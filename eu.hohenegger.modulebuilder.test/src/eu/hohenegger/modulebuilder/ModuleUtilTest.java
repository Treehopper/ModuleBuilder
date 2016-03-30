package eu.hohenegger.modulebuilder;

import static org.eclipse.emf.common.util.Diagnostic.OK;
import static org.junit.Assert.assertTrue;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.junit.Before;
import org.junit.Test;

import static eu.hohenegger.modulebuilder.ModuleUtil.generateFullFeature;
import static eu.hohenegger.modulebuilder.ModuleUtil.generateJavaProject;
import static eu.hohenegger.modulebuilder.ModuleUtil.generateParentProject;
import static eu.hohenegger.modulebuilder.ModuleUtil.generateTargetProject;
import static eu.hohenegger.modulebuilder.ModuleUtil.generateUpdatesiteProject;

import modulespecification.Module;
import modulespecification.ModulespecificationFactory;

public class ModuleUtilTest {

	private Module module;
	private NullProgressMonitor monitor;

	@Before
	public void setup() {
		module = createModel("TODO");
		monitor = new NullProgressMonitor();
	}

	private Module createModel(String pluginId) {
		Module module = ModulespecificationFactory.eINSTANCE.createModule();
		module.setBaseId(pluginId);

		return module;
	}

	@Test
	public void testGenerateJavaProject() {
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(module);
		assertTrue(diagnostic.getSeverity() == OK);

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

		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = root.getProject(module.getBaseId());
		assertTrue(project.exists());
	}

}
