package view.impl;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import form.LoginForm;
import presenter.LoginPresenter;
import utilidades.ViewConstants;
import view.AbstractView;
import view.LoginView;

public class LoginViewImpl extends AbstractView<LoginPresenter, LoginForm>
		implements LoginView<LoginPresenter, LoginForm> {

	private JTextField loginField;

	private JPasswordField passwordField;

	/**
	 * @wbp.parser.entryPoint
	 */
	@SuppressWarnings("deprecation")
	@Override
	public void paint() {
		this.frame = new JFrame();
		this.frame.setTitle("Login");
		this.frame.getContentPane().setLayout(null);
		this.loginField = new JTextField("Login");
		this.loginField.setBounds(127, 107, 130, 20);

		this.frame.getContentPane().add(this.loginField);
		this.passwordField = new JPasswordField("Senha");
		this.passwordField.setBounds(127, 164, 130, 20);
		this.frame.getContentPane().add(this.passwordField);

		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(127, 83, 97, 14);
		this.frame.getContentPane().add(lblLogin);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(127, 139, 97, 14);
		this.frame.getContentPane().add(lblPassword);

		JLabel lblFaaLoginNo = new JLabel("Fa\u00E7a Login No Sistema");
		lblFaaLoginNo.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblFaaLoginNo.setBounds(58, 24, 268, 48);
		this.frame.getContentPane().add(lblFaaLoginNo);

		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(225, 210, 89, 23);
		this.frame.getContentPane().add(btnLogin);
		btnLogin.addActionListener(
				event -> this.onLoginClicked(this.loginField.getText(), this.passwordField.getText()));

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(68, 210, 89, 23);
		this.frame.getContentPane().add(btnCancelar);
		btnCancelar.addActionListener(event -> this.frame.dispose());

		this.frame.setVisible(true);
		this.frame.setSize(ViewConstants.LOGIN_WIDTH, ViewConstants.LOGIN_HEIGHT);
		this.frame.setLocationRelativeTo(null);
	}

	@Override
	public void fillIn(LoginForm form) {

	}

	@Override
	public LoginForm fillOut() {
		// TODO Auto-generated method stub
		return null;
	}

	private void onLoginClicked(String login, String senha) {

	}

}
