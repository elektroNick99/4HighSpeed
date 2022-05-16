package HauptfensterPanels;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Font;
import java.awt.GridBagConstraints;

public class Gehaltsausgabe extends JPanel {
	private JTextField mitarbeiterGehaltName;
	private JTextField mitarbeiterGehaltNachname;
	private JTextField mitarbeiterGehaltNummer;
	private JTextField mitarbeiterGehaltMonate;
	/**
	 * Create the panel.
	 */
	public Gehaltsausgabe() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{60, 112, 144, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 29, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblMitarbeiterGehalt = new JLabel("Mitarbeiter Gehalt");
		lblMitarbeiterGehalt.setFont(new Font("Arial", Font.BOLD, 15));
		GridBagConstraints gbc_lblMitarbeiterGehalt = new GridBagConstraints();
		gbc_lblMitarbeiterGehalt.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterGehalt.insets = new Insets(0, 0, 5, 5);
		gbc_lblMitarbeiterGehalt.gridx = 1;
		gbc_lblMitarbeiterGehalt.gridy = 0;
		add(lblMitarbeiterGehalt, gbc_lblMitarbeiterGehalt);
		
		JLabel lblMitarbeiterGehaltSuchen = new JLabel("Mitarbeiter suchen");
		lblMitarbeiterGehaltSuchen.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblMitarbeiterGehaltSuchen = new GridBagConstraints();
		gbc_lblMitarbeiterGehaltSuchen.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterGehaltSuchen.insets = new Insets(0, 0, 5, 5);
		gbc_lblMitarbeiterGehaltSuchen.gridx = 1;
		gbc_lblMitarbeiterGehaltSuchen.gridy = 1;
		add(lblMitarbeiterGehaltSuchen, gbc_lblMitarbeiterGehaltSuchen);
		
		JLabel lblMitarbeiterGehaltName = new JLabel("Name*");
		lblMitarbeiterGehaltName.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMitarbeiterGehaltName = new GridBagConstraints();
		gbc_lblMitarbeiterGehaltName.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterGehaltName.insets = new Insets(0, 0, 5, 5);
		gbc_lblMitarbeiterGehaltName.gridx = 1;
		gbc_lblMitarbeiterGehaltName.gridy = 2;
		add(lblMitarbeiterGehaltName, gbc_lblMitarbeiterGehaltName);
	    
	    mitarbeiterGehaltName = new JTextField();
	    mitarbeiterGehaltName.setFont(new Font("Arial", Font.PLAIN, 12));
	    GridBagConstraints gbc_mitarbeiterGehaltName = new GridBagConstraints();
	    gbc_mitarbeiterGehaltName.insets = new Insets(0, 0, 5, 5);
	    gbc_mitarbeiterGehaltName.fill = GridBagConstraints.HORIZONTAL;
	    gbc_mitarbeiterGehaltName.gridx = 1;
	    gbc_mitarbeiterGehaltName.gridy = 3;
	    add(mitarbeiterGehaltName, gbc_mitarbeiterGehaltName);
	    mitarbeiterGehaltName.setColumns(10);
		
		JLabel lblMitarbeiterGehaltNachname = new JLabel("Nachname*");
		lblMitarbeiterGehaltNachname.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMitarbeiterGehaltNachname = new GridBagConstraints();
		gbc_lblMitarbeiterGehaltNachname.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterGehaltNachname.insets = new Insets(0, 0, 5, 5);
		gbc_lblMitarbeiterGehaltNachname.gridx = 1;
		gbc_lblMitarbeiterGehaltNachname.gridy = 4;
		add(lblMitarbeiterGehaltNachname, gbc_lblMitarbeiterGehaltNachname);
		
		mitarbeiterGehaltNachname = new JTextField();
		mitarbeiterGehaltNachname.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_mitarbeiterGehaltNachname = new GridBagConstraints();
		gbc_mitarbeiterGehaltNachname.insets = new Insets(0, 0, 5, 5);
		gbc_mitarbeiterGehaltNachname.fill = GridBagConstraints.HORIZONTAL;
		gbc_mitarbeiterGehaltNachname.gridx = 1;
		gbc_mitarbeiterGehaltNachname.gridy = 5;
		add(mitarbeiterGehaltNachname, gbc_mitarbeiterGehaltNachname);
		mitarbeiterGehaltNachname.setColumns(10);
		
		JLabel lblMitarbeiterGehaltNummer = new JLabel("Nummer*");
		lblMitarbeiterGehaltNummer.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMitarbeiterGehaltNummer = new GridBagConstraints();
		gbc_lblMitarbeiterGehaltNummer.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterGehaltNummer.insets = new Insets(0, 0, 5, 5);
		gbc_lblMitarbeiterGehaltNummer.gridx = 1;
		gbc_lblMitarbeiterGehaltNummer.gridy = 6;
		add(lblMitarbeiterGehaltNummer, gbc_lblMitarbeiterGehaltNummer);
		
		mitarbeiterGehaltNummer = new JTextField();
		mitarbeiterGehaltNummer.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_mitarbeiterGehaltNummer = new GridBagConstraints();
		gbc_mitarbeiterGehaltNummer.insets = new Insets(0, 0, 5, 5);
		gbc_mitarbeiterGehaltNummer.fill = GridBagConstraints.HORIZONTAL;
		gbc_mitarbeiterGehaltNummer.gridx = 1;
		gbc_mitarbeiterGehaltNummer.gridy = 7;
		add(mitarbeiterGehaltNummer, gbc_mitarbeiterGehaltNummer);
		mitarbeiterGehaltNummer.setColumns(10);
		
		JButton mitarbeiterSuchen = new JButton("Suchen");
		mitarbeiterSuchen.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_mitarbeiterSuchen = new GridBagConstraints();
		gbc_mitarbeiterSuchen.fill = GridBagConstraints.HORIZONTAL;
		gbc_mitarbeiterSuchen.insets = new Insets(0, 0, 5, 5);
		gbc_mitarbeiterSuchen.gridx = 1;
		gbc_mitarbeiterSuchen.gridy = 8;
		add(mitarbeiterSuchen, gbc_mitarbeiterSuchen);
		
		JLabel lblMitarbeiterGehaltMonate = new JLabel("Monate der Berechnung*");
		lblMitarbeiterGehaltMonate.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMitarbeiterGehaltMonate = new GridBagConstraints();
		gbc_lblMitarbeiterGehaltMonate.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterGehaltMonate.insets = new Insets(0, 0, 5, 5);
		gbc_lblMitarbeiterGehaltMonate.gridx = 1;
		gbc_lblMitarbeiterGehaltMonate.gridy = 10;
		add(lblMitarbeiterGehaltMonate, gbc_lblMitarbeiterGehaltMonate);
		
		mitarbeiterGehaltMonate = new JTextField();
		mitarbeiterGehaltMonate.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_mitarbeiterGehaltMonate = new GridBagConstraints();
		gbc_mitarbeiterGehaltMonate.insets = new Insets(0, 0, 5, 5);
		gbc_mitarbeiterGehaltMonate.fill = GridBagConstraints.HORIZONTAL;
		gbc_mitarbeiterGehaltMonate.gridx = 1;
		gbc_mitarbeiterGehaltMonate.gridy = 11;
		add(mitarbeiterGehaltMonate, gbc_mitarbeiterGehaltMonate);
		mitarbeiterGehaltMonate.setColumns(10);
		
		JButton gehaltAusgebenPDF = new JButton("Gehalt ausgeben PDF");
		gehaltAusgebenPDF.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_gehaltAusgebenPDF = new GridBagConstraints();
		gbc_gehaltAusgebenPDF.fill = GridBagConstraints.HORIZONTAL;
		gbc_gehaltAusgebenPDF.insets = new Insets(0, 0, 5, 5);
		gbc_gehaltAusgebenPDF.gridx = 1;
		gbc_gehaltAusgebenPDF.gridy = 12;
		add(gehaltAusgebenPDF, gbc_gehaltAusgebenPDF);
		
		JButton gehaltAusgeben = new JButton("Gehalt ausgeben");
		gehaltAusgeben.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_gehaltAusgeben = new GridBagConstraints();
		gbc_gehaltAusgeben.fill = GridBagConstraints.HORIZONTAL;
		gbc_gehaltAusgeben.insets = new Insets(0, 0, 5, 5);
		gbc_gehaltAusgeben.gridx = 1;
		gbc_gehaltAusgeben.gridy = 13;
		add(gehaltAusgeben, gbc_gehaltAusgeben);

	}

}