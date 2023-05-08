package UTNFRGP.tp3_grupo_3;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import UTNFRGP.tp3_grupo_3.entidad.Autor;
import UTNFRGP.tp3_grupo_3.entidad.Genero;
import UTNFRGP.tp3_grupo_3.entidad.Libro;
import UTNFRGP.tp3_grupo_3.entidad.Nacionalidad;

/**
 *Tp 3
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {

    	/* llenar tablas */ 
    	
    	SessionFactory sessionFactory;
    	
    	Configuration configuration = new Configuration();
    	configuration.configure();	
    	ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
    	sessionFactory = configuration.buildSessionFactory(serviceRegistry);
    	Session session = sessionFactory.openSession();
    	
 
    	session.beginTransaction();
    	
    	Nacionalidad nacionalidad1 = new Nacionalidad();
    	Nacionalidad nacionalidad2 = new Nacionalidad();
    	Nacionalidad nacionalidad3 = new Nacionalidad();
    	Nacionalidad nacionalidad4 = new Nacionalidad();
    	Nacionalidad nacionalidad5 = new Nacionalidad();

    	nacionalidad1.setDescripcion("Argentina");
    	nacionalidad2.setDescripcion("Brasil");
    	nacionalidad3.setDescripcion("Uruguay");
    	nacionalidad4.setDescripcion("Paraguay");
    	nacionalidad5.setDescripcion("Bolivia");
    	
    	
    	session.save(nacionalidad1);    
    	session.save(nacionalidad2);    
    	session.save(nacionalidad3);    
    	session.save(nacionalidad4);    
    	session.save(nacionalidad5);    
    	
      	Autor autor1 = new Autor();
    	Autor autor2 = new Autor();
    	Autor autor3 = new Autor();
    	Autor autor4 = new Autor();
    	Autor autor5 = new Autor();
    	
    	autor1.setNombre("Pablo");
    	autor1.setApellido("Lampone");
    	autor1.setNacionalidad(nacionalidad1);
    	autor1.setEmail("test@test.com");
    	
    	autor2.setNombre("Mario");
    	autor2.setApellido("Santos");
    	autor2.setNacionalidad(nacionalidad2);
    	autor2.setEmail("test@test.com");
    	
    	autor3.setNombre("Gabriel");
    	autor3.setApellido("Medina");
    	autor3.setNacionalidad(nacionalidad3);
    	autor3.setEmail("test@test.com");
    	
    	autor4.setNombre("Emilio");
    	autor4.setApellido("Ravenna");
    	autor4.setNacionalidad(nacionalidad4);
    	autor4.setEmail("test@test.com");
    	
    	autor5.setNombre("Damian");
    	autor5.setApellido("Szifron");
    	autor5.setNacionalidad(nacionalidad5);
    	autor5.setEmail("test@test.com");
    	

       	session.save(autor1);    
       	session.save(autor2);    
       	session.save(autor3);    
       	session.save(autor4);    
       	session.save(autor5);    
       	

       	
       	Genero genero1 = new Genero();
       	Genero genero2 = new Genero();
       	Genero genero3 = new Genero();
       	Genero genero4 = new Genero();
       	Genero genero5 = new Genero();


       	genero1.setDescripción("Terror");       	
       	genero2.setDescripción("Suspenso");
       	genero3.setDescripción("Comedia");
       	genero4.setDescripción("Accion");
       	genero5.setDescripción("Otros");
       	
    	Set<Genero> listGenero1 = new HashSet<Genero>();
    	listGenero1.add(genero1);
    	
    	Set<Genero> listGenero2 = new HashSet<Genero>();
    	listGenero2.add(genero2);
    	
    	Set<Genero> listGenero3 = new HashSet<Genero>();
    	listGenero3.add(genero3);
    	
    	Set<Genero> listGenero4 = new HashSet<Genero>();
    	listGenero4.add(genero4);
    	
    	Set<Genero> listGenero5 = new HashSet<Genero>();
    	listGenero5.add(genero5);

       	
       	session.save(genero1);    
       	session.save(genero2);    
       	session.save(genero3);    
       	session.save(genero4);    
       	session.save(genero5);  

       	
       	
       	Libro libro1 = new Libro();
       	Libro libro2 = new Libro();
       	Libro libro3 = new Libro();
       	Libro libro4 = new Libro();
       	Libro libro5 = new Libro();
       	
       	libro1.setIsbn("1");	
       	libro1.setTitulo("harry1");
       	libro1.setIdioma("ingles");
       	libro1.setIdAutor(autor1);
       	libro1.setGenero(listGenero1);
       	
     	libro2.setIsbn("2");	
     	libro2.setTitulo("harry2");
     	libro2.setIdioma("ingles");
     	libro2.setIdAutor(autor2);
       	libro2.setGenero(listGenero2);

     	libro3.setIsbn("3");	
       	libro3.setTitulo("harry3");
       	libro3.setIdioma("ingles");
       	libro3.setIdAutor(autor3);
       	libro3.setGenero(listGenero3);
       	
     	libro4.setIsbn("4");	
       	libro4.setTitulo("harry4");
       	libro4.setIdioma("ingles");
       	libro4.setIdAutor(autor4);
       	libro4.setGenero(listGenero4);
       	
     	libro5.setIsbn("5");	
       	libro5.setTitulo("harry5");
       	libro5.setIdioma("ingles");
       	libro5.setIdAutor(autor5);
       	libro5.setGenero(listGenero5);
       	
       	session.save(libro1);    
       	session.save(libro2);    
       	session.save(libro3);    
       	session.save(libro4);    
       	session.save(libro5);  
	    
    	session.getTransaction().commit();
    	session.close();
    	
    	sessionFactory.close();
    	
    	
    	/* */
    	    	
    }
}
