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
	public static void generateJavaProject(Module module, String projectName, IProgressMonitor monitor,
			String templateMask) throws CoreException {
		// get project root folder as absolute file system path

		monitor.beginTask("Generating project", 6);
		IProject project = createProject(projectName, monitor);
		monitor.worked(1);
		IJavaProject javaProject = makeJavaProject(project, monitor, module.getUpdatesites().get(0).getJavaVersion());
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

	public static void generateFullFeature(Module module, String baseName, IProgressMonitor monitor,
			String templateMask) throws CoreException {
		if (!module.getUpdatesites().get(0).isGenerateFeature()) {
			return;
		}

		monitor.beginTask("Generating project", 1);
		IProject project = ProjectFactory.createProject(baseName, monitor);
		monitor.worked(1);

		expandTemplate(module, project, "feature.xml", templateMask);
		expandTemplate(module, project, "pom.xml", templateMask);
		expandTemplate(module, project, "build.properties", templateMask);

		project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
	}

	public static void generateUpdatesiteProject(Module module, String baseName, IProgressMonitor monitor,
			String templateMask) throws CoreException {
		if (!module.getUpdatesites().get(0).isGenerateUpdatesite()) {
			return;
		}

		monitor.beginTask("Generating project", 1);
		IProject project = ProjectFactory.createProject(baseName, monitor);
		monitor.worked(1);

		expandTemplate(module, project, "category.xml", templateMask);
		expandTemplate(module, project, "pom.xml", templateMask);

		project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
	}

	public static void generateTargetProject(Module module, String baseName, IProgressMonitor monitor,
			String templateMask) throws CoreException {
		if (!module.getUpdatesites().get(0).isGenerateTarget()) {
			return;
		}
		monitor.beginTask("Generating project", 1);
		IProject project = ProjectFactory.createProject(baseName, monitor);
		monitor.worked(1);

		expandTemplate(module, project, "mars.tpd", templateMask);
		expandTemplate(module, project, "pom.xml", templateMask);

		project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
	}

	public static void generateParentProject(Module module, String baseName, IProgressMonitor monitor,
			String templateMask) throws CoreException {
		if (!module.getUpdatesites().get(0).isGenerateParent()) {
			return;
		}

		monitor.beginTask("Generating project", 1);
		IProject project = ProjectFactory.createProject(baseName, monitor);
		monitor.worked(1);

		expandTemplate(module, project, "pom.xml", templateMask);

		project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
	}
}
