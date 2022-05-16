package HauptfensterPanels;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.NumberFormatter;

import de.fourHighSpeedHR.database.MitarbeiterDB;
import de.fourHighSpeedHR.objects.Mitarbeiter;


public class MitarbeiterAnlegen extends JPanel {

	private static JTextField mitarbeiterAnlegenName;
	private static JTextField mitarbeiterAnlegenNachname;
	private static JTextField mitarbeiterAnlegenStraße;
	private static JFormattedTextField mitarbeiterAnlegenHNR;
	private static JTextField mitarbeiterAnlegenOrt;
	private static JFormattedTextField mitarbeiterAnlegenPLZ;
	private static JFormattedTextField mitarbeiterAnlegenTel;
	private static JTextField mitarbeiterAnlegenAbteilung;
	private static JFormattedTextField mitarbeiterAnlegenGehalt;
	private static JFormattedTextField tfGeburtstagJahr;
	private static JFormattedTextField tfGeburtstagMonat;
	private static JFormattedTextField tfGeburtstagTag;
	
	static String [] args;
	
	/**
	 * Create the panel.
	 */
	
	public MitarbeiterAnlegen(String [] args) {
		this.args = args;
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{60, 236, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 29, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblMitarbeiterAnlegen = new JLabel("Neuer Mitarbeiter anlegen");
		lblMitarbeiterAnlegen.setFont(new Font("Arial", Font.BOLD, 15));
		GridBagConstraints gbc_lblMitarbeiterAnlegen = new GridBagConstraints();
		gbc_lblMitarbeiterAnlegen.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterAnlegen.insets = new Insets(0, 0, 5, 5);
		gbc_lblMitarbeiterAnlegen.gridx = 1;
		gbc_lblMitarbeiterAnlegen.gridy = 0;
		add(lblMitarbeiterAnlegen, gbc_lblMitarbeiterAnlegen);
		
		JLabel lblMitarbeiterAnlegenName = new JLabel("Name");
		lblMitarbeiterAnlegenName.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMitarbeiterAnlegenName = new GridBagConstraints();
		gbc_lblMitarbeiterAnlegenName.insets = new Insets(0, 0, 5, 5);
		gbc_lblMitarbeiterAnlegenName.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterAnlegenName.gridx = 1;
		gbc_lblMitarbeiterAnlegenName.gridy = 1;
		add(lblMitarbeiterAnlegenName, gbc_lblMitarbeiterAnlegenName);
		
	    mitarbeiterAnlegenName = new JTextField();
	    mitarbeiterAnlegenName.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_mitarbeiterAnlegenName = new GridBagConstraints();
		gbc_mitarbeiterAnlegenName.insets = new Insets(0, 0, 5, 5);
		gbc_mitarbeiterAnlegenName.fill = GridBagConstraints.HORIZONTAL;
		gbc_mitarbeiterAnlegenName.gridx = 1;
		gbc_mitarbeiterAnlegenName.gridy = 2;
		add(mitarbeiterAnlegenName, gbc_mitarbeiterAnlegenName);
		mitarbeiterAnlegenName.setColumns(20);
		
		JLabel lblMitarbeiterAnlegenNachname = new JLabel("Nachname");
		lblMitarbeiterAnlegenNachname.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMitarbeiterAnlegenNachname = new GridBagConstraints();
		gbc_lblMitarbeiterAnlegenNachname.insets = new Insets(0, 0, 5, 5);
		gbc_lblMitarbeiterAnlegenNachname.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterAnlegenNachname.gridx = 1;
		gbc_lblMitarbeiterAnlegenNachname.gridy = 3;
		add(lblMitarbeiterAnlegenNachname, gbc_lblMitarbeiterAnlegenNachname);
		
		JLabel lblMitarbeiterAnlegenGeburtstag = new JLabel("Geburtstag (YYYY/MM/DD)");
		lblMitarbeiterAnlegenGeburtstag.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMitarbeiterAnlegenGeburtstag = new GridBagConstraints();
		gbc_lblMitarbeiterAnlegenGeburtstag.gridwidth = 3;
		gbc_lblMitarbeiterAnlegenGeburtstag.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterAnlegenGeburtstag.insets = new Insets(0, 0, 5, 0);
		gbc_lblMitarbeiterAnlegenGeburtstag.gridx = 2;
		gbc_lblMitarbeiterAnlegenGeburtstag.gridy = 3;
		add(lblMitarbeiterAnlegenGeburtstag, gbc_lblMitarbeiterAnlegenGeburtstag);
		
		mitarbeiterAnlegenNachname = new JTextField();
		mitarbeiterAnlegenNachname.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_mitarbeiterAnlegenNachname = new GridBagConstraints();
		gbc_mitarbeiterAnlegenNachname.insets = new Insets(0, 0, 5, 5);
		gbc_mitarbeiterAnlegenNachname.fill = GridBagConstraints.HORIZONTAL;
		gbc_mitarbeiterAnlegenNachname.gridx = 1;
		gbc_mitarbeiterAnlegenNachname.gridy = 4;
		add(mitarbeiterAnlegenNachname, gbc_mitarbeiterAnlegenNachname);
		mitarbeiterAnlegenNachname.setColumns(20);
		
		tfGeburtstagJahr = new JFormattedTextField(getNuberformatter());
		GridBagConstraints gbc_tfGeburtstagJahr = new GridBagConstraints();
		gbc_tfGeburtstagJahr.insets = new Insets(0, 0, 5, 5);
		gbc_tfGeburtstagJahr.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfGeburtstagJahr.gridx = 2;
		gbc_tfGeburtstagJahr.gridy = 4;
		add(tfGeburtstagJahr, gbc_tfGeburtstagJahr);
		tfGeburtstagJahr.setColumns(4);
		
		tfGeburtstagMonat = new JFormattedTextField(getNuberformatter());
		GridBagConstraints gbc_tfGeburtstagMonat = new GridBagConstraints();
		gbc_tfGeburtstagMonat.insets = new Insets(0, 0, 5, 5);
		gbc_tfGeburtstagMonat.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfGeburtstagMonat.gridx = 3;
		gbc_tfGeburtstagMonat.gridy = 4;
		add(tfGeburtstagMonat, gbc_tfGeburtstagMonat);
		tfGeburtstagMonat.setColumns(2);
		
		tfGeburtstagTag = new JFormattedTextField(getNuberformatter());
		GridBagConstraints gbc_tfGeburtstagTag = new GridBagConstraints();
		gbc_tfGeburtstagTag.insets = new Insets(0, 0, 5, 0);
		gbc_tfGeburtstagTag.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfGeburtstagTag.gridx = 4;
		gbc_tfGeburtstagTag.gridy = 4;
		add(tfGeburtstagTag, gbc_tfGeburtstagTag);
		tfGeburtstagTag.setColumns(2);
		
		JLabel lblMitarbeiterAnlegenAdresse = new JLabel("Adresse");
		lblMitarbeiterAnlegenAdresse.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblMitarbeiterAnlegenAdresse = new GridBagConstraints();
		gbc_lblMitarbeiterAnlegenAdresse.insets = new Insets(0, 0, 5, 5);
		gbc_lblMitarbeiterAnlegenAdresse.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterAnlegenAdresse.gridx = 1;
		gbc_lblMitarbeiterAnlegenAdresse.gridy = 5;
		add(lblMitarbeiterAnlegenAdresse, gbc_lblMitarbeiterAnlegenAdresse);
		
		JLabel lblMitarbeiterAnlegenStraße = new JLabel("Straße");
		lblMitarbeiterAnlegenStraße.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMitarbeiterAnlegenStraße = new GridBagConstraints();
		gbc_lblMitarbeiterAnlegenStraße.insets = new Insets(0, 0, 5, 5);
		gbc_lblMitarbeiterAnlegenStraße.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterAnlegenStraße.gridx = 1;
		gbc_lblMitarbeiterAnlegenStraße.gridy = 6;
		add(lblMitarbeiterAnlegenStraße, gbc_lblMitarbeiterAnlegenStraße);
		
		JLabel lblMitarbeiterAnlegenHNR = new JLabel("HNR");
		lblMitarbeiterAnlegenHNR.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMitarbeiterAnlegenHNR = new GridBagConstraints();
		gbc_lblMitarbeiterAnlegenHNR.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterAnlegenHNR.insets = new Insets(0, 0, 5, 5);
		gbc_lblMitarbeiterAnlegenHNR.gridx = 2;
		gbc_lblMitarbeiterAnlegenHNR.gridy = 6;
		add(lblMitarbeiterAnlegenHNR, gbc_lblMitarbeiterAnlegenHNR);
		
		mitarbeiterAnlegenStraße = new JTextField();
		mitarbeiterAnlegenStraße.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_mitarbeiterAnlegenStraße = new GridBagConstraints();
		gbc_mitarbeiterAnlegenStraße.insets = new Insets(0, 0, 5, 5);
		gbc_mitarbeiterAnlegenStraße.fill = GridBagConstraints.HORIZONTAL;
		gbc_mitarbeiterAnlegenStraße.gridx = 1;
		gbc_mitarbeiterAnlegenStraße.gridy = 7;
		add(mitarbeiterAnlegenStraße, gbc_mitarbeiterAnlegenStraße);
		mitarbeiterAnlegenStraße.setColumns(25);
		
		mitarbeiterAnlegenHNR = new JFormattedTextField(getNuberformatter());
		mitarbeiterAnlegenHNR.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_mitarbeiterAnlegenHNR = new GridBagConstraints();
		gbc_mitarbeiterAnlegenHNR.gridwidth = 2;
		gbc_mitarbeiterAnlegenHNR.insets = new Insets(0, 0, 5, 0);
		gbc_mitarbeiterAnlegenHNR.fill = GridBagConstraints.HORIZONTAL;
		gbc_mitarbeiterAnlegenHNR.gridx = 2;
		gbc_mitarbeiterAnlegenHNR.gridy = 7;
		add(mitarbeiterAnlegenHNR, gbc_mitarbeiterAnlegenHNR);
		mitarbeiterAnlegenHNR.setColumns(4);
		
		JLabel lblMitarbeiterAnlegenOrt = new JLabel("Ort");
		lblMitarbeiterAnlegenOrt.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMitarbeiterAnlegenOrt = new GridBagConstraints();
		gbc_lblMitarbeiterAnlegenOrt.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterAnlegenOrt.insets = new Insets(0, 0, 5, 5);
		gbc_lblMitarbeiterAnlegenOrt.gridx = 1;
		gbc_lblMitarbeiterAnlegenOrt.gridy = 8;
		add(lblMitarbeiterAnlegenOrt, gbc_lblMitarbeiterAnlegenOrt);
		
		JLabel lblMitarbeiterAnlegenPLZ = new JLabel("PLZ");
		lblMitarbeiterAnlegenPLZ.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMitarbeiterAnlegenPLZ = new GridBagConstraints();
		gbc_lblMitarbeiterAnlegenPLZ.insets = new Insets(0, 0, 5, 5);
		gbc_lblMitarbeiterAnlegenPLZ.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterAnlegenPLZ.gridx = 2;
		gbc_lblMitarbeiterAnlegenPLZ.gridy = 8;
		add(lblMitarbeiterAnlegenPLZ, gbc_lblMitarbeiterAnlegenPLZ);
		
		mitarbeiterAnlegenOrt = new JTextField();
		mitarbeiterAnlegenOrt.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_mitarbeiterAnlegenOrt = new GridBagConstraints();
		gbc_mitarbeiterAnlegenOrt.insets = new Insets(0, 0, 5, 5);
		gbc_mitarbeiterAnlegenOrt.fill = GridBagConstraints.HORIZONTAL;
		gbc_mitarbeiterAnlegenOrt.gridx = 1;
		gbc_mitarbeiterAnlegenOrt.gridy = 9;
		add(mitarbeiterAnlegenOrt, gbc_mitarbeiterAnlegenOrt);
		mitarbeiterAnlegenOrt.setColumns(25);
		
		mitarbeiterAnlegenPLZ = new JFormattedTextField(getNuberformatter());
		GridBagConstraints gbc_mitarbeiterAnlegenPLZ = new GridBagConstraints();
		gbc_mitarbeiterAnlegenPLZ.gridwidth = 2;
		gbc_mitarbeiterAnlegenPLZ.insets = new Insets(0, 0, 5, 0);
		gbc_mitarbeiterAnlegenPLZ.fill = GridBagConstraints.HORIZONTAL;
		gbc_mitarbeiterAnlegenPLZ.gridx = 2;
		gbc_mitarbeiterAnlegenPLZ.gridy = 9;
		add(mitarbeiterAnlegenPLZ, gbc_mitarbeiterAnlegenPLZ);
		mitarbeiterAnlegenPLZ.setColumns(5);
		
		JLabel lblMitarbeiterAnlegenTel = new JLabel("Tel.:");
		lblMitarbeiterAnlegenTel.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMitarbeiterAnlegenTel = new GridBagConstraints();
		gbc_lblMitarbeiterAnlegenTel.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterAnlegenTel.insets = new Insets(0, 0, 5, 5);
		gbc_lblMitarbeiterAnlegenTel.gridx = 1;
		gbc_lblMitarbeiterAnlegenTel.gridy = 10;
		add(lblMitarbeiterAnlegenTel, gbc_lblMitarbeiterAnlegenTel);
		
		mitarbeiterAnlegenTel = new JFormattedTextField(getNuberformatter());
		mitarbeiterAnlegenTel.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_mitarbeiterAnlegenTel = new GridBagConstraints();
		gbc_mitarbeiterAnlegenTel.insets = new Insets(0, 0, 5, 5);
		gbc_mitarbeiterAnlegenTel.fill = GridBagConstraints.HORIZONTAL;
		gbc_mitarbeiterAnlegenTel.gridx = 1;
		gbc_mitarbeiterAnlegenTel.gridy = 11;
		add(mitarbeiterAnlegenTel, gbc_mitarbeiterAnlegenTel);
		mitarbeiterAnlegenTel.setColumns(11);
		
		JLabel lblMitarbeiterAnlegenAbteilung = new JLabel("Abteilung");
		lblMitarbeiterAnlegenAbteilung.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMitarbeiterAnlegenAbteilung = new GridBagConstraints();
		gbc_lblMitarbeiterAnlegenAbteilung.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterAnlegenAbteilung.insets = new Insets(0, 0, 5, 5);
		gbc_lblMitarbeiterAnlegenAbteilung.gridx = 1;
		gbc_lblMitarbeiterAnlegenAbteilung.gridy = 12;
		add(lblMitarbeiterAnlegenAbteilung, gbc_lblMitarbeiterAnlegenAbteilung);
		
		JLabel lblMitarbeiterAnlegenGehalt = new JLabel("Gehalt");
		lblMitarbeiterAnlegenGehalt.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMitarbeiterAnlegenGehalt = new GridBagConstraints();
		gbc_lblMitarbeiterAnlegenGehalt.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterAnlegenGehalt.insets = new Insets(0, 0, 5, 5);
		gbc_lblMitarbeiterAnlegenGehalt.gridx = 2;
		gbc_lblMitarbeiterAnlegenGehalt.gridy = 12;
		add(lblMitarbeiterAnlegenGehalt, gbc_lblMitarbeiterAnlegenGehalt);
		
		mitarbeiterAnlegenAbteilung = new JTextField();
		mitarbeiterAnlegenAbteilung.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_mitarbeiterAnlegenAbteilung = new GridBagConstraints();
		gbc_mitarbeiterAnlegenAbteilung.anchor = GridBagConstraints.NORTH;
		gbc_mitarbeiterAnlegenAbteilung.insets = new Insets(0, 0, 5, 5);
		gbc_mitarbeiterAnlegenAbteilung.fill = GridBagConstraints.HORIZONTAL;
		gbc_mitarbeiterAnlegenAbteilung.gridx = 1;
		gbc_mitarbeiterAnlegenAbteilung.gridy = 13;
		add(mitarbeiterAnlegenAbteilung, gbc_mitarbeiterAnlegenAbteilung);
		mitarbeiterAnlegenAbteilung.setColumns(10);
		
		mitarbeiterAnlegenGehalt = new JFormattedTextField(getNuberformatter());
		mitarbeiterAnlegenGehalt.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_mitarbeiterAnlegenGehalt = new GridBagConstraints();
		gbc_mitarbeiterAnlegenGehalt.gridwidth = 2;
		gbc_mitarbeiterAnlegenGehalt.insets = new Insets(0, 0, 5, 0);
		gbc_mitarbeiterAnlegenGehalt.fill = GridBagConstraints.HORIZONTAL;
		gbc_mitarbeiterAnlegenGehalt.gridx = 2;
		gbc_mitarbeiterAnlegenGehalt.gridy = 13;
		add(mitarbeiterAnlegenGehalt, gbc_mitarbeiterAnlegenGehalt);
		mitarbeiterAnlegenGehalt.setColumns(7);
		
		JButton mitarbeiterAnlegenSpeichern = new JButton("Speichern");
		mitarbeiterAnlegenSpeichern.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_mitarbeiterAnlegenSpeichern = new GridBagConstraints();
		gbc_mitarbeiterAnlegenSpeichern.fill = GridBagConstraints.HORIZONTAL;
		gbc_mitarbeiterAnlegenSpeichern.insets = new Insets(0, 0, 0, 5);
		gbc_mitarbeiterAnlegenSpeichern.gridx = 1;
		gbc_mitarbeiterAnlegenSpeichern.gridy = 14;
		add(mitarbeiterAnlegenSpeichern, gbc_mitarbeiterAnlegenSpeichern);
		mitarbeiterAnlegenSpeichern.addActionListener(e -> speichern());
		

	}
	
	public static void speichern() {
		
		String name = mitarbeiterAnlegenName.getText();
		String nachname = mitarbeiterAnlegenNachname.getText();
		String strasse = mitarbeiterAnlegenStraße.getText();
		int hnr = Integer.valueOf(mitarbeiterAnlegenHNR.getText());
		String ort = mitarbeiterAnlegenOrt.getText();
		int plz = Integer.valueOf(mitarbeiterAnlegenPLZ.getText());
		long tel = Long.valueOf(mitarbeiterAnlegenTel.getText());
		String abteilung = mitarbeiterAnlegenAbteilung.getText();
		int gehalt = Integer.valueOf(mitarbeiterAnlegenGehalt.getText());
		String geburtstag = tfGeburtstagTag.getText()+"."+tfGeburtstagMonat.getText()+"."+tfGeburtstagJahr.getText();
		
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
//		LocalDate geburtstag = LocalDate.parse(geb, formatter);
		
		MitarbeiterDB.hinzufuegenMitarbeiter(new Mitarbeiter(name, nachname, strasse, hnr, ort, plz, tel, abteilung, gehalt, geburtstag), args);
	}
	
	public static NumberFormatter getNuberformatter() {
		
	    NumberFormat format = NumberFormat.getInstance();
	    NumberFormatter formatter = new NumberFormatter(format);
	    formatter.setValueClass(Integer.class);
	    formatter.setMinimum(0);
	    formatter.setMaximum(Integer.MAX_VALUE);
	    formatter.setAllowsInvalid(false);
	    formatter.setCommitsOnValidEdit(true);
	    return formatter;
	}

}
