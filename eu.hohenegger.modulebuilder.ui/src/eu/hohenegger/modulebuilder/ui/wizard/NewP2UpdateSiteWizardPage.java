package eu.hohenegger.modulebuilder.ui.wizard;

import org.eclipse.emf.ecp.ui.view.ECPRendererException;
import org.eclipse.emf.ecp.ui.view.swt.ECPSWTViewRenderer;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

import modulespecification.Updatesite;

/**
 * The "New" wizard page allows setting the container for the new file as well
 * as the file name. The page will only accept file name without the extension
 * OR with the extension that matches the expected one (mpe).
 */

public class NewP2UpdateSiteWizardPage extends WizardPage {
	private Updatesite updatesite;

	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param updatesite
	 * @param pageName
	 */
	public NewP2UpdateSiteWizardPage(Updatesite updatesite) {
		super("wizardPage");
		this.updatesite = updatesite;
		setTitle("Tycho p2 layout");
		setDescription("This wizard creates new projects that can be built with Tycho, producing a p2 update site.");
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);

		render(container);

		setControl(container);
	}

	private void render(Composite parent) {
		try {
			ECPSWTViewRenderer.INSTANCE.render(parent, updatesite);
		} catch (ECPRendererException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}