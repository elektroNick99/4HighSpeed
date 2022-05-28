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
import javax.swing.JTextField;

import de.fourHighSpeedHR.database.MitarbeiterDB;
import de.fourHighSpeedHR.objects.Abteilungen;
import de.fourHighSpeedHR.objects.Gehaltsgruppe;
import de.fourHighSpeedHR.objects.Mitarbeiter;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

public class MitarbeiterAendern extends JPanel {

	private static String idMA;
	private static String gebMA;

	private static JTextField mitarbeiterAEndernName;
	private static JTextField mitarbeiterAEndernNachname;
	private static JTextField mitarbeiterAEndernStrasse;
	private static JTextField mitarbeiterAEndernHNR;
	private static JTextField mitarbeiterAEndernOrt;
	private static JTextField mitarbeiterAEndernPLZ;
	private static JTextField mitarbeiterAEndernTel;
	private static JTextField mitarbeiterSuchenName;
	private static JTextField mitarbeiterSuchenNachname;
	private static JTextField mitarbeiterSuchenNummer;
	private static JCheckBox cbKuendigen;
	private static JComboBox cbGehalt, cbAbteilung;

	
	/**
	 * Create the panel.
	 */
	public MitarbeiterAendern() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 60, 112, 236, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 29, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, Double.MIN_VALUE };
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
		gbc_lbl2MitarbeiterAEndern.gridx = 2;
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
		gbc_lblMitarbeiterAEndernName.gridx = 2;
		gbc_lblMitarbeiterAEndernName.gridy = 2;
		add(lblMitarbeiterAEndernName, gbc_lblMitarbeiterAEndernName);

		mitarbeiterSuchenName = new JTextField();
		mitarbeiterSuchenName.setFont(new Font("Arial", Font.PLAIN, 12));
		mitarbeiterSuchenName.addKeyListener(new KeyAdapter() {
	         public void keyTyped(KeyEvent e) {
	             char c = e.getKeyChar();
	             if(!(Character.isAlphabetic(c) || (c==KeyEvent.VK_SPACE) || c==KeyEvent.VK_DELETE || c==KeyEvent.VK_MINUS)) {
	                 e.consume();  // ignore the event if it's not an alphabet
	             }
	         }
	      });
		GridBagConstraints gbc_mitarbeiterSuchenName = new GridBagConstraints();
		gbc_mitarbeiterSuchenName.insets = new Insets(0, 0, 5, 5);
		gbc_mitarbeiterSuchenName.fill = GridBagConstraints.HORIZONTAL;
		gbc_mitarbeiterSuchenName.gridx = 1;
		gbc_mitarbeiterSuchenName.gridy = 3;
		add(mitarbeiterSuchenName, gbc_mitarbeiterSuchenName);
		mitarbeiterSuchenName.setColumns(10);

		mitarbeiterAEndernName = new JTextField();
		mitarbeiterAEndernName.setFont(new Font("Arial", Font.PLAIN, 12));
		mitarbeiterAEndernName.addKeyListener(new KeyAdapter() {
	         public void keyTyped(KeyEvent e) {
	             char c = e.getKeyChar();
	             if(!(Character.isAlphabetic(c) || (c==KeyEvent.VK_SPACE) || c==KeyEvent.VK_DELETE || c==KeyEvent.VK_MINUS)) {
	                 e.consume();  // ignore the event if it's not an alphabet
	             }
	         }
	      });
		GridBagConstraints gbc_mitarbeiterAEndernName = new GridBagConstraints();
		gbc_mitarbeiterAEndernName.insets = new Insets(0, 0, 5, 5);
		gbc_mitarbeiterAEndernName.fill = GridBagConstraints.HORIZONTAL;
		gbc_mitarbeiterAEndernName.gridx = 2;
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
		gbc_lblMitarbeiterAEndernNachname.gridx = 2;
		gbc_lblMitarbeiterAEndernNachname.gridy = 4;
		add(lblMitarbeiterAEndernNachname, gbc_lblMitarbeiterAEndernNachname);

		mitarbeiterSuchenNachname = new JTextField();
		mitarbeiterSuchenNachname.setFont(new Font("Arial", Font.PLAIN, 12));
		mitarbeiterSuchenNachname.addKeyListener(new KeyAdapter() {
	         public void keyTyped(KeyEvent e) {
	             char c = e.getKeyChar();
	             if(!(Character.isAlphabetic(c) || (c==KeyEvent.VK_SPACE) || c==KeyEvent.VK_DELETE || c==KeyEvent.VK_MINUS)) {
	                 e.consume();  // ignore the event if it's not an alphabet
	             }
	         }
	      });
		GridBagConstraints gbc_mitarbeiterSuchenNachname = new GridBagConstraints();
		gbc_mitarbeiterSuchenNachname.insets = new Insets(0, 0, 5, 5);
		gbc_mitarbeiterSuchenNachname.fill = GridBagConstraints.HORIZONTAL;
		gbc_mitarbeiterSuchenNachname.gridx = 1;
		gbc_mitarbeiterSuchenNachname.gridy = 5;
		add(mitarbeiterSuchenNachname, gbc_mitarbeiterSuchenNachname);
		mitarbeiterSuchenNachname.setColumns(10);

		mitarbeiterAEndernNachname = new JTextField();
		mitarbeiterAEndernNachname.setFont(new Font("Arial", Font.PLAIN, 12));
		mitarbeiterAEndernNachname.addKeyListener(new KeyAdapter() {
	         public void keyTyped(KeyEvent e) {
	             char c = e.getKeyChar();
	             if(!(Character.isAlphabetic(c) || (c==KeyEvent.VK_SPACE) || c==KeyEvent.VK_DELETE || c==KeyEvent.VK_MINUS)) {
	                 e.consume();  // ignore the event if it's not an alphabet
	             }
	         }
	      });
		GridBagConstraints gbc_mitarbeiterAEndernNachname = new GridBagConstraints();
		gbc_mitarbeiterAEndernNachname.insets = new Insets(0, 0, 5, 5);
		gbc_mitarbeiterAEndernNachname.fill = GridBagConstraints.HORIZONTAL;
		gbc_mitarbeiterAEndernNachname.gridx = 2;
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
		gbc_lblMitarbeiterAEndernAdresse.gridx = 2;
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
		gbc_lblMitarbeiterAEndernStraße.gridx = 2;
		gbc_lblMitarbeiterAEndernStraße.gridy = 7;
		add(lblMitarbeiterAEndernStraße, gbc_lblMitarbeiterAEndernStraße);

		JLabel lblMitarbeiterAEndernHNR = new JLabel("HNR");
		lblMitarbeiterAEndernHNR.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMitarbeiterAEndernHNR = new GridBagConstraints();
		gbc_lblMitarbeiterAEndernHNR.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterAEndernHNR.insets = new Insets(0, 0, 5, 0);
		gbc_lblMitarbeiterAEndernHNR.gridx = 3;
		gbc_lblMitarbeiterAEndernHNR.gridy = 7;
		add(lblMitarbeiterAEndernHNR, gbc_lblMitarbeiterAEndernHNR);

		JButton mitarbeiterSuchen = new JButton("Suchen");
		mitarbeiterSuchen.setFont(new Font("Arial", Font.BOLD, 12));
		mitarbeiterSuchen.addActionListener(e -> maSuchen());
		GridBagConstraints gbc_mitarbeiterSuchen = new GridBagConstraints();
		gbc_mitarbeiterSuchen.fill = GridBagConstraints.HORIZONTAL;
		gbc_mitarbeiterSuchen.insets = new Insets(0, 0, 5, 5);
		gbc_mitarbeiterSuchen.gridx = 1;
		gbc_mitarbeiterSuchen.gridy = 8;
		add(mitarbeiterSuchen, gbc_mitarbeiterSuchen);

		mitarbeiterAEndernStrasse = new JTextField();
		mitarbeiterAEndernStrasse.setFont(new Font("Arial", Font.PLAIN, 12));
		mitarbeiterAEndernStrasse.addKeyListener(new KeyAdapter() {
	         public void keyTyped(KeyEvent e) {
	             char c = e.getKeyChar();
	             if(!(Character.isAlphabetic(c) || (c==KeyEvent.VK_SPACE) || c==KeyEvent.VK_DELETE || c==KeyEvent.VK_MINUS)) {
	                 e.consume();  // ignore the event if it's not an alphabet
	             }
	         }
	      });
		GridBagConstraints gbc_mitarbeiterAEndernStrasse = new GridBagConstraints();
		gbc_mitarbeiterAEndernStrasse.insets = new Insets(0, 0, 5, 5);
		gbc_mitarbeiterAEndernStrasse.fill = GridBagConstraints.HORIZONTAL;
		gbc_mitarbeiterAEndernStrasse.gridx = 2;
		gbc_mitarbeiterAEndernStrasse.gridy = 8;
		add(mitarbeiterAEndernStrasse, gbc_mitarbeiterAEndernStrasse);
		mitarbeiterAEndernStrasse.setColumns(10);

		mitarbeiterAEndernHNR = new JTextField();
		mitarbeiterAEndernHNR.setFont(new Font("Arial", Font.PLAIN, 12));
		mitarbeiterAEndernHNR.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
					getToolkit().beep();
					e.consume();
				}
			}
		});
		GridBagConstraints gbc_mitarbeiterAEndernHNR = new GridBagConstraints();
		gbc_mitarbeiterAEndernHNR.insets = new Insets(0, 0, 5, 0);
		gbc_mitarbeiterAEndernHNR.fill = GridBagConstraints.HORIZONTAL;
		gbc_mitarbeiterAEndernHNR.gridx = 3;
		gbc_mitarbeiterAEndernHNR.gridy = 8;
		add(mitarbeiterAEndernHNR, gbc_mitarbeiterAEndernHNR);
		mitarbeiterAEndernHNR.setColumns(10);

		JLabel lblMitarbeiterAEndernOrt = new JLabel("Ort");
		lblMitarbeiterAEndernOrt.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMitarbeiterAEndernOrt = new GridBagConstraints();
		gbc_lblMitarbeiterAEndernOrt.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterAEndernOrt.insets = new Insets(0, 0, 5, 5);
		gbc_lblMitarbeiterAEndernOrt.gridx = 2;
		gbc_lblMitarbeiterAEndernOrt.gridy = 9;
		add(lblMitarbeiterAEndernOrt, gbc_lblMitarbeiterAEndernOrt);

		JLabel lblMitarbeiterAEndernPLZ = new JLabel("PLZ");
		lblMitarbeiterAEndernPLZ.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMitarbeiterAEndernPLZ = new GridBagConstraints();
		gbc_lblMitarbeiterAEndernPLZ.insets = new Insets(0, 0, 5, 0);
		gbc_lblMitarbeiterAEndernPLZ.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterAEndernPLZ.gridx = 3;
		gbc_lblMitarbeiterAEndernPLZ.gridy = 9;
		add(lblMitarbeiterAEndernPLZ, gbc_lblMitarbeiterAEndernPLZ);

		mitarbeiterAEndernOrt = new JTextField();
		mitarbeiterAEndernOrt.setFont(new Font("Arial", Font.PLAIN, 12));
		mitarbeiterAEndernOrt.addKeyListener(new KeyAdapter() {
	         public void keyTyped(KeyEvent e) {
	             char c = e.getKeyChar();
	             if(!(Character.isAlphabetic(c) || (c==KeyEvent.VK_SPACE) || c==KeyEvent.VK_DELETE || c==KeyEvent.VK_MINUS)) {
	                 e.consume();  // ignore the event if it's not an alphabet
	             }
	         }
	      });
		GridBagConstraints gbc_mitarbeiterAEndernOrt = new GridBagConstraints();
		gbc_mitarbeiterAEndernOrt.insets = new Insets(0, 0, 5, 5);
		gbc_mitarbeiterAEndernOrt.fill = GridBagConstraints.HORIZONTAL;
		gbc_mitarbeiterAEndernOrt.gridx = 2;
		gbc_mitarbeiterAEndernOrt.gridy = 10;
		add(mitarbeiterAEndernOrt, gbc_mitarbeiterAEndernOrt);
		mitarbeiterAEndernOrt.setColumns(10);

		mitarbeiterAEndernPLZ = new JTextField();
		mitarbeiterAEndernPLZ.setFont(new Font("Arial", Font.PLAIN, 12));
		mitarbeiterAEndernPLZ.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
					getToolkit().beep();
					e.consume();
				}
			}
		});
		GridBagConstraints gbc_mitarbeiterAEndernPLZ = new GridBagConstraints();
		gbc_mitarbeiterAEndernPLZ.insets = new Insets(0, 0, 5, 0);
		gbc_mitarbeiterAEndernPLZ.fill = GridBagConstraints.HORIZONTAL;
		gbc_mitarbeiterAEndernPLZ.gridx = 3;
		gbc_mitarbeiterAEndernPLZ.gridy = 10;
		add(mitarbeiterAEndernPLZ, gbc_mitarbeiterAEndernPLZ);
		mitarbeiterAEndernPLZ.setColumns(10);

		JLabel lblMitarbeiterAEndernTel = new JLabel("Tel.:");
		lblMitarbeiterAEndernTel.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMitarbeiterAEndernTel = new GridBagConstraints();
		gbc_lblMitarbeiterAEndernTel.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterAEndernTel.insets = new Insets(0, 0, 5, 5);
		gbc_lblMitarbeiterAEndernTel.gridx = 2;
		gbc_lblMitarbeiterAEndernTel.gridy = 11;
		add(lblMitarbeiterAEndernTel, gbc_lblMitarbeiterAEndernTel);

		mitarbeiterAEndernTel = new JTextField();
		mitarbeiterAEndernTel.setFont(new Font("Arial", Font.PLAIN, 12));
		mitarbeiterAEndernTel.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
					getToolkit().beep();
					e.consume();
				}
			}
		});
		GridBagConstraints gbc_mitarbeiterAEndernTel = new GridBagConstraints();
		gbc_mitarbeiterAEndernTel.insets = new Insets(0, 0, 5, 5);
		gbc_mitarbeiterAEndernTel.fill = GridBagConstraints.HORIZONTAL;
		gbc_mitarbeiterAEndernTel.gridx = 2;
		gbc_mitarbeiterAEndernTel.gridy = 12;
		add(mitarbeiterAEndernTel, gbc_mitarbeiterAEndernTel);
		mitarbeiterAEndernTel.setColumns(10);
		
		cbKuendigen = new JCheckBox("kuendigen");
		cbKuendigen.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_cbKuendigen = new GridBagConstraints();
		gbc_cbKuendigen.anchor = GridBagConstraints.WEST;
		gbc_cbKuendigen.insets = new Insets(0, 0, 5, 0);
		gbc_cbKuendigen.gridx = 3;
		gbc_cbKuendigen.gridy = 12;
		add(cbKuendigen, gbc_cbKuendigen);

		JLabel lblMitarbeiterAEndernAbteilung = new JLabel("Abteilung");
		lblMitarbeiterAEndernAbteilung.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMitarbeiterAEndernAbteilung = new GridBagConstraints();
		gbc_lblMitarbeiterAEndernAbteilung.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterAEndernAbteilung.insets = new Insets(0, 0, 5, 5);
		gbc_lblMitarbeiterAEndernAbteilung.gridx = 2;
		gbc_lblMitarbeiterAEndernAbteilung.gridy = 13;
		add(lblMitarbeiterAEndernAbteilung, gbc_lblMitarbeiterAEndernAbteilung);

		JLabel lblMitarbeiterAEndernGehalt = new JLabel("Gehalt");
		lblMitarbeiterAEndernGehalt.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMitarbeiterAEndernGehalt = new GridBagConstraints();
		gbc_lblMitarbeiterAEndernGehalt.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterAEndernGehalt.insets = new Insets(0, 0, 5, 0);
		gbc_lblMitarbeiterAEndernGehalt.gridx = 3;
		gbc_lblMitarbeiterAEndernGehalt.gridy = 13;
		add(lblMitarbeiterAEndernGehalt, gbc_lblMitarbeiterAEndernGehalt);
		
		Abteilungen[] abteilungen = Abteilungen.values();
		cbAbteilung = new JComboBox(abteilungen);
		GridBagConstraints gbc_cbAbteilung = new GridBagConstraints();
		gbc_cbAbteilung.insets = new Insets(0, 0, 5, 5);
		gbc_cbAbteilung.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbAbteilung.gridx = 2;
		gbc_cbAbteilung.gridy = 14;
		add(cbAbteilung, gbc_cbAbteilung);
		
		Gehaltsgruppe[] gehaltsgruppe = Gehaltsgruppe.values();
		cbGehalt = new JComboBox(gehaltsgruppe);		
		GridBagConstraints gbc_cbGehalt = new GridBagConstraints();
		gbc_cbGehalt.insets = new Insets(0, 0, 5, 0);
		gbc_cbGehalt.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbGehalt.gridx = 3;
		gbc_cbGehalt.gridy = 14;
		add(cbGehalt, gbc_cbGehalt);

		JButton mitarbeiterAEndernSpeichern = new JButton("Speichern");
		mitarbeiterAEndernSpeichern.setFont(new Font("Arial", Font.BOLD, 12));
		mitarbeiterAEndernSpeichern.addActionListener(e -> maAendern());
		GridBagConstraints gbc_mitarbeiterAEndernSpeichern = new GridBagConstraints();
		gbc_mitarbeiterAEndernSpeichern.gridwidth = 2;
		gbc_mitarbeiterAEndernSpeichern.fill = GridBagConstraints.HORIZONTAL;
		gbc_mitarbeiterAEndernSpeichern.gridx = 2;
		gbc_mitarbeiterAEndernSpeichern.gridy = 16;
		add(mitarbeiterAEndernSpeichern, gbc_mitarbeiterAEndernSpeichern);

	}

	public static void maSuchen() {

		String nameInput = mitarbeiterSuchenName.getText();
		String nachnameInput = mitarbeiterSuchenNachname.getText();
		String idInput = mitarbeiterSuchenNummer.getText();

		if (nameInput.equals("") || nameInput.equals("") || idInput.equals("")) {

			JOptionPane.showMessageDialog(null, "Deine Eingabe ist nicht vollstaendig. Bitte aendere deine Eingabe");

		} else {
			ArrayList<Mitarbeiter> mitarbeiter = MitarbeiterDB.ausgebenMitarbeiterAlle();

			for (int i = 0; i < mitarbeiter.size(); i++) {

				Mitarbeiter m = mitarbeiter.get(i);
				String id = "" + m.getName().charAt(0) + m.getNachname().charAt(0) + m.getGeb();

				if (m.getName().equals(nameInput) && m.getNachname().equals(nachnameInput) && id.equals(idInput)) {

					mitarbeiterAEndernName.setText(m.getName());
					mitarbeiterAEndernNachname.setText(m.getNachname());
					
					String abteilung = m.getAbteilung();
					switch (abteilung) {
					case "GESCHAEFTSLEITUNG":
						cbAbteilung.setSelectedItem(Abteilungen.GESCHAEFTSLEITUNG);
						break;
					case "VERKAUF":
						cbAbteilung.setSelectedItem(Abteilungen.VERKAUF);
						break;
					case "MONTAGE":
						cbAbteilung.setSelectedItem(Abteilungen.MONTAGE);
						break;
					case "LAGERVERWALTUNG":
						cbAbteilung.setSelectedItem(Abteilungen.LAGERVERWALTUNG);
						break;
					case "EINKAUF":
						cbAbteilung.setSelectedItem(Abteilungen.EINKAUF);
						break;
					case "BUCHHALTUNG":
						cbAbteilung.setSelectedItem(Abteilungen.BUCHHALTUNG);
						break;
					case "PERSONALABTEILUNG":
						cbAbteilung.setSelectedItem(Abteilungen.PERSONALABTEILUNG);
						break;
					}
					int gehalt = m.getGehalt();
					switch(gehalt) {
					case 1500:
						cbGehalt.setSelectedItem(Gehaltsgruppe.GEHALTSGRUPPE_1);
						System.out.println(1500);
						break;
					case 3000:
						cbGehalt.setSelectedItem(Gehaltsgruppe.GEHALTSGRUPPE_2);
						System.out.println(3000);
						break;
					case 5000:
						cbGehalt.setSelectedItem(Gehaltsgruppe.GEHALTSGRUPPE_3);
						System.out.println(5000);
						break;
					case 8000:
						cbGehalt.setSelectedItem(Gehaltsgruppe.GEHALTSGRUPPE_4);
						break;
					case 10000:
						cbGehalt.setSelectedItem(Gehaltsgruppe.GEHALTSGRUPPE_5);
						break;
					}
					mitarbeiterAEndernOrt.setText(m.getOrt());
					mitarbeiterAEndernStrasse.setText(m.getStrasse());
					mitarbeiterAEndernHNR.setText(String.valueOf(m.getHnr()));
					mitarbeiterAEndernTel.setText(String.valueOf(m.getTel()));
					mitarbeiterAEndernPLZ.setText(String.valueOf(m.getPlz()));
					
					boolean eingestellt = true;
					if(m.getStatus().equals("gekuendigt")) {
						eingestellt = false;
					}
					
					cbKuendigen.setSelected(eingestellt);

					mitarbeiterSuchenName.setText("");
					mitarbeiterSuchenNachname.setText("");
					mitarbeiterSuchenNummer.setText("");

					idMA = id;
					gebMA = m.getGeb();

					break;

				}
			}
		}

	}

	public static void maAendern() {

		String name = "";
		String nachname = "";
		String strasse = "";
		String ort = "";
		String abteilung = "";
		String geburtstag = "";
		int hnr = 0, plz = 0, gehalt = 0;
		long tel = 0;
		String status = "eingestellt";

		/**
		 * Erst Nummern ueberpruefen da sonst NumberFormatException
		 */

		if (mitarbeiterAEndernHNR.getText().equals("") || mitarbeiterAEndernPLZ.getText().equals("")
				|| mitarbeiterAEndernTel.getText().equals("")) {

		} else {

			name = mitarbeiterAEndernName.getText();
			nachname = mitarbeiterAEndernNachname.getText();
			strasse = mitarbeiterAEndernStrasse.getText();
			hnr = Integer.valueOf(mitarbeiterAEndernHNR.getText());
			ort = mitarbeiterAEndernOrt.getText();
			plz = Integer.valueOf(mitarbeiterAEndernPLZ.getText());
			tel = Long.valueOf(mitarbeiterAEndernTel.getText());
			
			Abteilungen ab = (Abteilungen) cbAbteilung.getSelectedItem();
			abteilung = ab.toString();
			
			Gehaltsgruppe gg = (Gehaltsgruppe) cbGehalt.getSelectedItem();
			gehalt = gg.gehalt;		
			
			geburtstag = gebMA;

			if(cbKuendigen.isSelected()) {
				status = "gekuendigt";
			}
		}

		/**
		 * Test ob alle Felder ausgefüllt sind
		 */

		if (name.equals("") || nachname.equals("") || strasse.equals("") || ort.equals("") || abteilung.equals("")
				|| geburtstag.equals("") || hnr == 0 || plz == 0 || gehalt == 0 || tel == 0) {

			JOptionPane.showMessageDialog(null, "Deine Eingabe ist nicht vollstaendig. Bitte aendere deine Eingabe");

		} else {
			
			MitarbeiterDB.loeschenMitarbeiter(idMA);
			
			MitarbeiterDB.hinzufuegenMitarbeiter(
					new Mitarbeiter(name, nachname, strasse, hnr, ort, plz, tel, abteilung, gehalt, geburtstag, status));
		
			mitarbeiterAEndernName.setText("");
			mitarbeiterAEndernNachname.setText("");
			mitarbeiterAEndernStrasse.setText("");
			mitarbeiterAEndernHNR.setText("");
			mitarbeiterAEndernOrt.setText("");
			mitarbeiterAEndernPLZ.setText("");
			mitarbeiterAEndernTel.setText("");
		}

	}
	
	public static void clearAll() {
		
		mitarbeiterSuchenName.setText("");
		mitarbeiterSuchenNachname.setText("");
		mitarbeiterSuchenNummer.setText("");
		
		mitarbeiterAEndernName.setText("");
		mitarbeiterAEndernNachname.setText("");
		mitarbeiterAEndernStrasse.setText("");
		mitarbeiterAEndernHNR.setText("");
		mitarbeiterAEndernOrt.setText("");
		mitarbeiterAEndernPLZ.setText("");
		mitarbeiterAEndernTel.setText("");
		
		cbGehalt.setSelectedItem(Gehaltsgruppe.GEHALTSGRUPPE_1);
		cbAbteilung.setSelectedItem(Abteilungen.EINKAUF);
	}

}
