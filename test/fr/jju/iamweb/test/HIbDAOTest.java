package fr.jju.iamweb.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.jju.iamwebproject.DAO.Identity;
import fr.jju.iamwebproject.DAO.IdentityDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/applicationContext.xml")

public class HIbDAOTest {
	
	@Autowired
	IdentityDAO identityDAO;

	@Test
	public void testInsert() {
		Identity identity = new Identity("Kate", "Beckett", "555-555-5555");
		identityDAO.saveIdentity(identity);
	}
	
}
