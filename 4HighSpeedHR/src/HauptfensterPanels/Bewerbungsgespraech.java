package HauptfensterPanels;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import de.fourHighSpeedHR.database.BewerberDB;
import de.fourHighSpeedHR.objects.Bewerber;

/**
 * Panel das alles enthaelt um waehrend dem Bewerbungsgespräch mit schreiben zu
 * koennen
 */
public class Bewerbungsgespraech extends JPanel {

	private static JTextField bewerbungsgespraechName;
	private static JTextField bewerbungsgespraechNachname;
	private static JTextField bewerbungsgespraechNummer;
	private static JEditorPane epBewerberNotizen;

	private static String notizenBewerber;
	private static String idBewerber;

	public Bewerbungsgespraech() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 60, 276, 138, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 144, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel lblBewerbungsgespraech = new JLabel("Bewerbungsgespraech");
		lblBewerbungsgespraech.setFont(new Font("Arial", Font.BOLD, 15));
		GridBagConstraints gbc_lblBewerbungsgespraech = new GridBagConstraints();
		gbc_lblBewerbungsgespraech.anchor = GridBagConstraints.WEST;
		gbc_lblBewerbungsgespraech.insets = new Insets(0, 0, 5, 5);
		gbc_lblBewerbungsgespraech.gridx = 1;
		gbc_lblBewerbungsgespraech.gridy = 0;
		add(lblBewerbungsgespraech, gbc_lblBewerbungsgespraech);

		JLabel lblBewerberSuchen = new JLabel("Bewerber suchen");
		lblBewerberSuchen.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblBewerberSuchen = new GridBagConstraints();
		gbc_lblBewerberSuchen.anchor = GridBagConstraints.WEST;
		gbc_lblBewerberSuchen.insets = new Insets(0, 0, 5, 5);
		gbc_lblBewerberSuchen.gridx = 1;
		gbc_lblBewerberSuchen.gridy = 1;
		add(lblBewerberSuchen, gbc_lblBewerberSuchen);

		JLabel lblBewerbungsgespraechName = new JLabel("Name*");
		lblBewerbungsgespraechName.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblBewerbungsgespraechName = new GridBagConstraints();
		gbc_lblBewerbungsgespraechName.anchor = GridBagConstraints.WEST;
		gbc_lblBewerbungsgespraechName.insets = new Insets(0, 0, 5, 5);
		gbc_lblBewerbungsgespraechName.gridx = 1;
		gbc_lblBewerbungsgespraechName.gridy = 2;
		add(lblBewerbungsgespraechName, gbc_lblBewerbungsgespraechName);

		bewerbungsgespraechName = new JTextField();
		bewerbungsgespraechName.setFont(new Font("Arial", Font.PLAIN, 12));
		bewerbungsgespraechName.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!(Character.isAlphabetic(c) || (c == KeyEvent.VK_SPACE) || c == KeyEvent.VK_DELETE
						|| c == KeyEvent.VK_MINUS)) {
					e.consume(); // ignore the event if it's not an alphabet
				}
			}
		});
		GridBagConstraints gbc_bewerbungsgespraechName = new GridBagConstraints();
		gbc_bewerbungsgespraechName.insets = new Insets(0, 0, 5, 5);
		gbc_bewerbungsgespraechName.fill = GridBagConstraints.HORIZONTAL;
		gbc_bewerbungsgespraechName.gridx = 1;
		gbc_bewerbungsgespraechName.gridy = 3;
		add(bewerbungsgespraechName, gbc_bewerbungsgespraechName);
		bewerbungsgespraechName.setColumns(10);

		JLabel lblBewerbungsgespraechNachname = new JLabel("Nachname*");
		lblBewerbungsgespraechNachname.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblBewerbungsgespraechNachname = new GridBagConstraints();
		gbc_lblBewerbungsgespraechNachname.anchor = GridBagConstraints.WEST;
		gbc_lblBewerbungsgespraechNachname.insets = new Insets(0, 0, 5, 5);
		gbc_lblBewerbungsgespraechNachname.gridx = 1;
		gbc_lblBewerbungsgespraechNachname.gridy = 4;
		add(lblBewerbungsgespraechNachname, gbc_lblBewerbungsgespraechNachname);

		bewerbungsgespraechNachname = new JTextField();
		bewerbungsgespraechNachname.setFont(new Font("Arial", Font.PLAIN, 12));
		bewerbungsgespraechNachname.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!(Character.isAlphabetic(c) || (c == KeyEvent.VK_SPACE) || c == KeyEvent.VK_DELETE
						|| c == KeyEvent.VK_MINUS)) {
					e.consume(); // ignore the event if it's not an alphabet
				}
			}
		});
		GridBagConstraints gbc_bewerbungsgespraechNachname = new GridBagConstraints();
		gbc_bewerbungsgespraechNachname.insets = new Insets(0, 0, 5, 5);
		gbc_bewerbungsgespraechNachname.fill = GridBagConstraints.HORIZONTAL;
		gbc_bewerbungsgespraechNachname.gridx = 1;
		gbc_bewerbungsgespraechNachname.gridy = 5;
		add(bewerbungsgespraechNachname, gbc_bewerbungsgespraechNachname);
		bewerbungsgespraechNachname.setColumns(10);

		JLabel lblBewerbungsgespraechNummer = new JLabel("Nummer*");
		lblBewerbungsgespraechNummer.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblBewerbungsgespraechNummer = new GridBagConstraints();
		gbc_lblBewerbungsgespraechNummer.anchor = GridBagConstraints.WEST;
		gbc_lblBewerbungsgespraechNummer.insets = new Insets(0, 0, 5, 5);
		gbc_lblBewerbungsgespraechNummer.gridx = 1;
		gbc_lblBewerbungsgespraechNummer.gridy = 6;
		add(lblBewerbungsgespraechNummer, gbc_lblBewerbungsgespraechNummer);

		bewerbungsgespraechNummer = new JTextField();
		bewerbungsgespraechNummer.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_bewerbungsgespraechNummer = new GridBagConstraints();
		gbc_bewerbungsgespraechNummer.insets = new Insets(0, 0, 5, 5);
		gbc_bewerbungsgespraechNummer.fill = GridBagConstraints.HORIZONTAL;
		gbc_bewerbungsgespraechNummer.gridx = 1;
		gbc_bewerbungsgespraechNummer.gridy = 7;
		add(bewerbungsgespraechNummer, gbc_bewerbungsgespraechNummer);
		bewerbungsgespraechNummer.setColumns(10);

		JButton btnBewerberSuchen = new JButton("Bewerber suchen");
		btnBewerberSuchen.setHorizontalAlignment(SwingConstants.LEFT);
		btnBewerberSuchen.addActionListener(e -> suchenBewerber());
		btnBewerberSuchen.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_btnBewerberSuchen = new GridBagConstraints();
		gbc_btnBewerberSuchen.anchor = GridBagConstraints.WEST;
		gbc_btnBewerberSuchen.insets = new Insets(0, 0, 5, 0);
		gbc_btnBewerberSuchen.gridx = 2;
		gbc_btnBewerberSuchen.gridy = 7;
		add(btnBewerberSuchen, gbc_btnBewerberSuchen);

		JLabel lblBewerberNotizenHinzufuegen = new JLabel("Bewerber Notizen");
		lblBewerberNotizenHinzufuegen.setFont(new Font("Arial", Font.BOLD, 15));
		GridBagConstraints gbc_lblBewerberNotizenHinzufuegen = new GridBagConstraints();
		gbc_lblBewerberNotizenHinzufuegen.anchor = GridBagConstraints.WEST;
		gbc_lblBewerberNotizenHinzufuegen.insets = new Insets(0, 0, 5, 5);
		gbc_lblBewerberNotizenHinzufuegen.gridx = 1;
		gbc_lblBewerberNotizenHinzufuegen.gridy = 10;
		add(lblBewerberNotizenHinzufuegen, gbc_lblBewerberNotizenHinzufuegen);

		JLabel lblNewLabel = new JLabel("");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 10;
		add(lblNewLabel, gbc_lblNewLabel);

		JLabel lblNewLabel_7 = new JLabel(" ");
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_7.gridx = 0;
		gbc_lblNewLabel_7.gridy = 11;
		add(lblNewLabel_7, gbc_lblNewLabel_7);

		epBewerberNotizen = new JEditorPane();
		epBewerberNotizen.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_epBewerberNotizen = new GridBagConstraints();
		gbc_epBewerberNotizen.gridwidth = 2;
		gbc_epBewerberNotizen.gridheight = 4;
		gbc_epBewerberNotizen.insets = new Insets(0, 0, 5, 0);
		gbc_epBewerberNotizen.fill = GridBagConstraints.BOTH;
		gbc_epBewerberNotizen.gridx = 1;
		gbc_epBewerberNotizen.gridy = 11;
		add(epBewerberNotizen, gbc_epBewerberNotizen);

		JButton bewerbungsgespraechSpeichern = new JButton("Speichern");
		bewerbungsgespraechSpeichern.setFont(new Font("Arial", Font.BOLD, 12));
		bewerbungsgespraechSpeichern.addActionListener(e -> aendernNotizen());
		GridBagConstraints gbc_bewerbungsgespraechSpeichern = new GridBagConstraints();
		gbc_bewerbungsgespraechSpeichern.insets = new Insets(0, 0, 0, 5);
		gbc_bewerbungsgespraechSpeichern.fill = GridBagConstraints.HORIZONTAL;
		gbc_bewerbungsgespraechSpeichern.gridx = 1;
		gbc_bewerbungsgespraechSpeichern.gridy = 15;
		add(bewerbungsgespraechSpeichern, gbc_bewerbungsgespraechSpeichern);

	}

	/**
	 * Mehtode um Bewerber zu suchen um die bereits eingefuegten Notizen zu laden
	 */
	public static void suchenBewerber() {

		String name = bewerbungsgespraechName.getText();
		String nachname = bewerbungsgespraechNachname.getText();
		String idInput = bewerbungsgespraechNummer.getText();

		if (name.equals("") || nachname.equals("") || idInput.equals("")) {

			JOptionPane.showMessageDialog(null, "Deine Eingabe ist nicht vollstaendig. Bitte aendere deine Eingabe");

		} else {
			ArrayList<Bewerber> bewerber = BewerberDB.ausgebenBewerberAlle();

			for (int i = 0; i < bewerber.size(); i++) {

				Bewerber b = bewerber.get(i);
				String id = "" + b.getName().charAt(0) + b.getNachname().charAt(0) + b.getGeb();

				if (b.getName().equals(name) && b.getNachname().equals(nachname) && id.equals(idInput)) {

					notizenBewerber = b.getNotizen();
					idBewerber = id;

					epBewerberNotizen.setText(notizenBewerber);
				}
			}
		}
	}

	/**
	 * Methode um die geaenderten Notizen zu speichern
	 */
	public static void aendernNotizen() {

		String notizen = epBewerberNotizen.getText();

		if (!notizen.equals("")) {

			BewerberDB.aendernNotizen(notizen, idBewerber);

		}

		epBewerberNotizen.setText("");
		bewerbungsgespraechName.setText("");
		bewerbungsgespraechNachname.setText("");
		bewerbungsgespraechNummer.setText("");

	}

	public static void clearAll() {

		epBewerberNotizen.setText("");
		bewerbungsgespraechName.setText("");
		bewerbungsgespraechNachname.setText("");
		bewerbungsgespraechNummer.setText("");
	}

}
