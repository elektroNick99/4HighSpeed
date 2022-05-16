package HauptfensterPanels;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MitarbeiterAendern extends JPanel {


	private JTextField mitarbeiterÄndernName;
	private JTextField mitarbeiterÄndernNachname;
	private JTextField mitarbeiterÄndernStraße;
	private JTextField mitarbeiterÄndernHNR;
	private JTextField mitarbeiterÄndernOrt;
	private JTextField mitarbeiterÄndernPLZ;
	private JTextField mitarbeiterÄndernTel;
	private JTextField mitarbeiterÄndernAbteilung;
	private JTextField mitarbeiterÄndernGehalt;
	private JTextField mitarbeiterSuchenName;
	private JTextField mitarbeiterSuchenNachname;
	private JTextField mitarbeiterSuchenNummer;
	/**
	 * Create the panel.
	 */
	public MitarbeiterAendern() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{60, 112, 144, 236, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 29, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblMitarbeiterÄndern = new JLabel("Mitarbeiter ändern");
		lblMitarbeiterÄndern.setFont(new Font("Arial", Font.BOLD, 15));
		GridBagConstraints gbc_lblMitarbeiterÄndern = new GridBagConstraints();
		gbc_lblMitarbeiterÄndern.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterÄndern.insets = new Insets(0, 0, 5, 5);
		gbc_lblMitarbeiterÄndern.gridx = 1;
		gbc_lblMitarbeiterÄndern.gridy = 0;
		add(lblMitarbeiterÄndern, gbc_lblMitarbeiterÄndern);
		
		JLabel lblMitarbeiterSuchen = new JLabel("Mitarbeiter suchen");
		lblMitarbeiterSuchen.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblMitarbeiterSuchen = new GridBagConstraints();
		gbc_lblMitarbeiterSuchen.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterSuchen.insets = new Insets(0, 0, 5, 5);
		gbc_lblMitarbeiterSuchen.gridx = 1;
		gbc_lblMitarbeiterSuchen.gridy = 1;
		add(lblMitarbeiterSuchen, gbc_lblMitarbeiterSuchen);
		
		JLabel lbl2MitarbeiterÄndern = new JLabel("Mitarbeiter ändern");
		lbl2MitarbeiterÄndern.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lbl2MitarbeiterÄndern = new GridBagConstraints();
		gbc_lbl2MitarbeiterÄndern.anchor = GridBagConstraints.WEST;
		gbc_lbl2MitarbeiterÄndern.insets = new Insets(0, 0, 5, 5);
		gbc_lbl2MitarbeiterÄndern.gridx = 3;
		gbc_lbl2MitarbeiterÄndern.gridy = 1;
		add(lbl2MitarbeiterÄndern, gbc_lbl2MitarbeiterÄndern);
		
		JLabel lblMitarbeiterSuchenName = new JLabel("Name*");
		lblMitarbeiterSuchenName.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMitarbeiterSuchenName = new GridBagConstraints();
		gbc_lblMitarbeiterSuchenName.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterSuchenName.insets = new Insets(0, 0, 5, 5);
		gbc_lblMitarbeiterSuchenName.gridx = 1;
		gbc_lblMitarbeiterSuchenName.gridy = 2;
		add(lblMitarbeiterSuchenName, gbc_lblMitarbeiterSuchenName);
		
		JLabel lblMitarbeiterÄndernName = new JLabel("Name");
		lblMitarbeiterÄndernName.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMitarbeiterÄndernName = new GridBagConstraints();
		gbc_lblMitarbeiterÄndernName.insets = new Insets(0, 0, 5, 5);
		gbc_lblMitarbeiterÄndernName.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterÄndernName.gridx = 3;
		gbc_lblMitarbeiterÄndernName.gridy = 2;
		add(lblMitarbeiterÄndernName, gbc_lblMitarbeiterÄndernName);
	    
	    mitarbeiterSuchenName = new JTextField();
	    mitarbeiterSuchenName.setFont(new Font("Arial", Font.PLAIN, 12));
	    GridBagConstraints gbc_mitarbeiterSuchenName = new GridBagConstraints();
	    gbc_mitarbeiterSuchenName.insets = new Insets(0, 0, 5, 5);
	    gbc_mitarbeiterSuchenName.fill = GridBagConstraints.HORIZONTAL;
	    gbc_mitarbeiterSuchenName.gridx = 1;
	    gbc_mitarbeiterSuchenName.gridy = 3;
	    add(mitarbeiterSuchenName, gbc_mitarbeiterSuchenName);
	    mitarbeiterSuchenName.setColumns(10);
		
	    mitarbeiterÄndernName = new JTextField();
	    mitarbeiterÄndernName.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_mitarbeiterÄndernName = new GridBagConstraints();
		gbc_mitarbeiterÄndernName.insets = new Insets(0, 0, 5, 5);
		gbc_mitarbeiterÄndernName.fill = GridBagConstraints.HORIZONTAL;
		gbc_mitarbeiterÄndernName.gridx = 3;
		gbc_mitarbeiterÄndernName.gridy = 3;
		add(mitarbeiterÄndernName, gbc_mitarbeiterÄndernName);
		mitarbeiterÄndernName.setColumns(10);
		
		JLabel lblMitarbeiterSuchenNachname = new JLabel("Nachname*");
		lblMitarbeiterSuchenNachname.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMitarbeiterSuchenNachname = new GridBagConstraints();
		gbc_lblMitarbeiterSuchenNachname.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterSuchenNachname.insets = new Insets(0, 0, 5, 5);
		gbc_lblMitarbeiterSuchenNachname.gridx = 1;
		gbc_lblMitarbeiterSuchenNachname.gridy = 4;
		add(lblMitarbeiterSuchenNachname, gbc_lblMitarbeiterSuchenNachname);
		
		JLabel lblMitarbeiterÄndernNachname = new JLabel("Nachname");
		lblMitarbeiterÄndernNachname.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMitarbeiterÄndernNachname = new GridBagConstraints();
		gbc_lblMitarbeiterÄndernNachname.insets = new Insets(0, 0, 5, 5);
		gbc_lblMitarbeiterÄndernNachname.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterÄndernNachname.gridx = 3;
		gbc_lblMitarbeiterÄndernNachname.gridy = 4;
		add(lblMitarbeiterÄndernNachname, gbc_lblMitarbeiterÄndernNachname);
		
		mitarbeiterSuchenNachname = new JTextField();
		mitarbeiterSuchenNachname.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_mitarbeiterSuchenNachname = new GridBagConstraints();
		gbc_mitarbeiterSuchenNachname.insets = new Insets(0, 0, 5, 5);
		gbc_mitarbeiterSuchenNachname.fill = GridBagConstraints.HORIZONTAL;
		gbc_mitarbeiterSuchenNachname.gridx = 1;
		gbc_mitarbeiterSuchenNachname.gridy = 5;
		add(mitarbeiterSuchenNachname, gbc_mitarbeiterSuchenNachname);
		mitarbeiterSuchenNachname.setColumns(10);
		
		mitarbeiterÄndernNachname = new JTextField();
		mitarbeiterÄndernNachname.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_mitarbeiterÄndernNachname = new GridBagConstraints();
		gbc_mitarbeiterÄndernNachname.insets = new Insets(0, 0, 5, 5);
		gbc_mitarbeiterÄndernNachname.fill = GridBagConstraints.HORIZONTAL;
		gbc_mitarbeiterÄndernNachname.gridx = 3;
		gbc_mitarbeiterÄndernNachname.gridy = 5;
		add(mitarbeiterÄndernNachname, gbc_mitarbeiterÄndernNachname);
		mitarbeiterÄndernNachname.setColumns(10);
		
		JLabel lblMitarbeiterSuchenNummer = new JLabel("Nummer*");
		lblMitarbeiterSuchenNummer.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMitarbeiterSuchenNummer = new GridBagConstraints();
		gbc_lblMitarbeiterSuchenNummer.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterSuchenNummer.insets = new Insets(0, 0, 5, 5);
		gbc_lblMitarbeiterSuchenNummer.gridx = 1;
		gbc_lblMitarbeiterSuchenNummer.gridy = 6;
		add(lblMitarbeiterSuchenNummer, gbc_lblMitarbeiterSuchenNummer);
		
		JLabel lblMitarbeiterÄndernAdresse = new JLabel("Adresse");
		lblMitarbeiterÄndernAdresse.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblMitarbeiterÄndernAdresse = new GridBagConstraints();
		gbc_lblMitarbeiterÄndernAdresse.insets = new Insets(0, 0, 5, 5);
		gbc_lblMitarbeiterÄndernAdresse.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterÄndernAdresse.gridx = 3;
		gbc_lblMitarbeiterÄndernAdresse.gridy = 6;
		add(lblMitarbeiterÄndernAdresse, gbc_lblMitarbeiterÄndernAdresse);
		
		mitarbeiterSuchenNummer = new JTextField();
		mitarbeiterSuchenNummer.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_mitarbeiterSuchenNummer = new GridBagConstraints();
		gbc_mitarbeiterSuchenNummer.insets = new Insets(0, 0, 5, 5);
		gbc_mitarbeiterSuchenNummer.fill = GridBagConstraints.HORIZONTAL;
		gbc_mitarbeiterSuchenNummer.gridx = 1;
		gbc_mitarbeiterSuchenNummer.gridy = 7;
		add(mitarbeiterSuchenNummer, gbc_mitarbeiterSuchenNummer);
		mitarbeiterSuchenNummer.setColumns(10);
		
		JLabel lblMitarbeiterÄndernStraße = new JLabel("Straße");
		lblMitarbeiterÄndernStraße.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMitarbeiterÄndernStraße = new GridBagConstraints();
		gbc_lblMitarbeiterÄndernStraße.insets = new Insets(0, 0, 5, 5);
		gbc_lblMitarbeiterÄndernStraße.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterÄndernStraße.gridx = 3;
		gbc_lblMitarbeiterÄndernStraße.gridy = 7;
		add(lblMitarbeiterÄndernStraße, gbc_lblMitarbeiterÄndernStraße);
		
		JLabel lblMitarbeiterÄndernHNR = new JLabel("HNR");
		lblMitarbeiterÄndernHNR.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMitarbeiterÄndernHNR = new GridBagConstraints();
		gbc_lblMitarbeiterÄndernHNR.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterÄndernHNR.insets = new Insets(0, 0, 5, 0);
		gbc_lblMitarbeiterÄndernHNR.gridx = 4;
		gbc_lblMitarbeiterÄndernHNR.gridy = 7;
		add(lblMitarbeiterÄndernHNR, gbc_lblMitarbeiterÄndernHNR);
		
		JButton mitarbeiterSuchen = new JButton("Suchen");
		mitarbeiterSuchen.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_mitarbeiterSuchen = new GridBagConstraints();
		gbc_mitarbeiterSuchen.insets = new Insets(0, 0, 5, 5);
		gbc_mitarbeiterSuchen.gridx = 1;
		gbc_mitarbeiterSuchen.gridy = 8;
		add(mitarbeiterSuchen, gbc_mitarbeiterSuchen);
		
		mitarbeiterÄndernStraße = new JTextField();
		mitarbeiterÄndernStraße.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_mitarbeiterÄndernStraße = new GridBagConstraints();
		gbc_mitarbeiterÄndernStraße.insets = new Insets(0, 0, 5, 5);
		gbc_mitarbeiterÄndernStraße.fill = GridBagConstraints.HORIZONTAL;
		gbc_mitarbeiterÄndernStraße.gridx = 3;
		gbc_mitarbeiterÄndernStraße.gridy = 8;
		add(mitarbeiterÄndernStraße, gbc_mitarbeiterÄndernStraße);
		mitarbeiterÄndernStraße.setColumns(10);
		
		mitarbeiterÄndernHNR = new JTextField();
		mitarbeiterÄndernHNR.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_mitarbeiterÄndernHNR = new GridBagConstraints();
		gbc_mitarbeiterÄndernHNR.insets = new Insets(0, 0, 5, 0);
		gbc_mitarbeiterÄndernHNR.fill = GridBagConstraints.HORIZONTAL;
		gbc_mitarbeiterÄndernHNR.gridx = 4;
		gbc_mitarbeiterÄndernHNR.gridy = 8;
		add(mitarbeiterÄndernHNR, gbc_mitarbeiterÄndernHNR);
		mitarbeiterÄndernHNR.setColumns(10);
		
		JLabel lblMitarbeiterÄndernOrt = new JLabel("Ort");
		lblMitarbeiterÄndernOrt.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMitarbeiterÄndernOrt = new GridBagConstraints();
		gbc_lblMitarbeiterÄndernOrt.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterÄndernOrt.insets = new Insets(0, 0, 5, 5);
		gbc_lblMitarbeiterÄndernOrt.gridx = 3;
		gbc_lblMitarbeiterÄndernOrt.gridy = 9;
		add(lblMitarbeiterÄndernOrt, gbc_lblMitarbeiterÄndernOrt);
		
		JLabel lblMitarbeiterÄndernPLZ = new JLabel("PLZ");
		lblMitarbeiterÄndernPLZ.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMitarbeiterÄndernPLZ = new GridBagConstraints();
		gbc_lblMitarbeiterÄndernPLZ.insets = new Insets(0, 0, 5, 0);
		gbc_lblMitarbeiterÄndernPLZ.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterÄndernPLZ.gridx = 4;
		gbc_lblMitarbeiterÄndernPLZ.gridy = 9;
		add(lblMitarbeiterÄndernPLZ, gbc_lblMitarbeiterÄndernPLZ);
		
		mitarbeiterÄndernOrt = new JTextField();
		mitarbeiterÄndernOrt.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_mitarbeiterÄndernOrt = new GridBagConstraints();
		gbc_mitarbeiterÄndernOrt.insets = new Insets(0, 0, 5, 5);
		gbc_mitarbeiterÄndernOrt.fill = GridBagConstraints.HORIZONTAL;
		gbc_mitarbeiterÄndernOrt.gridx = 3;
		gbc_mitarbeiterÄndernOrt.gridy = 10;
		add(mitarbeiterÄndernOrt, gbc_mitarbeiterÄndernOrt);
		mitarbeiterÄndernOrt.setColumns(10);
		
		mitarbeiterÄndernPLZ = new JTextField();
		mitarbeiterÄndernPLZ.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_mitarbeiterÄndernPLZ = new GridBagConstraints();
		gbc_mitarbeiterÄndernPLZ.insets = new Insets(0, 0, 5, 0);
		gbc_mitarbeiterÄndernPLZ.fill = GridBagConstraints.HORIZONTAL;
		gbc_mitarbeiterÄndernPLZ.gridx = 4;
		gbc_mitarbeiterÄndernPLZ.gridy = 10;
		add(mitarbeiterÄndernPLZ, gbc_mitarbeiterÄndernPLZ);
		mitarbeiterÄndernPLZ.setColumns(10);
		
		JLabel lblMitarbeiterÄndernTel = new JLabel("Tel.:");
		lblMitarbeiterÄndernTel.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMitarbeiterÄndernTel = new GridBagConstraints();
		gbc_lblMitarbeiterÄndernTel.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterÄndernTel.insets = new Insets(0, 0, 5, 5);
		gbc_lblMitarbeiterÄndernTel.gridx = 3;
		gbc_lblMitarbeiterÄndernTel.gridy = 11;
		add(lblMitarbeiterÄndernTel, gbc_lblMitarbeiterÄndernTel);
		
		mitarbeiterÄndernTel = new JTextField();
		mitarbeiterÄndernTel.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_mitarbeiterÄndernTel = new GridBagConstraints();
		gbc_mitarbeiterÄndernTel.insets = new Insets(0, 0, 5, 5);
		gbc_mitarbeiterÄndernTel.fill = GridBagConstraints.HORIZONTAL;
		gbc_mitarbeiterÄndernTel.gridx = 3;
		gbc_mitarbeiterÄndernTel.gridy = 12;
		add(mitarbeiterÄndernTel, gbc_mitarbeiterÄndernTel);
		mitarbeiterÄndernTel.setColumns(10);
		
		JLabel lblMitarbeiterÄndernAbteilung = new JLabel("Abteilung");
		lblMitarbeiterÄndernAbteilung.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMitarbeiterÄndernAbteilung = new GridBagConstraints();
		gbc_lblMitarbeiterÄndernAbteilung.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterÄndernAbteilung.insets = new Insets(0, 0, 5, 5);
		gbc_lblMitarbeiterÄndernAbteilung.gridx = 3;
		gbc_lblMitarbeiterÄndernAbteilung.gridy = 13;
		add(lblMitarbeiterÄndernAbteilung, gbc_lblMitarbeiterÄndernAbteilung);
		
		JLabel lblMitarbeiterÄndernGehalt = new JLabel("Gehalt");
		lblMitarbeiterÄndernGehalt.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMitarbeiterÄndernGehalt = new GridBagConstraints();
		gbc_lblMitarbeiterÄndernGehalt.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterÄndernGehalt.insets = new Insets(0, 0, 5, 0);
		gbc_lblMitarbeiterÄndernGehalt.gridx = 4;
		gbc_lblMitarbeiterÄndernGehalt.gridy = 13;
		add(lblMitarbeiterÄndernGehalt, gbc_lblMitarbeiterÄndernGehalt);
		
		mitarbeiterÄndernAbteilung = new JTextField();
		mitarbeiterÄndernAbteilung.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_mitarbeiterÄndernAbteilung = new GridBagConstraints();
		gbc_mitarbeiterÄndernAbteilung.anchor = GridBagConstraints.NORTH;
		gbc_mitarbeiterÄndernAbteilung.insets = new Insets(0, 0, 5, 5);
		gbc_mitarbeiterÄndernAbteilung.fill = GridBagConstraints.HORIZONTAL;
		gbc_mitarbeiterÄndernAbteilung.gridx = 3;
		gbc_mitarbeiterÄndernAbteilung.gridy = 14;
		add(mitarbeiterÄndernAbteilung, gbc_mitarbeiterÄndernAbteilung);
		mitarbeiterÄndernAbteilung.setColumns(10);
		
		mitarbeiterÄndernGehalt = new JTextField();
		mitarbeiterÄndernGehalt.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_mitarbeiterÄndernGehalt = new GridBagConstraints();
		gbc_mitarbeiterÄndernGehalt.insets = new Insets(0, 0, 5, 0);
		gbc_mitarbeiterÄndernGehalt.fill = GridBagConstraints.HORIZONTAL;
		gbc_mitarbeiterÄndernGehalt.gridx = 4;
		gbc_mitarbeiterÄndernGehalt.gridy = 14;
		add(mitarbeiterÄndernGehalt, gbc_mitarbeiterÄndernGehalt);
		mitarbeiterÄndernGehalt.setColumns(10);
		
		JButton mitarbeiterÄndernSpeichern = new JButton("Speichern");
		mitarbeiterÄndernSpeichern.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_mitarbeiterÄndernSpeichern = new GridBagConstraints();
		gbc_mitarbeiterÄndernSpeichern.gridwidth = 2;
		gbc_mitarbeiterÄndernSpeichern.fill = GridBagConstraints.HORIZONTAL;
		gbc_mitarbeiterÄndernSpeichern.gridx = 3;
		gbc_mitarbeiterÄndernSpeichern.gridy = 15;
		add(mitarbeiterÄndernSpeichern, gbc_mitarbeiterÄndernSpeichern);

	}

}
