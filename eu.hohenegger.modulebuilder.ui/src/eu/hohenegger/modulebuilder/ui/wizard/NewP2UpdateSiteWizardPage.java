package eu.hohenegger.modulebuilder.ui.wizard;

import static org.eclipse.emf.common.util.Diagnostic.OK;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.util.Diagnostician;
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
	private final class ValidationStatusUpdater extends AdapterImpl {
		@Override
		public void notifyChanged(Notification msg) {
			if (msg.getEventType() != Notification.SET) {
				return;
			}
			dialogChanged();
			super.notifyChanged(msg);
		}
	}

	private Module module;
	private ValidationStatusUpdater validationStatusUpdater;

	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param module
	 * @param pageName
	 */
	public NewP2UpdateSiteWizardPage(Module module) {
		super("wizardPage");
		this.module = module;
		setTitle("Eclipse/Tycho Module Builder");
		setDescription(
				"This wizard generates all projects and files that are necessary to to build an Eclipse update site with Maven Tycho.");
		validationStatusUpdater = new ValidationStatusUpdater();
		module.eAdapters().add(validationStatusUpdater);
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

	private void dialogChanged() {
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(module);
		if (OK != diagnostic.getSeverity()) {
			updateStatus("There are validation errors");
			return;
		}
		updateStatus(null);
	}

	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}

	private Control render(Composite parent) {
		try {
			ECPSWTView render = ECPSWTViewRenderer.INSTANCE.render(parent, module);
			return render.getSWTControl();
		} catch (ECPRendererException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void dispose() {
		module.eAdapters().remove(validationStatusUpdater);
		super.dispose();
	}
}