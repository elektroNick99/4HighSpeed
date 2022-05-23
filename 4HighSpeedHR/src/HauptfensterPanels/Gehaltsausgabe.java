package HauptfensterPanels;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import de.fourHighSpeedHR.database.MitarbeiterDB;
import de.fourHighSpeedHR.objects.Mitarbeiter;

import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.ArrayList;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;

public class Gehaltsausgabe extends JPanel {
	private static JTextField mitarbeiterGehaltName;
	private static JTextField mitarbeiterGehaltNachname;
	private static JTextField mitarbeiterGehaltNummer;
	private static JTextField mitarbeiterGehaltMonate;
	private static JLabel lblMitarbeiter;
	private static Integer gehalt;
	private static 	JLabel lblListeAusgeben ;
	private static JLabel lblGehaltAusgeben;
	private static String mitarbeiterDaten;
	
	/**
	 * Create the panel.
	 */
	public Gehaltsausgabe() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{112, 31, 269};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 29, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
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
		
		JLabel lblGesamGehaltAusgabe = new JLabel("Gehalt aller Mitarbeiter anhand angegebenen Monaten");
		GridBagConstraints gbc_lblGesamGehaltAusgabe = new GridBagConstraints();
		gbc_lblGesamGehaltAusgabe.insets = new Insets(0, 0, 5, 0);
		gbc_lblGesamGehaltAusgabe.gridx = 2;
		gbc_lblGesamGehaltAusgabe.gridy = 1;
		add(lblGesamGehaltAusgabe, gbc_lblGesamGehaltAusgabe);
		
		JLabel lblMitarbeiterGehaltName = new JLabel("Name*");
		lblMitarbeiterGehaltName.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMitarbeiterGehaltName = new GridBagConstraints();
		gbc_lblMitarbeiterGehaltName.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterGehaltName.insets = new Insets(0, 0, 5, 5);
		gbc_lblMitarbeiterGehaltName.gridx = 0;
		gbc_lblMitarbeiterGehaltName.gridy = 2;
		add(lblMitarbeiterGehaltName, gbc_lblMitarbeiterGehaltName);
	    
	    JScrollPane scrollPane = new JScrollPane();
	    GridBagConstraints gbc_scrollPane = new GridBagConstraints();
	    gbc_scrollPane.fill = GridBagConstraints.BOTH;
	    gbc_scrollPane.gridheight = 11;
	    gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
	    gbc_scrollPane.gridx = 2;
	    gbc_scrollPane.gridy = 3;
	    add(scrollPane, gbc_scrollPane);
	    
	    lblListeAusgeben = new JLabel("a");
	    scrollPane.setViewportView(lblListeAusgeben);
	    lblListeAusgeben.setHorizontalAlignment(SwingConstants.LEFT);
	    
	    mitarbeiterGehaltName = new JTextField();
	    mitarbeiterGehaltName.setFont(new Font("Arial", Font.PLAIN, 12));
	    mitarbeiterGehaltName.addKeyListener(new KeyAdapter() {
	         public void keyTyped(KeyEvent e) {
	             char c = e.getKeyChar();
	             if(!(Character.isAlphabetic(c) || (c==KeyEvent.VK_SPACE) || c==KeyEvent.VK_DELETE || c==KeyEvent.VK_MINUS)) {
	                 e.consume();  // ignore the event if it's not an alphabet
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
	             if(!(Character.isAlphabetic(c) || (c==KeyEvent.VK_SPACE) || c==KeyEvent.VK_DELETE || c==KeyEvent.VK_MINUS)) {
	                 e.consume();  // ignore the event if it's not an alphabet
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
		
		JButton mitarbeiterSuchen = new JButton("Suchen");
		mitarbeiterSuchen.addActionListener( e -> maSuchen());
		mitarbeiterSuchen.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_mitarbeiterSuchen = new GridBagConstraints();
		gbc_mitarbeiterSuchen.fill = GridBagConstraints.HORIZONTAL;
		gbc_mitarbeiterSuchen.insets = new Insets(0, 0, 5, 5);
		gbc_mitarbeiterSuchen.gridx = 0;
		gbc_mitarbeiterSuchen.gridy = 8;
		add(mitarbeiterSuchen, gbc_mitarbeiterSuchen);
		
		lblMitarbeiter = new JLabel("");
		GridBagConstraints gbc_lblMitarbeiter = new GridBagConstraints();
		gbc_lblMitarbeiter.insets = new Insets(0, 0, 5, 5);
		gbc_lblMitarbeiter.gridx = 1;
		gbc_lblMitarbeiter.gridy = 9;
		add(lblMitarbeiter, gbc_lblMitarbeiter);
		
		JLabel lblMitarbeiterGehaltMonate = new JLabel("Monate der Berechnung*");
		lblMitarbeiterGehaltMonate.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMitarbeiterGehaltMonate = new GridBagConstraints();
		gbc_lblMitarbeiterGehaltMonate.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiterGehaltMonate.insets = new Insets(0, 0, 5, 5);
		gbc_lblMitarbeiterGehaltMonate.gridx = 0;
		gbc_lblMitarbeiterGehaltMonate.gridy = 10;
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
		gbc_mitarbeiterGehaltMonate.gridy = 11;
		add(mitarbeiterGehaltMonate, gbc_mitarbeiterGehaltMonate);
		mitarbeiterGehaltMonate.setColumns(10);
		
		JButton gehaltAusgebenPDF = new JButton("Gehalt ausgeben PDF");
		gehaltAusgebenPDF.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_gehaltAusgebenPDF = new GridBagConstraints();
		gbc_gehaltAusgebenPDF.fill = GridBagConstraints.HORIZONTAL;
		gbc_gehaltAusgebenPDF.insets = new Insets(0, 0, 5, 5);
		gbc_gehaltAusgebenPDF.gridx = 0;
		gbc_gehaltAusgebenPDF.gridy = 12;
		add(gehaltAusgebenPDF, gbc_gehaltAusgebenPDF);
		
		JButton gehaltAusgeben = new JButton("Gehalt ausgeben");
		gehaltAusgeben.addActionListener( e -> gehaltRechnen());
		gehaltAusgeben.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_gehaltAusgeben = new GridBagConstraints();
		gbc_gehaltAusgeben.fill = GridBagConstraints.HORIZONTAL;
		gbc_gehaltAusgeben.insets = new Insets(0, 0, 5, 5);
		gbc_gehaltAusgeben.gridx = 0;
		gbc_gehaltAusgeben.gridy = 13;
		add(gehaltAusgeben, gbc_gehaltAusgeben);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.insets = new Insets(0, 0, 0, 5);
		gbc_scrollPane_1.gridx = 0;
		gbc_scrollPane_1.gridy = 14;
		add(scrollPane_1, gbc_scrollPane_1);
		
		JPanel panel = new JPanel();
		scrollPane_1.setViewportView(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{112, 0};
		gbl_panel.rowHeights = new int[]{29, 51, 0};
		gbl_panel.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		lblGehaltAusgeben = new JLabel("");
		GridBagConstraints gbc_lblGehaltAusgeben = new GridBagConstraints();
		gbc_lblGehaltAusgeben.gridheight = 2;
		gbc_lblGehaltAusgeben.insets = new Insets(0, 0, 5, 0);
		gbc_lblGehaltAusgeben.gridx = 0;
		gbc_lblGehaltAusgeben.gridy = 0;
		panel.add(lblGehaltAusgeben, gbc_lblGehaltAusgeben);
		
		JButton btnGesamtGehalt = new JButton("Gesamt Gehalt");
		btnGesamtGehalt.addActionListener( e -> gehaltAllerMitarbeiterRechnen());
		GridBagConstraints gbc_btnGesamtGehalt = new GridBagConstraints();
		gbc_btnGesamtGehalt.gridx = 2;
		gbc_btnGesamtGehalt.gridy = 14;
		add(btnGesamtGehalt, gbc_btnGesamtGehalt);
		
	
	}
	public static void maSuchen() {


		String nameInput = mitarbeiterGehaltName.getText();
		String nachnameInput = mitarbeiterGehaltNachname.getText();
		String idInput = mitarbeiterGehaltNummer.getText();
		
		

		if (nameInput.equals("") || nameInput.equals("") || idInput.equals("")) {

			JOptionPane.showMessageDialog(null, "Deine Eingabe ist nicht vollstaendig. Bitte aendere deine Eingabe");

		} else {
			ArrayList<Mitarbeiter> mitarbeiter = MitarbeiterDB.ausgebenMitarbeiterAlle();

			for (int i = 0; i < mitarbeiter.size(); i++) {

				Mitarbeiter m = mitarbeiter.get(i);
				String id = "" + m.getName().charAt(0) + m.getNachname().charAt(0) + m.getGeb();

				if (m.getName().equals(nameInput) && m.getNachname().equals(nachnameInput) && id.equals(idInput)) {
					
					lblGehaltAusgeben.setText( ""+ m.getName() +" " + m.getNachname()+ ": " +m.getGehalt() );
					gehalt= m.getGehalt();
					mitarbeiterDaten = lblGehaltAusgeben.getText();
					break;

				}
			}
		}

	}
	
	public static void gehaltRechnen() {
		
		Integer monate = 0;
		monate=Integer.parseInt(mitarbeiterGehaltMonate.getText());
		
		
		if (monate==0) {
			JOptionPane.showMessageDialog(null, "Geben Sie bitte der Anzahl der Monaten");
			
		}else {
			String label = "Fuer "+ monate + " Monate wurde berechnet: "+ monate*gehalt;
			lblGehaltAusgeben.setText("<html><body>"+ mitarbeiterDaten+ "<br>"+  label +"</body></html>");
			
		}
	
		
		
	}
	
	public static void gehaltAllerMitarbeiterRechnen() {
		StringBuilder result = new StringBuilder();
		
		Integer monate = Integer.parseInt(mitarbeiterGehaltMonate.getText());
		String text = mitarbeiterGehaltMonate.getText();
		Integer allerGehalt=0;
		
		if (text.equals("")) {
			JOptionPane.showMessageDialog(null, "Geben Sie bitte die Anzahl der Monaten");
			
		}else {
			ArrayList<Mitarbeiter> mitarbeiter = MitarbeiterDB.ausgebenMitarbeiterAlle();
			
			for (int i = 0; i < mitarbeiter.size(); i++) {
				Mitarbeiter m = mitarbeiter.get(i);
				result.append(i+1+". Mitarbeiter: " +m.getName() + " " + m.getNachname() + ": "+ m.getGehalt()+ "<br>");				
				 allerGehalt= allerGehalt+ mitarbeiter.get(i).getGehalt()*monate;
							
			}
			lblListeAusgeben.setText( "<html><body>"+ result.toString() + "<br> <hr>"+  "Das Gehalt aller Mitarbeiter wurde f�r "+ monate + " Monate berechnet: "+ allerGehalt +"</body></html>" );		

		}
	
		
		
	}

}