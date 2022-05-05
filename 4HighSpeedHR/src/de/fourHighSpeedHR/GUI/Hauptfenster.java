package de.fourHighSpeedHR.GUI;

import javax.swing.*;

public class Hauptfenster {
	
	private JFrame frame;
	JLabel label = new JLabel("Hauptfenster", SwingConstants.CENTER);
	
	Hauptfenster(){
		
		frame = new JFrame();
		frame.setTitle("4HighSpeed HR");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setSize(300, 200);
		frame.setVisible(true);
		frame.add(label);

	}

}
