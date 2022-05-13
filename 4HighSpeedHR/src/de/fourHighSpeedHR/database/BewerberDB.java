package de.fourHighSpeedHR.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import de.fourHighSpeedHR.objects.Bewerber;

public class BewerberDB {

	public static ArrayList<Bewerber> ausgebenBewerberAlle(String[] args){
		
		ArrayList<Bewerber> bewerberliste = new ArrayList<>();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://3.69.96.96:3306/db5", "db5", args[0]);
			Statement s = c.createStatement();

			ResultSet rs = s.executeQuery("SELECT * FROM Bewerber");
			while (rs.next()) {
				bewerberliste.add(new Bewerber(rs.getString("Name"), rs.getString("Nachname"), rs.getString("Strasse"), Integer.valueOf(rs.getString("Hausnummer")), 
						rs.getString("Ort"), Integer.valueOf(rs.getString("Postleitzahl")), Long.valueOf(rs.getString("Telefonnummer")), rs.getString("Notizen")));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bewerberliste;
	}
}
