package jatinhibernate.sthibernate;

import javax.transaction.Synchronization;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.engine.transaction.spi.LocalStatus;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App 
{
    public static void main( String[] args )
    {

    	//*It is used to insert data in database*// 
    	
    	//       Alien jatin=new Alien();
//       
//       jatin.setAid(8);
//       jatin.setAname("amit");
//       jatin.setColor("white");
//       
//       Configuration con=new Configuration().configure().addAnnotatedClass(Alien.class);
//       ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
//       SessionFactory sf=con.buildSessionFactory(reg);
//       Session session=sf.openSession();
//       Transaction tx=session.beginTransaction();
//       session.save(jatin);
//       
//       tx.commit();
    	
    	//*It is used to fetch the data in the database*//

    	//    	Alien jatin=new Alien();
//    	Configuration con=new Configuration().configure().addAnnotatedClass(Alien.class);
//    	ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
//    	SessionFactory sf=con.buildSessionFactory(reg);
//    	Session session=sf.openSession();
//    	Transaction tx=session.beginTransaction();
//    	jatin=(Alien)session.get(Alien.class, 2);
//    	tx.commit();
//    	System.out.println(jatin);
    	
    	//*It is used to Update the data in the database*
    	
//    	Alien jatin=new Alien();
//    	Configuration con=new Configuration().configure().addAnnotatedClass(Alien.class);
//    	ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
//    	SessionFactory sf=con.buildSessionFactory(reg);
//    	Session session=sf.openSession();
//    	Transaction tx=session.beginTransaction();
//    	jatin=(Alien)session.get(Alien.class, 5);
//    	jatin.setAname("sahil");
//    	session.update(jatin);
//    	tx.commit();	
   
    	//*It is used to delete the data into the database*

    	//    	Alien jatin=new Alien();
//    	Configuration con=new Configuration().configure().addAnnotatedClass(Alien.class);
//    	ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
//    	SessionFactory sf=con.buildSessionFactory(reg);
//    	Session session=sf.openSession();
//    	Transaction tx=session.beginTransaction();
//    	jatin=(Alien)session.get(Alien.class, 7);
//    	jatin.setAname("");
//    	session.delete(jatin);
//    	tx.commit();
    }
}
