package de.fourHighSpeedHR.objects;

import java.util.HashMap;

public class Passworte {

	HashMap<String, String> passwortLogin = new HashMap<>();
	
	public Passworte(){
		
		passwortLogin.put("Fritz", "123456789");
		passwortLogin.put("Nicklas", "160899");
		passwortLogin.put("Luis", "150801");

	}
	
	public HashMap<String, String> getLogin() {
		return passwortLogin;
	}
}
