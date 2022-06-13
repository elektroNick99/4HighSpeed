package HauptfensterPanels;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import de.fourHighSpeedHR.database.BewerberDB;
import de.fourHighSpeedHR.database.MitarbeiterDB;
import de.fourHighSpeedHR.objects.Bewerber;
import de.fourHighSpeedHR.objects.Mitarbeiter;

import javax.swing.JButton;
import java.awt.Font;

/**
 * Panel das alles enthaelt um Mitarbeiter auszugeben
 */
public class BewerberAusgeben extends JPanel {

	private static JLabel lblListeAusgabe;

	public BewerberAusgeben() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 60, 500, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 300, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
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

	}

	/**
	 * Methode um die Bewerberliste auszugeben
	 */
	public static void ausgebenBewerberListe() {

		StringBuilder result = new StringBuilder();

		ArrayList<Bewerber> bewerberListe = BewerberDB.ausgebenBewerberAlle();

		for (int i = 0; i < bewerberListe.size(); i++) {
			Bewerber b = bewerberListe.get(i);
			result.append(i + 1 + ". Mitarbeiter: " + b.getName() + " " + b.getNachname() + ":\n");
			result.append("Bewerber ID: " + b.getName().charAt(0) + b.getNachname().charAt(0) + b.getGeb() + "\n");
			result.append("Anschrift:" + "\n");
			result.append(b.getStrasse() + " " + b.getHnr() + "\n");
			result.append(b.getPlz() + " " + b.getOrt() + "\n");
			result.append("Tel.: " + b.getTel() + "\n");
			result.append("Geburtstag: " + b.getGeb() + "\n");
			result.append("Notizen:\n" + b.getNotizen() + "\n");
			result.append("Status:\n" + b.getStatus() + "\n" + "\n" + "\n");

		}

		lblListeAusgabe.setText(zeilenFormattieren(result.toString()));

	}

	/**
	 * Methode um einen String so zu fromattieren, dass er in einem HTML format ist
	 * 
	 * @param s String der formattiert werden soll
	 * @return den formattierten String
	 */
	public static String zeilenFormattieren(String s) {
		return "<html>" + s.replaceAll("\n", "<br>");
	}

	/**
	 * Methode um die Bewerberliste als PDF im privaten Verzeichnis des Benutzers zu
	 * speichern
	 */
	public static void ausgebenBewerberListePDF() {

		ArrayList<Bewerber> bewerberListe = BewerberDB.ausgebenBewerberAlle();

		try {

			String fileName = System.getProperty("user.home") + "/Bewerber.pdf";
			Document doc = new Document(PageSize.A4.rotate());
			PdfWriter.getInstance(doc, new FileOutputStream(fileName));

			doc.open();

			Paragraph par = new Paragraph("Liste aller Bewerber:\n");
			doc.add(par);

			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
			String now = String.valueOf(LocalDate.now().format(formatter));
			Paragraph para = new Paragraph("Stand: " + now);
			doc.add(para);

			Paragraph par2 = new Paragraph(" ");
			doc.add(par2);

			PdfPTable tabelle = new PdfPTable(new float[] { 0.8f, 1, 1, 1, 3, 0.5f });
			tabelle.setWidthPercentage(100);
			PdfPCell c1 = new PdfPCell(new Phrase("\nID\n\n"));
			c1.setHorizontalAlignment(Element.ALIGN_CENTER);
			tabelle.addCell(c1);

			c1 = new PdfPCell(new Phrase("\nName"));
			c1.setHorizontalAlignment(Element.ALIGN_CENTER);
			tabelle.addCell(c1);

			c1 = new PdfPCell(new Phrase("\nNachname"));
			c1.setHorizontalAlignment(Element.ALIGN_CENTER);
			tabelle.addCell(c1);

			c1 = new PdfPCell(new Phrase("\nTel"));
			c1.setHorizontalAlignment(Element.ALIGN_CENTER);
			tabelle.addCell(c1);

			c1 = new PdfPCell(new Phrase("\nNotizen"));
			c1.setHorizontalAlignment(Element.ALIGN_CENTER);
			tabelle.addCell(c1);

			c1 = new PdfPCell(new Phrase("\nStatus"));
			c1.setHorizontalAlignment(Element.ALIGN_CENTER);
			tabelle.addCell(c1);

			tabelle.setHeaderRows(1);

			for (int i = 0; i < bewerberListe.size(); i++) {
				Bewerber b = bewerberListe.get(i);
				String id = "" + b.getName().charAt(0) + b.getNachname().charAt(0) + b.getGeb();
				tabelle.addCell(id);
				tabelle.addCell(b.getName());
				tabelle.addCell(b.getNachname());
				tabelle.addCell(Long.valueOf(b.getTel()).toString());
				tabelle.addCell(b.getNotizen());
				tabelle.addCell(b.getStatus());
			}

			doc.add(tabelle);
			doc.close();

		} catch (FileNotFoundException | DocumentException e) {
			e.printStackTrace();
		}

	}

}
