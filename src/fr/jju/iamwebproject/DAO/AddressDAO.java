package fr.jju.iamwebproject.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AddressDAO {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public void saveAddress(Address address) {
		if (address == null) {
			return;
		}
		Session session = sessionFactory.openSession();
		session.saveOrUpdate(address);
		session.flush();
	}

}
