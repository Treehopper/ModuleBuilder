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
import org.eclipse.core.runtime.SubMonitor;
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
		SubMonitor sub = SubMonitor.convert(monitor, "Generating Java project", 13);

		IProject project = createProject(projectName, sub.newChild(1));
		IJavaProject javaProject = makeJavaProject(project, sub.newChild(1), module.getJavaVersion());
		IFolder sourceFolder = addSourcePath(project, sub.newChild(1));
		addToClassPathEntries(javaProject, sourceFolder, sub.newChild(1));
		IResource javaPackage = createJavaPackage(javaProject, sourceFolder, sub.newChild(1));
		IFolder metaInf = createFolder("META-INF", project, sub.newChild(1));

		expandTemplate(module, metaInf, MANIFEST_MF, templateMask, sub.newChild(1));
		expandTemplate(module, javaPackage, ACTIVATOR_JAVA, templateMask, sub.newChild(1));
		expandTemplate(module, project, BUILD_PROPERTIES, templateMask, sub.newChild(1));
		expandTemplate(module, project, PLUGIN_PROPERTIES, templateMask, sub.newChild(1));
		expandTemplate(module, project, POM_XML, templateMask, sub.newChild(1));
		expandTemplate(module, project, PLUGIN_XML, templateMask, sub.newChild(1));

		// refresh the project to get external updates:
		project.refreshLocal(IResource.DEPTH_INFINITE, sub.newChild(1));
	}

	private static void generateFullFeature(Module module, String baseName, IProgressMonitor monitor,
			String templateMask) throws CoreException {
		SubMonitor sub = SubMonitor.convert(monitor, "Generating Feature project", 5);

		if (!module.isGenerateFeature()) {
			return;
		}

		IProject project = ProjectFactory.createProject(baseName, sub.newChild(1));

		expandTemplate(module, project, FEATURE_XML, templateMask, sub.newChild(1));
		expandTemplate(module, project, POM_XML, templateMask, sub.newChild(1));
		expandTemplate(module, project, BUILD_PROPERTIES, templateMask, sub.newChild(1));

		project.refreshLocal(IResource.DEPTH_INFINITE, sub.newChild(1));
	}

	private static void generateUpdatesiteProject(Module module, String baseName, IProgressMonitor monitor,
			String templateMask) throws CoreException {
		SubMonitor sub = SubMonitor.convert(monitor, "Generating p2 update site project", 4);

		if (!module.isGenerateUpdatesite()) {
			return;
		}

		IProject project = ProjectFactory.createProject(baseName, sub.newChild(1));

		expandTemplate(module, project, CATEGORY_XML, templateMask, sub.newChild(1));
		expandTemplate(module, project, POM_XML, templateMask, sub.newChild(1));

		project.refreshLocal(IResource.DEPTH_INFINITE, sub.newChild(1));
	}

	private static void generateTargetProject(Module module, String baseName, IProgressMonitor monitor,
			String templateMask) throws CoreException {
		SubMonitor sub = SubMonitor.convert(monitor, "Generating target project", 4);

		if (!module.isGenerateTarget()) {
			return;
		}
		IProject project = ProjectFactory.createProject(baseName, sub.newChild(1));

		expandTemplate(module, project, "mars.tpd", templateMask, sub.newChild(1));
		expandTemplate(module, project, POM_XML, templateMask, sub.newChild(1));

		project.refreshLocal(IResource.DEPTH_INFINITE, sub.newChild(1));
	}

	private static void generateParentProject(Module module, String baseName, IProgressMonitor monitor,
			String templateMask) throws CoreException {
		SubMonitor sub = SubMonitor.convert(monitor, "Generating parent project", 3);

		if (!module.isGenerateParent()) {
			return;
		}

		IProject project = ProjectFactory.createProject(baseName, sub.newChild(1));

		expandTemplate(module, project, POM_XML, templateMask, sub.newChild(1));

		project.refreshLocal(IResource.DEPTH_INFINITE, sub.newChild(1));
	}

	public static void generateModule(Module module, IProgressMonitor monitor) {
		SubMonitor sub = SubMonitor.convert(monitor, "Generating module", 6);

		try {
			generateJavaProject(module, module.getBaseId(), sub.newChild(1), "template::core::%s::main");

			generateJavaProject(module, module.getUiId(), sub.newChild(1), "template::ui::%s::main");

			generateFullFeature(module, module.getFeatureId(), sub.newChild(1), "template::feature::%s::main");

			generateUpdatesiteProject(module, module.getUpdateSiteId(), sub.newChild(1), "template::p2::%s::main");

			generateTargetProject(module, module.getTargetId(), sub.newChild(1), "template::target::%s::main");

			generateParentProject(module, module.getTychoParentName(), sub.newChild(1), "template::parent::%s::main");
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
