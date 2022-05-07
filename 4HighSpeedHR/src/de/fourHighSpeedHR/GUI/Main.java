package de.fourHighSpeedHR.GUI;

import de.fourHighSpeedHR.objects.Passworte;

public class Main {

	public static void main(String[] args) {
		
		Passworte passworte = new Passworte();
	
		String[] args2 = args;
		
		Login login = new Login(args2);
	}

}
