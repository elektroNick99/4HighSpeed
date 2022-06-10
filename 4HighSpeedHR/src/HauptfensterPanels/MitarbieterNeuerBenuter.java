package HauptfensterPanels;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import de.fourHighSpeedHR.database.MitarbeiterDB;
import de.fourHighSpeedHR.database.PasswortDB;
import de.fourHighSpeedHR.objects.Mitarbeiter;

/**
 * Panel für das anlegen eines neuen Benutzers
 */
public class MitarbieterNeuerBenuter extends JPanel {

	private static JTextField tfName, tfNachname, tfID;
	private static JTextField tfBenutzername;
	private static JPasswordField tfPasswort;
	private static JPasswordField tfPasswortWhd;

	public MitarbieterNeuerBenuter() {

		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 60, 276, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel lblMitarbeiterLoeschen = new JLabel("Neuen Benutzer anlegen");
		lblMitarbeiterLoeschen.setFont(new Font("Arial", Font.BOLD, 15));
		GridBagConstraints gbc_lblMitarbeiterLoeschen = new GridBagConstraints();
		gbc_lblMitarbeiterLoeschen.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterLoeschen.insets = new Insets(0, 0, 5, 5);
		gbc_lblMitarbeiterLoeschen.gridx = 1;
		gbc_lblMitarbeiterLoeschen.gridy = 0;
		add(lblMitarbeiterLoeschen, gbc_lblMitarbeiterLoeschen);

		JLabel lblMitarbeiterLoeschenName = new JLabel("Name*");
		lblMitarbeiterLoeschenName.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMitarbeiterLoeschenName = new GridBagConstraints();
		gbc_lblMitarbeiterLoeschenName.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterLoeschenName.insets = new Insets(0, 0, 5, 5);
		gbc_lblMitarbeiterLoeschenName.gridx = 1;
		gbc_lblMitarbeiterLoeschenName.gridy = 1;
		add(lblMitarbeiterLoeschenName, gbc_lblMitarbeiterLoeschenName);

		tfName = new JTextField();
		tfName.setFont(new Font("Arial", Font.PLAIN, 12));
		tfName.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!(Character.isAlphabetic(c) || (c == KeyEvent.VK_SPACE) || c == KeyEvent.VK_DELETE
						|| c == KeyEvent.VK_MINUS)) {
					e.consume(); // ignore the event if it's not an alphabet
				}
			}
		});

		JLabel lblBenutzerName = new JLabel("Benutzername");
		lblBenutzerName.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblBenutzerName = new GridBagConstraints();
		gbc_lblBenutzerName.anchor = GridBagConstraints.WEST;
		gbc_lblBenutzerName.insets = new Insets(0, 0, 5, 0);
		gbc_lblBenutzerName.gridx = 2;
		gbc_lblBenutzerName.gridy = 1;
		add(lblBenutzerName, gbc_lblBenutzerName);
		GridBagConstraints gbc_tfName = new GridBagConstraints();
		gbc_tfName.insets = new Insets(0, 0, 5, 5);
		gbc_tfName.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfName.gridx = 1;
		gbc_tfName.gridy = 2;
		add(tfName, gbc_tfName);
		tfName.setColumns(10);

		tfBenutzername = new JTextField();
		GridBagConstraints gbc_tfBenutzername = new GridBagConstraints();
		gbc_tfBenutzername.insets = new Insets(0, 0, 5, 0);
		gbc_tfBenutzername.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfBenutzername.gridx = 2;
		gbc_tfBenutzername.gridy = 2;
		add(tfBenutzername, gbc_tfBenutzername);
		tfBenutzername.setColumns(10);

		JLabel lblMitarbeiterLoeschenNachname = new JLabel("Nachname*");
		lblMitarbeiterLoeschenNachname.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMitarbeiterLoeschenNachname = new GridBagConstraints();
		gbc_lblMitarbeiterLoeschenNachname.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterLoeschenNachname.insets = new Insets(0, 0, 5, 5);
		gbc_lblMitarbeiterLoeschenNachname.gridx = 1;
		gbc_lblMitarbeiterLoeschenNachname.gridy = 3;
		add(lblMitarbeiterLoeschenNachname, gbc_lblMitarbeiterLoeschenNachname);

		tfNachname = new JTextField();
		tfNachname.setFont(new Font("Arial", Font.PLAIN, 12));
		tfNachname.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!(Character.isAlphabetic(c) || (c == KeyEvent.VK_SPACE) || c == KeyEvent.VK_DELETE
						|| c == KeyEvent.VK_MINUS)) {
					e.consume(); // ignore the event if it's not an alphabet
				}
			}
		});

		JLabel lblPasswort = new JLabel("Passwort");
		lblPasswort.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 3;
		add(lblPasswort, gbc_lblNewLabel);
		GridBagConstraints gbc_tfNachname = new GridBagConstraints();
		gbc_tfNachname.insets = new Insets(0, 0, 5, 5);
		gbc_tfNachname.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfNachname.gridx = 1;
		gbc_tfNachname.gridy = 4;
		add(tfNachname, gbc_tfNachname);
		tfNachname.setColumns(10);

		tfPasswort = new JPasswordField();
		GridBagConstraints gbc_tfPasswort = new GridBagConstraints();
		gbc_tfPasswort.insets = new Insets(0, 0, 5, 0);
		gbc_tfPasswort.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfPasswort.gridx = 2;
		gbc_tfPasswort.gridy = 4;
		add(tfPasswort, gbc_tfPasswort);
		tfPasswort.setColumns(10);

		JLabel lblMitarbeiterLoeschenNummer = new JLabel("Nummer*");
		lblMitarbeiterLoeschenNummer.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMitarbeiterLoeschenNummer = new GridBagConstraints();
		gbc_lblMitarbeiterLoeschenNummer.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterLoeschenNummer.insets = new Insets(0, 0, 5, 5);
		gbc_lblMitarbeiterLoeschenNummer.gridx = 1;
		gbc_lblMitarbeiterLoeschenNummer.gridy = 5;
		add(lblMitarbeiterLoeschenNummer, gbc_lblMitarbeiterLoeschenNummer);

		JLabel lblPasswortWhd = new JLabel("Passwort wiederholen");
		lblPasswortWhd.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_2.gridx = 2;
		gbc_lblNewLabel_2.gridy = 5;
		add(lblPasswortWhd, gbc_lblNewLabel_2);

		tfID = new JTextField();
		tfID.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_tfID = new GridBagConstraints();
		gbc_tfID.insets = new Insets(0, 0, 5, 5);
		gbc_tfID.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfID.gridx = 1;
		gbc_tfID.gridy = 6;
		add(tfID, gbc_tfID);
		tfID.setColumns(10);

		JButton btnMitarbeiterAuswaehlen = new JButton("Mitarbeiter auswaehlen");
		btnMitarbeiterAuswaehlen.setFont(new Font("Arial", Font.BOLD, 12));
		btnMitarbeiterAuswaehlen.addActionListener(e -> waehlenMitarbeiter());
		GridBagConstraints gbc_btnMitarbeiterLoeschen = new GridBagConstraints();
		gbc_btnMitarbeiterLoeschen.insets = new Insets(0, 0, 0, 5);
		gbc_btnMitarbeiterLoeschen.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnMitarbeiterLoeschen.gridx = 1;
		gbc_btnMitarbeiterLoeschen.gridy = 8;
		add(btnMitarbeiterAuswaehlen, gbc_btnMitarbeiterLoeschen);

		tfPasswortWhd = new JPasswordField();
		GridBagConstraints gbc_tfPasswortWhd = new GridBagConstraints();
		gbc_tfPasswortWhd.insets = new Insets(0, 0, 5, 0);
		gbc_tfPasswortWhd.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfPasswortWhd.gridx = 2;
		gbc_tfPasswortWhd.gridy = 6;
		add(tfPasswortWhd, gbc_tfPasswortWhd);
		tfPasswortWhd.setColumns(10);

		JButton btnBenutzerAnlegen = new JButton("Benutzer anlegen");
		btnBenutzerAnlegen.setFont(new Font("Arial", Font.BOLD, 12));
		btnBenutzerAnlegen.addActionListener(e -> anlegenBenutzer());
		GridBagConstraints gbc_btnBenutzerAnlegen = new GridBagConstraints();
		gbc_btnBenutzerAnlegen.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnBenutzerAnlegen.gridx = 2;
		gbc_btnBenutzerAnlegen.gridy = 8;
		add(btnBenutzerAnlegen, gbc_btnBenutzerAnlegen);

	}

	/**
	 * Metode sucht den Mitarbeiter der den neuen Benutzer anlgen kann
	 */
	public static void waehlenMitarbeiter() {

		String name = tfName.getText();
		String nachname = tfNachname.getText();
		String idInput = tfID.getText();

		if (name.equals("") || nachname.equals("") || idInput.equals("")) {

			JOptionPane.showMessageDialog(null, "Deine Eingabe ist nicht vollstaendig. Bitte aendere deine Eingabe");

		} else {
			ArrayList<Mitarbeiter> mitarbeiter = MitarbeiterDB.ausgebenMitarbeiterAlle();

			for (int i = 0; i < mitarbeiter.size(); i++) {

				Mitarbeiter m = mitarbeiter.get(i);
				String id = "" + m.getName().charAt(0) + m.getNachname().charAt(0) + m.getGeb();

				if (m.getName().equals(name) && m.getNachname().equals(nachname) && id.equals(idInput)
						&& m.getAbteilung().equals("PERSONALABTEILUNG")) {

					tfName.setText("");
					tfNachname.setText("");
					tfID.setText("");

					enableTextField();
				}
			}
		}
	}

	/**
	 * Methode zum anlegen eines neuen Benutzers
	 */
	public static void anlegenBenutzer() {

		String benutzer = tfBenutzername.getText();
		String pw1 = String.valueOf(tfPasswort.getPassword());
		String pw2 = String.valueOf(tfPasswortWhd.getPassword());

		if (pw1.equals(pw2) && !pw1.equals("")) {

			PasswortDB.hinzufuegenBenutzer(benutzer, pw1);

		} else {
			JOptionPane.showMessageDialog(null,
					"Deine Passworte stimmen nicht ueberein. Bitte aendere deine Eingabe");

		}

		clearAll();
		disableTextField();
	}

	public static void disableTextField() {

		boolean nein = false;

		tfBenutzername.setEnabled(nein);
		tfPasswort.setEnabled(nein);
		tfPasswortWhd.setEnabled(nein);
	}

	private static void enableTextField() {

		boolean ja = true;

		tfBenutzername.setEnabled(ja);
		tfPasswort.setEnabled(ja);
		tfPasswortWhd.setEnabled(ja);
	}

	public static void clearAll() {

		tfName.setText("");
		tfNachname.setText("");
		tfID.setText("");
		tfPasswortWhd.setText("");
		tfPasswort.setText("");
		tfBenutzername.setText("");
	}

}
