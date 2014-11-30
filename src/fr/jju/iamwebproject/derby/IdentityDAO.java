package fr.jju.iamwebproject.derby;

import java.sql.SQLException;
import java.util.List;

public interface IdentityDAO {
	
	public List<Identity> getAllIdentities() throws SQLException;
	
	public void insertIdentity(Identity identity);
	
	public void deleteIdentity(Identity identity);
	
	public void updateIdentity(Identity identity);
	
}
