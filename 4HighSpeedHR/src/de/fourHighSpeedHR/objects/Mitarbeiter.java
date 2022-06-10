package de.fourHighSpeedHR.objects;


/**
 * Klasse der Mitarbeiterobjekte
 */
public class Mitarbeiter {
	
	private String name;
	private String nachname;
	private String strasse;
	private int hnr;
	private String ort;
	private int plz;
	private long tel;
	private String abteilung;
	private int gehalt;
	private String geb;
	private String status;
	
	public Mitarbeiter(String name, String nachname, String strasse, int hnr, String ort, int plz, long tel,
			String abteilung, int gehalt, String geb, String status) {
		this.name = name;
		this.nachname = nachname;
		this.strasse = strasse;
		this.hnr = hnr;
		this.ort = ort;
		this.plz = plz;
		this.tel = tel;
		this.abteilung = abteilung;
		this.gehalt = gehalt;
		this.geb = geb;
		this.status = status;
	}
	@Override
	public String toString() {
		return "Mitarbeiter [name=" + name + ", nachname=" + nachname + ", strasse=" + strasse + ", hnr=" + hnr
				+ ", ort=" + ort + ", plz=" + plz + ", tel=" + tel + ", abteilung=" + abteilung + ", gehalt=" + gehalt
				+ ", geb=" + geb + "]";
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public int getHnr() {
		return hnr;
	}

	public void setHnr(int hnr) {
		this.hnr = hnr;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	public int getPlz() {
		return plz;
	}

	public void setPlz(int plz) {
		this.plz = plz;
	}

	public long getTel() {
		return tel;
	}

	public void setTel(long tel) {
		this.tel = tel;
	}

	public String getAbteilung() {
		return abteilung;
	}

	public void setAbteilung(String abteilung) {
		this.abteilung = abteilung;
	}

	public int getGehalt() {
		return gehalt;
	}

	public void setGehalt(int gehalt) {
		this.gehalt = gehalt;
	}
	public String getGeb() {
		return geb;
	}
	public void setGeb(String geb) {
		this.geb = geb;
	}	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}