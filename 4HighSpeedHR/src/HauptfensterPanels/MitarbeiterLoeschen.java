package HauptfensterPanels;

import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;

public class MitarbeiterLoeschen extends JPanel {

	private JTextField MitarbeiterLöschenNachname;
	private JTextField mitarbeiterLöschenNachname;
	private JTextField mitarbeiterLöschenNummer;

	/**
	 * Create the panel.
	 */
	public MitarbeiterLoeschen() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{60, 276, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblMitarbeiterLöschen = new JLabel("Mitarbeiter löschen");
		lblMitarbeiterLöschen.setFont(new Font("Arial", Font.BOLD, 15));
		GridBagConstraints gbc_lblMitarbeiterLöschen = new GridBagConstraints();
		gbc_lblMitarbeiterLöschen.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterLöschen.insets = new Insets(0, 0, 5, 0);
		gbc_lblMitarbeiterLöschen.gridx = 1;
		gbc_lblMitarbeiterLöschen.gridy = 0;
		add(lblMitarbeiterLöschen, gbc_lblMitarbeiterLöschen);
		
		JLabel lblMitarbeiterLöschenName = new JLabel("Name*");
		lblMitarbeiterLöschenName.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMitarbeiterLöschenName = new GridBagConstraints();
		gbc_lblMitarbeiterLöschenName.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterLöschenName.insets = new Insets(0, 0, 5, 0);
		gbc_lblMitarbeiterLöschenName.gridx = 1;
		gbc_lblMitarbeiterLöschenName.gridy = 1;
		add(lblMitarbeiterLöschenName, gbc_lblMitarbeiterLöschenName);
		
		MitarbeiterLöschenNachname = new JTextField();
		MitarbeiterLöschenNachname.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_MitarbeiterLöschenNachname = new GridBagConstraints();
		gbc_MitarbeiterLöschenNachname.insets = new Insets(0, 0, 5, 0);
		gbc_MitarbeiterLöschenNachname.fill = GridBagConstraints.HORIZONTAL;
		gbc_MitarbeiterLöschenNachname.gridx = 1;
		gbc_MitarbeiterLöschenNachname.gridy = 2;
		add(MitarbeiterLöschenNachname, gbc_MitarbeiterLöschenNachname);
		MitarbeiterLöschenNachname.setColumns(10);
		
		JLabel lblMitarbeiterLöschenNachname = new JLabel("Nachname*");
		lblMitarbeiterLöschenNachname.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMitarbeiterLöschenNachname = new GridBagConstraints();
		gbc_lblMitarbeiterLöschenNachname.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterLöschenNachname.insets = new Insets(0, 0, 5, 0);
		gbc_lblMitarbeiterLöschenNachname.gridx = 1;
		gbc_lblMitarbeiterLöschenNachname.gridy = 3;
		add(lblMitarbeiterLöschenNachname, gbc_lblMitarbeiterLöschenNachname);
		
		mitarbeiterLöschenNachname = new JTextField();
		mitarbeiterLöschenNachname.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_mitarbeiterLöschenNachname = new GridBagConstraints();
		gbc_mitarbeiterLöschenNachname.insets = new Insets(0, 0, 5, 0);
		gbc_mitarbeiterLöschenNachname.fill = GridBagConstraints.HORIZONTAL;
		gbc_mitarbeiterLöschenNachname.gridx = 1;
		gbc_mitarbeiterLöschenNachname.gridy = 4;
		add(mitarbeiterLöschenNachname, gbc_mitarbeiterLöschenNachname);
		mitarbeiterLöschenNachname.setColumns(10);
		
		JLabel lblMitarbeiterLöschenNummer = new JLabel("Nummer*");
		lblMitarbeiterLöschenNummer.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMitarbeiterLöschenNummer = new GridBagConstraints();
		gbc_lblMitarbeiterLöschenNummer.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterLöschenNummer.insets = new Insets(0, 0, 5, 0);
		gbc_lblMitarbeiterLöschenNummer.gridx = 1;
		gbc_lblMitarbeiterLöschenNummer.gridy = 5;
		add(lblMitarbeiterLöschenNummer, gbc_lblMitarbeiterLöschenNummer);
		
		mitarbeiterLöschenNummer = new JTextField();
		mitarbeiterLöschenNummer.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_mitarbeiterLöschenNummer = new GridBagConstraints();
		gbc_mitarbeiterLöschenNummer.insets = new Insets(0, 0, 5, 0);
		gbc_mitarbeiterLöschenNummer.fill = GridBagConstraints.HORIZONTAL;
		gbc_mitarbeiterLöschenNummer.gridx = 1;
		gbc_mitarbeiterLöschenNummer.gridy = 6;
		add(mitarbeiterLöschenNummer, gbc_mitarbeiterLöschenNummer);
		mitarbeiterLöschenNummer.setColumns(10);
		
		JButton MitarbeiterLöschen = new JButton("Löschen");
		MitarbeiterLöschen.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_MitarbeiterLöschen = new GridBagConstraints();
		gbc_MitarbeiterLöschen.fill = GridBagConstraints.HORIZONTAL;
		gbc_MitarbeiterLöschen.gridx = 1;
		gbc_MitarbeiterLöschen.gridy = 8;
		add(MitarbeiterLöschen, gbc_MitarbeiterLöschen);


	}

}