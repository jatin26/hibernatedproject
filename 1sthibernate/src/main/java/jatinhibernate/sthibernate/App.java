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
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {

    	//*It is used to insert data in database*// 
    	
    	Scanner s=new Scanner(System.in);       
//    	Alien jatin=new Alien();
// 
//       System.out.println("enter data");
//    	
//       jatin.setAid(s.nextInt());
//       
//       jatin.setAname(s.next());
//       
//       jatin.setColor(s.next());
//       
//       Configuration con=new Configuration().configure().addAnnotatedClass(Alien.class);
//       ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
//       SessionFactory sf=con.buildSessionFactory(reg);
//       Session session=sf.openSession();
//       Transaction tx=session.beginTransaction();
//       session.save(jatin);
//       
//       tx.commit();
//       session.close();
//    	
    	//*It is used to fetch the data in the database*//

//    	    	Alien jatin=new Alien();
//    	Configuration con=new Configuration().configure().addAnnotatedClass(Alien.class);
//    	ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
//    	SessionFactory sf=con.buildSessionFactory(reg);
//    	Session session=sf.openSession();
//    	Transaction tx=session.beginTransaction();
//    	System.out.println("enter data");
//    	jatin=(Alien)session.get(Alien.class, s.nextInt());
//    	tx.commit();
//    	System.out.println(jatin);
//    	
    	//*It is used to Update the data in the database*
    	
//   	Alien jatin=new Alien();
//    	Configuration con=new Configuration().configure().addAnnotatedClass(Alien.class);
//    	ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
//    	SessionFactory sf=con.buildSessionFactory(reg);
//    	Session session=sf.openSession();
//    	Transaction tx=session.beginTransaction();
//    	System.out.println("enter data");
//    	jatin=(Alien)session.get(Alien.class, s.nextInt());
//    	System.out.println("enter updated data");
//    	jatin.setAname(s.next());
//    	session.update(jatin);
//    	tx.commit();	
   
    	//*It is used to delete the data into the database*

//    	   	Alien jatin=new Alien();
//    	Configuration con=new Configuration().configure().addAnnotatedClass(Alien.class);
//    	ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
//    	SessionFactory sf=con.buildSessionFactory(reg);
//    	Session session=sf.openSession();
//    	Transaction tx=session.beginTransaction();
//    	System.out.println("enter data");
//    	jatin=(Alien)session.get(Alien.class, s.nextInt());
//    	jatin.setAname("");
//    	session.delete(jatin);
//    	tx.commit();
//    	
    }
}
