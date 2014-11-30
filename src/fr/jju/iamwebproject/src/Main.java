package fr.jju.iamwebproject.src;

import fr.jju.iamwebproject.derby.DerbyDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		try {
			
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
			
			Connection connection = DriverManager.getConnection("jdbc:derby:/Users/Suiz/Documents/Java/workspace/IAMWebProject;create=true");
			
			PreparedStatement pstmt = connection.prepareStatement("select * from IDENTITIES");
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				String firstname = rs.getString(2);
				String lastname = rs.getString(3);
				
				System.out.println(firstname + " " + lastname);
				
			}
			
			DerbyDAO derbytest = new DerbyDAO();
			derbytest.getAllIdentities();
			
		
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
