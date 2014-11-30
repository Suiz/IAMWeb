package fr.jju.iamwebproject.derby;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DerbyDAO implements IdentityDAO {
	
	private Connection connection;
	
	public void connect() {
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
			
			connection = DriverManager.getConnection("jdbc:derby:/Users/Suiz/Documents/Java/workspace/IAMWebProject/IAMWeb;create=true");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public List<Identity> getAllIdentities() throws SQLException {
		
		List<Identity> idList = new ArrayList<Identity>();
		
		if (connection == null || connection.isClosed()) {
			connect();
			
			PreparedStatement pstat = connection.prepareStatement("select * from IDENTITIES");
			ResultSet rs = pstat.executeQuery();
			while (rs.next()) {
				String firstname = rs.getString(2);
				String lastname = rs.getString(3);
				idList.add(new Identity(firstname, lastname));
				

				System.out.println(idList.get(idList.size() - 1).identityName + " " + idList.get(idList.size() - 1).identityLastName);
			}
		}
		
		return idList;
	}

	@Override
	public void insertIdentity(Identity identity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteIdentity(Identity identity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateIdentity(Identity identity) {
		// TODO Auto-generated method stub
		
	}

}
