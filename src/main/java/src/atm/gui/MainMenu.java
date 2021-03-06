/**
 * This class provides methods and functionality for users to have bank accounts that can store their balances and make deposits, withdrawals, or transfers.
 * 
 * @author Yulli Saavedra
 */

package src.atm.gui;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;

@SuppressWarnings("javadoc")
final class MainMenu extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static Font labelFont = new Font("Dialog", Font.BOLD, 14);
	private JLabel mainMenuLabel;
	private JButton loginButton, createAccountButton, exitButton;

	public MainMenu() {
		super(null);

		mainMenuLabel = new JLabel("Parcial");
		mainMenuLabel.setFont(labelFont);
		mainMenuLabel.setHorizontalAlignment(SwingConstants.CENTER);
		mainMenuLabel.setVerticalAlignment(SwingConstants.CENTER);
		mainMenuLabel.setBounds(150, 10, 200, 50);

		loginButton = new JButton("Ingresar");
		loginButton.setBounds(150, 85, 200, 50);

		createAccountButton = new JButton("Crear Cuenta");
		createAccountButton.setBounds(150, 180, 200, 50);

		exitButton = new JButton("Salir");
		exitButton.setBounds(150, 280, 200, 50);

		this.add(mainMenuLabel);
		this.add(loginButton);
		this.add(createAccountButton);
		this.add(exitButton);
	}

	public JLabel getMainMenuLabel() {
		return this.mainMenuLabel;
	}

	public JButton getLoginButton() {
		return this.loginButton;
	}

	public JButton getCreateAccountButton() {
		return this.createAccountButton;
	}

	public JButton getExitButton() {
		return this.exitButton;
	}

}