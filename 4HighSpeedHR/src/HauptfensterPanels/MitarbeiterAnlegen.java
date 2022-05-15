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

	private static JTextField tfName;
	private static JTextField tfNachname;
	private static JTextField tfStrasse;
	private static JFormattedTextField tfHNR;
	private static JTextField tfOrt;
	private static JFormattedTextField tfPLZ;
	private static JFormattedTextField tfTel;
	private static JTextField tfAbteilung;
	private static JFormattedTextField tfGehalt;
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
		
		JLabel lblNewLabel = new JLabel("Neuer Mitarbeiter anlegen");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 15));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 0;
		add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 1;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
	    tfName = new JTextField();
	    tfName.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_tfName = new GridBagConstraints();
		gbc_tfName.insets = new Insets(0, 0, 5, 5);
		gbc_tfName.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfName.gridx = 1;
		gbc_tfName.gridy = 2;
		add(tfName, gbc_tfName);
		tfName.setColumns(20);
		
		JLabel lblNewLabel_2 = new JLabel("Nachname");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 3;
		add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JLabel lblNewLabel_11 = new JLabel("Geburtstag (YYYY/MM/DD)");
		lblNewLabel_11.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblNewLabel_11 = new GridBagConstraints();
		gbc_lblNewLabel_11.gridwidth = 3;
		gbc_lblNewLabel_11.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_11.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_11.gridx = 2;
		gbc_lblNewLabel_11.gridy = 3;
		add(lblNewLabel_11, gbc_lblNewLabel_11);
		
		tfNachname = new JTextField();
		tfNachname.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_tfNachname = new GridBagConstraints();
		gbc_tfNachname.insets = new Insets(0, 0, 5, 5);
		gbc_tfNachname.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfNachname.gridx = 1;
		gbc_tfNachname.gridy = 4;
		add(tfNachname, gbc_tfNachname);
		tfNachname.setColumns(20);
		
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
		
		JLabel lblNewLabel_3 = new JLabel("Adresse");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_3.gridx = 1;
		gbc_lblNewLabel_3.gridy = 5;
		add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Straße");
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_4.gridx = 1;
		gbc_lblNewLabel_4.gridy = 6;
		add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("HNR");
		lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 2;
		gbc_lblNewLabel_5.gridy = 6;
		add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		tfStrasse = new JTextField();
		tfStrasse.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_tfStrasse = new GridBagConstraints();
		gbc_tfStrasse.insets = new Insets(0, 0, 5, 5);
		gbc_tfStrasse.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfStrasse.gridx = 1;
		gbc_tfStrasse.gridy = 7;
		add(tfStrasse, gbc_tfStrasse);
		tfStrasse.setColumns(25);
		
		tfHNR = new JFormattedTextField(getNuberformatter());
		tfHNR.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_tfHNR = new GridBagConstraints();
		gbc_tfHNR.gridwidth = 2;
		gbc_tfHNR.insets = new Insets(0, 0, 5, 0);
		gbc_tfHNR.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfHNR.gridx = 2;
		gbc_tfHNR.gridy = 7;
		add(tfHNR, gbc_tfHNR);
		tfHNR.setColumns(4);
		
		JLabel lblNewLabel_6 = new JLabel("Ort");
		lblNewLabel_6.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 1;
		gbc_lblNewLabel_6.gridy = 8;
		add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("PLZ");
		lblNewLabel_7.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_7.gridx = 2;
		gbc_lblNewLabel_7.gridy = 8;
		add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		tfOrt = new JTextField();
		tfOrt.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_tfOrt = new GridBagConstraints();
		gbc_tfOrt.insets = new Insets(0, 0, 5, 5);
		gbc_tfOrt.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfOrt.gridx = 1;
		gbc_tfOrt.gridy = 9;
		add(tfOrt, gbc_tfOrt);
		tfOrt.setColumns(25);
		
		tfPLZ = new JFormattedTextField(getNuberformatter());
		GridBagConstraints gbc_tfPLZ = new GridBagConstraints();
		gbc_tfPLZ.gridwidth = 2;
		gbc_tfPLZ.insets = new Insets(0, 0, 5, 0);
		gbc_tfPLZ.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfPLZ.gridx = 2;
		gbc_tfPLZ.gridy = 9;
		add(tfPLZ, gbc_tfPLZ);
		tfPLZ.setColumns(5);
		
		JLabel lblNewLabel_8 = new JLabel("Tel.:");
		lblNewLabel_8.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_8.gridx = 1;
		gbc_lblNewLabel_8.gridy = 10;
		add(lblNewLabel_8, gbc_lblNewLabel_8);
		
		tfTel = new JFormattedTextField(getNuberformatter());
		tfTel.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_tfTel = new GridBagConstraints();
		gbc_tfTel.insets = new Insets(0, 0, 5, 5);
		gbc_tfTel.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfTel.gridx = 1;
		gbc_tfTel.gridy = 11;
		add(tfTel, gbc_tfTel);
		tfTel.setColumns(11);
		
		JLabel lblNewLabel_9 = new JLabel("Abteilung");
		lblNewLabel_9.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
		gbc_lblNewLabel_9.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_9.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_9.gridx = 1;
		gbc_lblNewLabel_9.gridy = 12;
		add(lblNewLabel_9, gbc_lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Gehalt");
		lblNewLabel_10.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblNewLabel_10 = new GridBagConstraints();
		gbc_lblNewLabel_10.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_10.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_10.gridx = 2;
		gbc_lblNewLabel_10.gridy = 12;
		add(lblNewLabel_10, gbc_lblNewLabel_10);
		
		tfAbteilung = new JTextField();
		tfAbteilung.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_tfAbteilung = new GridBagConstraints();
		gbc_tfAbteilung.anchor = GridBagConstraints.NORTH;
		gbc_tfAbteilung.insets = new Insets(0, 0, 5, 5);
		gbc_tfAbteilung.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfAbteilung.gridx = 1;
		gbc_tfAbteilung.gridy = 13;
		add(tfAbteilung, gbc_tfAbteilung);
		tfAbteilung.setColumns(10);
		
		tfGehalt = new JFormattedTextField(getNuberformatter());
		tfGehalt.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_tfGehalt = new GridBagConstraints();
		gbc_tfGehalt.gridwidth = 2;
		gbc_tfGehalt.insets = new Insets(0, 0, 5, 0);
		gbc_tfGehalt.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfGehalt.gridx = 2;
		gbc_tfGehalt.gridy = 13;
		add(tfGehalt, gbc_tfGehalt);
		tfGehalt.setColumns(7);
		
		JButton btnSpeichern = new JButton("Speichern");
		btnSpeichern.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_btnSpeichern = new GridBagConstraints();
		gbc_btnSpeichern.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnSpeichern.insets = new Insets(0, 0, 0, 5);
		gbc_btnSpeichern.gridx = 1;
		gbc_btnSpeichern.gridy = 14;
		add(btnSpeichern, gbc_btnSpeichern);
		btnSpeichern.addActionListener(e -> speichern());
		

	}
	
	public static void speichern() {
		
		String name = tfName.getText();
		String nachname = tfNachname.getText();
		String strasse = tfStrasse.getText();
		int hnr = Integer.valueOf(tfHNR.getText());
		String ort = tfOrt.getText();
		int plz = Integer.valueOf(tfPLZ.getText());
		long tel = Long.valueOf(tfTel.getText());
		String abteilung = tfAbteilung.getText();
		int gehalt = Integer.valueOf(tfGehalt.getText());
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
