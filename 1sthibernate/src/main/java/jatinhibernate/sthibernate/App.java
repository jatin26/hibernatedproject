package jatinhibernate.sthibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Alien jatin=new Alien();
       
       jatin.setAid(2);
       jatin.setAname("jatin");
       jatin.setColor("green");
       
       Configuration con=new Configuration().configure().addAnnotatedClass(Alien.class);
       SessionFactory sf=con.buildSessionFactory();
       Session session=sf.openSession();
       Transaction tx=session.beginTransaction();
       session.save(jatin);
       
       tx.commit();
    }
}
