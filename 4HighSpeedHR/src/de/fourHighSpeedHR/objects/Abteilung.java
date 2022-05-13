package de.fourHighSpeedHR.objects;

import java.util.ArrayList;

public class Abteilung {
	
	private ArrayList<Mitarbeiter> mitarbeiter;
	private String name;
	
	public Abteilung(String name) {
		
		mitarbeiter = new ArrayList<>();
		this.name = name;
	}

	public ArrayList<Mitarbeiter> getMitarbeiter() {
		return mitarbeiter;
	}

	public void setMitarbeiter(ArrayList<Mitarbeiter> mitarbeiter) {
		this.mitarbeiter = mitarbeiter;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
