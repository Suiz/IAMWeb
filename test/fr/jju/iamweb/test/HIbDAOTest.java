package fr.jju.iamweb.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.jju.iamwebproject.derby.Address;
import fr.jju.iamwebproject.derby.AddressDAO;
import fr.jju.iamwebproject.derby.Identity;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/applicationContext.xml")

public class HIbDAOTest {
	
	@Autowired
	AddressDAO addressDAO;
	
	@Autowired
	Identity testIdentity;

	@Test
	public void testInsert() {
		Address address = new Address("1", "rue de Lagny", "Vincennes", "France");
		testIdentity.setAddress(address);
		addressDAO.saveAddress(address);
	}
	
}
