package codigo;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PruebaUsuario {

	
	
	public static void main(String[] args) {
		Usuario usuario1 = new Usuario("Pablo", 36, new Date());
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(usuario1);
		session.getTransaction().commit();
		session.close();
	}

}
