package eu.hohenegger.modulebuilder.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;

public class ProjectFactory {
	public static IJavaProject makeJavaProject(IProject project, IProgressMonitor monitor, String javaVersion) throws CoreException {
		addNature(project, monitor, JavaCore.NATURE_ID, "org.eclipse.pde.PluginNature");
		IJavaProject javaProject = JavaCore.create(project);
		addBuilders(project, monitor);
		addBinPath(project, javaProject, monitor);
		defineClassPathEntries(javaProject, javaVersion);
		return javaProject;
	}

	private static void addBuilders(IProject project, IProgressMonitor monitor) throws CoreException {
		IProjectDescription projectDescription = project.getDescription();
		final ICommand java = projectDescription.newCommand();
		java.setBuilderName(JavaCore.BUILDER_ID);

		final ICommand manifest = projectDescription.newCommand();
		manifest.setBuilderName("org.eclipse.pde.ManifestBuilder");

		final ICommand schema = projectDescription.newCommand();
		schema.setBuilderName("org.eclipse.pde.SchemaBuilder");

		projectDescription.setBuildSpec(new ICommand[] { java, manifest, schema });

		project.open(monitor);
		project.setDescription(projectDescription, monitor);
	}

	private static void addNature(IProject project, IProgressMonitor monitor, String... natures) throws CoreException {
		IProjectDescription description = project.getDescription();
		description.setNatureIds(natures);
		project.setDescription(description, monitor);
	}

	public static IResource createJavaPackage(IJavaProject javaProject, IFolder sourceFolder, IProgressMonitor monitor)
			throws JavaModelException {
		IPackageFragment packageFragment = javaProject.getPackageFragmentRoot(sourceFolder)
				.createPackageFragment(javaProject.getElementName(), false, monitor);
		return packageFragment.getCorrespondingResource();
	}

	public static void addToClassPathEntries(IJavaProject javaProject, IFolder sourceFolder, IProgressMonitor monitor)
			throws JavaModelException {
		IPackageFragmentRoot root = javaProject.getPackageFragmentRoot(sourceFolder);
		IClasspathEntry[] oldEntries = javaProject.getRawClasspath();
		IClasspathEntry[] newEntries = new IClasspathEntry[oldEntries.length + 1];
		System.arraycopy(oldEntries, 0, newEntries, 0, oldEntries.length);
		newEntries[oldEntries.length] = JavaCore.newSourceEntry(root.getPath());
		javaProject.setRawClasspath(newEntries, monitor);
	}

	public static IFolder addSourcePath(IProject project, IProgressMonitor monitor) throws CoreException {
		return createFolder("src", project, monitor);
	}

	public static IFolder createFolder(String folderName, IProject project, IProgressMonitor monitor) throws CoreException {
		IFolder sourceFolder = project.getFolder(folderName);
		if (!sourceFolder.exists()) {
			sourceFolder.create(false, true, monitor);
		}
		return sourceFolder;
	}

	private static void defineClassPathEntries(IJavaProject javaProject, String javaVersion) throws JavaModelException {
		List<IClasspathEntry> entries = new ArrayList<IClasspathEntry>();

		// TODO: remove: alternate way to add java libs
		// IVMInstall vmInstall = JavaRuntime.getDefaultVMInstall();
		// LibraryLocation[] locations =
		// JavaRuntime.getLibraryLocations(vmInstall);
		// for (LibraryLocation element : locations) {
		// entries.add(JavaCore.newLibraryEntry(element.getSystemLibraryPath(),
		// null, null));
		// }
		entries.add(JavaCore.newContainerEntry(new Path(
				"org.eclipse.jdt.launching.JRE_CONTAINER/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/"
						+ javaVersion)));
		entries.add(JavaCore.newContainerEntry(new Path("org.eclipse.pde.core.requiredPlugins")));

		// add libs to project class path
		javaProject.setRawClasspath(entries.toArray(new IClasspathEntry[entries.size()]), null);

	}

	private static void addBinPath(IProject project, IJavaProject javaProject, IProgressMonitor monitor) throws CoreException {
		IFolder binFolder = project.getFolder("bin");
		if (!binFolder.exists()) {
			binFolder.create(false, true, monitor);
			javaProject.setOutputLocation(binFolder.getFullPath(), monitor);
		}
	}

	public static IProject createProject(String projectName, String baseLocation, IProgressMonitor monitor) throws CoreException {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root = workspace.getRoot();
		IProjectDescription projectDescription = workspace.newProjectDescription(projectName);

		IPath location = Path.fromOSString(baseLocation).addTrailingSeparator().append(projectName);
		projectDescription.setLocation(location);
		IProject project = root.getProject(projectName);
		if (!project.exists()) {
			project.create(projectDescription, monitor);
			project.open(monitor);
		}
		return project;
	}
}