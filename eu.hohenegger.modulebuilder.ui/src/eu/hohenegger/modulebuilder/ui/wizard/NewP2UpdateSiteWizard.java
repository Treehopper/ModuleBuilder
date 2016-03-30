package eu.hohenegger.modulebuilder.ui.wizard;


import static eu.hohenegger.modulebuilder.ModuleUtil.generateFullFeature;
import static eu.hohenegger.modulebuilder.ModuleUtil.generateJavaProject;
import static eu.hohenegger.modulebuilder.ModuleUtil.generateParentProject;
import static eu.hohenegger.modulebuilder.ModuleUtil.generateTargetProject;
import static eu.hohenegger.modulebuilder.ModuleUtil.generateUpdatesiteProject;
import static org.eclipse.emf.common.util.Diagnostic.OK;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import modulespecification.Module;
import modulespecification.ModulespecificationFactory;

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
	private Module module;

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
		module = createModel("TODO");
		page = new NewP2UpdateSiteWizardPage(module);
		addPage(page);
	}

	@Override
	public boolean performFinish() {
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(module);
		if (diagnostic.getSeverity() != OK) {
			return false;
		}

		try {
			getContainer().run(true, false, monitor -> {
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

			});
		} catch (InvocationTargetException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return true;
	}

	private Module createModel(String pluginId) {
		Module module = ModulespecificationFactory.eINSTANCE.createModule();
		module.setBaseId(pluginId);

		return module;
	}



	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// intentionally left empty
	}
}