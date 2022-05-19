package de.fourHighSpeedHR.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import de.fourHighSpeedHR.objects.Mitarbeiter;

public class MitarbeiterDB {

	public static ArrayList<Mitarbeiter> ausgebenMitarbeiterAlle(String[] args) {

		ArrayList<Mitarbeiter> mitarbeiterliste = new ArrayList<>();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://3.69.96.96:3306/db5", "db5", args[0]);
			Statement s = c.createStatement();

			ResultSet rs = s.executeQuery("SELECT * FROM Mitarbeiter");
			while (rs.next()) {
				mitarbeiterliste.add(new Mitarbeiter(rs.getString("Name"), rs.getString("Nachname"),
						rs.getString("Strasse"), Integer.valueOf(rs.getString("Hausnummer")), rs.getString("Ort"),
						Integer.valueOf(rs.getString("Postleitzahl")), Long.valueOf(rs.getString("Telefonnummer")),
						rs.getString("Abteilung"), Integer.valueOf(rs.getString("Gehalt")),
						rs.getString("Geburtstag")));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mitarbeiterliste;
	}

	public static void hinzufuegenMitarbeiter(Mitarbeiter ma, String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://3.69.96.96:3306/db5", "db5", args[0]);

			String name = ma.getName();
			String nachname = ma.getNachname();
			String strasse = ma.getStrasse();
			int hnr = ma.getHnr();
			String ort = ma.getOrt();
			int plz = ma.getPlz();
			long tel = ma.getTel();
			String abteilung = ma.getAbteilung();
			int gehalt = ma.getGehalt();
			String geburtstag = ma.getGeb();

			String id = name.charAt(1) + "" + nachname.charAt(1) + "" + geburtstag;

			String sql = "INSERT INTO Mitarbeiter VALUES (?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement stm = c.prepareStatement(sql);
			stm.setString(1, id);
			stm.setString(2, name);
			stm.setString(3, nachname);
			stm.setString(4, strasse);
			stm.setString(5, Integer.valueOf(hnr).toString());
			stm.setString(6, ort);
			stm.setString(7, Integer.valueOf(plz).toString());
			stm.setString(8, Long.valueOf(tel).toString());
			stm.setString(9, abteilung);
			stm.setString(10, Integer.valueOf(gehalt).toString());
			stm.setString(11, geburtstag);
			stm.executeUpdate();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}