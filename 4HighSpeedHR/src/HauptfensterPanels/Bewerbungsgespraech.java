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

	private JTextField bewerbungsgespraechName;
	private JTextField bewerbungsgespraechNachname;
	private JTextField bewerbungsgespraechNummer;
	private JTextField bisherigeNotizen;
	private JTextField bewerberNotizenHinzufuegen;

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
		
		JLabel lblBewerbungsgespraech = new JLabel("Bewerbungsgespraech");
		lblBewerbungsgespraech.setFont(new Font("Arial", Font.BOLD, 15));
		GridBagConstraints gbc_lblBewerbungsgespraech = new GridBagConstraints();
		gbc_lblBewerbungsgespraech.anchor = GridBagConstraints.WEST;
		gbc_lblBewerbungsgespraech.insets = new Insets(0, 0, 5, 5);
		gbc_lblBewerbungsgespraech.gridx = 1;
		gbc_lblBewerbungsgespraech.gridy = 0;
		add(lblBewerbungsgespraech, gbc_lblBewerbungsgespraech);
		
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
		
		JLabel lblBewerbungsgespraechName = new JLabel("Name*");
		lblBewerbungsgespraechName.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblBewerbungsgespraechName = new GridBagConstraints();
		gbc_lblBewerbungsgespraechName.anchor = GridBagConstraints.WEST;
		gbc_lblBewerbungsgespraechName.insets = new Insets(0, 0, 5, 5);
		gbc_lblBewerbungsgespraechName.gridx = 1;
		gbc_lblBewerbungsgespraechName.gridy = 2;
		add(lblBewerbungsgespraechName, gbc_lblBewerbungsgespraechName);
		
		bewerbungsgespraechName = new JTextField();
		bewerbungsgespraechName.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_bewerbungsgespraechName = new GridBagConstraints();
		gbc_bewerbungsgespraechName.insets = new Insets(0, 0, 5, 5);
		gbc_bewerbungsgespraechName.fill = GridBagConstraints.HORIZONTAL;
		gbc_bewerbungsgespraechName.gridx = 1;
		gbc_bewerbungsgespraechName.gridy = 3;
		add(bewerbungsgespraechName, gbc_bewerbungsgespraechName);
		bewerbungsgespraechName.setColumns(10);
		
		JLabel lblBewerbungsgespraechNachname = new JLabel("Nachname*");
		lblBewerbungsgespraechNachname.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblBewerbungsgespraechNachname = new GridBagConstraints();
		gbc_lblBewerbungsgespraechNachname.anchor = GridBagConstraints.WEST;
		gbc_lblBewerbungsgespraechNachname.insets = new Insets(0, 0, 5, 5);
		gbc_lblBewerbungsgespraechNachname.gridx = 1;
		gbc_lblBewerbungsgespraechNachname.gridy = 4;
		add(lblBewerbungsgespraechNachname, gbc_lblBewerbungsgespraechNachname);
		
		bewerbungsgespraechNachname = new JTextField();
		bewerbungsgespraechNachname.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_bewerbungsgespraechNachname = new GridBagConstraints();
		gbc_bewerbungsgespraechNachname.insets = new Insets(0, 0, 5, 5);
		gbc_bewerbungsgespraechNachname.fill = GridBagConstraints.HORIZONTAL;
		gbc_bewerbungsgespraechNachname.gridx = 1;
		gbc_bewerbungsgespraechNachname.gridy = 5;
		add(bewerbungsgespraechNachname, gbc_bewerbungsgespraechNachname);
		bewerbungsgespraechNachname.setColumns(10);
		
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
		
		JLabel lblBewerbungsgespraechNummer = new JLabel("Nummer*");
		lblBewerbungsgespraechNummer.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblBewerbungsgespraechNummer = new GridBagConstraints();
		gbc_lblBewerbungsgespraechNummer.anchor = GridBagConstraints.WEST;
		gbc_lblBewerbungsgespraechNummer.insets = new Insets(0, 0, 5, 5);
		gbc_lblBewerbungsgespraechNummer.gridx = 1;
		gbc_lblBewerbungsgespraechNummer.gridy = 6;
		add(lblBewerbungsgespraechNummer, gbc_lblBewerbungsgespraechNummer);
		
		bewerbungsgespraechNummer = new JTextField();
		bewerbungsgespraechNummer.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_bewerbungsgespraechNummer = new GridBagConstraints();
		gbc_bewerbungsgespraechNummer.insets = new Insets(0, 0, 5, 5);
		gbc_bewerbungsgespraechNummer.fill = GridBagConstraints.HORIZONTAL;
		gbc_bewerbungsgespraechNummer.gridx = 1;
		gbc_bewerbungsgespraechNummer.gridy = 7;
		add(bewerbungsgespraechNummer, gbc_bewerbungsgespraechNummer);
		bewerbungsgespraechNummer.setColumns(10);
		
		JLabel lblBewerberNotizenHinzufuegen = new JLabel("Bewerber Notizen hinzufuegen");
		lblBewerberNotizenHinzufuegen.setFont(new Font("Arial", Font.BOLD, 15));
		GridBagConstraints gbc_lblBewerberNotizenHinzufuegen = new GridBagConstraints();
		gbc_lblBewerberNotizenHinzufuegen.anchor = GridBagConstraints.WEST;
		gbc_lblBewerberNotizenHinzufuegen.insets = new Insets(0, 0, 5, 5);
		gbc_lblBewerberNotizenHinzufuegen.gridx = 1;
		gbc_lblBewerberNotizenHinzufuegen.gridy = 10;
		add(lblBewerberNotizenHinzufuegen, gbc_lblBewerberNotizenHinzufuegen);
		
		JLabel lblNewLabel_7 = new JLabel(" ");
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_7.gridx = 0;
		gbc_lblNewLabel_7.gridy = 11;
		add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		bewerberNotizenHinzufuegen = new JTextField();
		bewerberNotizenHinzufuegen.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_bewerberNotizenHinzufuegen = new GridBagConstraints();
		gbc_bewerberNotizenHinzufuegen.gridwidth = 2;
		gbc_bewerberNotizenHinzufuegen.gridheight = 4;
		gbc_bewerberNotizenHinzufuegen.insets = new Insets(0, 0, 5, 0);
		gbc_bewerberNotizenHinzufuegen.fill = GridBagConstraints.BOTH;
		gbc_bewerberNotizenHinzufuegen.gridx = 1;
		gbc_bewerberNotizenHinzufuegen.gridy = 11;
		add(bewerberNotizenHinzufuegen, gbc_bewerberNotizenHinzufuegen);
		bewerberNotizenHinzufuegen.setColumns(10);
		
		JButton bewerbungsgespraechSpeichern = new JButton("Speichern");
		bewerbungsgespraechSpeichern.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_bewerbungsgespraechSpeichern = new GridBagConstraints();
		gbc_bewerbungsgespraechSpeichern.insets = new Insets(0, 0, 0, 5);
		gbc_bewerbungsgespraechSpeichern.fill = GridBagConstraints.HORIZONTAL;
		gbc_bewerbungsgespraechSpeichern.gridx = 1;
		gbc_bewerbungsgespraechSpeichern.gridy = 15;
		add(bewerbungsgespraechSpeichern, gbc_bewerbungsgespraechSpeichern);


	}

}
