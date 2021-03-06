package de.fourHighSpeedHR.GUI;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.border.Border;

import de.fourHighSpeedHR.database.PasswortDB;

import javax.swing.JPasswordField;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.util.HashMap;

/**
 * Die Klasse enthaelt das Login in das Programm
 */
public class Login {

	private JTextField tfUsername;
	private JPasswordField tfPassword;
	private JFrame frame;
	public static int anzahlVersuche;

	Login() {

		anzahlVersuche = 5;

		frame = new JFrame();
		frame.setTitle("4HighSpeed HR - Login");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setSize(350, 200);

		ImageIcon logo = new ImageIcon("logo.png");
		frame.setIconImage(logo.getImage());

		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };

		JPanel contentPanel = new JPanel();
		Border padding = BorderFactory.createEmptyBorder(15, 15, 15, 15);
		contentPanel.setBorder(padding);
		frame.setContentPane(contentPanel);

		frame.getContentPane().setLayout(gridBagLayout);

		JLabel lblUsername = new JLabel("Username:");
		GridBagConstraints gbc_lblUsername = new GridBagConstraints();
		gbc_lblUsername.weighty = 1.0;
		gbc_lblUsername.weightx = 0.5;
		gbc_lblUsername.anchor = GridBagConstraints.WEST;
		gbc_lblUsername.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsername.gridx = 0;
		gbc_lblUsername.gridy = 0;
		frame.getContentPane().add(lblUsername, gbc_lblUsername);

		tfUsername = new JTextField();
		GridBagConstraints gbc_tfUsername = new GridBagConstraints();
		gbc_tfUsername.weighty = 1.0;
		gbc_tfUsername.weightx = 1.0;
		gbc_tfUsername.insets = new Insets(0, 0, 5, 0);
		gbc_tfUsername.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfUsername.gridx = 1;
		gbc_tfUsername.gridy = 0;
		frame.getContentPane().add(tfUsername, gbc_tfUsername);
		tfUsername.setColumns(10);

		JLabel lblPasswort = new JLabel("Passwort:");
		GridBagConstraints gbc_lblPasswort = new GridBagConstraints();
		gbc_lblPasswort.anchor = GridBagConstraints.WEST;
		gbc_lblPasswort.weighty = 1.0;
		gbc_lblPasswort.weightx = 0.5;
		gbc_lblPasswort.insets = new Insets(0, 0, 5, 5);
		gbc_lblPasswort.gridx = 0;
		gbc_lblPasswort.gridy = 1;
		frame.getContentPane().add(lblPasswort, gbc_lblPasswort);

		tfPassword = new JPasswordField();
		GridBagConstraints gbc_tfPassword = new GridBagConstraints();
		gbc_tfPassword.weighty = 1.0;
		gbc_tfPassword.weightx = 1.0;
		gbc_tfPassword.insets = new Insets(0, 0, 5, 0);
		gbc_tfPassword.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfPassword.gridx = 1;
		gbc_tfPassword.gridy = 1;
		frame.getContentPane().add(tfPassword, gbc_tfPassword);

		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(e -> loginCheck());

		GridBagConstraints gbc_btnLogin = new GridBagConstraints();
		gbc_btnLogin.weighty = 1.0;
		gbc_btnLogin.weightx = 1.0;
		gbc_btnLogin.gridx = 1;
		gbc_btnLogin.gridy = 2;
		frame.getContentPane().add(btnLogin, gbc_btnLogin);
		
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}

	/**
	 * Die Methode Prueft den Login
	 * 
	 * 1. Passwort und Name in Variable speichern. 2. Schauen ob es den Name auch
	 * gibt. 3. Wenn es den Namen gibt stimmt = true sodass die naechste Schleife
	 * durchlaufen werden kann. So loest da sonst mehrmals das JOptionPane kommt,
	 * wegen der Schleife. 4. wenn PW und Name Uebereinstimmen wird das n??chste
	 * Fenster geoeffnet, wenn nicht wird von der Anzahl der Versuche einer
	 * abgezogen bis man bei 0 ist und wenn man bei 0 ist das Programm auch beendet.
	 * Zwischen din werden dabei immer die Felder auf null gesetzt.
	 * 
	 * @param passwort ist das eingegebene Passwort
	 * @param username ist der eingegebene Benutzername
	 * @param stimmt   boolean die ausgibt ob das PW und der BN richtig sind
	 */

	public void loginCheck() {

		String username = tfUsername.getText();
		String passwort = String.valueOf(tfPassword.getPassword());

		boolean stimmt = false;

		HashMap<String, String> passworte = PasswortDB.connectToDataBasePW();

		if (passwort.equals("") || username.equals("")) {

			JOptionPane.showMessageDialog(null, "Du musst alle Felder ausfuellen!");

		} else {
			for (String s : passworte.keySet()) {
				if (s.equals(username)) {
					stimmt = true;
				}
			}

			if (stimmt && passworte.get(username).equals(passwort)) {
				frame.dispose();
				Hauptfenster hauptfenster = new Hauptfenster();

			} else {

				if (anzahlVersuche == 0) {
					JOptionPane.showMessageDialog(null,
							"Das Passwort und der Benutzername stimmen nicht Ueberein. Das Programm schlie?t sich jetzt!");
				} else {
					JOptionPane.showMessageDialog(null,
							"Das Passwort und der Benutzername stimmen nicht Ueberein. Du hast noch " + anzahlVersuche
									+ " Versuche Uebrig");
				}
			}
		}

		tfPassword.setText("");
		tfUsername.setText("");

		if (anzahlVersuche == 0) {
			System.exit(0);
		}

		anzahlVersuche--;
	}
}
