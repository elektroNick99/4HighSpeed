package de.fourHighSpeedHR.GUI;

import de.fourHighSpeedHR.objects.Passworte;

public class Main {

	public static void main(String[] args) {
		
		Passworte passworte = new Passworte();
		
		Login login = new Login(passworte.getLogin());
	}

}
