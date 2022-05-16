package HauptfensterPanels;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MitarbeiterAusgeben extends JPanel {

	private JTextField mitarbeiterAusgeben;

	/**
	 * Create the panel.
	 */
	public MitarbeiterAusgeben() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{60, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 83, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblMitarbeiterAusgeben = new JLabel("Mitarbeiterliste ausgeben");
		lblMitarbeiterAusgeben.setFont(new Font("Arial", Font.BOLD, 15));
		GridBagConstraints gbc_lblMitarbeiterAusgeben = new GridBagConstraints();
		gbc_lblMitarbeiterAusgeben.insets = new Insets(0, 0, 5, 5);
		gbc_lblMitarbeiterAusgeben.gridx = 1;
		gbc_lblMitarbeiterAusgeben.gridy = 0;
		add(lblMitarbeiterAusgeben, gbc_lblMitarbeiterAusgeben);
		
		mitarbeiterAusgeben = new JTextField();
		mitarbeiterAusgeben.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_mitarbeiterAusgeben = new GridBagConstraints();
		gbc_mitarbeiterAusgeben.gridwidth = 2;
		gbc_mitarbeiterAusgeben.gridheight = 5;
		gbc_mitarbeiterAusgeben.insets = new Insets(0, 0, 5, 5);
		gbc_mitarbeiterAusgeben.fill = GridBagConstraints.BOTH;
		gbc_mitarbeiterAusgeben.gridx = 1;
		gbc_mitarbeiterAusgeben.gridy = 1;
		add(mitarbeiterAusgeben, gbc_mitarbeiterAusgeben);
		mitarbeiterAusgeben.setColumns(10);
		
		JButton mitarbeiterlisteAusgebenPDF = new JButton("Liste ausgeben PDF");
		mitarbeiterlisteAusgebenPDF.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_mitarbeiterlisteAusgebenPDF = new GridBagConstraints();
		gbc_mitarbeiterlisteAusgebenPDF.gridwidth = 2;
		gbc_mitarbeiterlisteAusgebenPDF.insets = new Insets(0, 0, 5, 5);
		gbc_mitarbeiterlisteAusgebenPDF.fill = GridBagConstraints.HORIZONTAL;
		gbc_mitarbeiterlisteAusgebenPDF.gridx = 1;
		gbc_mitarbeiterlisteAusgebenPDF.gridy = 6;
		add(mitarbeiterlisteAusgebenPDF, gbc_mitarbeiterlisteAusgebenPDF);
		
		JButton mitarbeiterlisteAusgeben = new JButton("Liste ausgeben");
		mitarbeiterlisteAusgeben.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_mitarbeiterlisteAusgeben = new GridBagConstraints();
		gbc_mitarbeiterlisteAusgeben.gridwidth = 2;
		gbc_mitarbeiterlisteAusgeben.insets = new Insets(0, 0, 0, 5);
		gbc_mitarbeiterlisteAusgeben.fill = GridBagConstraints.HORIZONTAL;
		gbc_mitarbeiterlisteAusgeben.gridx = 1;
		gbc_mitarbeiterlisteAusgeben.gridy = 7;
		add(mitarbeiterlisteAusgeben, gbc_mitarbeiterlisteAusgeben);
	}

}
