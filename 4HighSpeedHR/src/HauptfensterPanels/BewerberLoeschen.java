package HauptfensterPanels;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.JTextField;

import de.fourHighSpeedHR.database.BewerberDB;
import de.fourHighSpeedHR.database.MitarbeiterDB;
import de.fourHighSpeedHR.objects.Bewerber;
import de.fourHighSpeedHR.objects.Mitarbeiter;

import javax.swing.JButton;

public class BewerberLoeschen extends JPanel {
	private static JTextField bewerberLoeschenName;
	private static JTextField bewerberLoeschenNachname;
	private static JTextField bewerberLoeschenNummer;

	/**
	 * Create the panel.
	 */
	public BewerberLoeschen() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{60, 276, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblBewerberLoeschen = new JLabel("Bewerber loeschen");
		lblBewerberLoeschen.setFont(new Font("Arial", Font.BOLD, 15));
		GridBagConstraints gbc_lblBewerberLoeschen = new GridBagConstraints();
		gbc_lblBewerberLoeschen.anchor = GridBagConstraints.WEST;
		gbc_lblBewerberLoeschen.insets = new Insets(0, 0, 5, 0);
		gbc_lblBewerberLoeschen.gridx = 1;
		gbc_lblBewerberLoeschen.gridy = 0;
		add(lblBewerberLoeschen, gbc_lblBewerberLoeschen);
		
		JLabel lblBewerberLoeschenName = new JLabel("Name*");
		lblBewerberLoeschenName.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblBewerberLoeschenName = new GridBagConstraints();
		gbc_lblBewerberLoeschenName.anchor = GridBagConstraints.WEST;
		gbc_lblBewerberLoeschenName.insets = new Insets(0, 0, 5, 0);
		gbc_lblBewerberLoeschenName.gridx = 1;
		gbc_lblBewerberLoeschenName.gridy = 1;
		add(lblBewerberLoeschenName, gbc_lblBewerberLoeschenName);
		
		bewerberLoeschenName = new JTextField();
		bewerberLoeschenName.setFont(new Font("Arial", Font.PLAIN, 12));
		bewerberLoeschenName.addKeyListener(new KeyAdapter() {
	         public void keyTyped(KeyEvent e) {
	             char c = e.getKeyChar();
	             if(!(Character.isAlphabetic(c) || (c==KeyEvent.VK_SPACE) || c==KeyEvent.VK_DELETE || c==KeyEvent.VK_MINUS)) {
	                 e.consume();  // ignore the event if it's not an alphabet
	             }
	         }
	      });
		GridBagConstraints gbc_bewerberLoeschenName = new GridBagConstraints();
		gbc_bewerberLoeschenName.insets = new Insets(0, 0, 5, 0);
		gbc_bewerberLoeschenName.fill = GridBagConstraints.HORIZONTAL;
		gbc_bewerberLoeschenName.gridx = 1;
		gbc_bewerberLoeschenName.gridy = 2;
		add(bewerberLoeschenName, gbc_bewerberLoeschenName);
		bewerberLoeschenName.setColumns(10);
		
		JLabel lblBewerberLoeschenNachname = new JLabel("Nachname*");
		lblBewerberLoeschenNachname.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblBewerberLoeschenNachname = new GridBagConstraints();
		gbc_lblBewerberLoeschenNachname.anchor = GridBagConstraints.WEST;
		gbc_lblBewerberLoeschenNachname.insets = new Insets(0, 0, 5, 0);
		gbc_lblBewerberLoeschenNachname.gridx = 1;
		gbc_lblBewerberLoeschenNachname.gridy = 3;
		add(lblBewerberLoeschenNachname, gbc_lblBewerberLoeschenNachname);
		
		bewerberLoeschenNachname = new JTextField();
		bewerberLoeschenNachname.setFont(new Font("Arial", Font.PLAIN, 12));
		bewerberLoeschenNachname.addKeyListener(new KeyAdapter() {
	         public void keyTyped(KeyEvent e) {
	             char c = e.getKeyChar();
	             if(!(Character.isAlphabetic(c) || (c==KeyEvent.VK_SPACE) || c==KeyEvent.VK_DELETE || c==KeyEvent.VK_MINUS)) {
	                 e.consume();  // ignore the event if it's not an alphabet
	             }
	         }
	      });
		GridBagConstraints gbc_bewerberLoeschenNachname = new GridBagConstraints();
		gbc_bewerberLoeschenNachname.insets = new Insets(0, 0, 5, 0);
		gbc_bewerberLoeschenNachname.fill = GridBagConstraints.HORIZONTAL;
		gbc_bewerberLoeschenNachname.gridx = 1;
		gbc_bewerberLoeschenNachname.gridy = 4;
		add(bewerberLoeschenNachname, gbc_bewerberLoeschenNachname);
		bewerberLoeschenNachname.setColumns(10);
		
		JLabel lblBewerberLoeschenNummer = new JLabel("Nummer*");
		lblBewerberLoeschenNummer.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblBewerberLoeschenNummer = new GridBagConstraints();
		gbc_lblBewerberLoeschenNummer.anchor = GridBagConstraints.WEST;
		gbc_lblBewerberLoeschenNummer.insets = new Insets(0, 0, 5, 0);
		gbc_lblBewerberLoeschenNummer.gridx = 1;
		gbc_lblBewerberLoeschenNummer.gridy = 5;
		add(lblBewerberLoeschenNummer, gbc_lblBewerberLoeschenNummer);
		
		bewerberLoeschenNummer = new JTextField();
		bewerberLoeschenNummer.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_bewerberLoeschenNummer = new GridBagConstraints();
		gbc_bewerberLoeschenNummer.insets = new Insets(0, 0, 5, 0);
		gbc_bewerberLoeschenNummer.fill = GridBagConstraints.HORIZONTAL;
		gbc_bewerberLoeschenNummer.gridx = 1;
		gbc_bewerberLoeschenNummer.gridy = 6;
		add(bewerberLoeschenNummer, gbc_bewerberLoeschenNummer);
		bewerberLoeschenNummer.setColumns(10);
		
		JButton bewerberLoeschen = new JButton("Loeschen");
		bewerberLoeschen.setFont(new Font("Arial", Font.BOLD, 12));
		bewerberLoeschen.addActionListener(e -> bwLoeschen());
		GridBagConstraints gbc_bewerberLoeschen = new GridBagConstraints();
		gbc_bewerberLoeschen.fill = GridBagConstraints.HORIZONTAL;
		gbc_bewerberLoeschen.gridx = 1;
		gbc_bewerberLoeschen.gridy = 8;
		add(bewerberLoeschen, gbc_bewerberLoeschen);

	}
	
	public static void bwLoeschen() {
		
		String name = bewerberLoeschenName.getText();
		String nachname = bewerberLoeschenNachname.getText();
		String idInput = bewerberLoeschenNummer.getText();

		if (name.equals("") || nachname.equals("") || idInput.equals("")) {

			JOptionPane.showMessageDialog(null, "Deine Eingabe ist nicht vollstaendig. Bitte aendere deine Eingabe");
			
		} else {
			ArrayList<Bewerber> bewerber = BewerberDB.ausgebenBewerberAlle();

			for (int i = 0; i < bewerber.size(); i++) {

				Bewerber b = bewerber.get(i);
				String id = "" + b.getName().charAt(0) + b.getNachname().charAt(0) + b.getGeb();
				
				if (b.getName().equals(name) && b.getNachname().equals(nachname) && id.equals(idInput)) {

					BewerberDB.loeschenBewerber(idInput);;
					
					bewerberLoeschenName.setText("");
					bewerberLoeschenNachname.setText("");
					bewerberLoeschenNummer.setText("");
					
					JOptionPane.showMessageDialog(null, "Der Bewerber "+name+" "+ nachname+" wurde geloescht!");

				}
			}
		}
	}
	
	public static void clearAll() {
		
		bewerberLoeschenName.setText("");
		bewerberLoeschenNachname.setText("");
		bewerberLoeschenNummer.setText("");
	}

}
