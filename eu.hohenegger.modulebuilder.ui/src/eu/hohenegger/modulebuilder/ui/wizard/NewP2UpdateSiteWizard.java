package eu.hohenegger.modulebuilder.ui.wizard;


import static eu.hohenegger.modulebuilder.ProjectFactory.addSourcePath;
import static eu.hohenegger.modulebuilder.ProjectFactory.addToClassPathEntries;
import static eu.hohenegger.modulebuilder.ProjectFactory.createFolder;
import static eu.hohenegger.modulebuilder.ProjectFactory.createJavaPackage;
import static eu.hohenegger.modulebuilder.ProjectFactory.createProject;
import static eu.hohenegger.modulebuilder.ProjectFactory.makeJavaProject;
import static eu.hohenegger.modulebuilder.XPandUtil.expandTemplate;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;

import eu.hohenegger.modulebuilder.ProjectFactory;
import modulespecification.Module;
import modulespecification.ModulespecificationFactory;
import modulespecification.Updatesite;

/**
 * This is a sample new wizard. Its role is to create a new file 
 * resource in the provided container. If the container resource
 * (a folder or a project) is selected in the workspace 
 * when the wizard is opened, it will accept it as the target
 * container. The wizard creates one file with the extension
 * "mpe". If a sample multi-page editor (also available
 * as a template) is registered for the same extension, it will
 * be able to open it.
 */

public class NewP2UpdateSiteWizard extends Wizard implements INewWizard {
	private NewP2UpdateSiteWizardPage page;
	private ISelection selection;

	/**
	 * Constructor for NewP2UpdateSiteWizard.
	 */
	public NewP2UpdateSiteWizard() {
		super();
		setNeedsProgressMonitor(true);
	}

	/**
	 * Adding the page to the wizard.
	 */

	public void addPages() {
		page = new NewP2UpdateSiteWizardPage(selection);
		addPage(page);
	}

	@Override
	public boolean performFinish() {
		final String containerName = page.getContainerName();

		try {
			getContainer().run(true, false, monitor -> {
				Module module = createModel(containerName);
				try {
					Updatesite updatesite = module.getUpdatesites().get(0);
					generateJavaProject(module, updatesite.getBaseId(), monitor, "template::core::%s::main");

					generateJavaProject(module, updatesite.getUiId(), monitor, "template::ui::%s::main");

					generateFullFeature(module, updatesite.getFeatureId(), monitor, "template::feature::%s::main");

					generateUpdatesiteProject(module, updatesite.getUpdateSiteId(), monitor,
							"template::p2::%s::main");
					generateTargetProject(module, updatesite.getTargetId(), monitor, "template::target::%s::main");

					generateParentProject(module, "parent", monitor, "template::parent::%s::main");
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			});
		} catch (InvocationTargetException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return true;
	}

	private Module createModel(String pluginId) {
		Updatesite updatesite = ModulespecificationFactory.eINSTANCE.createUpdatesite();
		updatesite.setBaseId(pluginId);

		Module module = ModulespecificationFactory.eINSTANCE.createModule();
		module.getUpdatesites().add(updatesite);

		return module;
	}

	private void generateJavaProject(Module module, String projectName, IProgressMonitor monitor, String templateMask) throws CoreException {
		// get project root folder as absolute file system path

		monitor.beginTask("Generating project", 6);
		IProject project = createProject(projectName, monitor);
		monitor.worked(1);
		IJavaProject javaProject = makeJavaProject(project, monitor);
		monitor.worked(1);
		IFolder sourceFolder = addSourcePath(project, monitor);
		monitor.worked(1);
		addToClassPathEntries(javaProject, sourceFolder, monitor);
		monitor.worked(1);
		IResource javaPackage = createJavaPackage(javaProject, sourceFolder, monitor);
		monitor.worked(1);
		IFolder metaInf = createFolder("META-INF", project, monitor);
		monitor.worked(1);

		expandTemplate(module, metaInf, "MANIFEST.MF", templateMask);
		expandTemplate(module, javaPackage, "Activator.java", templateMask);
		expandTemplate(module, project, "build.properties", templateMask);
		expandTemplate(module, project, "plugin.properties", templateMask);
		expandTemplate(module, project, "pom.xml", templateMask);
		expandTemplate(module, project, "plugin.xml", templateMask);

		// refresh the project to get external updates:
		project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
	}



	private void generateFullFeature(Module module, String baseName, IProgressMonitor monitor, String templateMask) throws CoreException {
		monitor.beginTask("Generating project", 1);
		IProject project = ProjectFactory.createProject(baseName, monitor);
		monitor.worked(1);

		expandTemplate(module, project, "feature.xml", templateMask);
		expandTemplate(module, project, "pom.xml", templateMask);
		expandTemplate(module, project, "build.properties", templateMask);

		project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
	}

	private void generateUpdatesiteProject(Module module, String baseName, IProgressMonitor monitor, String templateMask) throws CoreException {
		monitor.beginTask("Generating project", 1);
		IProject project = ProjectFactory.createProject(baseName, monitor);
		monitor.worked(1);

		expandTemplate(module, project, "category.xml", templateMask);
		expandTemplate(module, project, "pom.xml", templateMask);

		project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
	}
	private void generateTargetProject(Module module, String baseName, IProgressMonitor monitor, String templateMask) throws CoreException {
		monitor.beginTask("Generating project", 1);
		IProject project = ProjectFactory.createProject(baseName, monitor);
		monitor.worked(1);

		expandTemplate(module, project, "mars.tpd", templateMask);
		expandTemplate(module, project, "pom.xml", templateMask);

		project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
	}
	private void generateParentProject(Module module, String baseName, IProgressMonitor monitor, String templateMask) throws CoreException {
		monitor.beginTask("Generating project", 1);
		IProject project = ProjectFactory.createProject(baseName, monitor);
		monitor.worked(1);

		expandTemplate(module, project, "pom.xml", templateMask);

		project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
	}


	/**
	 * We will accept the selection in the workbench to see if
	 * we can initialize from it.
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
	}
}