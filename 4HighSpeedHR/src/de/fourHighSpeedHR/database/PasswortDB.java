package de.fourHighSpeedHR.database;

import java.sql.*;
import java.util.HashMap;

import de.fourHighSpeedHR.GUI.Main;

public class PasswortDB {
	
	static String [] args = Main.args2;

	public static HashMap<String, String> connectToDataBasePW() {

		HashMap<String, String> benutzerPasswort = new HashMap<>();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://3.69.96.96:3306/db5", "db5", args[0]);
			Statement s = c.createStatement();
			
			ResultSet rs = s.executeQuery("SELECT Benutzername, Passwort FROM Passwort");
			while (rs.next()) {
				benutzerPasswort.put(rs.getString("Benutzername"), rs.getString("Passwort"));
			}
			
			c.close();

			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return benutzerPasswort;
	}
	
	public static void hinzufuegenBenutzer(String bn, String pw) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://3.69.96.96:3306/db5", "db5", args[0]);
			
			String sql = "INSERT INTO Passwort VALUES (default, ?,?)";
			PreparedStatement stm = c.prepareStatement(sql);
			stm.setString(1, bn);
			stm.setString(2, pw);
			stm.executeUpdate();
			
			c.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
