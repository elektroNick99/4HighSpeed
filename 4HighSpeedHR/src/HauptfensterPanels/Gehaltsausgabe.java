package HauptfensterPanels;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

import de.fourHighSpeedHR.database.MitarbeiterDB;
import de.fourHighSpeedHR.objects.Mitarbeiter;

import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.ArrayList;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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

import javax.swing.JScrollPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

/**
 * Panel das die Gehaltsausgabe handelt
 */
public class Gehaltsausgabe extends JPanel {

	private static JTextField mitarbeiterGehaltName;
	private static JTextField mitarbeiterGehaltNachname;
	private static JTextField mitarbeiterGehaltNummer;
	private static JTextField mitarbeiterGehaltMonate;
	private static JLabel lblMitarbeiter;
	private static JLabel lblListeAusgabe;
	private static JRadioButton rbEingestellt, rbNichtEingestellt;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	public Gehaltsausgabe() {

		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 112, 31, 269 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 29, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 1.0 };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel lblMitarbeiterGehalt = new JLabel("Mitarbeiter Gehalt");
		lblMitarbeiterGehalt.setFont(new Font("Arial", Font.BOLD, 15));
		GridBagConstraints gbc_lblMitarbeiterGehalt = new GridBagConstraints();
		gbc_lblMitarbeiterGehalt.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterGehalt.insets = new Insets(0, 0, 5, 5);
		gbc_lblMitarbeiterGehalt.gridx = 0;
		gbc_lblMitarbeiterGehalt.gridy = 0;
		add(lblMitarbeiterGehalt, gbc_lblMitarbeiterGehalt);

		JLabel lblMitarbeiterGehaltSuchen = new JLabel("Mitarbeiter suchen");
		lblMitarbeiterGehaltSuchen.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblMitarbeiterGehaltSuchen = new GridBagConstraints();
		gbc_lblMitarbeiterGehaltSuchen.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterGehaltSuchen.insets = new Insets(0, 0, 5, 5);
		gbc_lblMitarbeiterGehaltSuchen.gridx = 0;
		gbc_lblMitarbeiterGehaltSuchen.gridy = 1;
		add(lblMitarbeiterGehaltSuchen, gbc_lblMitarbeiterGehaltSuchen);

		JLabel lblMitarbeiterGehaltName = new JLabel("Name*");
		lblMitarbeiterGehaltName.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMitarbeiterGehaltName = new GridBagConstraints();
		gbc_lblMitarbeiterGehaltName.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterGehaltName.insets = new Insets(0, 0, 5, 5);
		gbc_lblMitarbeiterGehaltName.gridx = 0;
		gbc_lblMitarbeiterGehaltName.gridy = 2;
		add(lblMitarbeiterGehaltName, gbc_lblMitarbeiterGehaltName);

		lblListeAusgabe = new JLabel();
		lblListeAusgabe.setHorizontalAlignment(SwingConstants.LEFT);

		JScrollPane scroll = new JScrollPane(lblListeAusgabe, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridheight = 17;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.gridx = 2;
		gbc_scrollPane.gridy = 3;
		add(scroll, gbc_scrollPane);

		mitarbeiterGehaltName = new JTextField();
		mitarbeiterGehaltName.setFont(new Font("Arial", Font.PLAIN, 12));
		mitarbeiterGehaltName.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!(Character.isAlphabetic(c) || (c == KeyEvent.VK_SPACE) || c == KeyEvent.VK_DELETE
						|| c == KeyEvent.VK_MINUS)) {
					e.consume(); // ignore the event if it's not an alphabet
				}
			}
		});
		GridBagConstraints gbc_mitarbeiterGehaltName = new GridBagConstraints();
		gbc_mitarbeiterGehaltName.insets = new Insets(0, 0, 5, 5);
		gbc_mitarbeiterGehaltName.fill = GridBagConstraints.HORIZONTAL;
		gbc_mitarbeiterGehaltName.gridx = 0;
		gbc_mitarbeiterGehaltName.gridy = 3;
		add(mitarbeiterGehaltName, gbc_mitarbeiterGehaltName);
		mitarbeiterGehaltName.setColumns(10);

		JLabel lblMitarbeiterGehaltNachname = new JLabel("Nachname*");
		lblMitarbeiterGehaltNachname.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMitarbeiterGehaltNachname = new GridBagConstraints();
		gbc_lblMitarbeiterGehaltNachname.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterGehaltNachname.insets = new Insets(0, 0, 5, 5);
		gbc_lblMitarbeiterGehaltNachname.gridx = 0;
		gbc_lblMitarbeiterGehaltNachname.gridy = 4;
		add(lblMitarbeiterGehaltNachname, gbc_lblMitarbeiterGehaltNachname);

		mitarbeiterGehaltNachname = new JTextField();
		mitarbeiterGehaltNachname.setFont(new Font("Arial", Font.PLAIN, 12));
		mitarbeiterGehaltNachname.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!(Character.isAlphabetic(c) || (c == KeyEvent.VK_SPACE) || c == KeyEvent.VK_DELETE
						|| c == KeyEvent.VK_MINUS)) {
					e.consume(); // ignore the event if it's not an alphabet
				}
			}
		});
		GridBagConstraints gbc_mitarbeiterGehaltNachname = new GridBagConstraints();
		gbc_mitarbeiterGehaltNachname.insets = new Insets(0, 0, 5, 5);
		gbc_mitarbeiterGehaltNachname.fill = GridBagConstraints.HORIZONTAL;
		gbc_mitarbeiterGehaltNachname.gridx = 0;
		gbc_mitarbeiterGehaltNachname.gridy = 5;
		add(mitarbeiterGehaltNachname, gbc_mitarbeiterGehaltNachname);
		mitarbeiterGehaltNachname.setColumns(10);

		JLabel lblMitarbeiterGehaltNummer = new JLabel("Nummer*");
		lblMitarbeiterGehaltNummer.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMitarbeiterGehaltNummer = new GridBagConstraints();
		gbc_lblMitarbeiterGehaltNummer.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterGehaltNummer.insets = new Insets(0, 0, 5, 5);
		gbc_lblMitarbeiterGehaltNummer.gridx = 0;
		gbc_lblMitarbeiterGehaltNummer.gridy = 6;
		add(lblMitarbeiterGehaltNummer, gbc_lblMitarbeiterGehaltNummer);

		mitarbeiterGehaltNummer = new JTextField();
		mitarbeiterGehaltNummer.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_mitarbeiterGehaltNummer = new GridBagConstraints();
		gbc_mitarbeiterGehaltNummer.insets = new Insets(0, 0, 5, 5);
		gbc_mitarbeiterGehaltNummer.fill = GridBagConstraints.HORIZONTAL;
		gbc_mitarbeiterGehaltNummer.gridx = 0;
		gbc_mitarbeiterGehaltNummer.gridy = 7;
		add(mitarbeiterGehaltNummer, gbc_mitarbeiterGehaltNummer);
		mitarbeiterGehaltNummer.setColumns(10);

		JLabel lblMitarbeiterGehaltMonate = new JLabel("Monate der Berechnung*");
		lblMitarbeiterGehaltMonate.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMitarbeiterGehaltMonate = new GridBagConstraints();
		gbc_lblMitarbeiterGehaltMonate.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterGehaltMonate.insets = new Insets(0, 0, 5, 5);
		gbc_lblMitarbeiterGehaltMonate.gridx = 0;
		gbc_lblMitarbeiterGehaltMonate.gridy = 8;
		add(lblMitarbeiterGehaltMonate, gbc_lblMitarbeiterGehaltMonate);

		mitarbeiterGehaltMonate = new JTextField();
		mitarbeiterGehaltMonate.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
					getToolkit().beep();
					e.consume();
				}
			}
		});
		mitarbeiterGehaltMonate.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_mitarbeiterGehaltMonate = new GridBagConstraints();
		gbc_mitarbeiterGehaltMonate.insets = new Insets(0, 0, 5, 5);
		gbc_mitarbeiterGehaltMonate.fill = GridBagConstraints.HORIZONTAL;
		gbc_mitarbeiterGehaltMonate.gridx = 0;
		gbc_mitarbeiterGehaltMonate.gridy = 9;
		add(mitarbeiterGehaltMonate, gbc_mitarbeiterGehaltMonate);
		mitarbeiterGehaltMonate.setColumns(10);

		rbEingestellt = new JRadioButton("Eingestellt");
		buttonGroup.add(rbEingestellt);
		rbEingestellt.setSelected(true);
		rbEingestellt.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_rbEingestellt = new GridBagConstraints();
		gbc_rbEingestellt.anchor = GridBagConstraints.WEST;
		gbc_rbEingestellt.insets = new Insets(0, 0, 5, 5);
		gbc_rbEingestellt.gridx = 0;
		gbc_rbEingestellt.gridy = 10;
		add(rbEingestellt, gbc_rbEingestellt);

		rbNichtEingestellt = new JRadioButton("Nicht eingestellt");
		buttonGroup.add(rbNichtEingestellt);
		rbNichtEingestellt.setHorizontalAlignment(SwingConstants.LEFT);
		rbNichtEingestellt.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_rbNichtEingestellt = new GridBagConstraints();
		gbc_rbNichtEingestellt.anchor = GridBagConstraints.WEST;
		gbc_rbNichtEingestellt.insets = new Insets(0, 0, 5, 5);
		gbc_rbNichtEingestellt.gridx = 0;
		gbc_rbNichtEingestellt.gridy = 11;
		add(rbNichtEingestellt, gbc_rbNichtEingestellt);

		lblMitarbeiter = new JLabel("");
		GridBagConstraints gbc_lblMitarbeiter = new GridBagConstraints();
		gbc_lblMitarbeiter.insets = new Insets(0, 0, 5, 5);
		gbc_lblMitarbeiter.gridx = 1;
		gbc_lblMitarbeiter.gridy = 12;
		add(lblMitarbeiter, gbc_lblMitarbeiter);

		JButton gehaltAusgebenPDF = new JButton("Gehalt ausgeben PDF");
		gehaltAusgebenPDF.setFont(new Font("Arial", Font.BOLD, 12));
		gehaltAusgebenPDF.addActionListener(e -> ausgebenGehaltPDF());
		GridBagConstraints gbc_gehaltAusgebenPDF = new GridBagConstraints();
		gbc_gehaltAusgebenPDF.fill = GridBagConstraints.HORIZONTAL;
		gbc_gehaltAusgebenPDF.insets = new Insets(0, 0, 5, 5);
		gbc_gehaltAusgebenPDF.gridx = 0;
		gbc_gehaltAusgebenPDF.gridy = 13;
		add(gehaltAusgebenPDF, gbc_gehaltAusgebenPDF);

		JButton gehaltAusgeben = new JButton("Gehalt ausgeben");
		gehaltAusgeben.addActionListener(e -> gehaltRechnen());
		gehaltAusgeben.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_gehaltAusgeben = new GridBagConstraints();
		gbc_gehaltAusgeben.fill = GridBagConstraints.HORIZONTAL;
		gbc_gehaltAusgeben.insets = new Insets(0, 0, 5, 5);
		gbc_gehaltAusgeben.gridx = 0;
		gbc_gehaltAusgeben.gridy = 14;
		add(gehaltAusgeben, gbc_gehaltAusgeben);

		JButton btnGesamtGehalt = new JButton("Gesamt Gehalt");
		btnGesamtGehalt.setFont(new Font("Arial", Font.BOLD, 12));
		btnGesamtGehalt.addActionListener(e -> rechnenGehaltGesamt());
		GridBagConstraints gbc_btnGesamtGehalt = new GridBagConstraints();
		gbc_btnGesamtGehalt.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnGesamtGehalt.insets = new Insets(0, 0, 5, 5);
		gbc_btnGesamtGehalt.gridx = 0;
		gbc_btnGesamtGehalt.gridy = 15;
		add(btnGesamtGehalt, gbc_btnGesamtGehalt);

	}

	/**
	 * Methode die das Gehalt eines bestimmten ausgewaehlten Mitarbeiters ausgibt
	 */
	public static void gehaltRechnen() {

		String nameInput = mitarbeiterGehaltName.getText();
		String nachnameInput = mitarbeiterGehaltNachname.getText();
		String idInput = mitarbeiterGehaltNummer.getText();
		int monate = 0;
		if (!mitarbeiterGehaltMonate.getText().toString().equals("")) {

			monate = Integer.valueOf(mitarbeiterGehaltMonate.getText());

		}

		if (nameInput.equals("") || nameInput.equals("") || idInput.equals("") || monate == 0) {

			JOptionPane.showMessageDialog(null, "Deine Eingabe ist nicht vollstaendig. Bitte aendere deine Eingabe");

		} else {
			ArrayList<Mitarbeiter> mitarbeiter = MitarbeiterDB.ausgebenMitarbeiterAlle();

			for (int i = 0; i < mitarbeiter.size(); i++) {

				Mitarbeiter m = mitarbeiter.get(i);
				String id = "" + m.getName().charAt(0) + m.getNachname().charAt(0) + m.getGeb();

				if (m.getName().equals(nameInput) && m.getNachname().equals(nachnameInput) && id.equals(idInput)) {

					lblListeAusgabe.setText("");
					StringBuilder result = new StringBuilder();
					result.append("Der Mitarbeiter/Die Mitarbeiterin \n\n" + m.getName() + " " + m.getNachname()
							+ "\n\nwird in den naechsten " + monate + " Monaten " + monate * m.getGehalt()
							+ " € verdienen.");
					lblListeAusgabe.setText(zeilenFormattieren(result.toString()));
					break;

				}
			}
		}
	}

	/**
	 * Methode die das Gehalt aller Mitarbeiter ausgibt. Es kann gewaehlt werden ob
	 * es nur die aktuellen oder auch die gekuendigten Mitarbeiter beruecksihtigen
	 * soll.
	 */
	public static void rechnenGehaltGesamt() {

		int monate = 0;
		boolean eingestellt;

		if (rbEingestellt.isSelected()) {
			eingestellt = true;
		} else {
			eingestellt = false;
		}

		if (!mitarbeiterGehaltMonate.getText().toString().equals("")) {

			monate = Integer.valueOf(mitarbeiterGehaltMonate.getText());

		}

		if (monate > 0) {

			lblListeAusgabe.setText("");
			ArrayList<Mitarbeiter> mitarbeiter = MitarbeiterDB.ausgebenMitarbeiterAlle();
			int gehaltsumme = 0;
			StringBuilder result = new StringBuilder();
			result.append("Das Gehalt aller Mitarbeiter der Firma teilt sich wie folgt auf:\n\n");
			for (int i = 0; i < mitarbeiter.size(); i++) {

				Mitarbeiter ma = mitarbeiter.get(i);

				if (eingestellt) {
					if (ma.getStatus().equals("eingestellt")) {

						result.append(ma.getName() + " " + ma.getNachname() + ":\n " + ma.getGehalt() + " €\n\n");
						gehaltsumme += ma.getGehalt();
					}
				} else {
					if (ma.getStatus().equals("gekuendigt")) {

						result.append(ma.getName() + " " + ma.getNachname() + ":\n " + ma.getGehalt() + " €\n\n");
						gehaltsumme += ma.getGehalt();
					}
				}

			}
			result.append("Der gesamt Gehaltaufwand der Firma betraegt " + gehaltsumme + " € fuer " + "" + " Monate.");
			lblListeAusgabe.setText(zeilenFormattieren(result.toString()));
		} else {
			JOptionPane.showMessageDialog(null,
					"Deine Eingabe ist nicht richtig. Es muss fuer eine Mindestanzahl von einem Monat berechnet werden");

		}

	}

	/**
	 * Methode zum formattieren der ausgabe
	 * 
	 * @param s Eingabe String
	 * @return formattierter Ausgabestring
	 */
	public static String zeilenFormattieren(String s) {
		return "<html>" + s.replaceAll("\n", "<br>");
	}

	/**
	 * Methode die die Gehaltsliste als PDF auf dem Computer des Benutzers speichert
	 */
	public static void ausgebenGehaltPDF() {

		ArrayList<Mitarbeiter> mitarbeiterListe = MitarbeiterDB.ausgebenMitarbeiterAlle();

		try {

			String fileName = System.getProperty("user.home") + "/GehaltAusgabe.pdf";
			Document doc = new Document(PageSize.A4);
			PdfWriter.getInstance(doc, new FileOutputStream(fileName));

			doc.open();

			Paragraph par = new Paragraph("Gehaltliste aller Mitarbeiter pro Monat:\n");
			doc.add(par);

			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
			String now = String.valueOf(LocalDate.now().format(formatter));
			Paragraph para = new Paragraph("Stand: " + now);
			doc.add(para);

			Paragraph par2 = new Paragraph(" ");
			doc.add(par2);

			PdfPTable tabelle = new PdfPTable(new float[] { 1, 1, 1, 1 });
			tabelle.setWidthPercentage(100);
			PdfPCell c1 = new PdfPCell(new Phrase("\nName\n\n"));
			c1.setHorizontalAlignment(Element.ALIGN_CENTER);
			tabelle.addCell(c1);

			c1 = new PdfPCell(new Phrase("\nNachname"));
			c1.setHorizontalAlignment(Element.ALIGN_CENTER);
			tabelle.addCell(c1);

			c1 = new PdfPCell(new Phrase("\nAbteilung"));
			c1.setHorizontalAlignment(Element.ALIGN_CENTER);
			tabelle.addCell(c1);

			c1 = new PdfPCell(new Phrase("\nGehalt"));
			c1.setHorizontalAlignment(Element.ALIGN_CENTER);
			tabelle.addCell(c1);

			tabelle.setHeaderRows(1);

			int gehaltSumme = 0;

			for (int i = 0; i < mitarbeiterListe.size(); i++) {
				Mitarbeiter m = mitarbeiterListe.get(i);

				if (m.getStatus().equals("eingestellt")) {
					tabelle.addCell(m.getName());
					tabelle.addCell(m.getNachname());
					tabelle.addCell(m.getAbteilung());
					PdfPCell c2 = new PdfPCell(new Phrase(Integer.valueOf(m.getGehalt()).toString() + ",00 €"));
					c2.setHorizontalAlignment(Element.ALIGN_RIGHT);
					tabelle.addCell(c2);
					gehaltSumme += m.getGehalt();
				}
			}

			doc.add(tabelle);

			Paragraph par3 = new Paragraph(" ");
			doc.add(par3);

			Paragraph par4 = new Paragraph("Das gesamte Gehalt aller Mitarbeiter pro Monat betraegt");
			doc.add(par4);

			Paragraph par5 = new Paragraph(" ");
			doc.add(par5);

			Paragraph par6 = new Paragraph(Integer.valueOf(gehaltSumme).toString() + ",00 €");
			doc.add(par6);

			doc.close();

		} catch (FileNotFoundException | DocumentException e) {
			e.printStackTrace();
		}

	}

	public static void clearAll() {

		mitarbeiterGehaltName.setText("");
		mitarbeiterGehaltNachname.setText("");
		mitarbeiterGehaltNummer.setText("");
		mitarbeiterGehaltMonate.setText("");
		lblMitarbeiter.setText("");
		lblListeAusgabe.setText("");
	}

}