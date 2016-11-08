package view.impl;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import utilidades.ViewConstants;

public class MainViewImpl {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				MainViewImpl window = new MainViewImpl();
				window.frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainViewImpl() {
		this.initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 *
	 * @wbp.parser.entryPoint
	 */
	private void initialize() {
		this.frame = new JFrame();
		this.frame.setBounds(100, 100, ViewConstants.DEFAULT_WIDTH, ViewConstants.DEFAULT_HEIGHT);
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.renderMenu();
	}

	private void renderMenu() {
		JMenuBar menuBar = new JMenuBar();
		this.frame.setJMenuBar(menuBar);

		JMenu mnOpes = new JMenu("Op\u00E7\u00F5es");
		menuBar.add(mnOpes);

		JMenuItem mntmCadastrarOcorrncia = new JMenuItem("Cadastrar ocorr\u00EAncia");
		mnOpes.add(mntmCadastrarOcorrncia);

		JMenu mnRelatrios = new JMenu("Relat\u00F3rios");
		menuBar.add(mnRelatrios);

		JMenuItem mntmPorPessoa = new JMenuItem("Por pessoa");
		mnRelatrios.add(mntmPorPessoa);

		JMenuItem mntmPorEstrada = new JMenuItem("Por estrada");
		mnRelatrios.add(mntmPorEstrada);

		JMenuItem mntmPorTipoDe = new JMenuItem("Por tipo de acidente");
		mnRelatrios.add(mntmPorTipoDe);
	}

}
