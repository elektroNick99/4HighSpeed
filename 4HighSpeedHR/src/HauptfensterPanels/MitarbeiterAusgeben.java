package HauptfensterPanels;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import de.fourHighSpeedHR.GUI.Main;
import de.fourHighSpeedHR.database.MitarbeiterDB;
import de.fourHighSpeedHR.objects.Mitarbeiter;

import javax.swing.ScrollPaneConstants;

public class MitarbeiterAusgeben extends JPanel {
	
	private static JLabel lblListeAusgabe;

	/**
	 * Create the panel.
	 */
	public MitarbeiterAusgeben() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 60, 500, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 300, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel lblMitarbeiterAusgeben = new JLabel("Mitarbeiterliste ausgeben");
		lblMitarbeiterAusgeben.setFont(new Font("Arial", Font.BOLD, 15));
		GridBagConstraints gbc_lblMitarbeiterAusgeben = new GridBagConstraints();
		gbc_lblMitarbeiterAusgeben.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterAusgeben.insets = new Insets(0, 0, 5, 0);
		gbc_lblMitarbeiterAusgeben.gridx = 1;
		gbc_lblMitarbeiterAusgeben.gridy = 0;
		add(lblMitarbeiterAusgeben, gbc_lblMitarbeiterAusgeben);

		lblListeAusgabe = new JLabel();
		lblListeAusgabe.setHorizontalAlignment(SwingConstants.LEFT);
		JScrollPane scroll = new JScrollPane(lblListeAusgabe, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		GridBagConstraints gbc_scroll = new GridBagConstraints();
		gbc_scroll.fill = GridBagConstraints.BOTH;
		gbc_scroll.insets = new Insets(0, 0, 5, 0);
		gbc_scroll.gridx = 1;
		gbc_scroll.gridy = 1;
		add(scroll, gbc_scroll);

		JButton mitarbeiterlisteAusgebenPDF = new JButton("Liste ausgeben PDF");
		mitarbeiterlisteAusgebenPDF.setFont(new Font("Arial", Font.BOLD, 12));
		mitarbeiterlisteAusgebenPDF.addActionListener(e -> ausgebenMitarbeiterListePDF());
		GridBagConstraints gbc_mitarbeiterlisteAusgebenPDF = new GridBagConstraints();
		gbc_mitarbeiterlisteAusgebenPDF.insets = new Insets(0, 0, 5, 0);
		gbc_mitarbeiterlisteAusgebenPDF.fill = GridBagConstraints.HORIZONTAL;
		gbc_mitarbeiterlisteAusgebenPDF.gridx = 1;
		gbc_mitarbeiterlisteAusgebenPDF.gridy = 6;
		add(mitarbeiterlisteAusgebenPDF, gbc_mitarbeiterlisteAusgebenPDF);
		
	}

	public static void ausgebenMitarbeiterListe() {

		StringBuilder result = new StringBuilder();

		ArrayList<Mitarbeiter> mitarbeiterListe = MitarbeiterDB.ausgebenMitarbeiterAlle();

		for (int i = 0; i < mitarbeiterListe.size(); i++) {
			Mitarbeiter m = mitarbeiterListe.get(i);
			result.append(i+1+". Mitarbeiter: " +m.getName() + " " + m.getNachname() + ":\n");
			result.append("Mitarbeiter ID: " + m.getName().charAt(0) + m.getNachname().charAt(0) + m.getGeb() + "\n");
			result.append("Anschrift:"+ "\n");
			result.append(m.getStrasse() + " " + m.getHnr() + "\n");
			result.append(m.getPlz() + " " + m.getOrt() + "\n");
			result.append("Tel.: "+m.getTel() + "\n");
			result.append("Geburtstag: "+m.getGeb() + "\n");
			result.append("Abteilung: "+m.getAbteilung() + "\n");
			result.append("Gehalt: "+m.getGehalt() + " €\n" + "\n" + "\n");
		}

		lblListeAusgabe.setText(zeilenFormattieren(result.toString()));

	}

	public static String zeilenFormattieren(String s) {
		return "<html>" + s.replaceAll("\n", "<br>");
	}
	
	public static void ausgebenMitarbeiterListePDF() {
		//ToDo PDF erstellen und auf desktop speichern
	}
}
