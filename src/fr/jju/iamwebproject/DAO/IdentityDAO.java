package fr.jju.iamwebproject.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;

import fr.jju.iamwebproject.Classes.Identity;

@Component
@ContextConfiguration(locations = "/applicationContext.xml")

public class IdentityDAO {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public IdentityDAO() {
		
	}

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
	
	public List<Identity> displayAllRecords() {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		List<Identity> rows = session.createCriteria(Identity.class).list();
		tx.commit();
		session.flush();
		
		return rows;
	}
	
}
