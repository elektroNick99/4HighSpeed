package HauptfensterPanels;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;

public class BewerberLoeschen extends JPanel {
	private JTextField bewerberLoeschenName;
	private JTextField bewerberLoeschenNachname;
	private JTextField bewerberLoeschenNummer;

	/**
	 * Create the panel.
	 */
	public BewerberLoeschen() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{60, 276, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblBewerberLoeschen = new JLabel("Bewerber loeschen");
		lblBewerberLoeschen.setFont(new Font("Arial", Font.BOLD, 15));
		GridBagConstraints gbc_lblBewerberLoeschen = new GridBagConstraints();
		gbc_lblBewerberLoeschen.anchor = GridBagConstraints.WEST;
		gbc_lblBewerberLoeschen.insets = new Insets(0, 0, 5, 0);
		gbc_lblBewerberLoeschen.gridx = 1;
		gbc_lblBewerberLoeschen.gridy = 0;
		add(lblBewerberLoeschen, gbc_lblBewerberLoeschen);
		
		JLabel lblBewerberLoeschenName = new JLabel("Name*");
		lblBewerberLoeschenName.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblBewerberLoeschenName = new GridBagConstraints();
		gbc_lblBewerberLoeschenName.anchor = GridBagConstraints.WEST;
		gbc_lblBewerberLoeschenName.insets = new Insets(0, 0, 5, 0);
		gbc_lblBewerberLoeschenName.gridx = 1;
		gbc_lblBewerberLoeschenName.gridy = 1;
		add(lblBewerberLoeschenName, gbc_lblBewerberLoeschenName);
		
		bewerberLoeschenName = new JTextField();
		bewerberLoeschenName.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_bewerberLoeschenName = new GridBagConstraints();
		gbc_bewerberLoeschenName.insets = new Insets(0, 0, 5, 0);
		gbc_bewerberLoeschenName.fill = GridBagConstraints.HORIZONTAL;
		gbc_bewerberLoeschenName.gridx = 1;
		gbc_bewerberLoeschenName.gridy = 2;
		add(bewerberLoeschenName, gbc_bewerberLoeschenName);
		bewerberLoeschenName.setColumns(10);
		
		JLabel lblBewerberLoeschenNachname = new JLabel("Nachname*");
		lblBewerberLoeschenNachname.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblBewerberLoeschenNachname = new GridBagConstraints();
		gbc_lblBewerberLoeschenNachname.anchor = GridBagConstraints.WEST;
		gbc_lblBewerberLoeschenNachname.insets = new Insets(0, 0, 5, 0);
		gbc_lblBewerberLoeschenNachname.gridx = 1;
		gbc_lblBewerberLoeschenNachname.gridy = 3;
		add(lblBewerberLoeschenNachname, gbc_lblBewerberLoeschenNachname);
		
		bewerberLoeschenNachname = new JTextField();
		bewerberLoeschenNachname.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_bewerberLoeschenNachname = new GridBagConstraints();
		gbc_bewerberLoeschenNachname.insets = new Insets(0, 0, 5, 0);
		gbc_bewerberLoeschenNachname.fill = GridBagConstraints.HORIZONTAL;
		gbc_bewerberLoeschenNachname.gridx = 1;
		gbc_bewerberLoeschenNachname.gridy = 4;
		add(bewerberLoeschenNachname, gbc_bewerberLoeschenNachname);
		bewerberLoeschenNachname.setColumns(10);
		
		JLabel lblBewerberLoeschenNummer = new JLabel("Nummer*");
		lblBewerberLoeschenNummer.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblBewerberLoeschenNummer = new GridBagConstraints();
		gbc_lblBewerberLoeschenNummer.anchor = GridBagConstraints.WEST;
		gbc_lblBewerberLoeschenNummer.insets = new Insets(0, 0, 5, 0);
		gbc_lblBewerberLoeschenNummer.gridx = 1;
		gbc_lblBewerberLoeschenNummer.gridy = 5;
		add(lblBewerberLoeschenNummer, gbc_lblBewerberLoeschenNummer);
		
		bewerberLoeschenNummer = new JTextField();
		bewerberLoeschenNummer.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_bewerberLoeschenNummer = new GridBagConstraints();
		gbc_bewerberLoeschenNummer.insets = new Insets(0, 0, 5, 0);
		gbc_bewerberLoeschenNummer.fill = GridBagConstraints.HORIZONTAL;
		gbc_bewerberLoeschenNummer.gridx = 1;
		gbc_bewerberLoeschenNummer.gridy = 6;
		add(bewerberLoeschenNummer, gbc_bewerberLoeschenNummer);
		bewerberLoeschenNummer.setColumns(10);
		
		JButton bewerberLoeschen = new JButton("Loeschen");
		bewerberLoeschen.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_bewerberLoeschen = new GridBagConstraints();
		gbc_bewerberLoeschen.fill = GridBagConstraints.HORIZONTAL;
		gbc_bewerberLoeschen.gridx = 1;
		gbc_bewerberLoeschen.gridy = 8;
		add(bewerberLoeschen, gbc_bewerberLoeschen);


	}

}
