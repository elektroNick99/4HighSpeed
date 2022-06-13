package de.fourHighSpeedHR.objects;

/**
 * Enums der Gehaltsgruppen, die die jeweiligen Gehaelter enthalten
 */
public enum Gehaltsgruppe {

	GEHALTSGRUPPE_1(1500), GEHALTSGRUPPE_2(3000), GEHALTSGRUPPE_3(5000), GEHALTSGRUPPE_4(8000), GEHALTSGRUPPE_5(10000);

	public final int gehalt;

	Gehaltsgruppe(int gehalt) {
		this.gehalt = gehalt;
	}
}
