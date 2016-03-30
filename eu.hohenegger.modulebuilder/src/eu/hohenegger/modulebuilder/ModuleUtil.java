package eu.hohenegger.modulebuilder;

import static eu.hohenegger.modulebuilder.ProjectFactory.addSourcePath;
import static eu.hohenegger.modulebuilder.ProjectFactory.addToClassPathEntries;
import static eu.hohenegger.modulebuilder.ProjectFactory.createFolder;
import static eu.hohenegger.modulebuilder.ProjectFactory.createJavaPackage;
import static eu.hohenegger.modulebuilder.ProjectFactory.createProject;
import static eu.hohenegger.modulebuilder.ProjectFactory.makeJavaProject;
import static eu.hohenegger.modulebuilder.XPandUtil.expandTemplate;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IJavaProject;

import modulespecification.Module;

public class ModuleUtil {
	private static final String CATEGORY_XML = "category.xml";
	private static final String FEATURE_XML = "feature.xml";
	private static final String PLUGIN_XML = "plugin.xml";
	private static final String ACTIVATOR_JAVA = "Activator.java";
	private static final String PLUGIN_PROPERTIES = "plugin.properties";
	private static final String BUILD_PROPERTIES = "build.properties";
	private static final String MANIFEST_MF = "MANIFEST.MF";
	private static final String POM_XML = "pom.xml";

	private static void generateJavaProject(Module module, String projectName, IProgressMonitor monitor,
			String templateMask) throws CoreException {
		// get project root folder as absolute file system path

		monitor.beginTask("Generating project", 6);
		IProject project = createProject(projectName, monitor);
		monitor.worked(1);
		IJavaProject javaProject = makeJavaProject(project, monitor, module.getJavaVersion());
		monitor.worked(1);
		IFolder sourceFolder = addSourcePath(project, monitor);
		monitor.worked(1);
		addToClassPathEntries(javaProject, sourceFolder, monitor);
		monitor.worked(1);
		IResource javaPackage = createJavaPackage(javaProject, sourceFolder, monitor);
		monitor.worked(1);
		IFolder metaInf = createFolder("META-INF", project, monitor);
		monitor.worked(1);

		expandTemplate(module, metaInf, MANIFEST_MF, templateMask);
		expandTemplate(module, javaPackage, ACTIVATOR_JAVA, templateMask);
		expandTemplate(module, project, BUILD_PROPERTIES, templateMask);
		expandTemplate(module, project, PLUGIN_PROPERTIES, templateMask);
		expandTemplate(module, project, POM_XML, templateMask);
		expandTemplate(module, project, PLUGIN_XML, templateMask);

		// refresh the project to get external updates:
		project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
	}

	private static void generateFullFeature(Module module, String baseName, IProgressMonitor monitor,
			String templateMask) throws CoreException {
		if (!module.isGenerateFeature()) {
			return;
		}

		monitor.beginTask("Generating project", 1);
		IProject project = ProjectFactory.createProject(baseName, monitor);
		monitor.worked(1);

		expandTemplate(module, project, FEATURE_XML, templateMask);
		expandTemplate(module, project, POM_XML, templateMask);
		expandTemplate(module, project, BUILD_PROPERTIES, templateMask);

		project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
	}

	private static void generateUpdatesiteProject(Module module, String baseName, IProgressMonitor monitor,
			String templateMask) throws CoreException {
		if (!module.isGenerateUpdatesite()) {
			return;
		}

		monitor.beginTask("Generating project", 1);
		IProject project = ProjectFactory.createProject(baseName, monitor);
		monitor.worked(1);

		expandTemplate(module, project, CATEGORY_XML, templateMask);
		expandTemplate(module, project, POM_XML, templateMask);

		project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
	}

	private static void generateTargetProject(Module module, String baseName, IProgressMonitor monitor,
			String templateMask) throws CoreException {
		if (!module.isGenerateTarget()) {
			return;
		}
		monitor.beginTask("Generating project", 1);
		IProject project = ProjectFactory.createProject(baseName, monitor);
		monitor.worked(1);

		expandTemplate(module, project, "mars.tpd", templateMask);
		expandTemplate(module, project, POM_XML, templateMask);

		project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
	}

	private static void generateParentProject(Module module, String baseName, IProgressMonitor monitor,
			String templateMask) throws CoreException {
		if (!module.isGenerateParent()) {
			return;
		}

		monitor.beginTask("Generating project", 1);
		IProject project = ProjectFactory.createProject(baseName, monitor);
		monitor.worked(1);

		expandTemplate(module, project, POM_XML, templateMask);

		project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
	}

	public static void generateModule(Module module, IProgressMonitor monitor) {
		try {
			generateJavaProject(module, module.getBaseId(), monitor, "template::core::%s::main");

			generateJavaProject(module, module.getUiId(), monitor, "template::ui::%s::main");

			generateFullFeature(module, module.getFeatureId(), monitor, "template::feature::%s::main");

			generateUpdatesiteProject(module, module.getUpdateSiteId(), monitor, "template::p2::%s::main");

			generateTargetProject(module, module.getTargetId(), monitor, "template::target::%s::main");

			generateParentProject(module, "parent", monitor, "template::parent::%s::main");
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
