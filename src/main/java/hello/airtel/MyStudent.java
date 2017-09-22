package hello.airtel;

import java.util.List; 
import java.util.Date;
import java.util.Iterator; 
 
import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MyStudent {
	private static SessionFactory factory; 
	public static void main(String[] args) {
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session s=sf.openSession();
	Transaction tx = s.beginTransaction();
	Student st = new Student("abc","def");
	s.save(st);
	s.flush();
	tx.commit();
	s.close();
	
}
}