package de.fourHighSpeedHR.objects;


/**
 * Die Klasse der Bewerberobjekte
 */
public class Bewerber {

	private String name;
	private String nachname;
	private String strasse;
	private int hnr;
	private String ort;
	private int plz;
	private long tel;
	private String notizen;
	private String geb;
	private String status;

	public Bewerber(String name, String nachname, String strasse, int hnr, String ort, int plz, long tel,
			String notizen, String geb, String status) {
		this.name = name;
		this.nachname = nachname;
		this.strasse = strasse;
		this.hnr = hnr;
		this.ort = ort;
		this.plz = plz;
		this.tel = tel;
		this.notizen = notizen;
		this.geb = geb;
		this.status = status;
	}

	/**
	 * Methode zum schreiben der Bewerberobjekte
	 */
	@Override
	public String toString() {
		return "Bewerber [name=" + name + ", nachname=" + nachname + ", strasse=" + strasse + ", hnr=" + hnr + ", ort="
				+ ort + ", plz=" + plz + ", tel=" + tel + ", notizen=" + notizen + "]";
	}

	/**
	 * Methode um den Geburtstag eines Bewerbers zu bekommen
	 * @return Geburtstag des Bewerbers
	 */
	public String getGeb() {
		return geb;
	}

	/**
	 * Methode um den Geburtstag eines Bewerbers zu aendern
	 * @param geb Geburtstag des Bewerbers
	 */
	public void setGeb(String geb) {
		this.geb = geb;
	}

	/**
	 * Mehtode um den Name des Bewerbers zu bekommen
	 * @return Name des Bewerbers
	 */
	public String getName() {
		return name;
	}

	/**
	 * Mehtode um den Name des Bewerbers zu aendern
	 * @param name  Name des Bewerbers
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Mehtode um den Nachname des Bewerbers zu bekommen
	 * @return Nachname des Bewerbers
	 */
	public String getNachname() {
		return nachname;
	}

	/**
	 * Methode um den Nachname des Bewerbers zu aendern
	 * @param nachname Nachname des Bewerbers
	 */
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	/**
	 * Methode um die Strasse des Bewerbers zu bekommen
	 * @return Strasse des Bewerbers
	 */
	public String getStrasse() {
		return strasse;
	}

	/**
	 * Methode um die Strasse des Bewerbers zu aendern
	 * @param strasse Strasse des Bewerbers
	 */
	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	/**
	 * Methode um die Hnr des Bewerbers zu bekommen
	 * @return Hnr des Bewerbers
	 */
	public int getHnr() {
		return hnr;
	}

	/**
	 * Methode um die Hnr des Bewerbers zu aendern
	 * @param hnr Hnr des Bewerbers
	 */
	public void setHnr(int hnr) {
		this.hnr = hnr;
	}

	/**
	 * Methode um den Ort des Bewerbers zu bekommen
	 * @return Ort des Bewerbers
	 */
	public String getOrt() {
		return ort;
	}

	/**
	 * Methode um den Ort des Bewerbers zu aendern
	 * @param ort Ort des Bewerbers
	 */
	public void setOrt(String ort) {
		this.ort = ort;
	}

	/**
	 * Methode um die Plz des Bewerbers zu bekommen
	 * @return Plz des Bewerbers
	 */
	public int getPlz() {
		return plz;
	}

	/**
	 * Methode um die Plz des Bewerbers zu aendern
	 * @param plz Plz des Bewerbers
	 */
	public void setPlz(int plz) {
		this.plz = plz;
	}

	/**
	 * Methode um die Tel des Bewerbers zu bekommen
	 * @return Tel des Bewerbers
	 */
	public long getTel() {
		return tel;
	}

	/**
	 * Methode um die Tel des Bewerbers zu aendern
	 * @param tel Tel des Bewerbers
	 */
	public void setTel(long tel) {
		this.tel = tel;
	}

	/**
	 * Methode um die Notizen des Bewerbers zu bekommen
	 * @return Notizen des Bewerbers
	 */
	public String getNotizen() {
		return notizen;
	}

	/**
	 * Methode um die Notizen des Bewerbers zu aendern
	 * @param notizen Notizen des Bewerbers
	 */
	public void setNotizen(String notizen) {
		this.notizen = notizen;
	}
	
	/**
	 * Methode um den Status des Bewerbers zu bekommen
	 * @return Status des Bewerbers
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Methode um den Status des Bewerbers zu aendern
	 * @param status Status des Bewerbers
	 */
	public void setStatus(String status) {
		this.status = status;
	}

}
