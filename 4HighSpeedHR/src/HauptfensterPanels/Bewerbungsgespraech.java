package HauptfensterPanels;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Bewerbungsgespraech extends JPanel {

	private JTextField bewerbungsgesprächName;
	private JTextField bewerbungsgesprächNachname;
	private JTextField bewerbungsgesprächNummer;
	private JTextField bisherigeNotizen;
	private JTextField bewerberNotizenHinzufügen;

	/**
	 * Create the panel.
	 */
	public Bewerbungsgespraech() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{60, 276, 138, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 144, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblBewerbungsgespräch = new JLabel("Bewerbungsgespräch");
		lblBewerbungsgespräch.setFont(new Font("Arial", Font.BOLD, 15));
		GridBagConstraints gbc_lblBewerbungsgespräch = new GridBagConstraints();
		gbc_lblBewerbungsgespräch.anchor = GridBagConstraints.WEST;
		gbc_lblBewerbungsgespräch.insets = new Insets(0, 0, 5, 5);
		gbc_lblBewerbungsgespräch.gridx = 1;
		gbc_lblBewerbungsgespräch.gridy = 0;
		add(lblBewerbungsgespräch, gbc_lblBewerbungsgespräch);
		
		JLabel lblBewerberSuchen = new JLabel("Bewerber suchen");
		lblBewerberSuchen.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblBewerberSuchen = new GridBagConstraints();
		gbc_lblBewerberSuchen.anchor = GridBagConstraints.WEST;
		gbc_lblBewerberSuchen.insets = new Insets(0, 0, 5, 5);
		gbc_lblBewerberSuchen.gridx = 1;
		gbc_lblBewerberSuchen.gridy = 1;
		add(lblBewerberSuchen, gbc_lblBewerberSuchen);
		
		JLabel lblBisherigeNotizen = new JLabel("bisherige Notizen");
		lblBisherigeNotizen.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblBisherigeNotizen = new GridBagConstraints();
		gbc_lblBisherigeNotizen.anchor = GridBagConstraints.WEST;
		gbc_lblBisherigeNotizen.insets = new Insets(0, 0, 5, 0);
		gbc_lblBisherigeNotizen.gridx = 2;
		gbc_lblBisherigeNotizen.gridy = 1;
		add(lblBisherigeNotizen, gbc_lblBisherigeNotizen);
		
		JLabel lblBewerbungsgesprächName = new JLabel("Name*");
		lblBewerbungsgesprächName.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblBewerbungsgesprächName = new GridBagConstraints();
		gbc_lblBewerbungsgesprächName.anchor = GridBagConstraints.WEST;
		gbc_lblBewerbungsgesprächName.insets = new Insets(0, 0, 5, 5);
		gbc_lblBewerbungsgesprächName.gridx = 1;
		gbc_lblBewerbungsgesprächName.gridy = 2;
		add(lblBewerbungsgesprächName, gbc_lblBewerbungsgesprächName);
		
		bewerbungsgesprächName = new JTextField();
		bewerbungsgesprächName.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_bewerbungsgesprächName = new GridBagConstraints();
		gbc_bewerbungsgesprächName.insets = new Insets(0, 0, 5, 5);
		gbc_bewerbungsgesprächName.fill = GridBagConstraints.HORIZONTAL;
		gbc_bewerbungsgesprächName.gridx = 1;
		gbc_bewerbungsgesprächName.gridy = 3;
		add(bewerbungsgesprächName, gbc_bewerbungsgesprächName);
		bewerbungsgesprächName.setColumns(10);
		
		JLabel lblBewerbungsgesprächNachname = new JLabel("Nachname*");
		lblBewerbungsgesprächNachname.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblBewerbungsgesprächNachname = new GridBagConstraints();
		gbc_lblBewerbungsgesprächNachname.anchor = GridBagConstraints.WEST;
		gbc_lblBewerbungsgesprächNachname.insets = new Insets(0, 0, 5, 5);
		gbc_lblBewerbungsgesprächNachname.gridx = 1;
		gbc_lblBewerbungsgesprächNachname.gridy = 4;
		add(lblBewerbungsgesprächNachname, gbc_lblBewerbungsgesprächNachname);
		
		bewerbungsgesprächNachname = new JTextField();
		bewerbungsgesprächNachname.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_bewerbungsgesprächNachname = new GridBagConstraints();
		gbc_bewerbungsgesprächNachname.insets = new Insets(0, 0, 5, 5);
		gbc_bewerbungsgesprächNachname.fill = GridBagConstraints.HORIZONTAL;
		gbc_bewerbungsgesprächNachname.gridx = 1;
		gbc_bewerbungsgesprächNachname.gridy = 5;
		add(bewerbungsgesprächNachname, gbc_bewerbungsgesprächNachname);
		bewerbungsgesprächNachname.setColumns(10);
		
		bisherigeNotizen = new JTextField();
		bisherigeNotizen.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_bisherigeNotizen = new GridBagConstraints();
		gbc_bisherigeNotizen.gridheight = 5;
		gbc_bisherigeNotizen.insets = new Insets(0, 0, 5, 0);
		gbc_bisherigeNotizen.fill = GridBagConstraints.BOTH;
		gbc_bisherigeNotizen.gridx = 2;
		gbc_bisherigeNotizen.gridy = 3;
		add(bisherigeNotizen, gbc_bisherigeNotizen);
		bisherigeNotizen.setColumns(10);
		
		JLabel lblBewerbungsgesprächNummer = new JLabel("Nummer*");
		lblBewerbungsgesprächNummer.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblBewerbungsgesprächNummer = new GridBagConstraints();
		gbc_lblBewerbungsgesprächNummer.anchor = GridBagConstraints.WEST;
		gbc_lblBewerbungsgesprächNummer.insets = new Insets(0, 0, 5, 5);
		gbc_lblBewerbungsgesprächNummer.gridx = 1;
		gbc_lblBewerbungsgesprächNummer.gridy = 6;
		add(lblBewerbungsgesprächNummer, gbc_lblBewerbungsgesprächNummer);
		
		bewerbungsgesprächNummer = new JTextField();
		bewerbungsgesprächNummer.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_bewerbungsgesprächNummer = new GridBagConstraints();
		gbc_bewerbungsgesprächNummer.insets = new Insets(0, 0, 5, 5);
		gbc_bewerbungsgesprächNummer.fill = GridBagConstraints.HORIZONTAL;
		gbc_bewerbungsgesprächNummer.gridx = 1;
		gbc_bewerbungsgesprächNummer.gridy = 7;
		add(bewerbungsgesprächNummer, gbc_bewerbungsgesprächNummer);
		bewerbungsgesprächNummer.setColumns(10);
		
		JLabel lblBewerberNotizenHinzufügen = new JLabel("Bewerber Notizen hinzufügen");
		lblBewerberNotizenHinzufügen.setFont(new Font("Arial", Font.BOLD, 15));
		GridBagConstraints gbc_lblBewerberNotizenHinzufügen = new GridBagConstraints();
		gbc_lblBewerberNotizenHinzufügen.anchor = GridBagConstraints.WEST;
		gbc_lblBewerberNotizenHinzufügen.insets = new Insets(0, 0, 5, 5);
		gbc_lblBewerberNotizenHinzufügen.gridx = 1;
		gbc_lblBewerberNotizenHinzufügen.gridy = 10;
		add(lblBewerberNotizenHinzufügen, gbc_lblBewerberNotizenHinzufügen);
		
		JLabel lblNewLabel_7 = new JLabel(" ");
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_7.gridx = 0;
		gbc_lblNewLabel_7.gridy = 11;
		add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		bewerberNotizenHinzufügen = new JTextField();
		bewerberNotizenHinzufügen.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_bewerberNotizenHinzufügen = new GridBagConstraints();
		gbc_bewerberNotizenHinzufügen.gridwidth = 2;
		gbc_bewerberNotizenHinzufügen.gridheight = 4;
		gbc_bewerberNotizenHinzufügen.insets = new Insets(0, 0, 5, 0);
		gbc_bewerberNotizenHinzufügen.fill = GridBagConstraints.BOTH;
		gbc_bewerberNotizenHinzufügen.gridx = 1;
		gbc_bewerberNotizenHinzufügen.gridy = 11;
		add(bewerberNotizenHinzufügen, gbc_bewerberNotizenHinzufügen);
		bewerberNotizenHinzufügen.setColumns(10);
		
		JButton bewerbungsgesprächSpeichern = new JButton("Speichern");
		bewerbungsgesprächSpeichern.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_bewerbungsgesprächSpeichern = new GridBagConstraints();
		gbc_bewerbungsgesprächSpeichern.insets = new Insets(0, 0, 0, 5);
		gbc_bewerbungsgesprächSpeichern.fill = GridBagConstraints.HORIZONTAL;
		gbc_bewerbungsgesprächSpeichern.gridx = 1;
		gbc_bewerbungsgesprächSpeichern.gridy = 15;
		add(bewerbungsgesprächSpeichern, gbc_bewerbungsgesprächSpeichern);


	}

}
