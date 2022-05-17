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


	private JTextField mitarbeiterAEndernName;
	private JTextField mitarbeiterAEndernNachname;
	private JTextField mitarbeiterAEndernStrasse;
	private JTextField mitarbeiterAEndernHNR;
	private JTextField mitarbeiterAEndernOrt;
	private JTextField mitarbeiterAEndernPLZ;
	private JTextField mitarbeiterAEndernTel;
	private JTextField mitarbeiterAEndernAbteilung;
	private JTextField mitarbeiterAEndernGehalt;
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
		
		JLabel lblMitarbeiterAEndern = new JLabel("Mitarbeiter aendern");
		lblMitarbeiterAEndern.setFont(new Font("Arial", Font.BOLD, 15));
		GridBagConstraints gbc_lblMitarbeiterAEndern = new GridBagConstraints();
		gbc_lblMitarbeiterAEndern.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterAEndern.insets = new Insets(0, 0, 5, 5);
		gbc_lblMitarbeiterAEndern.gridx = 1;
		gbc_lblMitarbeiterAEndern.gridy = 0;
		add(lblMitarbeiterAEndern, gbc_lblMitarbeiterAEndern);
		
		JLabel lblMitarbeiterSuchen = new JLabel("Mitarbeiter suchen");
		lblMitarbeiterSuchen.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblMitarbeiterSuchen = new GridBagConstraints();
		gbc_lblMitarbeiterSuchen.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterSuchen.insets = new Insets(0, 0, 5, 5);
		gbc_lblMitarbeiterSuchen.gridx = 1;
		gbc_lblMitarbeiterSuchen.gridy = 1;
		add(lblMitarbeiterSuchen, gbc_lblMitarbeiterSuchen);
		
		JLabel lbl2MitarbeiterAEndern = new JLabel("Mitarbeiter aendern");
		lbl2MitarbeiterAEndern.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lbl2MitarbeiterAEndern = new GridBagConstraints();
		gbc_lbl2MitarbeiterAEndern.anchor = GridBagConstraints.WEST;
		gbc_lbl2MitarbeiterAEndern.insets = new Insets(0, 0, 5, 5);
		gbc_lbl2MitarbeiterAEndern.gridx = 3;
		gbc_lbl2MitarbeiterAEndern.gridy = 1;
		add(lbl2MitarbeiterAEndern, gbc_lbl2MitarbeiterAEndern);
		
		JLabel lblMitarbeiterSuchenName = new JLabel("Name*");
		lblMitarbeiterSuchenName.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMitarbeiterSuchenName = new GridBagConstraints();
		gbc_lblMitarbeiterSuchenName.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterSuchenName.insets = new Insets(0, 0, 5, 5);
		gbc_lblMitarbeiterSuchenName.gridx = 1;
		gbc_lblMitarbeiterSuchenName.gridy = 2;
		add(lblMitarbeiterSuchenName, gbc_lblMitarbeiterSuchenName);
		
		JLabel lblMitarbeiterAEndernName = new JLabel("Name");
		lblMitarbeiterAEndernName.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMitarbeiterAEndernName = new GridBagConstraints();
		gbc_lblMitarbeiterAEndernName.insets = new Insets(0, 0, 5, 5);
		gbc_lblMitarbeiterAEndernName.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterAEndernName.gridx = 3;
		gbc_lblMitarbeiterAEndernName.gridy = 2;
		add(lblMitarbeiterAEndernName, gbc_lblMitarbeiterAEndernName);
	    
	    mitarbeiterSuchenName = new JTextField();
	    mitarbeiterSuchenName.setFont(new Font("Arial", Font.PLAIN, 12));
	    GridBagConstraints gbc_mitarbeiterSuchenName = new GridBagConstraints();
	    gbc_mitarbeiterSuchenName.insets = new Insets(0, 0, 5, 5);
	    gbc_mitarbeiterSuchenName.fill = GridBagConstraints.HORIZONTAL;
	    gbc_mitarbeiterSuchenName.gridx = 1;
	    gbc_mitarbeiterSuchenName.gridy = 3;
	    add(mitarbeiterSuchenName, gbc_mitarbeiterSuchenName);
	    mitarbeiterSuchenName.setColumns(10);
		
	    mitarbeiterAEndernName = new JTextField();
	    mitarbeiterAEndernName.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_mitarbeiterAEndernName = new GridBagConstraints();
		gbc_mitarbeiterAEndernName.insets = new Insets(0, 0, 5, 5);
		gbc_mitarbeiterAEndernName.fill = GridBagConstraints.HORIZONTAL;
		gbc_mitarbeiterAEndernName.gridx = 3;
		gbc_mitarbeiterAEndernName.gridy = 3;
		add(mitarbeiterAEndernName, gbc_mitarbeiterAEndernName);
		mitarbeiterAEndernName.setColumns(10);
		
		JLabel lblMitarbeiterSuchenNachname = new JLabel("Nachname*");
		lblMitarbeiterSuchenNachname.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMitarbeiterSuchenNachname = new GridBagConstraints();
		gbc_lblMitarbeiterSuchenNachname.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterSuchenNachname.insets = new Insets(0, 0, 5, 5);
		gbc_lblMitarbeiterSuchenNachname.gridx = 1;
		gbc_lblMitarbeiterSuchenNachname.gridy = 4;
		add(lblMitarbeiterSuchenNachname, gbc_lblMitarbeiterSuchenNachname);
		
		JLabel lblMitarbeiterAEndernNachname = new JLabel("Nachname");
		lblMitarbeiterAEndernNachname.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMitarbeiterAEndernNachname = new GridBagConstraints();
		gbc_lblMitarbeiterAEndernNachname.insets = new Insets(0, 0, 5, 5);
		gbc_lblMitarbeiterAEndernNachname.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterAEndernNachname.gridx = 3;
		gbc_lblMitarbeiterAEndernNachname.gridy = 4;
		add(lblMitarbeiterAEndernNachname, gbc_lblMitarbeiterAEndernNachname);
		
		mitarbeiterSuchenNachname = new JTextField();
		mitarbeiterSuchenNachname.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_mitarbeiterSuchenNachname = new GridBagConstraints();
		gbc_mitarbeiterSuchenNachname.insets = new Insets(0, 0, 5, 5);
		gbc_mitarbeiterSuchenNachname.fill = GridBagConstraints.HORIZONTAL;
		gbc_mitarbeiterSuchenNachname.gridx = 1;
		gbc_mitarbeiterSuchenNachname.gridy = 5;
		add(mitarbeiterSuchenNachname, gbc_mitarbeiterSuchenNachname);
		mitarbeiterSuchenNachname.setColumns(10);
		
		mitarbeiterAEndernNachname = new JTextField();
		mitarbeiterAEndernNachname.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_mitarbeiterAEndernNachname = new GridBagConstraints();
		gbc_mitarbeiterAEndernNachname.insets = new Insets(0, 0, 5, 5);
		gbc_mitarbeiterAEndernNachname.fill = GridBagConstraints.HORIZONTAL;
		gbc_mitarbeiterAEndernNachname.gridx = 3;
		gbc_mitarbeiterAEndernNachname.gridy = 5;
		add(mitarbeiterAEndernNachname, gbc_mitarbeiterAEndernNachname);
		mitarbeiterAEndernNachname.setColumns(10);
		
		JLabel lblMitarbeiterSuchenNummer = new JLabel("Nummer*");
		lblMitarbeiterSuchenNummer.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMitarbeiterSuchenNummer = new GridBagConstraints();
		gbc_lblMitarbeiterSuchenNummer.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterSuchenNummer.insets = new Insets(0, 0, 5, 5);
		gbc_lblMitarbeiterSuchenNummer.gridx = 1;
		gbc_lblMitarbeiterSuchenNummer.gridy = 6;
		add(lblMitarbeiterSuchenNummer, gbc_lblMitarbeiterSuchenNummer);
		
		JLabel lblMitarbeiterAEndernAdresse = new JLabel("Adresse");
		lblMitarbeiterAEndernAdresse.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblMitarbeiterAEndernAdresse = new GridBagConstraints();
		gbc_lblMitarbeiterAEndernAdresse.insets = new Insets(0, 0, 5, 5);
		gbc_lblMitarbeiterAEndernAdresse.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterAEndernAdresse.gridx = 3;
		gbc_lblMitarbeiterAEndernAdresse.gridy = 6;
		add(lblMitarbeiterAEndernAdresse, gbc_lblMitarbeiterAEndernAdresse);
		
		mitarbeiterSuchenNummer = new JTextField();
		mitarbeiterSuchenNummer.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_mitarbeiterSuchenNummer = new GridBagConstraints();
		gbc_mitarbeiterSuchenNummer.insets = new Insets(0, 0, 5, 5);
		gbc_mitarbeiterSuchenNummer.fill = GridBagConstraints.HORIZONTAL;
		gbc_mitarbeiterSuchenNummer.gridx = 1;
		gbc_mitarbeiterSuchenNummer.gridy = 7;
		add(mitarbeiterSuchenNummer, gbc_mitarbeiterSuchenNummer);
		mitarbeiterSuchenNummer.setColumns(10);
		
		JLabel lblMitarbeiterAEndernStraße = new JLabel("Strasse");
		lblMitarbeiterAEndernStraße.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMitarbeiterAEndernStraße = new GridBagConstraints();
		gbc_lblMitarbeiterAEndernStraße.insets = new Insets(0, 0, 5, 5);
		gbc_lblMitarbeiterAEndernStraße.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterAEndernStraße.gridx = 3;
		gbc_lblMitarbeiterAEndernStraße.gridy = 7;
		add(lblMitarbeiterAEndernStraße, gbc_lblMitarbeiterAEndernStraße);
		
		JLabel lblMitarbeiterAEndernHNR = new JLabel("HNR");
		lblMitarbeiterAEndernHNR.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMitarbeiterAEndernHNR = new GridBagConstraints();
		gbc_lblMitarbeiterAEndernHNR.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterAEndernHNR.insets = new Insets(0, 0, 5, 0);
		gbc_lblMitarbeiterAEndernHNR.gridx = 4;
		gbc_lblMitarbeiterAEndernHNR.gridy = 7;
		add(lblMitarbeiterAEndernHNR, gbc_lblMitarbeiterAEndernHNR);
		
		JButton mitarbeiterSuchen = new JButton("Suchen");
		mitarbeiterSuchen.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_mitarbeiterSuchen = new GridBagConstraints();
		gbc_mitarbeiterSuchen.insets = new Insets(0, 0, 5, 5);
		gbc_mitarbeiterSuchen.gridx = 1;
		gbc_mitarbeiterSuchen.gridy = 8;
		add(mitarbeiterSuchen, gbc_mitarbeiterSuchen);
		
		mitarbeiterAEndernStrasse = new JTextField();
		mitarbeiterAEndernStrasse.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_mitarbeiterAEndernStrasse = new GridBagConstraints();
		gbc_mitarbeiterAEndernStrasse.insets = new Insets(0, 0, 5, 5);
		gbc_mitarbeiterAEndernStrasse.fill = GridBagConstraints.HORIZONTAL;
		gbc_mitarbeiterAEndernStrasse.gridx = 3;
		gbc_mitarbeiterAEndernStrasse.gridy = 8;
		add(mitarbeiterAEndernStrasse, gbc_mitarbeiterAEndernStrasse);
		mitarbeiterAEndernStrasse.setColumns(10);
		
		mitarbeiterAEndernHNR = new JTextField();
		mitarbeiterAEndernHNR.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_mitarbeiterAEndernHNR = new GridBagConstraints();
		gbc_mitarbeiterAEndernHNR.insets = new Insets(0, 0, 5, 0);
		gbc_mitarbeiterAEndernHNR.fill = GridBagConstraints.HORIZONTAL;
		gbc_mitarbeiterAEndernHNR.gridx = 4;
		gbc_mitarbeiterAEndernHNR.gridy = 8;
		add(mitarbeiterAEndernHNR, gbc_mitarbeiterAEndernHNR);
		mitarbeiterAEndernHNR.setColumns(10);
		
		JLabel lblMitarbeiterAEndernOrt = new JLabel("Ort");
		lblMitarbeiterAEndernOrt.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMitarbeiterAEndernOrt = new GridBagConstraints();
		gbc_lblMitarbeiterAEndernOrt.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterAEndernOrt.insets = new Insets(0, 0, 5, 5);
		gbc_lblMitarbeiterAEndernOrt.gridx = 3;
		gbc_lblMitarbeiterAEndernOrt.gridy = 9;
		add(lblMitarbeiterAEndernOrt, gbc_lblMitarbeiterAEndernOrt);
		
		JLabel lblMitarbeiterAEndernPLZ = new JLabel("PLZ");
		lblMitarbeiterAEndernPLZ.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMitarbeiterAEndernPLZ = new GridBagConstraints();
		gbc_lblMitarbeiterAEndernPLZ.insets = new Insets(0, 0, 5, 0);
		gbc_lblMitarbeiterAEndernPLZ.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterAEndernPLZ.gridx = 4;
		gbc_lblMitarbeiterAEndernPLZ.gridy = 9;
		add(lblMitarbeiterAEndernPLZ, gbc_lblMitarbeiterAEndernPLZ);
		
		mitarbeiterAEndernOrt = new JTextField();
		mitarbeiterAEndernOrt.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_mitarbeiterAEndernOrt = new GridBagConstraints();
		gbc_mitarbeiterAEndernOrt.insets = new Insets(0, 0, 5, 5);
		gbc_mitarbeiterAEndernOrt.fill = GridBagConstraints.HORIZONTAL;
		gbc_mitarbeiterAEndernOrt.gridx = 3;
		gbc_mitarbeiterAEndernOrt.gridy = 10;
		add(mitarbeiterAEndernOrt, gbc_mitarbeiterAEndernOrt);
		mitarbeiterAEndernOrt.setColumns(10);
		
		mitarbeiterAEndernPLZ = new JTextField();
		mitarbeiterAEndernPLZ.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_mitarbeiterAEndernPLZ = new GridBagConstraints();
		gbc_mitarbeiterAEndernPLZ.insets = new Insets(0, 0, 5, 0);
		gbc_mitarbeiterAEndernPLZ.fill = GridBagConstraints.HORIZONTAL;
		gbc_mitarbeiterAEndernPLZ.gridx = 4;
		gbc_mitarbeiterAEndernPLZ.gridy = 10;
		add(mitarbeiterAEndernPLZ, gbc_mitarbeiterAEndernPLZ);
		mitarbeiterAEndernPLZ.setColumns(10);
		
		JLabel lblMitarbeiterAEndernTel = new JLabel("Tel.:");
		lblMitarbeiterAEndernTel.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMitarbeiterAEndernTel = new GridBagConstraints();
		gbc_lblMitarbeiterAEndernTel.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterAEndernTel.insets = new Insets(0, 0, 5, 5);
		gbc_lblMitarbeiterAEndernTel.gridx = 3;
		gbc_lblMitarbeiterAEndernTel.gridy = 11;
		add(lblMitarbeiterAEndernTel, gbc_lblMitarbeiterAEndernTel);
		
		mitarbeiterAEndernTel = new JTextField();
		mitarbeiterAEndernTel.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_mitarbeiterAEndernTel = new GridBagConstraints();
		gbc_mitarbeiterAEndernTel.insets = new Insets(0, 0, 5, 5);
		gbc_mitarbeiterAEndernTel.fill = GridBagConstraints.HORIZONTAL;
		gbc_mitarbeiterAEndernTel.gridx = 3;
		gbc_mitarbeiterAEndernTel.gridy = 12;
		add(mitarbeiterAEndernTel, gbc_mitarbeiterAEndernTel);
		mitarbeiterAEndernTel.setColumns(10);
		
		JLabel lblMitarbeiterAEndernAbteilung = new JLabel("Abteilung");
		lblMitarbeiterAEndernAbteilung.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMitarbeiterAEndernAbteilung = new GridBagConstraints();
		gbc_lblMitarbeiterAEndernAbteilung.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterAEndernAbteilung.insets = new Insets(0, 0, 5, 5);
		gbc_lblMitarbeiterAEndernAbteilung.gridx = 3;
		gbc_lblMitarbeiterAEndernAbteilung.gridy = 13;
		add(lblMitarbeiterAEndernAbteilung, gbc_lblMitarbeiterAEndernAbteilung);
		
		JLabel lblMitarbeiterAEndernGehalt = new JLabel("Gehalt");
		lblMitarbeiterAEndernGehalt.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMitarbeiterAEndernGehalt = new GridBagConstraints();
		gbc_lblMitarbeiterAEndernGehalt.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterAEndernGehalt.insets = new Insets(0, 0, 5, 0);
		gbc_lblMitarbeiterAEndernGehalt.gridx = 4;
		gbc_lblMitarbeiterAEndernGehalt.gridy = 13;
		add(lblMitarbeiterAEndernGehalt, gbc_lblMitarbeiterAEndernGehalt);
		
		mitarbeiterAEndernAbteilung = new JTextField();
		mitarbeiterAEndernAbteilung.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_mitarbeiterAEndernAbteilung = new GridBagConstraints();
		gbc_mitarbeiterAEndernAbteilung.anchor = GridBagConstraints.NORTH;
		gbc_mitarbeiterAEndernAbteilung.insets = new Insets(0, 0, 5, 5);
		gbc_mitarbeiterAEndernAbteilung.fill = GridBagConstraints.HORIZONTAL;
		gbc_mitarbeiterAEndernAbteilung.gridx = 3;
		gbc_mitarbeiterAEndernAbteilung.gridy = 14;
		add(mitarbeiterAEndernAbteilung, gbc_mitarbeiterAEndernAbteilung);
		mitarbeiterAEndernAbteilung.setColumns(10);
		
		mitarbeiterAEndernGehalt = new JTextField();
		mitarbeiterAEndernGehalt.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_mitarbeiterAEndernGehalt = new GridBagConstraints();
		gbc_mitarbeiterAEndernGehalt.insets = new Insets(0, 0, 5, 0);
		gbc_mitarbeiterAEndernGehalt.fill = GridBagConstraints.HORIZONTAL;
		gbc_mitarbeiterAEndernGehalt.gridx = 4;
		gbc_mitarbeiterAEndernGehalt.gridy = 14;
		add(mitarbeiterAEndernGehalt, gbc_mitarbeiterAEndernGehalt);
		mitarbeiterAEndernGehalt.setColumns(10);
		
		JButton mitarbeiterAEndernSpeichern = new JButton("Speichern");
		mitarbeiterAEndernSpeichern.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_mitarbeiterAEndernSpeichern = new GridBagConstraints();
		gbc_mitarbeiterAEndernSpeichern.gridwidth = 2;
		gbc_mitarbeiterAEndernSpeichern.fill = GridBagConstraints.HORIZONTAL;
		gbc_mitarbeiterAEndernSpeichern.gridx = 3;
		gbc_mitarbeiterAEndernSpeichern.gridy = 15;
		add(mitarbeiterAEndernSpeichern, gbc_mitarbeiterAEndernSpeichern);

	}

}
