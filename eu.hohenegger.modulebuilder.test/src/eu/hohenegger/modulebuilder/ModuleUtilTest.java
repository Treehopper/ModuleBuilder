package eu.hohenegger.modulebuilder;

import static eu.hohenegger.modulebuilder.ModuleUtil.generateModule;
import static org.eclipse.emf.common.util.Diagnostic.OK;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

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
	public void testGenerateModule() {
		generateModule(module, monitor);

		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		assertTrue(root.getProject(module.getCoreId()).exists());
		assertTrue(root.getProject(module.getFeatureId()).exists());
		assertTrue(root.getProject(module.getUpdateSiteId()).exists());
		assertTrue(root.getProject(module.getTargetId()).exists());
		assertTrue(root.getProject(module.getUiId()).exists());
	}

	@Test
	public void testValidation() {
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(module);
		assertEquals(OK, diagnostic.getSeverity());
	}

	@Test
	@Ignore // validation is not yet working properly
	public void testValidationFail() {
		Module failingMmodule = ModulespecificationFactory.eINSTANCE.createModule();
		module.setBaseId("!@#$%^&*()");
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(failingMmodule);
		assertNotEquals(OK, diagnostic.getSeverity());
	}

	@AfterClass
	public static void tearDown() throws Exception {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject[] projects = root.getProjects();
		for (IProject iProject : projects) {
			iProject.delete(true, null);
		}
	}
}
