package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.List;

public class App
{
    public static void main( String[] args )
    {

        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(City.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try{
            session.beginTransaction();

            List<String> Cities =
                    session.createQuery("select c.name from City c where c.population > 2000000").getResultList();

            for(String city : Cities){
                System.out.println(city);
            }

            //INSERT
			/*
			City city = new City();
			city.setName("Düzce 10");
			city.setCountryCode("TUR");
			city.setDistrict("Karadeniz");
			city.setPopulation(100000);
			session.save(city);
			*/

            //UPDATE
			/*
			City city = session.get(City.class, 4086);
			city.setPopulation(110000);
			session.save(city);
			*/
            //CRUD Create Read Update Delete

            //DELETE
			/*
			City city =session.get(City.class, 4086);
			session.delete(city);
			session.getTransaction().commit();
			*/
        }finally {
            session.close();
            factory.close();
        }
    }
}
