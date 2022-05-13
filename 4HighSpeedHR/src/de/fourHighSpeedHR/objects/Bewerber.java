package de.fourHighSpeedHR.objects;

public class Bewerber {

	private String name;
	private String nachname;
	private String strasse;
	private int hnr;
	private String ort;
	private int plz;
	private long tel;
	private String notizen;
	
	public Bewerber(String name, String nachname, String strasse, int hnr, String ort, int plz, long tel,
			String notizen) {
		this.name = name;
		this.nachname = nachname;
		this.strasse = strasse;
		this.hnr = hnr;
		this.ort = ort;
		this.plz = plz;
		this.tel = tel;
		this.notizen = notizen;
	}

	@Override
	public String toString() {
		return "Bewerber [name=" + name + ", nachname=" + nachname + ", strasse=" + strasse + ", hnr=" + hnr + ", ort="
				+ ort + ", plz=" + plz + ", tel=" + tel + ", notizen=" + notizen + "]";
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

	public String getNotizen() {
		return notizen;
	}

	public void setNotizen(String notizen) {
		this.notizen = notizen;
	}	
}
