package de.fourHighSpeedHR.GUI;

/**
 * Die Klasse startet das gesmate Programm
 */
public class Main {

	public static String[] args2;

	/**
	 * Die Methode startet das Programm
	 * 
	 * @param args enthaelt das Passwort für den Datenbankzugriff
	 */
	public static void main(String[] args) {

		args2 = args;
		Login login = new Login();
	}

}
