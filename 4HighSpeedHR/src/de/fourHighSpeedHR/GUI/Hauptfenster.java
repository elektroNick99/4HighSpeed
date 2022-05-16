package de.fourHighSpeedHR.GUI;

import java.awt.CardLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import java.util.*;
import javax.swing.*;
import javax.swing.border.Border;

import HauptfensterPanels.BewerberAnlegen;
import HauptfensterPanels.BewerberAusgeben;
import HauptfensterPanels.BewerberLoeschen;
import HauptfensterPanels.Bewerbungsgespraech;
import HauptfensterPanels.Gehaltsausgabe;
import HauptfensterPanels.MitarbeiterAendern;
import HauptfensterPanels.MitarbeiterAnlegen;
import HauptfensterPanels.MitarbeiterAusgeben;
import HauptfensterPanels.MitarbeiterLoeschen;
import java.awt.BorderLayout;

public class Hauptfenster {
	
	private static JPanel panel_2;
	private static JPanel bAnlegen, bAusgeben, bLoeschen, bGespraech, gehaltsausgabe, mAendern, mAnlegen, mLoeschen, mAusgeben;
	private static JLabel lblMitarbeiter;
	private static JButton btnMitarbeiterAnlegen;
	private static JButton btnMitarbeiterAusgeben;
	private static JButton btnMitarbeiterLoeschen;
	private static JButton btnMitarbeiterAendern;
	private static JLabel lblBewerber;
	private static JButton btnBewerberAnlegen;
	private static JButton btnBewerberAusgeben;
	private static JButton btnBewerberLoeschen;
	private static JButton btnGespraech;
	private static JLabel lblRechner;
	private static JButton btnGehaltRechner;
	static String [] args;
	private JPanel panel;
	private JLabel l1;
	private JLabel title;
	private JButton Abmelden;
	private JLabel Datum;
	
	Hauptfenster(String [] args) {
		
		this.args = args;
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 700);
		frame.setTitle("4HighSpeed HR");
		
		ImageIcon logo = new ImageIcon("logo.png");
		frame.setIconImage(logo.getImage());
		
		JPanel contentPanel = new JPanel();
		Border padding = BorderFactory.createEmptyBorder(25, 25, 25, 25);
		contentPanel.setBorder(padding);
		frame.setContentPane(contentPanel);
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 200, 856, 25, 0};
		gridBagLayout.rowHeights = new int[]{140, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
	
		GridBagConstraints gbc_l1 = new GridBagConstraints();
		gbc_l1.insets = new Insets(0, 0, 5, 5);
		gbc_l1.gridx = 1;
		gbc_l1.gridy = 0;
		
		panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 2;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 0;
		contentPanel.add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		ImageIcon icon = new ImageIcon ("C:\\Users\\cateh\\OneDrive\\Desktop\\uni\\firedfive.jpeg");
		l1 = new JLabel(icon);
		GridBagConstraints gbc_title_1_1 = new GridBagConstraints();
		gbc_title_1_1.anchor = GridBagConstraints.WEST;
		gbc_title_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_title_1_1.gridx = 0;
		gbc_title_1_1.gridy = 0;
		panel.add(l1, gbc_title_1_1);
		
		title = new JLabel("S4-HR");
		title.setFont(new Font("Arial", Font.BOLD, 50));
		GridBagConstraints gbc_title_1_11 = new GridBagConstraints();
		gbc_title_1_11.anchor = GridBagConstraints.EAST;
		gbc_title_1_11.insets = new Insets(0, 0, 5, 5);
		gbc_title_1_11.gridx = 1;
		gbc_title_1_11.gridy = 0;
		panel.add(title, gbc_title_1_11);
		
		
		
		
		Abmelden = new JButton("Abmelden");
		GridBagConstraints gbc_Abmelden = new GridBagConstraints();
		gbc_Abmelden.anchor = GridBagConstraints.NORTHEAST;
		gbc_Abmelden.insets = new Insets(0, 0, 5, 5);
		gbc_Abmelden.gridx = 2;
		gbc_Abmelden.gridy = 0;
		panel.add(Abmelden, gbc_Abmelden);
		Abmelden.setFont(new Font("Arial", Font.BOLD, 12));
		
		String date = String.format("%1$td.%1$tm.%1$tY - %1$tH:%1$tM:%1$tS", new Date());
		Datum = new JLabel(date);
		Datum.setFont(new Font("Arial", Font.BOLD, 20));
		GridBagConstraints gbc_Datum = new GridBagConstraints();
		gbc_Datum.anchor = GridBagConstraints.NORTHEAST;
		gbc_Datum.insets = new Insets(0, 0, 0, 5);
		gbc_Datum.gridx = 2;
		gbc_Datum.gridy = 1;
		panel.add(Datum, gbc_Datum);
	
		
	     

		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.weighty = 1.0;
		gbc_panel_1.weightx = 0.1;
		gbc_panel_1.insets = new Insets(0, 0, 0, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 1;
		frame.getContentPane().add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		lblMitarbeiter = new JLabel("Mitarbeiter");
		lblMitarbeiter.setFont(new Font("Arial", Font.BOLD, 20));
		GridBagConstraints gbc_lblMitarbeiter = new GridBagConstraints();
		gbc_lblMitarbeiter.anchor = GridBagConstraints.WEST;
		gbc_lblMitarbeiter.insets = new Insets(0, 0, 5, 0);
		gbc_lblMitarbeiter.gridx = 0;
		gbc_lblMitarbeiter.gridy = 0;
		panel_1.add(lblMitarbeiter, gbc_lblMitarbeiter);
		
		btnMitarbeiterAnlegen = new JButton("Anlegen");
		btnMitarbeiterAnlegen.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_btnMitarbeiterAnlegen = new GridBagConstraints();
		gbc_btnMitarbeiterAnlegen.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnMitarbeiterAnlegen.insets = new Insets(0, 0, 5, 0);
		gbc_btnMitarbeiterAnlegen.gridx = 0;
		gbc_btnMitarbeiterAnlegen.gridy = 1;
		panel_1.add(btnMitarbeiterAnlegen, gbc_btnMitarbeiterAnlegen);
		btnMitarbeiterAnlegen.addActionListener(e -> mAnlegenShow());
		
		btnMitarbeiterAusgeben = new JButton("Ausgeben");
		btnMitarbeiterAusgeben.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_btnMitarbeiterAusgeben = new GridBagConstraints();
		gbc_btnMitarbeiterAusgeben.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnMitarbeiterAusgeben.insets = new Insets(0, 0, 5, 0);
		gbc_btnMitarbeiterAusgeben.gridx = 0;
		gbc_btnMitarbeiterAusgeben.gridy = 2;
		panel_1.add(btnMitarbeiterAusgeben, gbc_btnMitarbeiterAusgeben);
		btnMitarbeiterAusgeben.addActionListener(e -> mAusgebenShow());
		
		btnMitarbeiterLoeschen = new JButton("Loeschen");
		btnMitarbeiterLoeschen.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_btnMitarbeiterLoeschen = new GridBagConstraints();
		gbc_btnMitarbeiterLoeschen.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnMitarbeiterLoeschen.insets = new Insets(0, 0, 5, 0);
		gbc_btnMitarbeiterLoeschen.gridx = 0;
		gbc_btnMitarbeiterLoeschen.gridy = 3;
		panel_1.add(btnMitarbeiterLoeschen, gbc_btnMitarbeiterLoeschen);
		btnMitarbeiterLoeschen.addActionListener(e -> mLoeschenShow());
		
		btnMitarbeiterAendern = new JButton("Aendern");
		btnMitarbeiterAendern.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_btnMitarbeiterAendern = new GridBagConstraints();
		gbc_btnMitarbeiterAendern.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnMitarbeiterAendern.insets = new Insets(0, 0, 5, 0);
		gbc_btnMitarbeiterAendern.gridx = 0;
		gbc_btnMitarbeiterAendern.gridy = 4;
		panel_1.add(btnMitarbeiterAendern, gbc_btnMitarbeiterAendern);
		btnMitarbeiterAendern.addActionListener(e -> mAendernShow());
		
		lblBewerber = new JLabel("Bewerber");
		lblBewerber.setFont(new Font("Arial", Font.BOLD, 20));
		GridBagConstraints gbc_lblBewerber = new GridBagConstraints();
		gbc_lblBewerber.anchor = GridBagConstraints.WEST;
		gbc_lblBewerber.insets = new Insets(0, 0, 5, 0);
		gbc_lblBewerber.gridx = 0;
		gbc_lblBewerber.gridy = 5;
		panel_1.add(lblBewerber, gbc_lblBewerber);
		
		btnBewerberAnlegen = new JButton("Anlegen");
		btnBewerberAnlegen.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_btnBewerberAnlegen = new GridBagConstraints();
		gbc_btnBewerberAnlegen.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnBewerberAnlegen.insets = new Insets(0, 0, 5, 0);
		gbc_btnBewerberAnlegen.gridx = 0;
		gbc_btnBewerberAnlegen.gridy = 6;
		panel_1.add(btnBewerberAnlegen, gbc_btnBewerberAnlegen);
		btnBewerberAnlegen.addActionListener(e -> bAnlegenShow());
		
		btnBewerberAusgeben = new JButton("Ausgeben");
		btnBewerberAusgeben.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_btnBewerberAusgeben = new GridBagConstraints();
		gbc_btnBewerberAusgeben.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnBewerberAusgeben.insets = new Insets(0, 0, 5, 0);
		gbc_btnBewerberAusgeben.gridx = 0;
		gbc_btnBewerberAusgeben.gridy = 7;
		panel_1.add(btnBewerberAusgeben, gbc_btnBewerberAusgeben);
		btnBewerberAusgeben.addActionListener(e -> bAusgebenShow());
		
		btnBewerberLoeschen = new JButton("Loeschen");
		btnBewerberLoeschen.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_btnBewerberLoeschen = new GridBagConstraints();
		gbc_btnBewerberLoeschen.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnBewerberLoeschen.insets = new Insets(0, 0, 5, 0);
		gbc_btnBewerberLoeschen.gridx = 0;
		gbc_btnBewerberLoeschen.gridy = 8;
		panel_1.add(btnBewerberLoeschen, gbc_btnBewerberLoeschen);
		btnBewerberLoeschen.addActionListener(e -> bLoeschenShow());
		
		btnGespraech = new JButton("Bewerbungsgespraech");
		btnGespraech.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_btnGespraech = new GridBagConstraints();
		gbc_btnGespraech.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnGespraech.insets = new Insets(0, 0, 5, 0);
		gbc_btnGespraech.gridx = 0;
		gbc_btnGespraech.gridy = 9;
		panel_1.add(btnGespraech, gbc_btnGespraech);
		btnGespraech.addActionListener(e -> bGespraechShow());
		
		lblRechner = new JLabel("Rechner");
		lblRechner.setFont(new Font("Arial", Font.BOLD, 20));
		GridBagConstraints gbc_lblRechner = new GridBagConstraints();
		gbc_lblRechner.anchor = GridBagConstraints.WEST;
		gbc_lblRechner.insets = new Insets(0, 0, 5, 0);
		gbc_lblRechner.gridx = 0;
		gbc_lblRechner.gridy = 10;
		panel_1.add(lblRechner, gbc_lblRechner);
		
		btnGehaltRechner = new JButton("Gehalt");
		btnGehaltRechner.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_btnGehaltRechner = new GridBagConstraints();
		gbc_btnGehaltRechner.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnGehaltRechner.gridx = 0;
		gbc_btnGehaltRechner.gridy = 11;
		panel_1.add(btnGehaltRechner, gbc_btnGehaltRechner);
		btnGehaltRechner.addActionListener(e -> gehaltsausgabeShow());
		
		panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.insets = new Insets(0, 0, 0, 5);
		gbc_panel_2.weighty = 1.0;
		gbc_panel_2.weightx = 0.9;
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 2;
		gbc_panel_2.gridy = 1;
		frame.getContentPane().add(panel_2, gbc_panel_2);
		panel_2.setLayout(new CardLayout(0, 0));
		
		bAnlegen = new BewerberAnlegen();
		panel_2.add(bAnlegen);
		bAusgeben = new BewerberAusgeben();
		panel_2.add(bAusgeben);
		bLoeschen = new BewerberLoeschen();
		panel_2.add(bLoeschen);
		bGespraech = new Bewerbungsgespraech();
		panel_2.add(bGespraech);

		
		gehaltsausgabe = new Gehaltsausgabe();
		panel_2.add(gehaltsausgabe);

		
		mAendern = new MitarbeiterAendern();
		panel_2.add(mAendern);
		mAnlegen = new MitarbeiterAnlegen(args);
		panel_2.add(mAnlegen);
		mLoeschen = new MitarbeiterLoeschen();
		panel_2.add(mLoeschen);
		mAusgeben = new MitarbeiterAusgeben();
		panel_2.add(mAusgeben);
		
		
		frame.setVisible(true);
	}

	public static void bAnlegenShow() {
		
		bAnlegen.setVisible(true);
		bAusgeben.setVisible(false);
		bLoeschen.setVisible(false);
		bGespraech.setVisible(false);
		gehaltsausgabe.setVisible(false);
		mAendern.setVisible(false);
		mAnlegen.setVisible(false);
		mLoeschen.setVisible(false);
		mAusgeben.setVisible(false);
	}
	public static void bAusgebenShow() {
		
		bAnlegen.setVisible(false);
		bAusgeben.setVisible(true);
		bLoeschen.setVisible(false);
		bGespraech.setVisible(false);
		gehaltsausgabe.setVisible(false);
		mAendern.setVisible(false);
		mAnlegen.setVisible(false);
		mLoeschen.setVisible(false);
		mAusgeben.setVisible(false);
	}
	public static void bLoeschenShow() {
		
		bAnlegen.setVisible(false);
		bAusgeben.setVisible(false);
		bLoeschen.setVisible(true);
		bGespraech.setVisible(false);
		gehaltsausgabe.setVisible(false);
		mAendern.setVisible(false);
		mAnlegen.setVisible(false);
		mLoeschen.setVisible(false);
		mAusgeben.setVisible(false);
	}
	public static void bGespraechShow() {
		
		bAnlegen.setVisible(false);
		bAusgeben.setVisible(false);
		bLoeschen.setVisible(false);
		bGespraech.setVisible(true);
		gehaltsausgabe.setVisible(false);
		mAendern.setVisible(false);
		mAnlegen.setVisible(false);
		mLoeschen.setVisible(false);
		mAusgeben.setVisible(false);
	}
	public static void gehaltsausgabeShow() {
		
		bAnlegen.setVisible(false);
		bAusgeben.setVisible(false);
		bLoeschen.setVisible(false);
		bGespraech.setVisible(false);
		gehaltsausgabe.setVisible(true);
		mAendern.setVisible(false);
		mAnlegen.setVisible(false);
		mLoeschen.setVisible(false);
		mAusgeben.setVisible(false);
	}
	public static void mAendernShow() {
		
		bAnlegen.setVisible(false);
		bAusgeben.setVisible(false);
		bLoeschen.setVisible(false);
		bGespraech.setVisible(false);
		gehaltsausgabe.setVisible(false);
		mAendern.setVisible(true);
		mAnlegen.setVisible(false);
		mLoeschen.setVisible(false);
		mAusgeben.setVisible(false);
	}
	public static void mAnlegenShow() {
		
		bAnlegen.setVisible(false);
		bAusgeben.setVisible(false);
		bLoeschen.setVisible(false);
		bGespraech.setVisible(false);
		gehaltsausgabe.setVisible(false);
		mAendern.setVisible(false);
		mAnlegen.setVisible(true);
		mLoeschen.setVisible(false);
		mAusgeben.setVisible(false);
	}
	public static void mLoeschenShow() {
		
		bAnlegen.setVisible(false);
		bAusgeben.setVisible(false);
		bLoeschen.setVisible(false);
		bGespraech.setVisible(false);
		gehaltsausgabe.setVisible(false);
		mAendern.setVisible(false);
		mAnlegen.setVisible(false);
		mLoeschen.setVisible(true);
		mAusgeben.setVisible(false);
	}
	public static void mAusgebenShow() {
		
		bAnlegen.setVisible(false);
		bAusgeben.setVisible(false);
		bLoeschen.setVisible(false);
		bGespraech.setVisible(false);
		gehaltsausgabe.setVisible(false);
		mAendern.setVisible(false);
		mAnlegen.setVisible(false);
		mLoeschen.setVisible(false);
		mAusgeben.setVisible(true);
	}

}
