package presenter;

import form.Form;
import view.View;

public abstract class AbstractPresenter<VIEW extends View<PRESENTER, FORM>, FORM extends Form, PRESENTER extends Presenter>
		implements Presenter {

	@SuppressWarnings("unused")
	private VIEW view;

	public void setView(VIEW view) {
		this.view = view;
	}

}
