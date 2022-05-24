package HauptfensterPanels;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import de.fourHighSpeedHR.database.BewerberDB;
import de.fourHighSpeedHR.database.MitarbeiterDB;
import de.fourHighSpeedHR.objects.Bewerber;
import de.fourHighSpeedHR.objects.Mitarbeiter;

import javax.swing.JFormattedTextField;
import javax.swing.JEditorPane;

public class BewerberAnlegen extends JPanel {

	private static JTextField bewerberAnlegenName;
	private static JTextField bewerberAnlegenNachname;
	private static JTextField bewerberAnlegenStraße;
	private static JTextField bewerberAnlegenHNR;
	private static JTextField bewerberAnlegenOrt;
	private static JTextField bewerberAnlegenPLZ;
	private static JTextField bewerberAnlegenTel;
	private static JTextField tfGeburtstagJahr;
	private static JTextField tfGeburtstagMonat;
	private static JTextField tfGeburtstagTag;
	private static JEditorPane epBewerberNotizen;

	/**
	 * Create the panel.
	 */
	public BewerberAnlegen() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{60, 236, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 120, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
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
	    bewerberAnlegenName.addKeyListener(new KeyAdapter() {
	         public void keyTyped(KeyEvent e) {
	             char c = e.getKeyChar();
	             if(!(Character.isAlphabetic(c) || (c==KeyEvent.VK_SPACE) || c==KeyEvent.VK_DELETE || c==KeyEvent.VK_MINUS)) {
	                 e.consume();  // ignore the event if it's not an alphabet
	             }
	         }
	      });
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
		
		JLabel lblGeburtstag = new JLabel("Geburtstag (YYYY/MM/DD)");
		lblGeburtstag.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblGeburtstag = new GridBagConstraints();
		gbc_lblGeburtstag.anchor = GridBagConstraints.WEST;
		gbc_lblGeburtstag.gridwidth = 3;
		gbc_lblGeburtstag.insets = new Insets(0, 0, 5, 0);
		gbc_lblGeburtstag.gridx = 2;
		gbc_lblGeburtstag.gridy = 3;
		add(lblGeburtstag, gbc_lblGeburtstag);
		
		bewerberAnlegenNachname = new JTextField();
		bewerberAnlegenNachname.setFont(new Font("Arial", Font.PLAIN, 12));
		bewerberAnlegenNachname.addKeyListener(new KeyAdapter() {
	         public void keyTyped(KeyEvent e) {
	             char c = e.getKeyChar();
	             if(!(Character.isAlphabetic(c) || (c==KeyEvent.VK_SPACE) || c==KeyEvent.VK_DELETE || c==KeyEvent.VK_MINUS)) {
	                 e.consume();  // ignore the event if it's not an alphabet
	             }
	         }
	      });
		GridBagConstraints gbc_bewerberAnlegenNachname = new GridBagConstraints();
		gbc_bewerberAnlegenNachname.insets = new Insets(0, 0, 5, 5);
		gbc_bewerberAnlegenNachname.fill = GridBagConstraints.HORIZONTAL;
		gbc_bewerberAnlegenNachname.gridx = 1;
		gbc_bewerberAnlegenNachname.gridy = 4;
		add(bewerberAnlegenNachname, gbc_bewerberAnlegenNachname);
		bewerberAnlegenNachname.setColumns(25);
		
		tfGeburtstagJahr = new JTextField();
		tfGeburtstagJahr.setFont(new Font("Arial", Font.PLAIN, 12));
		tfGeburtstagJahr.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
					getToolkit().beep();
					e.consume();
				}
			}
		});
		GridBagConstraints gbc_tfGeburtstagJahr = new GridBagConstraints();
		gbc_tfGeburtstagJahr.insets = new Insets(0, 0, 5, 5);
		gbc_tfGeburtstagJahr.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfGeburtstagJahr.gridx = 2;
		gbc_tfGeburtstagJahr.gridy = 4;
		add(tfGeburtstagJahr, gbc_tfGeburtstagJahr);
		tfGeburtstagJahr.setColumns(4);
		
		tfGeburtstagMonat = new JTextField();
		tfGeburtstagMonat.setFont(new Font("Arial", Font.PLAIN, 12));
		tfGeburtstagMonat.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
					getToolkit().beep();
					e.consume();
				}
			}
		});
		GridBagConstraints gbc_tfGeburtstagMonat = new GridBagConstraints();
		gbc_tfGeburtstagMonat.weightx = 0.1;
		gbc_tfGeburtstagMonat.insets = new Insets(0, 0, 5, 5);
		gbc_tfGeburtstagMonat.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfGeburtstagMonat.gridx = 3;
		gbc_tfGeburtstagMonat.gridy = 4;
		add(tfGeburtstagMonat, gbc_tfGeburtstagMonat);
		tfGeburtstagMonat.setColumns(2);
		
		tfGeburtstagTag = new JTextField();
		tfGeburtstagTag.setFont(new Font("Arial", Font.PLAIN, 12));
		tfGeburtstagTag.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
					getToolkit().beep();
					e.consume();
				}
			}
		});
		GridBagConstraints gbc_tfGeburtstagTag = new GridBagConstraints();
		gbc_tfGeburtstagTag.insets = new Insets(0, 0, 5, 0);
		gbc_tfGeburtstagTag.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfGeburtstagTag.gridx = 4;
		gbc_tfGeburtstagTag.gridy = 4;
		add(tfGeburtstagTag, gbc_tfGeburtstagTag);
		tfGeburtstagTag.setColumns(2);
		
		JLabel lblBewerberAnlegenAdresse = new JLabel("Adresse");
		lblBewerberAnlegenAdresse.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblBewerberAnlegenAdresse = new GridBagConstraints();
		gbc_lblBewerberAnlegenAdresse.insets = new Insets(0, 0, 5, 5);
		gbc_lblBewerberAnlegenAdresse.anchor = GridBagConstraints.WEST;
		gbc_lblBewerberAnlegenAdresse.gridx = 1;
		gbc_lblBewerberAnlegenAdresse.gridy = 5;
		add(lblBewerberAnlegenAdresse, gbc_lblBewerberAnlegenAdresse);
		
		JLabel lblBewerberAnlegenStrasse = new JLabel("Strasse");
		lblBewerberAnlegenStrasse.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblBewerberAnlegenStrasse = new GridBagConstraints();
		gbc_lblBewerberAnlegenStrasse.insets = new Insets(0, 0, 5, 5);
		gbc_lblBewerberAnlegenStrasse.anchor = GridBagConstraints.WEST;
		gbc_lblBewerberAnlegenStrasse.gridx = 1;
		gbc_lblBewerberAnlegenStrasse.gridy = 6;
		add(lblBewerberAnlegenStrasse, gbc_lblBewerberAnlegenStrasse);
		
		JLabel lblBewerberAnlegenHNR = new JLabel("HNR");
		lblBewerberAnlegenHNR.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblBewerberAnlegenHNR = new GridBagConstraints();
		gbc_lblBewerberAnlegenHNR.anchor = GridBagConstraints.WEST;
		gbc_lblBewerberAnlegenHNR.insets = new Insets(0, 0, 5, 5);
		gbc_lblBewerberAnlegenHNR.gridx = 2;
		gbc_lblBewerberAnlegenHNR.gridy = 6;
		add(lblBewerberAnlegenHNR, gbc_lblBewerberAnlegenHNR);
		
		bewerberAnlegenStraße = new JTextField();
		bewerberAnlegenStraße.setFont(new Font("Arial", Font.PLAIN, 12));
		bewerberAnlegenStraße.addKeyListener(new KeyAdapter() {
	         public void keyTyped(KeyEvent e) {
	             char c = e.getKeyChar();
	             if(!(Character.isAlphabetic(c) || (c==KeyEvent.VK_SPACE) || c==KeyEvent.VK_DELETE || c==KeyEvent.VK_MINUS)) {
	                 e.consume();  // ignore the event if it's not an alphabet
	             }
	         }
	      });
		GridBagConstraints gbc_bewerberAnlegenStraße = new GridBagConstraints();
		gbc_bewerberAnlegenStraße.insets = new Insets(0, 0, 5, 5);
		gbc_bewerberAnlegenStraße.fill = GridBagConstraints.HORIZONTAL;
		gbc_bewerberAnlegenStraße.gridx = 1;
		gbc_bewerberAnlegenStraße.gridy = 7;
		add(bewerberAnlegenStraße, gbc_bewerberAnlegenStraße);
		bewerberAnlegenStraße.setColumns(25);
		
		bewerberAnlegenHNR = new JTextField();
		bewerberAnlegenHNR.setFont(new Font("Arial", Font.PLAIN, 12));
		bewerberAnlegenHNR.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
					getToolkit().beep();
					e.consume();
				}
			}
		});
		GridBagConstraints gbc_bewerberAnlegenHNR = new GridBagConstraints();
		gbc_bewerberAnlegenHNR.gridwidth = 2;
		gbc_bewerberAnlegenHNR.insets = new Insets(0, 0, 5, 5);
		gbc_bewerberAnlegenHNR.fill = GridBagConstraints.HORIZONTAL;
		gbc_bewerberAnlegenHNR.gridx = 2;
		gbc_bewerberAnlegenHNR.gridy = 7;
		add(bewerberAnlegenHNR, gbc_bewerberAnlegenHNR);
		bewerberAnlegenHNR.setColumns(4);
		
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
		gbc_lblBewerberAnlegenPLZ.insets = new Insets(0, 0, 5, 5);
		gbc_lblBewerberAnlegenPLZ.anchor = GridBagConstraints.WEST;
		gbc_lblBewerberAnlegenPLZ.gridx = 2;
		gbc_lblBewerberAnlegenPLZ.gridy = 8;
		add(lblBewerberAnlegenPLZ, gbc_lblBewerberAnlegenPLZ);
		
		bewerberAnlegenOrt = new JTextField();
		bewerberAnlegenOrt.setFont(new Font("Arial", Font.PLAIN, 12));
		bewerberAnlegenOrt.addKeyListener(new KeyAdapter() {
	         public void keyTyped(KeyEvent e) {
	             char c = e.getKeyChar();
	             if(!(Character.isAlphabetic(c) || (c==KeyEvent.VK_SPACE) || c==KeyEvent.VK_DELETE || c==KeyEvent.VK_MINUS)) {
	                 e.consume();  // ignore the event if it's not an alphabet
	             }
	         }
	      });
		GridBagConstraints gbc_bewerberAnlegenOrt = new GridBagConstraints();
		gbc_bewerberAnlegenOrt.insets = new Insets(0, 0, 5, 5);
		gbc_bewerberAnlegenOrt.fill = GridBagConstraints.HORIZONTAL;
		gbc_bewerberAnlegenOrt.gridx = 1;
		gbc_bewerberAnlegenOrt.gridy = 9;
		add(bewerberAnlegenOrt, gbc_bewerberAnlegenOrt);
		bewerberAnlegenOrt.setColumns(25);
		
		bewerberAnlegenPLZ = new JTextField();
		bewerberAnlegenPLZ.setFont(new Font("Arial", Font.PLAIN, 12));
		bewerberAnlegenPLZ.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
					getToolkit().beep();
					e.consume();
				}
			}
		});
		GridBagConstraints gbc_bewerberAnlegenPLZ = new GridBagConstraints();
		gbc_bewerberAnlegenPLZ.gridwidth = 2;
		gbc_bewerberAnlegenPLZ.insets = new Insets(0, 0, 5, 5);
		gbc_bewerberAnlegenPLZ.fill = GridBagConstraints.HORIZONTAL;
		gbc_bewerberAnlegenPLZ.gridx = 2;
		gbc_bewerberAnlegenPLZ.gridy = 9;
		add(bewerberAnlegenPLZ, gbc_bewerberAnlegenPLZ);
		bewerberAnlegenPLZ.setColumns(5);
		
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
		bewerberAnlegenTel.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
					getToolkit().beep();
					e.consume();
				}
			}
		});
		GridBagConstraints gbc_bewerberAnlegenTel = new GridBagConstraints();
		gbc_bewerberAnlegenTel.insets = new Insets(0, 0, 5, 5);
		gbc_bewerberAnlegenTel.fill = GridBagConstraints.HORIZONTAL;
		gbc_bewerberAnlegenTel.gridx = 1;
		gbc_bewerberAnlegenTel.gridy = 11;
		add(bewerberAnlegenTel, gbc_bewerberAnlegenTel);
		bewerberAnlegenTel.setColumns(11);
		
		JLabel lblBewerberAnlegenNotizen = new JLabel("Notizen");
		lblBewerberAnlegenNotizen.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblBewerberAnlegenNotizen = new GridBagConstraints();
		gbc_lblBewerberAnlegenNotizen.anchor = GridBagConstraints.WEST;
		gbc_lblBewerberAnlegenNotizen.insets = new Insets(0, 0, 5, 5);
		gbc_lblBewerberAnlegenNotizen.gridx = 1;
		gbc_lblBewerberAnlegenNotizen.gridy = 12;
		add(lblBewerberAnlegenNotizen, gbc_lblBewerberAnlegenNotizen);
		
		epBewerberNotizen = new JEditorPane();
		epBewerberNotizen.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_epBewerberNotizen = new GridBagConstraints();
		gbc_epBewerberNotizen.gridwidth = 4;
		gbc_epBewerberNotizen.insets = new Insets(0, 0, 5, 5);
		gbc_epBewerberNotizen.fill = GridBagConstraints.BOTH;
		gbc_epBewerberNotizen.gridx = 1;
		gbc_epBewerberNotizen.gridy = 13;
		add(epBewerberNotizen, gbc_epBewerberNotizen);
		
		JButton bewerberAnlegenSpeichern = new JButton("Speichern");
		bewerberAnlegenSpeichern.setFont(new Font("Arial", Font.BOLD, 12));
		bewerberAnlegenSpeichern.addActionListener(e -> speichenBewerber());
		GridBagConstraints gbc_bewerberAnlegenSpeichern = new GridBagConstraints();
		gbc_bewerberAnlegenSpeichern.fill = GridBagConstraints.HORIZONTAL;
		gbc_bewerberAnlegenSpeichern.insets = new Insets(0, 0, 0, 5);
		gbc_bewerberAnlegenSpeichern.gridx = 1;
		gbc_bewerberAnlegenSpeichern.gridy = 14;
		add(bewerberAnlegenSpeichern, gbc_bewerberAnlegenSpeichern);

	}
	
	public static void speichenBewerber() {
		
		String name = "";
		String nachname = "";
		String strasse = "";
		String ort = "";
		String notizen = "";
		String geburtstag = "";
		int hnr = 0, plz = 0;
		long tel = 0;

		/**
		 * Erst Nummern ueberpruefen da sonst NumberFormatException
		 */
		
		if (bewerberAnlegenHNR.getText().equals("") || bewerberAnlegenPLZ.getText().equals("")
				|| bewerberAnlegenTel.getText().equals("")) {

		} else {
			
			name = bewerberAnlegenName.getText();
			nachname = bewerberAnlegenNachname.getText();
			strasse = bewerberAnlegenStraße.getText();
			hnr = Integer.valueOf(bewerberAnlegenHNR.getText());
			ort = bewerberAnlegenOrt.getText();
			plz = Integer.valueOf(bewerberAnlegenPLZ.getText());
			tel = Long.valueOf(bewerberAnlegenTel.getText());
			notizen = epBewerberNotizen.getText();
			geburtstag = tfGeburtstagTag.getText() + "." + tfGeburtstagMonat.getText() + "."
					+ tfGeburtstagJahr.getText();
			
		}

		/**
		 * Test ob alle Felder ausgefüllt sind
		 */
		
		if (name.equals("") || nachname.equals("") || strasse.equals("") || ort.equals("")
				|| geburtstag.equals("") || hnr == 0 || plz == 0 || tel == 0) {
			
			JOptionPane.showMessageDialog(null, "Deine Eingabe ist nicht vollstaendig. Bitte aendere deine Eingabe");
			
		} else {
			
			BewerberDB.hinzufuegenBewerber(
					new Bewerber(name, nachname, strasse, hnr, ort, plz, tel, notizen, geburtstag));

			bewerberAnlegenName.setText("");
			bewerberAnlegenNachname.setText("");
			bewerberAnlegenStraße.setText("");
			bewerberAnlegenHNR.setText("");
			bewerberAnlegenOrt.setText("");
			bewerberAnlegenPLZ.setText("");
			bewerberAnlegenTel.setText("");
			epBewerberNotizen.setText("");
			tfGeburtstagJahr.setText("");
			tfGeburtstagMonat.setText("");
			tfGeburtstagTag.setText("");
		}
	}
	
	public static void clearAll() {

		bewerberAnlegenName.setText("");
		bewerberAnlegenNachname.setText("");
		bewerberAnlegenStraße.setText("");
		bewerberAnlegenHNR.setText("");
		bewerberAnlegenOrt.setText("");
		bewerberAnlegenPLZ.setText("");
		bewerberAnlegenTel.setText("");
		epBewerberNotizen.setText("");
		tfGeburtstagJahr.setText("");
		tfGeburtstagMonat.setText("");
		tfGeburtstagTag.setText("");
	}

}
