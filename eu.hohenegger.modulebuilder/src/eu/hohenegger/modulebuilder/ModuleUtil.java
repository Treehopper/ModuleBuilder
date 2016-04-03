package eu.hohenegger.modulebuilder;

import static eu.hohenegger.modulebuilder.impl.ProjectFactory.addSourcePath;
import static eu.hohenegger.modulebuilder.impl.ProjectFactory.addToClassPathEntries;
import static eu.hohenegger.modulebuilder.impl.ProjectFactory.createFolder;
import static eu.hohenegger.modulebuilder.impl.ProjectFactory.createJavaPackage;
import static eu.hohenegger.modulebuilder.impl.ProjectFactory.createProject;
import static eu.hohenegger.modulebuilder.impl.ProjectFactory.makeJavaProject;
import static eu.hohenegger.modulebuilder.impl.XPandUtil.expandTemplate;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.jdt.core.IJavaProject;

import eu.hohenegger.modulebuilder.impl.ProjectFactory;
import modulespecification.Module;

public class ModuleUtil {
	private static final String FRAGMENT_XML = "fragment.xml";
	private static final String STD_MAIN = "main";
	private static final String TEMPLATE_PACKAGE = "template";
	private static final String CATEGORY_XML = "category.xml";
	private static final String FEATURE_XML = "feature.xml";
	private static final String PLUGIN_XML = "plugin.xml";
	private static final String ACTIVATOR_JAVA = "Activator.java";
	private static final String PLUGIN_PROPERTIES = "plugin.properties";
	private static final String BUILD_PROPERTIES = "build.properties";
	private static final String MANIFEST_MF = "MANIFEST.MF";
	private static final String POM_XML = "pom.xml";

	private static void generateJavaProject(Module module, String projectName, String templateMask,
			String baseLocation, IProgressMonitor monitor, boolean isFragment) throws CoreException {
		// get project root folder as absolute file system path
		SubMonitor sub = SubMonitor.convert(monitor, "Generating Java project", 13);

		IProject project = createProject(projectName, baseLocation, sub.newChild(1));
		IJavaProject javaProject = makeJavaProject(project, sub.newChild(1), module.getJavaVersion());
		IFolder sourceFolder = addSourcePath(project, sub.newChild(1));
		addToClassPathEntries(javaProject, sourceFolder, sub.newChild(1));
		IResource javaPackage = createJavaPackage(javaProject, sourceFolder, sub.newChild(1));
		IFolder metaInf = createFolder("META-INF", project, sub.newChild(1));

		expandTemplate(module, metaInf, MANIFEST_MF, templateMask, sub.newChild(1));
		if (!isFragment) {
			expandTemplate(module, javaPackage, ACTIVATOR_JAVA, templateMask, sub.newChild(1));
		}
		expandTemplate(module, project, BUILD_PROPERTIES, templateMask, sub.newChild(1));
		expandTemplate(module, project, PLUGIN_PROPERTIES, templateMask, sub.newChild(1));
		expandTemplate(module, project, POM_XML, templateMask, sub.newChild(1));
		expandTemplate(module, project, (!isFragment) ? PLUGIN_XML : FRAGMENT_XML, templateMask, sub.newChild(1));

		// refresh the project to get external updates:
		project.refreshLocal(IResource.DEPTH_INFINITE, sub.newChild(1));
	}

	private static void generateJavaProject(Module module, String projectName, String templateMask, String baseLocation,
			IProgressMonitor monitor) throws CoreException {
		generateJavaProject(module, projectName, templateMask, baseLocation, monitor, false);
	}

	private static void generateFullFeature(Module module, String baseName, String templateMask,
			String baseLocation, IProgressMonitor monitor) throws CoreException {
		SubMonitor sub = SubMonitor.convert(monitor, "Generating Feature project", 5);

		if (!module.isGenerateFeature()) {
			return;
		}

		IProject project = ProjectFactory.createProject(baseName, baseLocation, sub.newChild(1));

		expandTemplate(module, project, FEATURE_XML, templateMask, sub.newChild(1));
		expandTemplate(module, project, POM_XML, templateMask, sub.newChild(1));
		expandTemplate(module, project, BUILD_PROPERTIES, templateMask, sub.newChild(1));

		project.refreshLocal(IResource.DEPTH_INFINITE, sub.newChild(1));
	}

	private static void generateUpdatesiteProject(Module module,
			String baseName,
			String templateMask, String baseLocation,
			IProgressMonitor monitor) throws CoreException {
		SubMonitor sub = SubMonitor.convert(monitor, "Generating p2 update site project", 4);

		if (!module.isGenerateUpdatesite()) {
			return;
		}

		IProject project = ProjectFactory.createProject(baseName, baseLocation, sub.newChild(1));

		expandTemplate(module, project, CATEGORY_XML, templateMask, sub.newChild(1));
		expandTemplate(module, project, POM_XML, templateMask, sub.newChild(1));

		project.refreshLocal(IResource.DEPTH_INFINITE, sub.newChild(1));
	}

	private static void generateTargetProject(Module module, String baseName, String templateMask, String baseLocation,
			IProgressMonitor monitor) throws CoreException {
		SubMonitor sub = SubMonitor.convert(monitor, "Generating target project", 4);

		if (!module.isGenerateTarget()) {
			return;
		}
		IProject project = ProjectFactory.createProject(baseName, baseLocation, sub.newChild(1));

		expandTemplate(module, project, "mars.tpd", templateMask, sub.newChild(1));
		expandTemplate(module, project, POM_XML, templateMask, sub.newChild(1));

		project.refreshLocal(IResource.DEPTH_INFINITE, sub.newChild(1));
	}

	private static void generateParentProject(Module module, String baseName, String templateMask, String baseLocation,
			IProgressMonitor monitor) throws CoreException {
		SubMonitor sub = SubMonitor.convert(monitor, "Generating parent project", 3);

		if (!module.isGenerateParent()) {
			return;
		}

		IProject project = ProjectFactory.createProject(baseName, baseLocation, sub.newChild(1));

		expandTemplate(module, project, POM_XML, templateMask, sub.newChild(1));

		project.refreshLocal(IResource.DEPTH_INFINITE, sub.newChild(1));
	}

	public static void generateModule(Module module, IProgressMonitor monitor) {
		SubMonitor sub = SubMonitor.convert(monitor, "Generating module", 7);

		try {
			generateParentProject(module, module.getTychoParentName(), createTemplateMask("parent"), module.getBaseLocation(), sub.newChild(1));

			// TODO: platform dependent separator
			String baseLocation = module.getBaseLocation() + "/" + module.getTychoParentName();

			generateJavaProject(module, module.getBaseId(), createTemplateMask("core"), baseLocation, sub.newChild(1));

			generateJavaProject(module, module.getUiId(), createTemplateMask("ui"), baseLocation, sub.newChild(1));

			generateJavaProject(module, module.getUie3Id(), createTemplateMask("ui::e3"), baseLocation, sub.newChild(1), true);

			generateFullFeature(module, module.getFeatureId(), createTemplateMask("feature"), baseLocation, sub.newChild(1));

			generateUpdatesiteProject(module, module.getUpdateSiteId(), createTemplateMask("p2"), baseLocation, sub.newChild(1));

			generateTargetProject(module, module.getTargetId(), createTemplateMask("target"), baseLocation, sub.newChild(1));
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static String createTemplateMask(String subPackage) {
		return TEMPLATE_PACKAGE + "::" + subPackage + "::%s::" + STD_MAIN;
	}
}
