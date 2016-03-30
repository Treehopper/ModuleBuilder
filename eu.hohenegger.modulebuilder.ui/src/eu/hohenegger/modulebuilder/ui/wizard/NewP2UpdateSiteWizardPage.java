package eu.hohenegger.modulebuilder.ui.wizard;

import org.eclipse.emf.ecp.ui.view.ECPRendererException;
import org.eclipse.emf.ecp.ui.view.swt.ECPSWTView;
import org.eclipse.emf.ecp.ui.view.swt.ECPSWTViewRenderer;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import modulespecification.Module;

/**
 * The "New" wizard page allows setting the container for the new file as well
 * as the file name. The page will only accept file name without the extension
 * OR with the extension that matches the expected one (mpe).
 */

public class NewP2UpdateSiteWizardPage extends WizardPage {
	private Module updatesite;

	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param module
	 * @param pageName
	 */
	public NewP2UpdateSiteWizardPage(Module module) {
		super("wizardPage");
		this.updatesite = module;
		setTitle("Tycho p2 layout");
		setDescription("This wizard creates new projects that can be built with Tycho, producing a p2 update site.");
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {
		Composite rootComposite = new Composite(parent, SWT.NULL);
		rootComposite.setLayout(GridLayoutFactory.fillDefaults().create());

		scrolled(rootComposite);

		setControl(rootComposite);
	}

	private void scrolled(Composite rootComposite) {
		ScrolledComposite sc = new ScrolledComposite(rootComposite, SWT.H_SCROLL | SWT.V_SCROLL);
		sc.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).hint(SWT.DEFAULT, 400).create());
		sc.setExpandHorizontal(true);
		sc.setExpandVertical(true);

		Composite containerMain = new Composite(sc, SWT.NONE);
		containerMain.setLayout(GridLayoutFactory.swtDefaults().numColumns(1).create());

		render(containerMain);

		sc.setContent(containerMain);
		sc.setMinSize(containerMain.computeSize(SWT.DEFAULT, SWT.DEFAULT));
	}


	private Control render(Composite parent) {
		try {
			ECPSWTView render = ECPSWTViewRenderer.INSTANCE.render(parent, updatesite);
			return render.getSWTControl();
		} catch (ECPRendererException e) {
			throw new RuntimeException(e);
		}
	}
}