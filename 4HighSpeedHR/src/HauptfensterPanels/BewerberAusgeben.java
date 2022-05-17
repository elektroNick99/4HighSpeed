package HauptfensterPanels;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class BewerberAusgeben extends JPanel {
	private JTextField bewerberliste;

	/**
	 * Create the panel.
	 */
	public BewerberAusgeben() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{60, 500, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 300, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblBewerberlisteAusgeben = new JLabel("Bewerberliste ausgeben");
		lblBewerberlisteAusgeben.setFont(new Font("Arial", Font.BOLD, 15));
		GridBagConstraints gbc_lblBewerberlisteAusgeben = new GridBagConstraints();
		gbc_lblBewerberlisteAusgeben.anchor = GridBagConstraints.WEST;
		gbc_lblBewerberlisteAusgeben.insets = new Insets(0, 0, 5, 5);
		gbc_lblBewerberlisteAusgeben.gridx = 1;
		gbc_lblBewerberlisteAusgeben.gridy = 0;
		add(lblBewerberlisteAusgeben, gbc_lblBewerberlisteAusgeben);
		
		bewerberliste = new JTextField();
		bewerberliste.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_bewerberliste = new GridBagConstraints();
		gbc_bewerberliste.gridwidth = 2;
		gbc_bewerberliste.gridheight = 4;
		gbc_bewerberliste.insets = new Insets(0, 0, 5, 5);
		gbc_bewerberliste.fill = GridBagConstraints.BOTH;
		gbc_bewerberliste.gridx = 1;
		gbc_bewerberliste.gridy = 1;
		add(bewerberliste, gbc_bewerberliste);
		bewerberliste.setColumns(10);
		
		JButton bewerberlisteAusgebenPDF = new JButton("Liste ausgeben PDF");
		bewerberlisteAusgebenPDF.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_bewerberlisteAusgebenPDF = new GridBagConstraints();
		gbc_bewerberlisteAusgebenPDF.gridwidth = 2;
		gbc_bewerberlisteAusgebenPDF.insets = new Insets(0, 0, 5, 5);
		gbc_bewerberlisteAusgebenPDF.fill = GridBagConstraints.HORIZONTAL;
		gbc_bewerberlisteAusgebenPDF.gridx = 1;
		gbc_bewerberlisteAusgebenPDF.gridy = 6;
		add(bewerberlisteAusgebenPDF, gbc_bewerberlisteAusgebenPDF);
		
		JButton bewerberlisteAusgeben = new JButton("Liste ausgeben");
		bewerberlisteAusgeben.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_bewerberlisteAusgeben = new GridBagConstraints();
		gbc_bewerberlisteAusgeben.gridwidth = 2;
		gbc_bewerberlisteAusgeben.insets = new Insets(0, 0, 0, 5);
		gbc_bewerberlisteAusgeben.fill = GridBagConstraints.HORIZONTAL;
		gbc_bewerberlisteAusgeben.gridx = 1;
		gbc_bewerberlisteAusgeben.gridy = 7;
		add(bewerberlisteAusgeben, gbc_bewerberlisteAusgeben);
	}

}
