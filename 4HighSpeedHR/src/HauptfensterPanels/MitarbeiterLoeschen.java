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

	private JTextField MitarbeiterLoeschenNachname;
	private JTextField mitarbeiterLoeschenNachname;
	private JTextField mitarbeiterLoeschenNummer;

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
		
		JLabel lblMitarbeiterLoeschen = new JLabel("Mitarbeiter loeschen");
		lblMitarbeiterLoeschen.setFont(new Font("Arial", Font.BOLD, 15));
		GridBagConstraints gbc_lblMitarbeiterLoeschen = new GridBagConstraints();
		gbc_lblMitarbeiterLoeschen.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterLoeschen.insets = new Insets(0, 0, 5, 0);
		gbc_lblMitarbeiterLoeschen.gridx = 1;
		gbc_lblMitarbeiterLoeschen.gridy = 0;
		add(lblMitarbeiterLoeschen, gbc_lblMitarbeiterLoeschen);
		
		JLabel lblMitarbeiterLoeschenName = new JLabel("Name*");
		lblMitarbeiterLoeschenName.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMitarbeiterLoeschenName = new GridBagConstraints();
		gbc_lblMitarbeiterLoeschenName.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterLoeschenName.insets = new Insets(0, 0, 5, 0);
		gbc_lblMitarbeiterLoeschenName.gridx = 1;
		gbc_lblMitarbeiterLoeschenName.gridy = 1;
		add(lblMitarbeiterLoeschenName, gbc_lblMitarbeiterLoeschenName);
		
		MitarbeiterLoeschenNachname = new JTextField();
		MitarbeiterLoeschenNachname.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_MitarbeiterLoeschenNachname = new GridBagConstraints();
		gbc_MitarbeiterLoeschenNachname.insets = new Insets(0, 0, 5, 0);
		gbc_MitarbeiterLoeschenNachname.fill = GridBagConstraints.HORIZONTAL;
		gbc_MitarbeiterLoeschenNachname.gridx = 1;
		gbc_MitarbeiterLoeschenNachname.gridy = 2;
		add(MitarbeiterLoeschenNachname, gbc_MitarbeiterLoeschenNachname);
		MitarbeiterLoeschenNachname.setColumns(10);
		
		JLabel lblMitarbeiterLoeschenNachname = new JLabel("Nachname*");
		lblMitarbeiterLoeschenNachname.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMitarbeiterLoeschenNachname = new GridBagConstraints();
		gbc_lblMitarbeiterLoeschenNachname.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterLoeschenNachname.insets = new Insets(0, 0, 5, 0);
		gbc_lblMitarbeiterLoeschenNachname.gridx = 1;
		gbc_lblMitarbeiterLoeschenNachname.gridy = 3;
		add(lblMitarbeiterLoeschenNachname, gbc_lblMitarbeiterLoeschenNachname);
		
		mitarbeiterLoeschenNachname = new JTextField();
		mitarbeiterLoeschenNachname.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_mitarbeiterLoeschenNachname = new GridBagConstraints();
		gbc_mitarbeiterLoeschenNachname.insets = new Insets(0, 0, 5, 0);
		gbc_mitarbeiterLoeschenNachname.fill = GridBagConstraints.HORIZONTAL;
		gbc_mitarbeiterLoeschenNachname.gridx = 1;
		gbc_mitarbeiterLoeschenNachname.gridy = 4;
		add(mitarbeiterLoeschenNachname, gbc_mitarbeiterLoeschenNachname);
		mitarbeiterLoeschenNachname.setColumns(10);
		
		JLabel lblMitarbeiterLoeschenNummer = new JLabel("Nummer*");
		lblMitarbeiterLoeschenNummer.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMitarbeiterLoeschenNummer = new GridBagConstraints();
		gbc_lblMitarbeiterLoeschenNummer.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterLoeschenNummer.insets = new Insets(0, 0, 5, 0);
		gbc_lblMitarbeiterLoeschenNummer.gridx = 1;
		gbc_lblMitarbeiterLoeschenNummer.gridy = 5;
		add(lblMitarbeiterLoeschenNummer, gbc_lblMitarbeiterLoeschenNummer);
		
		mitarbeiterLoeschenNummer = new JTextField();
		mitarbeiterLoeschenNummer.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_mitarbeiterLoeschenNummer = new GridBagConstraints();
		gbc_mitarbeiterLoeschenNummer.insets = new Insets(0, 0, 5, 0);
		gbc_mitarbeiterLoeschenNummer.fill = GridBagConstraints.HORIZONTAL;
		gbc_mitarbeiterLoeschenNummer.gridx = 1;
		gbc_mitarbeiterLoeschenNummer.gridy = 6;
		add(mitarbeiterLoeschenNummer, gbc_mitarbeiterLoeschenNummer);
		mitarbeiterLoeschenNummer.setColumns(10);
		
		JButton MitarbeiterLoeschen = new JButton("Loeschen");
		MitarbeiterLoeschen.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_MitarbeiterLoeschen = new GridBagConstraints();
		gbc_MitarbeiterLoeschen.fill = GridBagConstraints.HORIZONTAL;
		gbc_MitarbeiterLoeschen.gridx = 1;
		gbc_MitarbeiterLoeschen.gridy = 8;
		add(MitarbeiterLoeschen, gbc_MitarbeiterLoeschen);


	}

}