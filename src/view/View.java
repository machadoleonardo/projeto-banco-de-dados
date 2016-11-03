package view;

public interface View<PRESENTER, FORM> {

	void fillIn(FORM form);

	FORM fillOut();

	void paint();

	void setPresenter(PRESENTER presenter);

}
