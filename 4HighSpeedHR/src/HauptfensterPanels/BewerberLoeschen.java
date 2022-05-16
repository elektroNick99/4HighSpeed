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
	private JTextField bewerberLöschenName;
	private JTextField bewerberLöschenNachname;
	private JTextField bewerberLöschenNummer;

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
		
		JLabel lblBewerberLöschen = new JLabel("Bewerber löschen");
		lblBewerberLöschen.setFont(new Font("Arial", Font.BOLD, 15));
		GridBagConstraints gbc_lblBewerberLöschen = new GridBagConstraints();
		gbc_lblBewerberLöschen.anchor = GridBagConstraints.WEST;
		gbc_lblBewerberLöschen.insets = new Insets(0, 0, 5, 0);
		gbc_lblBewerberLöschen.gridx = 1;
		gbc_lblBewerberLöschen.gridy = 0;
		add(lblBewerberLöschen, gbc_lblBewerberLöschen);
		
		JLabel lblBewerberLöschenName = new JLabel("Name*");
		lblBewerberLöschenName.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblBewerberLöschenName = new GridBagConstraints();
		gbc_lblBewerberLöschenName.anchor = GridBagConstraints.WEST;
		gbc_lblBewerberLöschenName.insets = new Insets(0, 0, 5, 0);
		gbc_lblBewerberLöschenName.gridx = 1;
		gbc_lblBewerberLöschenName.gridy = 1;
		add(lblBewerberLöschenName, gbc_lblBewerberLöschenName);
		
		bewerberLöschenName = new JTextField();
		bewerberLöschenName.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_bewerberLöschenName = new GridBagConstraints();
		gbc_bewerberLöschenName.insets = new Insets(0, 0, 5, 0);
		gbc_bewerberLöschenName.fill = GridBagConstraints.HORIZONTAL;
		gbc_bewerberLöschenName.gridx = 1;
		gbc_bewerberLöschenName.gridy = 2;
		add(bewerberLöschenName, gbc_bewerberLöschenName);
		bewerberLöschenName.setColumns(10);
		
		JLabel lblBewerberLöschenNachname = new JLabel("Nachname*");
		lblBewerberLöschenNachname.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblBewerberLöschenNachname = new GridBagConstraints();
		gbc_lblBewerberLöschenNachname.anchor = GridBagConstraints.WEST;
		gbc_lblBewerberLöschenNachname.insets = new Insets(0, 0, 5, 0);
		gbc_lblBewerberLöschenNachname.gridx = 1;
		gbc_lblBewerberLöschenNachname.gridy = 3;
		add(lblBewerberLöschenNachname, gbc_lblBewerberLöschenNachname);
		
		bewerberLöschenNachname = new JTextField();
		bewerberLöschenNachname.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_bewerberLöschenNachname = new GridBagConstraints();
		gbc_bewerberLöschenNachname.insets = new Insets(0, 0, 5, 0);
		gbc_bewerberLöschenNachname.fill = GridBagConstraints.HORIZONTAL;
		gbc_bewerberLöschenNachname.gridx = 1;
		gbc_bewerberLöschenNachname.gridy = 4;
		add(bewerberLöschenNachname, gbc_bewerberLöschenNachname);
		bewerberLöschenNachname.setColumns(10);
		
		JLabel lblBewerberLöschenNummer = new JLabel("Nummer*");
		lblBewerberLöschenNummer.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblBewerberLöschenNummer = new GridBagConstraints();
		gbc_lblBewerberLöschenNummer.anchor = GridBagConstraints.WEST;
		gbc_lblBewerberLöschenNummer.insets = new Insets(0, 0, 5, 0);
		gbc_lblBewerberLöschenNummer.gridx = 1;
		gbc_lblBewerberLöschenNummer.gridy = 5;
		add(lblBewerberLöschenNummer, gbc_lblBewerberLöschenNummer);
		
		bewerberLöschenNummer = new JTextField();
		bewerberLöschenNummer.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_bewerberLöschenNummer = new GridBagConstraints();
		gbc_bewerberLöschenNummer.insets = new Insets(0, 0, 5, 0);
		gbc_bewerberLöschenNummer.fill = GridBagConstraints.HORIZONTAL;
		gbc_bewerberLöschenNummer.gridx = 1;
		gbc_bewerberLöschenNummer.gridy = 6;
		add(bewerberLöschenNummer, gbc_bewerberLöschenNummer);
		bewerberLöschenNummer.setColumns(10);
		
		JButton bewerberLöschen = new JButton("Löschen");
		bewerberLöschen.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_bewerberLöschen = new GridBagConstraints();
		gbc_bewerberLöschen.fill = GridBagConstraints.HORIZONTAL;
		gbc_bewerberLöschen.gridx = 1;
		gbc_bewerberLöschen.gridy = 8;
		add(bewerberLöschen, gbc_bewerberLöschen);


	}

}
