package de.fourHighSpeedHR.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import de.fourHighSpeedHR.GUI.Main;
import de.fourHighSpeedHR.objects.Bewerber;

public class BewerberDB {

	static String[] args = Main.args2;

	public static ArrayList<Bewerber> ausgebenBewerberAlle() {

		ArrayList<Bewerber> bewerberliste = new ArrayList<>();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://3.69.96.96:3306/db5", "db5", args[0]);
			Statement s = c.createStatement();

			ResultSet rs = s.executeQuery("SELECT * FROM Bewerber");
			while (rs.next()) {
				bewerberliste.add(new Bewerber(rs.getString("Name"), rs.getString("Nachname"), rs.getString("Strasse"),
						Integer.valueOf(rs.getString("Hausnummer")), rs.getString("Ort"),
						Integer.valueOf(rs.getString("Postleitzahl")), Long.valueOf(rs.getString("Telefonnummer")),
						rs.getString("Notizen"), rs.getString("Geburtstag"), rs.getString("Status")));
			}
			
			c.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bewerberliste;
	}

	public static void hinzufuegenBewerber(Bewerber b) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://3.69.96.96:3306/db5", "db5", args[0]);

			String name = b.getName();
			String nachname = b.getNachname();
			String strasse = b.getStrasse();
			int hnr = b.getHnr();
			String ort = b.getOrt();
			int plz = b.getPlz();
			long tel = b.getTel();
			String geburtstag = b.getGeb();
			String notizen = b.getNotizen();
			String status = b.getStatus();

			String id = name.charAt(0) + "" + nachname.charAt(0) + "" + geburtstag;

			String sql = "INSERT INTO Bewerber VALUES (?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement stm = c.prepareStatement(sql);
			stm.setString(1, id);
			stm.setString(2, name);
			stm.setString(3, nachname);
			stm.setString(4, strasse);
			stm.setString(5, Integer.valueOf(hnr).toString());
			stm.setString(6, ort);
			stm.setString(7, Integer.valueOf(plz).toString());
			stm.setString(8, Long.valueOf(tel).toString());
			stm.setString(9, notizen);
			stm.setString(10, geburtstag);
			stm.setString(11, status);
			stm.executeUpdate();

			c.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static void loeschenBewerber(String id) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://3.69.96.96:3306/db5", "db5", args[0]);

			String sql = "DELETE FROM Bewerber WHERE id = ?";
			PreparedStatement stm = c.prepareStatement(sql);
			stm.setString(1, id);
			stm.executeUpdate();
			
			c.close();

			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
	}
	
	public static void aendernNotizen(String notizen, String idBewerber) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://3.69.96.96:3306/db5", "db5", args[0]);

			String sql = "UPDATE Bewerber SET Notizen = ? WHERE id = ?";
			PreparedStatement stm = c.prepareStatement(sql);
			stm.setString(1, notizen);
			stm.setString(2, idBewerber);
			stm.executeUpdate();
			
			c.close();

			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
	}
	
	public static void aendernStatus(String status, String idBewerber) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://3.69.96.96:3306/db5", "db5", args[0]);

			String sql = "UPDATE Bewerber SET Status = ? WHERE id = ?";
			PreparedStatement stm = c.prepareStatement(sql);
			stm.setString(1, status);
			stm.setString(2, idBewerber);
			stm.executeUpdate();
			
			c.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
	}
}
