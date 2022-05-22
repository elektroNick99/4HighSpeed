package HauptfensterPanels;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import de.fourHighSpeedHR.database.BewerberDB;
import de.fourHighSpeedHR.database.MitarbeiterDB;
import de.fourHighSpeedHR.objects.Bewerber;
import de.fourHighSpeedHR.objects.Mitarbeiter;

public class BewerberEinstellen extends JPanel {

	private static String idB;
	private static String gebB;

	private static JTextField tfName;
	private static JTextField tfNachname;
	private static JTextField tfStrasse;
	private static JTextField tfHNR;
	private static JTextField tfOrt;
	private static JTextField tfPLZ;
	private static JTextField tfTel;
	private static JTextField tfAbteilung;
	private static JTextField tfGehalt;
	private static JTextField tfNameSuchen;
	private static JTextField tfNachnameSuchen;
	private static JTextField tfNummer;
	
	/**
	 * Create the panel.
	 */
	public BewerberEinstellen() {

		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 60, 112, 144, 236, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 29, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel lblBewerberEinstellen = new JLabel("Bewerber einstellen");
		lblBewerberEinstellen.setFont(new Font("Arial", Font.BOLD, 15));
		GridBagConstraints gbc_lblBewerberEinstellen = new GridBagConstraints();
		gbc_lblBewerberEinstellen.anchor = GridBagConstraints.WEST;
		gbc_lblBewerberEinstellen.insets = new Insets(0, 0, 5, 5);
		gbc_lblBewerberEinstellen.gridx = 1;
		gbc_lblBewerberEinstellen.gridy = 0;
		add(lblBewerberEinstellen, gbc_lblBewerberEinstellen);

		JLabel lblBewerberSuchen = new JLabel("Bewerber suchen");
		lblBewerberSuchen.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblBewerberSuchen = new GridBagConstraints();
		gbc_lblBewerberSuchen.anchor = GridBagConstraints.WEST;
		gbc_lblBewerberSuchen.insets = new Insets(0, 0, 5, 5);
		gbc_lblBewerberSuchen.gridx = 1;
		gbc_lblBewerberSuchen.gridy = 1;
		add(lblBewerberSuchen, gbc_lblBewerberSuchen);

		JLabel lblDatenAendern = new JLabel("Daten aendern");
		lblDatenAendern.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblDatenAendern = new GridBagConstraints();
		gbc_lblDatenAendern.anchor = GridBagConstraints.WEST;
		gbc_lblDatenAendern.insets = new Insets(0, 0, 5, 5);
		gbc_lblDatenAendern.gridx = 3;
		gbc_lblDatenAendern.gridy = 1;
		add(lblDatenAendern, gbc_lblDatenAendern);

		JLabel lblNameSuchen = new JLabel("Name*");
		lblNameSuchen.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblNameSuchen = new GridBagConstraints();
		gbc_lblNameSuchen.anchor = GridBagConstraints.WEST;
		gbc_lblNameSuchen.insets = new Insets(0, 0, 5, 5);
		gbc_lblNameSuchen.gridx = 1;
		gbc_lblNameSuchen.gridy = 2;
		add(lblNameSuchen, gbc_lblNameSuchen);

		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblName = new GridBagConstraints();
		gbc_lblName.insets = new Insets(0, 0, 5, 5);
		gbc_lblName.anchor = GridBagConstraints.WEST;
		gbc_lblName.gridx = 3;
		gbc_lblName.gridy = 2;
		add(lblName, gbc_lblName);

		tfNameSuchen = new JTextField();
		tfNameSuchen.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_tfNameSuchen = new GridBagConstraints();
		gbc_tfNameSuchen.insets = new Insets(0, 0, 5, 5);
		gbc_tfNameSuchen.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfNameSuchen.gridx = 1;
		gbc_tfNameSuchen.gridy = 3;
		add(tfNameSuchen, gbc_tfNameSuchen);
		tfNameSuchen.setColumns(10);

		tfName = new JTextField();
		tfName.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_tfName = new GridBagConstraints();
		gbc_tfName.insets = new Insets(0, 0, 5, 5);
		gbc_tfName.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfName.gridx = 3;
		gbc_tfName.gridy = 3;
		add(tfName, gbc_tfName);
		tfName.setColumns(10);

		JLabel lblNachnameSuchen = new JLabel("Nachname*");
		lblNachnameSuchen.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblNachnameSuchen = new GridBagConstraints();
		gbc_lblNachnameSuchen.anchor = GridBagConstraints.WEST;
		gbc_lblNachnameSuchen.insets = new Insets(0, 0, 5, 5);
		gbc_lblNachnameSuchen.gridx = 1;
		gbc_lblNachnameSuchen.gridy = 4;
		add(lblNachnameSuchen, gbc_lblNachnameSuchen);

		JLabel lblNachname = new JLabel("Nachname");
		lblNachname.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblNachname = new GridBagConstraints();
		gbc_lblNachname.insets = new Insets(0, 0, 5, 5);
		gbc_lblNachname.anchor = GridBagConstraints.WEST;
		gbc_lblNachname.gridx = 3;
		gbc_lblNachname.gridy = 4;
		add(lblNachname, gbc_lblNachname);

		tfNachnameSuchen = new JTextField();
		tfNachnameSuchen.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_tfNachnameSuchen = new GridBagConstraints();
		gbc_tfNachnameSuchen.insets = new Insets(0, 0, 5, 5);
		gbc_tfNachnameSuchen.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfNachnameSuchen.gridx = 1;
		gbc_tfNachnameSuchen.gridy = 5;
		add(tfNachnameSuchen, gbc_tfNachnameSuchen);
		tfNachnameSuchen.setColumns(10);

		tfNachname = new JTextField();
		tfNachname.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_tfNachname = new GridBagConstraints();
		gbc_tfNachname.insets = new Insets(0, 0, 5, 5);
		gbc_tfNachname.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfNachname.gridx = 3;
		gbc_tfNachname.gridy = 5;
		add(tfNachname, gbc_tfNachname);
		tfNachname.setColumns(10);

		JLabel lblNummer = new JLabel("Nummer*");
		lblNummer.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblNummer = new GridBagConstraints();
		gbc_lblNummer.anchor = GridBagConstraints.WEST;
		gbc_lblNummer.insets = new Insets(0, 0, 5, 5);
		gbc_lblNummer.gridx = 1;
		gbc_lblNummer.gridy = 6;
		add(lblNummer, gbc_lblNummer);

		JLabel lblAdresse = new JLabel("Adresse");
		lblAdresse.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblAdresse = new GridBagConstraints();
		gbc_lblAdresse.insets = new Insets(0, 0, 5, 5);
		gbc_lblAdresse.anchor = GridBagConstraints.WEST;
		gbc_lblAdresse.gridx = 3;
		gbc_lblAdresse.gridy = 6;
		add(lblAdresse, gbc_lblAdresse);

		tfNummer = new JTextField();
		tfNummer.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_tfNummer = new GridBagConstraints();
		gbc_tfNummer.insets = new Insets(0, 0, 5, 5);
		gbc_tfNummer.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfNummer.gridx = 1;
		gbc_tfNummer.gridy = 7;
		add(tfNummer, gbc_tfNummer);
		tfNummer.setColumns(10);

		JLabel lblStrasse = new JLabel("Strasse");
		lblStrasse.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStrasse = new GridBagConstraints();
		gbc_lblStrasse.insets = new Insets(0, 0, 5, 5);
		gbc_lblStrasse.anchor = GridBagConstraints.WEST;
		gbc_lblStrasse.gridx = 3;
		gbc_lblStrasse.gridy = 7;
		add(lblStrasse, gbc_lblStrasse);

		JLabel lblHNR = new JLabel("HNR");
		lblHNR.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblHNR = new GridBagConstraints();
		gbc_lblHNR.anchor = GridBagConstraints.WEST;
		gbc_lblHNR.insets = new Insets(0, 0, 5, 0);
		gbc_lblHNR.gridx = 4;
		gbc_lblHNR.gridy = 7;
		add(lblHNR, gbc_lblHNR);

		JButton btnBewerberSuchen = new JButton("Suchen");
		btnBewerberSuchen.setFont(new Font("Arial", Font.BOLD, 12));
		btnBewerberSuchen.addActionListener(e -> suchen());
		GridBagConstraints gbc_btnBewerberSuchen = new GridBagConstraints();
		gbc_btnBewerberSuchen.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnBewerberSuchen.insets = new Insets(0, 0, 5, 5);
		gbc_btnBewerberSuchen.gridx = 1;
		gbc_btnBewerberSuchen.gridy = 8;
		add(btnBewerberSuchen, gbc_btnBewerberSuchen);

		tfStrasse = new JTextField();
		tfStrasse.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_tfStrasse = new GridBagConstraints();
		gbc_tfStrasse.insets = new Insets(0, 0, 5, 5);
		gbc_tfStrasse.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfStrasse.gridx = 3;
		gbc_tfStrasse.gridy = 8;
		add(tfStrasse, gbc_tfStrasse);
		tfStrasse.setColumns(10);

		tfHNR = new JTextField();
		tfHNR.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_tfHNR = new GridBagConstraints();
		gbc_tfHNR.insets = new Insets(0, 0, 5, 0);
		gbc_tfHNR.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfHNR.gridx = 4;
		gbc_tfHNR.gridy = 8;
		add(tfHNR, gbc_tfHNR);
		tfHNR.setColumns(10);

		JLabel lblOrt = new JLabel("Ort");
		lblOrt.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblOrt = new GridBagConstraints();
		gbc_lblOrt.anchor = GridBagConstraints.WEST;
		gbc_lblOrt.insets = new Insets(0, 0, 5, 5);
		gbc_lblOrt.gridx = 3;
		gbc_lblOrt.gridy = 9;
		add(lblOrt, gbc_lblOrt);

		JLabel lblPLZ = new JLabel("PLZ");
		lblPLZ.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblPLZ = new GridBagConstraints();
		gbc_lblPLZ.insets = new Insets(0, 0, 5, 0);
		gbc_lblPLZ.anchor = GridBagConstraints.WEST;
		gbc_lblPLZ.gridx = 4;
		gbc_lblPLZ.gridy = 9;
		add(lblPLZ, gbc_lblPLZ);

		tfOrt = new JTextField();
		tfOrt.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_tfOrt = new GridBagConstraints();
		gbc_tfOrt.insets = new Insets(0, 0, 5, 5);
		gbc_tfOrt.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfOrt.gridx = 3;
		gbc_tfOrt.gridy = 10;
		add(tfOrt, gbc_tfOrt);
		tfOrt.setColumns(10);

		tfPLZ = new JTextField();
		tfPLZ.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_tfPLZ = new GridBagConstraints();
		gbc_tfPLZ.insets = new Insets(0, 0, 5, 0);
		gbc_tfPLZ.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfPLZ.gridx = 4;
		gbc_tfPLZ.gridy = 10;
		add(tfPLZ, gbc_tfPLZ);
		tfPLZ.setColumns(10);

		JLabel lblTel = new JLabel("Tel.:");
		lblTel.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblTel = new GridBagConstraints();
		gbc_lblTel.anchor = GridBagConstraints.WEST;
		gbc_lblTel.insets = new Insets(0, 0, 5, 5);
		gbc_lblTel.gridx = 3;
		gbc_lblTel.gridy = 11;
		add(lblTel, gbc_lblTel);

		tfTel = new JTextField();
		tfTel.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_tfTel = new GridBagConstraints();
		gbc_tfTel.insets = new Insets(0, 0, 5, 5);
		gbc_tfTel.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfTel.gridx = 3;
		gbc_tfTel.gridy = 12;
		add(tfTel, gbc_tfTel);
		tfTel.setColumns(10);

		JLabel lblAbteilung = new JLabel("Abteilung");
		lblAbteilung.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblAbteilung = new GridBagConstraints();
		gbc_lblAbteilung.anchor = GridBagConstraints.WEST;
		gbc_lblAbteilung.insets = new Insets(0, 0, 5, 5);
		gbc_lblAbteilung.gridx = 3;
		gbc_lblAbteilung.gridy = 13;
		add(lblAbteilung, gbc_lblAbteilung);

		JLabel lblGehlat = new JLabel("Gehalt");
		lblGehlat.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblGehlat = new GridBagConstraints();
		gbc_lblGehlat.anchor = GridBagConstraints.WEST;
		gbc_lblGehlat.insets = new Insets(0, 0, 5, 0);
		gbc_lblGehlat.gridx = 4;
		gbc_lblGehlat.gridy = 13;
		add(lblGehlat, gbc_lblGehlat);

		tfAbteilung = new JTextField();
		tfAbteilung.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_tfAbteilung = new GridBagConstraints();
		gbc_tfAbteilung.anchor = GridBagConstraints.NORTH;
		gbc_tfAbteilung.insets = new Insets(0, 0, 5, 5);
		gbc_tfAbteilung.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfAbteilung.gridx = 3;
		gbc_tfAbteilung.gridy = 14;
		add(tfAbteilung, gbc_tfAbteilung);
		tfAbteilung.setColumns(10);

		tfGehalt = new JTextField();
		tfGehalt.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_tfGehalt = new GridBagConstraints();
		gbc_tfGehalt.insets = new Insets(0, 0, 5, 0);
		gbc_tfGehalt.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfGehalt.gridx = 4;
		gbc_tfGehalt.gridy = 14;
		add(tfGehalt, gbc_tfGehalt);
		tfGehalt.setColumns(10);

		JButton btnSpeichern = new JButton("Speichern");
		btnSpeichern.setFont(new Font("Arial", Font.BOLD, 12));
		btnSpeichern.addActionListener(e -> speichern());
		GridBagConstraints gbc_btnSpeichern = new GridBagConstraints();
		gbc_btnSpeichern.gridwidth = 2;
		gbc_btnSpeichern.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnSpeichern.gridx = 3;
		gbc_btnSpeichern.gridy = 15;
		add(btnSpeichern, gbc_btnSpeichern);

	}

	public static void suchen() {

		String nameInput = tfNameSuchen.getText();
		String nachnameInput = tfNachnameSuchen.getText();
		String idInput = tfNummer.getText();

		if (nameInput.equals("") || nameInput.equals("") || idInput.equals("")) {

			JOptionPane.showMessageDialog(null, "Deine Eingabe ist nicht vollstaendig. Bitte aendere deine Eingabe");

		} else {
			ArrayList<Bewerber> bewerber = BewerberDB.ausgebenBewerberAlle();

			for (int i = 0; i < bewerber.size(); i++) {

				Bewerber b = bewerber.get(i);
				String id = "" + b.getName().charAt(0) + b.getNachname().charAt(0) + b.getGeb();

				if (b.getName().equals(nameInput) && b.getNachname().equals(nachnameInput) && id.equals(idInput)) {

					tfName.setText(b.getName());
					tfNachname.setText(b.getNachname());
					tfOrt.setText(b.getOrt());
					tfStrasse.setText(b.getStrasse());
					tfHNR.setText(String.valueOf(b.getHnr()));
					tfTel.setText(String.valueOf(b.getTel()));
					tfPLZ.setText(String.valueOf(b.getPlz()));

					tfNameSuchen.setText("");
					tfNachnameSuchen.setText("");
					tfNummer.setText("");

					idB = id;
					gebB = b.getGeb();

					break;

				}
			}
		}

	}

	public static void speichern() {

		String name = "";
		String nachname = "";
		String strasse = "";
		String ort = "";
		String abteilung = "";
		int hnr = 0, plz = 0, gehalt = 0;
		long tel = 0;

		/**
		 * Erst Nummern ueberpruefen da sonst NumberFormatException
		 */

		if (tfHNR.getText().equals("") || tfPLZ.getText().equals("")
				|| tfTel.getText().equals("") || tfGehalt.getText().equals("")) {

		} else {

			name = tfName.getText();
			nachname = tfNachname.getText();
			strasse = tfStrasse.getText();
			hnr = Integer.valueOf(tfHNR.getText());
			ort = tfOrt.getText();
			plz = Integer.valueOf(tfPLZ.getText());
			tel = Long.valueOf(tfTel.getText());
			abteilung = tfAbteilung.getText();
			gehalt = Integer.valueOf(tfGehalt.getText());

		}

		/**
		 * Test ob alle Felder ausgefüllt sind
		 */

		if (name.equals("") || nachname.equals("") || strasse.equals("") || ort.equals("") || abteilung.equals("")
				|| hnr == 0 || plz == 0 || gehalt == 0 || tel == 0) {

			JOptionPane.showMessageDialog(null, "Deine Eingabe ist nicht vollstaendig. Bitte aendere deine Eingabe");

		} else {
			
			BewerberDB.loeschenBewerber(idB);
			
			MitarbeiterDB.hinzufuegenMitarbeiter(
					new Mitarbeiter(name, nachname, strasse, hnr, ort, plz, tel, abteilung, gehalt, gebB));
		
			tfName.setText("");
			tfNachname.setText("");
			tfStrasse.setText("");
			tfHNR.setText("");
			tfOrt.setText("");
			tfPLZ.setText("");
			tfTel.setText("");
			tfAbteilung.setText("");
			tfGehalt.setText("");
		}
		
	}

}
