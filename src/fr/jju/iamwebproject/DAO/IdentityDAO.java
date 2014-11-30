package fr.jju.iamwebproject.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IdentityDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	public void saveIdentity(Identity identity) {
		if (identity == null) {
			return;
		}
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
       
		session.save(identity);

		session.getTransaction().commit();
		
		//session.saveOrUpdate(identity);
		session.flush();
	}
	
}
