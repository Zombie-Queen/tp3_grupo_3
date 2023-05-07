package UTNFRGP.tp3_grupo_3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import UTNFRGP.tp3_grupo_3.entidad.Autor;

/**
 *Tp 3
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
    	SessionFactory sessionFactory;
    	
    	Configuration configuration = new Configuration();
    	configuration.configure();	
    	ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
    	sessionFactory = configuration.buildSessionFactory(serviceRegistry);
    	Session session = sessionFactory.openSession();
 
    	session.beginTransaction();
    	
    	Autor autor = new Autor();
    	
    	autor.setNombre("Charles");
    	autor.setApellido("Dickens");
    	autor.setNacionalidad("Ingles");
    	autor.setEmail("test@test.com");
    	
    	session.save(autor); 
	    
	 /* Santiago Cirone */   	
    	Nacionalidad nacionalidad = new Nacionalidad();
    	nacionalidad.setDescripcion("Argentina");
    	
    	nacionalidad = new Nacionalidad();
    	nacionalidad.setDescripcion("Mexico");
    	
    	nacionalidad = new Nacionalidad();
    	nacionalidad.setDescripcion("Uruguay");
    	
    	nacionalidad = new Nacionalidad();
    	nacionalidad.setDescripcion("Paraguay");
    	
    	nacionalidad = new Nacionalidad();
    	nacionalidad.setDescripcion("Bolivia");
    	
    	session.save(nacionalidad);    
    	/****************************/
	    
    	session.getTransaction().commit();
    	session.close();
    	
    	sessionFactory.close();
    	    	
    }
}
