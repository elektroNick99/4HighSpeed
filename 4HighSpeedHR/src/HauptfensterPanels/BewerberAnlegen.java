package HauptfensterPanels;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BewerberAnlegen extends JPanel {

	private JTextField bewerberAnlegenName;
	private JTextField bewerberAnlegenNachname;
	private JTextField bewerberAnlegenStraße;
	private JTextField bewerberAnlegenHNR;
	private JTextField bewerberAnlegenOrt;
	private JTextField bewerberAnlegenPLZ;
	private JTextField bewerberAnlegenTel;
	private JTextField bewerberAnlegenNotizen;
	/**
	 * Create the panel.
	 */
	public BewerberAnlegen() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{60, 236, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 120, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblNeuerBewerberAnlegen = new JLabel("Neuer Bewerber anlegen");
		lblNeuerBewerberAnlegen.setFont(new Font("Arial", Font.BOLD, 15));
		GridBagConstraints gbc_lblNeuerBewerberAnlegen = new GridBagConstraints();
		gbc_lblNeuerBewerberAnlegen.anchor = GridBagConstraints.WEST;
		gbc_lblNeuerBewerberAnlegen.insets = new Insets(0, 0, 5, 5);
		gbc_lblNeuerBewerberAnlegen.gridx = 1;
		gbc_lblNeuerBewerberAnlegen.gridy = 0;
		add(lblNeuerBewerberAnlegen, gbc_lblNeuerBewerberAnlegen);
		
		JLabel lblBewerberAnlegenName = new JLabel("Name");
		lblBewerberAnlegenName.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblBewerberAnlegenName = new GridBagConstraints();
		gbc_lblBewerberAnlegenName.insets = new Insets(0, 0, 5, 5);
		gbc_lblBewerberAnlegenName.anchor = GridBagConstraints.WEST;
		gbc_lblBewerberAnlegenName.gridx = 1;
		gbc_lblBewerberAnlegenName.gridy = 1;
		add(lblBewerberAnlegenName, gbc_lblBewerberAnlegenName);
		
	    bewerberAnlegenName = new JTextField();
	    bewerberAnlegenName.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_bewerberAnlegenName = new GridBagConstraints();
		gbc_bewerberAnlegenName.insets = new Insets(0, 0, 5, 5);
		gbc_bewerberAnlegenName.fill = GridBagConstraints.HORIZONTAL;
		gbc_bewerberAnlegenName.gridx = 1;
		gbc_bewerberAnlegenName.gridy = 2;
		add(bewerberAnlegenName, gbc_bewerberAnlegenName);
		bewerberAnlegenName.setColumns(10);
		
		JLabel lblBewerberAnlegenNachname = new JLabel("Nachname");
		lblBewerberAnlegenNachname.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblBewerberAnlegenNachname = new GridBagConstraints();
		gbc_lblBewerberAnlegenNachname.insets = new Insets(0, 0, 5, 5);
		gbc_lblBewerberAnlegenNachname.anchor = GridBagConstraints.WEST;
		gbc_lblBewerberAnlegenNachname.gridx = 1;
		gbc_lblBewerberAnlegenNachname.gridy = 3;
		add(lblBewerberAnlegenNachname, gbc_lblBewerberAnlegenNachname);
		
		bewerberAnlegenNachname = new JTextField();
		bewerberAnlegenNachname.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_bewerberAnlegenNachname = new GridBagConstraints();
		gbc_bewerberAnlegenNachname.insets = new Insets(0, 0, 5, 5);
		gbc_bewerberAnlegenNachname.fill = GridBagConstraints.HORIZONTAL;
		gbc_bewerberAnlegenNachname.gridx = 1;
		gbc_bewerberAnlegenNachname.gridy = 4;
		add(bewerberAnlegenNachname, gbc_bewerberAnlegenNachname);
		bewerberAnlegenNachname.setColumns(10);
		
		JLabel lblBewerberAnlegenAdresse = new JLabel("Adresse");
		lblBewerberAnlegenAdresse.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblBewerberAnlegenAdresse = new GridBagConstraints();
		gbc_lblBewerberAnlegenAdresse.insets = new Insets(0, 0, 5, 5);
		gbc_lblBewerberAnlegenAdresse.anchor = GridBagConstraints.WEST;
		gbc_lblBewerberAnlegenAdresse.gridx = 1;
		gbc_lblBewerberAnlegenAdresse.gridy = 5;
		add(lblBewerberAnlegenAdresse, gbc_lblBewerberAnlegenAdresse);
		
		JLabel lblBewerberAnlegenStraße = new JLabel("Straße");
		lblBewerberAnlegenStraße.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblBewerberAnlegenStraße = new GridBagConstraints();
		gbc_lblBewerberAnlegenStraße.insets = new Insets(0, 0, 5, 5);
		gbc_lblBewerberAnlegenStraße.anchor = GridBagConstraints.WEST;
		gbc_lblBewerberAnlegenStraße.gridx = 1;
		gbc_lblBewerberAnlegenStraße.gridy = 6;
		add(lblBewerberAnlegenStraße, gbc_lblBewerberAnlegenStraße);
		
		JLabel lblBewerberAnlegenHNR = new JLabel("HNR");
		lblBewerberAnlegenHNR.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblBewerberAnlegenHNR = new GridBagConstraints();
		gbc_lblBewerberAnlegenHNR.anchor = GridBagConstraints.WEST;
		gbc_lblBewerberAnlegenHNR.insets = new Insets(0, 0, 5, 0);
		gbc_lblBewerberAnlegenHNR.gridx = 2;
		gbc_lblBewerberAnlegenHNR.gridy = 6;
		add(lblBewerberAnlegenHNR, gbc_lblBewerberAnlegenHNR);
		
		bewerberAnlegenStraße = new JTextField();
		bewerberAnlegenStraße.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_bewerberAnlegenStraße = new GridBagConstraints();
		gbc_bewerberAnlegenStraße.insets = new Insets(0, 0, 5, 5);
		gbc_bewerberAnlegenStraße.fill = GridBagConstraints.HORIZONTAL;
		gbc_bewerberAnlegenStraße.gridx = 1;
		gbc_bewerberAnlegenStraße.gridy = 7;
		add(bewerberAnlegenStraße, gbc_bewerberAnlegenStraße);
		bewerberAnlegenStraße.setColumns(10);
		
		bewerberAnlegenHNR = new JTextField();
		bewerberAnlegenHNR.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_bewerberAnlegenHNR = new GridBagConstraints();
		gbc_bewerberAnlegenHNR.insets = new Insets(0, 0, 5, 0);
		gbc_bewerberAnlegenHNR.fill = GridBagConstraints.HORIZONTAL;
		gbc_bewerberAnlegenHNR.gridx = 2;
		gbc_bewerberAnlegenHNR.gridy = 7;
		add(bewerberAnlegenHNR, gbc_bewerberAnlegenHNR);
		bewerberAnlegenHNR.setColumns(10);
		
		JLabel lblBewerberAnlegenOrt = new JLabel("Ort");
		lblBewerberAnlegenOrt.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblBewerberAnlegenOrt = new GridBagConstraints();
		gbc_lblBewerberAnlegenOrt.anchor = GridBagConstraints.WEST;
		gbc_lblBewerberAnlegenOrt.insets = new Insets(0, 0, 5, 5);
		gbc_lblBewerberAnlegenOrt.gridx = 1;
		gbc_lblBewerberAnlegenOrt.gridy = 8;
		add(lblBewerberAnlegenOrt, gbc_lblBewerberAnlegenOrt);
		
		JLabel lblBewerberAnlegenPLZ = new JLabel("PLZ");
		lblBewerberAnlegenPLZ.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblBewerberAnlegenPLZ = new GridBagConstraints();
		gbc_lblBewerberAnlegenPLZ.insets = new Insets(0, 0, 5, 0);
		gbc_lblBewerberAnlegenPLZ.anchor = GridBagConstraints.WEST;
		gbc_lblBewerberAnlegenPLZ.gridx = 2;
		gbc_lblBewerberAnlegenPLZ.gridy = 8;
		add(lblBewerberAnlegenPLZ, gbc_lblBewerberAnlegenPLZ);
		
		bewerberAnlegenOrt = new JTextField();
		bewerberAnlegenOrt.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_bewerberAnlegenOrt = new GridBagConstraints();
		gbc_bewerberAnlegenOrt.insets = new Insets(0, 0, 5, 5);
		gbc_bewerberAnlegenOrt.fill = GridBagConstraints.HORIZONTAL;
		gbc_bewerberAnlegenOrt.gridx = 1;
		gbc_bewerberAnlegenOrt.gridy = 9;
		add(bewerberAnlegenOrt, gbc_bewerberAnlegenOrt);
		bewerberAnlegenOrt.setColumns(10);
		
		bewerberAnlegenPLZ = new JTextField();
		bewerberAnlegenPLZ.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_bewerberAnlegenPLZ = new GridBagConstraints();
		gbc_bewerberAnlegenPLZ.insets = new Insets(0, 0, 5, 0);
		gbc_bewerberAnlegenPLZ.fill = GridBagConstraints.HORIZONTAL;
		gbc_bewerberAnlegenPLZ.gridx = 2;
		gbc_bewerberAnlegenPLZ.gridy = 9;
		add(bewerberAnlegenPLZ, gbc_bewerberAnlegenPLZ);
		bewerberAnlegenPLZ.setColumns(10);
		
		JLabel lblBewerberAnlegenTel = new JLabel("Tel.:");
		lblBewerberAnlegenTel.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblBewerberAnlegenTel = new GridBagConstraints();
		gbc_lblBewerberAnlegenTel.anchor = GridBagConstraints.WEST;
		gbc_lblBewerberAnlegenTel.insets = new Insets(0, 0, 5, 5);
		gbc_lblBewerberAnlegenTel.gridx = 1;
		gbc_lblBewerberAnlegenTel.gridy = 10;
		add(lblBewerberAnlegenTel, gbc_lblBewerberAnlegenTel);
		
		bewerberAnlegenTel = new JTextField();
		bewerberAnlegenTel.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_bewerberAnlegenTel = new GridBagConstraints();
		gbc_bewerberAnlegenTel.insets = new Insets(0, 0, 5, 5);
		gbc_bewerberAnlegenTel.fill = GridBagConstraints.HORIZONTAL;
		gbc_bewerberAnlegenTel.gridx = 1;
		gbc_bewerberAnlegenTel.gridy = 11;
		add(bewerberAnlegenTel, gbc_bewerberAnlegenTel);
		bewerberAnlegenTel.setColumns(10);
		
		JLabel lblBewerberAnlegenNotizen = new JLabel("Notizen");
		lblBewerberAnlegenNotizen.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblBewerberAnlegenNotizen = new GridBagConstraints();
		gbc_lblBewerberAnlegenNotizen.anchor = GridBagConstraints.WEST;
		gbc_lblBewerberAnlegenNotizen.insets = new Insets(0, 0, 5, 5);
		gbc_lblBewerberAnlegenNotizen.gridx = 1;
		gbc_lblBewerberAnlegenNotizen.gridy = 12;
		add(lblBewerberAnlegenNotizen, gbc_lblBewerberAnlegenNotizen);
		
		bewerberAnlegenNotizen = new JTextField();
		bewerberAnlegenNotizen.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_bewerberAnlegenNotizen = new GridBagConstraints();
		gbc_bewerberAnlegenNotizen.insets = new Insets(0, 0, 5, 5);
		gbc_bewerberAnlegenNotizen.fill = GridBagConstraints.BOTH;
		gbc_bewerberAnlegenNotizen.gridx = 1;
		gbc_bewerberAnlegenNotizen.gridy = 13;
		add(bewerberAnlegenNotizen, gbc_bewerberAnlegenNotizen);
		bewerberAnlegenNotizen.setColumns(10);
		
		JButton bewerberAnlegenSpeichern = new JButton("Speichern");
		bewerberAnlegenSpeichern.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_bewerberAnlegenSpeichern = new GridBagConstraints();
		gbc_bewerberAnlegenSpeichern.fill = GridBagConstraints.HORIZONTAL;
		gbc_bewerberAnlegenSpeichern.insets = new Insets(0, 0, 0, 5);
		gbc_bewerberAnlegenSpeichern.gridx = 1;
		gbc_bewerberAnlegenSpeichern.gridy = 14;
		add(bewerberAnlegenSpeichern, gbc_bewerberAnlegenSpeichern);

	}

}
