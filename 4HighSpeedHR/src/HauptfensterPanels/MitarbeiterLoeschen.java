package HauptfensterPanels;

import javax.swing.JPanel;
import javax.swing.JTextField;

import de.fourHighSpeedHR.database.MitarbeiterDB;
import de.fourHighSpeedHR.objects.Mitarbeiter;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MitarbeiterLoeschen extends JPanel {

	private static JTextField tfName, tfNachname, tfID;

	/**
	 * Create the panel.
	 */
	public MitarbeiterLoeschen() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 60, 276, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel lblMitarbeiterLoeschen = new JLabel("Mitarbeiter loeschen");
		lblMitarbeiterLoeschen.setFont(new Font("Arial", Font.BOLD, 15));
		GridBagConstraints gbc_lblMitarbeiterLoeschen = new GridBagConstraints();
		gbc_lblMitarbeiterLoeschen.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterLoeschen.insets = new Insets(0, 0, 5, 0);
		gbc_lblMitarbeiterLoeschen.gridx = 1;
		gbc_lblMitarbeiterLoeschen.gridy = 0;
		add(lblMitarbeiterLoeschen, gbc_lblMitarbeiterLoeschen);

		JLabel lblMitarbeiterLoeschenName = new JLabel("Name*");
		lblMitarbeiterLoeschenName.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMitarbeiterLoeschenName = new GridBagConstraints();
		gbc_lblMitarbeiterLoeschenName.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterLoeschenName.insets = new Insets(0, 0, 5, 0);
		gbc_lblMitarbeiterLoeschenName.gridx = 1;
		gbc_lblMitarbeiterLoeschenName.gridy = 1;
		add(lblMitarbeiterLoeschenName, gbc_lblMitarbeiterLoeschenName);

		tfName = new JTextField();
		tfName.setFont(new Font("Arial", Font.PLAIN, 12));
		tfName.addKeyListener(new KeyAdapter() {
	         public void keyTyped(KeyEvent e) {
	             char c = e.getKeyChar();
	             if(!(Character.isAlphabetic(c) || (c==KeyEvent.VK_SPACE) || c==KeyEvent.VK_DELETE || c==KeyEvent.VK_MINUS)) {
	                 e.consume();  // ignore the event if it's not an alphabet
	             }
	         }
	      });
		GridBagConstraints gbc_tfName = new GridBagConstraints();
		gbc_tfName.insets = new Insets(0, 0, 5, 0);
		gbc_tfName.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfName.gridx = 1;
		gbc_tfName.gridy = 2;
		add(tfName, gbc_tfName);
		tfName.setColumns(10);

		JLabel lblMitarbeiterLoeschenNachname = new JLabel("Nachname*");
		lblMitarbeiterLoeschenNachname.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMitarbeiterLoeschenNachname = new GridBagConstraints();
		gbc_lblMitarbeiterLoeschenNachname.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterLoeschenNachname.insets = new Insets(0, 0, 5, 0);
		gbc_lblMitarbeiterLoeschenNachname.gridx = 1;
		gbc_lblMitarbeiterLoeschenNachname.gridy = 3;
		add(lblMitarbeiterLoeschenNachname, gbc_lblMitarbeiterLoeschenNachname);

		tfNachname = new JTextField();
		tfNachname.setFont(new Font("Arial", Font.PLAIN, 12));
		tfNachname.addKeyListener(new KeyAdapter() {
	         public void keyTyped(KeyEvent e) {
	             char c = e.getKeyChar();
	             if(!(Character.isAlphabetic(c) || (c==KeyEvent.VK_SPACE) || c==KeyEvent.VK_DELETE || c==KeyEvent.VK_MINUS)) {
	                 e.consume();  // ignore the event if it's not an alphabet
	             }
	         }
	      });
		GridBagConstraints gbc_tfNachname = new GridBagConstraints();
		gbc_tfNachname.insets = new Insets(0, 0, 5, 0);
		gbc_tfNachname.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfNachname.gridx = 1;
		gbc_tfNachname.gridy = 4;
		add(tfNachname, gbc_tfNachname);
		tfNachname.setColumns(10);

		JLabel lblMitarbeiterLoeschenNummer = new JLabel("Nummer*");
		lblMitarbeiterLoeschenNummer.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMitarbeiterLoeschenNummer = new GridBagConstraints();
		gbc_lblMitarbeiterLoeschenNummer.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterLoeschenNummer.insets = new Insets(0, 0, 5, 0);
		gbc_lblMitarbeiterLoeschenNummer.gridx = 1;
		gbc_lblMitarbeiterLoeschenNummer.gridy = 5;
		add(lblMitarbeiterLoeschenNummer, gbc_lblMitarbeiterLoeschenNummer);

		tfID = new JTextField();
		tfID.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_tfID = new GridBagConstraints();
		gbc_tfID.insets = new Insets(0, 0, 5, 0);
		gbc_tfID.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfID.gridx = 1;
		gbc_tfID.gridy = 6;
		add(tfID, gbc_tfID);
		tfID.setColumns(10);

		JButton btnMitarbeiterLoeschen = new JButton("Loeschen");
		btnMitarbeiterLoeschen.setFont(new Font("Arial", Font.BOLD, 12));
		btnMitarbeiterLoeschen.addActionListener(e -> maLoeschen());
		GridBagConstraints gbc_btnMitarbeiterLoeschen = new GridBagConstraints();
		gbc_btnMitarbeiterLoeschen.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnMitarbeiterLoeschen.gridx = 1;
		gbc_btnMitarbeiterLoeschen.gridy = 8;
		add(btnMitarbeiterLoeschen, gbc_btnMitarbeiterLoeschen);

	}

	public static void maLoeschen() {

		String name = tfName.getText();
		String nachname = tfNachname.getText();
		String idInput = tfID.getText();

		if (name.equals("") || nachname.equals("") || idInput.equals("")) {

			JOptionPane.showMessageDialog(null, "Deine Eingabe ist nicht vollstaendig. Bitte aendere deine Eingabe");
			
		} else {
			ArrayList<Mitarbeiter> mitarbeiter = MitarbeiterDB.ausgebenMitarbeiterAlle();

			for (int i = 0; i < mitarbeiter.size(); i++) {

				Mitarbeiter m = mitarbeiter.get(i);
				String id = "" + m.getName().charAt(0) + m.getNachname().charAt(0) + m.getGeb();

				if (m.getName().equals(name) && m.getNachname().equals(nachname) && id.equals(idInput)) {

					MitarbeiterDB.loeschenMitarbeiter(idInput);
					
					tfName.setText("");
					tfNachname.setText("");
					tfID.setText("");
					
					JOptionPane.showMessageDialog(null, "Der Mitarbieter "+name+" "+ nachname+" wurde geloescht!");

				}
			}
		}

	}

}