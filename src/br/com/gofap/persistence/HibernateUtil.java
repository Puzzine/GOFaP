package br.com.gofap.persistence;


import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;




public class HibernateUtil {
    private static final SessionFactory sessionFactory;
    private static final ServiceRegistry serviceRegistry;
    
    
    static {
        //HIBERNATE 4 NOVA CONFIGURAÇÃO DE SESSION FACTORY PARA HIBERNATE 4.3
        try {
            
        	Configuration configuration = new Configuration();
            configuration.configure("hibernate.cfg.xml");
        	 serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();  
        	sessionFactory = configuration.buildSessionFactory(serviceRegistry);
      
        }catch (HibernateException ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}

