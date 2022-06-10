package HauptfensterPanels;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
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

import de.fourHighSpeedHR.database.MitarbeiterDB;
import de.fourHighSpeedHR.objects.Mitarbeiter;

import javax.swing.ScrollPaneConstants;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

/**
 * Panel zum ausgeben aller Mitarbeiter
 */
public class MitarbeiterAusgeben extends JPanel {

	private static JLabel lblListeAusgabe;
	private static JRadioButton rbAktuelleMa, rbGekuendigteMa;
	private static final ButtonGroup buttonGroup = new ButtonGroup();

	public MitarbeiterAusgeben() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 300, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel lblMitarbeiterAusgeben = new JLabel("Mitarbeiterliste ausgeben");
		lblMitarbeiterAusgeben.setFont(new Font("Arial", Font.BOLD, 15));
		GridBagConstraints gbc_lblMitarbeiterAusgeben = new GridBagConstraints();
		gbc_lblMitarbeiterAusgeben.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterAusgeben.insets = new Insets(0, 0, 5, 5);
		gbc_lblMitarbeiterAusgeben.gridx = 0;
		gbc_lblMitarbeiterAusgeben.gridy = 0;
		add(lblMitarbeiterAusgeben, gbc_lblMitarbeiterAusgeben);

		lblListeAusgabe = new JLabel();
		lblListeAusgabe.setHorizontalAlignment(SwingConstants.LEFT);
		JScrollPane scroll = new JScrollPane(lblListeAusgabe, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		GridBagConstraints gbc_scroll = new GridBagConstraints();
		gbc_scroll.gridwidth = 2;
		gbc_scroll.fill = GridBagConstraints.BOTH;
		gbc_scroll.insets = new Insets(0, 0, 5, 0);
		gbc_scroll.gridx = 0;
		gbc_scroll.gridy = 1;
		add(scroll, gbc_scroll);

		JButton mitarbeiterlisteAusgebenPDF = new JButton("Liste ausgeben PDF");
		mitarbeiterlisteAusgebenPDF.setFont(new Font("Arial", Font.BOLD, 12));
		mitarbeiterlisteAusgebenPDF.addActionListener(e -> ausgebenMitarbeiterListePDF());

		rbAktuelleMa = new JRadioButton("Aktuelle Mitarbeiter");
		buttonGroup.add(rbAktuelleMa);
		rbAktuelleMa.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_rbAktuelleMa = new GridBagConstraints();
		gbc_rbAktuelleMa.anchor = GridBagConstraints.EAST;
		gbc_rbAktuelleMa.insets = new Insets(0, 0, 5, 5);
		gbc_rbAktuelleMa.gridx = 0;
		gbc_rbAktuelleMa.gridy = 4;
		add(rbAktuelleMa, gbc_rbAktuelleMa);

		rbGekuendigteMa = new JRadioButton("Gekuendigte Mitarbeiter");
		buttonGroup.add(rbGekuendigteMa);
		rbGekuendigteMa.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_rbGekuendigteMa = new GridBagConstraints();
		gbc_rbGekuendigteMa.anchor = GridBagConstraints.WEST;
		gbc_rbGekuendigteMa.insets = new Insets(0, 0, 5, 0);
		gbc_rbGekuendigteMa.gridx = 1;
		gbc_rbGekuendigteMa.gridy = 4;
		add(rbGekuendigteMa, gbc_rbGekuendigteMa);
		GridBagConstraints gbc_mitarbeiterlisteAusgebenPDF = new GridBagConstraints();
		gbc_mitarbeiterlisteAusgebenPDF.gridwidth = 2;
		gbc_mitarbeiterlisteAusgebenPDF.insets = new Insets(0, 0, 5, 0);
		gbc_mitarbeiterlisteAusgebenPDF.fill = GridBagConstraints.HORIZONTAL;
		gbc_mitarbeiterlisteAusgebenPDF.gridx = 0;
		gbc_mitarbeiterlisteAusgebenPDF.gridy = 6;
		add(mitarbeiterlisteAusgebenPDF, gbc_mitarbeiterlisteAusgebenPDF);

		JButton btnListeAktualisieren = new JButton("Liste aktualisieren");
		btnListeAktualisieren.addActionListener(e -> ausgebenMitarbeiterListe());
		btnListeAktualisieren.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_btnListeAktualisieren = new GridBagConstraints();
		gbc_btnListeAktualisieren.gridwidth = 2;
		gbc_btnListeAktualisieren.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnListeAktualisieren.insets = new Insets(0, 0, 5, 0);
		gbc_btnListeAktualisieren.gridx = 0;
		gbc_btnListeAktualisieren.gridy = 5;
		add(btnListeAktualisieren, gbc_btnListeAktualisieren);

	}
	
	public static void clear() {
		buttonGroup.clearSelection();
	}

	/**
	 * Methode die eine Liste aller eingestellen, gekündigten oder eingestellten und gekündigten Mitarbeiter ausgibt
	 */
	public static void ausgebenMitarbeiterListe() {

		StringBuilder result = new StringBuilder();

		ArrayList<Mitarbeiter> mitarbeiterListe = MitarbeiterDB.ausgebenMitarbeiterAlle();

		if (rbAktuelleMa.isSelected()) {
			for (int i = 0; i < mitarbeiterListe.size(); i++) {
				Mitarbeiter m = mitarbeiterListe.get(i);
				if (m.getStatus().equals("eingestellt")) {
					result.append("Mitarbeiter: " + m.getName() + " " + m.getNachname() + ":\n");
					result.append(
							"Mitarbeiter ID: " + m.getName().charAt(0) + m.getNachname().charAt(0) + m.getGeb() + "\n");
					result.append("Anschrift:" + "\n");
					result.append(m.getStrasse() + " " + m.getHnr() + "\n");
					result.append(m.getPlz() + " " + m.getOrt() + "\n");
					result.append("Tel.: " + m.getTel() + "\n");
					result.append("Geburtstag: " + m.getGeb() + "\n");
					result.append("Abteilung: " + m.getAbteilung() + "\n");
					result.append("Gehalt: " + m.getGehalt() + " €\n");
					result.append("Status: " + m.getStatus() + " \n" + "\n" + "\n");
				}
			}
		} else if (rbGekuendigteMa.isSelected()) {
			for (int i = 0; i < mitarbeiterListe.size(); i++) {
				Mitarbeiter m = mitarbeiterListe.get(i);
				if (m.getStatus().equals("gekuendigt")) {
					result.append("Mitarbeiter: " + m.getName() + " " + m.getNachname() + ":\n");
					result.append(
							"Mitarbeiter ID: " + m.getName().charAt(0) + m.getNachname().charAt(0) + m.getGeb() + "\n");
					result.append("Anschrift:" + "\n");
					result.append(m.getStrasse() + " " + m.getHnr() + "\n");
					result.append(m.getPlz() + " " + m.getOrt() + "\n");
					result.append("Tel.: " + m.getTel() + "\n");
					result.append("Geburtstag: " + m.getGeb() + "\n");
					result.append("Abteilung: " + m.getAbteilung() + "\n");
					result.append("Gehalt: " + m.getGehalt() + " €\n");
					result.append("Status: " + m.getStatus() + " \n" + "\n" + "\n");
				}
			}
		} else {
			for (int i = 0; i < mitarbeiterListe.size(); i++) {
				Mitarbeiter m = mitarbeiterListe.get(i);
				result.append("Mitarbeiter: " + m.getName() + " " + m.getNachname() + ":\n");
				result.append(
						"Mitarbeiter ID: " + m.getName().charAt(0) + m.getNachname().charAt(0) + m.getGeb() + "\n");
				result.append("Anschrift:" + "\n");
				result.append(m.getStrasse() + " " + m.getHnr() + "\n");
				result.append(m.getPlz() + " " + m.getOrt() + "\n");
				result.append("Tel.: " + m.getTel() + "\n");
				result.append("Geburtstag: " + m.getGeb() + "\n");
				result.append("Abteilung: " + m.getAbteilung() + "\n");
				result.append("Gehalt: " + m.getGehalt() + " €\n");
				result.append("Status: " + m.getStatus() + " \n" + "\n" + "\n");

			}
		}

		lblListeAusgabe.setText(zeilenFormattieren(result.toString()));

	}

	public static String zeilenFormattieren(String s) {
		return "<html>" + s.replaceAll("\n", "<br>");
	}

	/**
	 * Methode zum speichern der Mitarbeiterliste als PDF auf dem Computer des Benutzers
	 */
	public static void ausgebenMitarbeiterListePDF() {

		ArrayList<Mitarbeiter> mitarbeiterListe = MitarbeiterDB.ausgebenMitarbeiterAlle();

		try {

			String fileName = System.getProperty("user.home") + "/Mitarbeiter.pdf";
			Document doc = new Document(PageSize.A4.rotate());
			PdfWriter.getInstance(doc, new FileOutputStream(fileName));

			doc.open();

			Paragraph par = new Paragraph("Liste aller Mitarbeiter:\n");
			doc.add(par);

			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
			String now = String.valueOf(LocalDate.now().format(formatter));
			Paragraph para = new Paragraph("Stand: " + now);
			doc.add(para);

			Paragraph par2 = new Paragraph(" ");
			doc.add(par2);

			PdfPTable tabelle = new PdfPTable(new float[] { 1, 1, 1, 1, 1, 1, 0.8f });
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

			c1 = new PdfPCell(new Phrase("\nAbteilung"));
			c1.setHorizontalAlignment(Element.ALIGN_CENTER);
			tabelle.addCell(c1);

			c1 = new PdfPCell(new Phrase("\nStatus"));
			c1.setHorizontalAlignment(Element.ALIGN_CENTER);
			tabelle.addCell(c1);

			c1 = new PdfPCell(new Phrase("\nGehalt"));
			c1.setHorizontalAlignment(Element.ALIGN_CENTER);
			tabelle.addCell(c1);

			tabelle.setHeaderRows(1);

			for (int i = 0; i < mitarbeiterListe.size(); i++) {
				Mitarbeiter m = mitarbeiterListe.get(i);
				String id = "" + m.getName().charAt(0) + m.getNachname().charAt(0) + m.getGeb();
				tabelle.addCell(id);
				tabelle.addCell(m.getName());
				tabelle.addCell(m.getNachname());
				tabelle.addCell(Long.valueOf(m.getTel()).toString());
				tabelle.addCell(m.getAbteilung());
				tabelle.addCell(m.getStatus());
				PdfPCell c2 = new PdfPCell(new Phrase(Integer.valueOf(m.getGehalt()).toString() + ",00 €"));
				c2.setHorizontalAlignment(Element.ALIGN_RIGHT);
				tabelle.addCell(c2);
			}

			doc.add(tabelle);
			doc.close();

		} catch (FileNotFoundException | DocumentException e) {
			e.printStackTrace();
		}

	}
}
