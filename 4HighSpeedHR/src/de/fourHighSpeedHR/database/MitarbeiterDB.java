package de.fourHighSpeedHR.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import de.fourHighSpeedHR.objects.Mitarbeiter;

public class MitarbeiterDB {

	public static ArrayList<Mitarbeiter> ausgebenMitarbeiterAlle(String[] args){
		
		ArrayList<Mitarbeiter> mitarbeiterliste = new ArrayList<>();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://3.69.96.96:3306/db5", "db5", args[0]);
			Statement s = c.createStatement();

			ResultSet rs = s.executeQuery("SELECT * FROM Mitarbeiter");
			while (rs.next()) {
				mitarbeiterliste.add(new Mitarbeiter(rs.getString("Name"), rs.getString("Nachname"), rs.getString("Strasse"), Integer.valueOf(rs.getString("Hausnummer")), 
						rs.getString("Ort"), Integer.valueOf(rs.getString("Postleitzahl")), Long.valueOf(rs.getString("Telefonnummer")), rs.getString("Abteilung"), Integer.valueOf(rs.getString("Gehalt"))));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mitarbeiterliste;
	}
}