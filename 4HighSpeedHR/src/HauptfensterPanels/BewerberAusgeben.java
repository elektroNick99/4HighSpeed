package HauptfensterPanels;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

import de.fourHighSpeedHR.database.BewerberDB;
import de.fourHighSpeedHR.database.MitarbeiterDB;
import de.fourHighSpeedHR.objects.Bewerber;
import de.fourHighSpeedHR.objects.Mitarbeiter;

import javax.swing.JButton;
import java.awt.Font;

public class BewerberAusgeben extends JPanel {

	private static JLabel lblListeAusgabe;

	
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
		
		JButton bewerberlisteAusgebenPDF = new JButton("Liste ausgeben PDF");
		bewerberlisteAusgebenPDF.setFont(new Font("Arial", Font.BOLD, 12));
		bewerberlisteAusgebenPDF.addActionListener(e -> ausgebenBewerberListePDF());
		GridBagConstraints gbc_bewerberlisteAusgebenPDF = new GridBagConstraints();
		gbc_bewerberlisteAusgebenPDF.gridwidth = 2;
		gbc_bewerberlisteAusgebenPDF.insets = new Insets(0, 0, 5, 5);
		gbc_bewerberlisteAusgebenPDF.fill = GridBagConstraints.HORIZONTAL;
		gbc_bewerberlisteAusgebenPDF.gridx = 1;
		gbc_bewerberlisteAusgebenPDF.gridy = 6;
		add(bewerberlisteAusgebenPDF, gbc_bewerberlisteAusgebenPDF);
		
		ausgebenBewerberListe();
	}
	
	public static void ausgebenBewerberListe() {
		
		
		StringBuilder result = new StringBuilder();

		ArrayList<Bewerber> bewerberListe = BewerberDB.ausgebenBewerberAlle();

		for (int i = 0; i < bewerberListe.size(); i++) {
			Bewerber b = bewerberListe.get(i);
			result.append(i+1+". Mitarbeiter: " +b.getName() + " " + b.getNachname() + ":\n");
			result.append("Bewerber ID: " + b.getName().charAt(0) + b.getNachname().charAt(0) + b.getGeb() + "\n");
			result.append("Anschrift:"+ "\n");
			result.append(b.getStrasse() + " " + b.getHnr() + "\n");
			result.append(b.getPlz() + " " + b.getOrt() + "\n");
			result.append("Tel.: "+b.getTel() + "\n");
			result.append("Geburtstag: "+b.getGeb() + "\n");
			result.append("Notizen:\n"+b.getNotizen() + "\n"+ "\n" + "\n");
		}

		lblListeAusgabe.setText(zeilenFormattieren(result.toString()));

	}

	public static String zeilenFormattieren(String s) {
		return "<html>" + s.replaceAll("\n", "<br>");
	}
	
	public static void ausgebenBewerberListePDF() {
		//ToDp PDF erstellen und auf desktop speichern
	}

}
