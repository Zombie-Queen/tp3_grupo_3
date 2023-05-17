package UTNFRGP.tp3_grupo_3;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import UTNFRGP.tp3_grupo_3.entidad.Autor;
import UTNFRGP.tp3_grupo_3.entidad.Biblioteca;
import UTNFRGP.tp3_grupo_3.entidad.Genero;
import UTNFRGP.tp3_grupo_3.entidad.Libro;
import UTNFRGP.tp3_grupo_3.entidad.Nacionalidad;
import dao.daoHibernate;

/**
 *Tp 3
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {

    	/* llenar tablas */ 

    	
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
    	
    	daoHibernate.Add(nacionalidad1);
    	daoHibernate.Add(nacionalidad2);
    	daoHibernate.Add(nacionalidad3);
    	daoHibernate.Add(nacionalidad4);
    	daoHibernate.Add(nacionalidad5);

    	
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
    	
    	
    	daoHibernate.Add(autor1);
    	daoHibernate.Add(autor2);
    	daoHibernate.Add(autor3);
    	daoHibernate.Add(autor4);
    	daoHibernate.Add(autor5);

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
    	listGenero1.add(genero2);
    	
    	Set<Genero> listGenero2 = new HashSet<Genero>();
    	listGenero2.add(genero2);
    	listGenero2.add(genero4);
    	listGenero2.add(genero5);
    	
    	Set<Genero> listGenero3 = new HashSet<Genero>();
    	listGenero3.add(genero3);
    	
    	Set<Genero> listGenero4 = new HashSet<Genero>();
    	listGenero4.add(genero4);
    	
    	Set<Genero> listGenero5 = new HashSet<Genero>();
    	listGenero5.add(genero5);
    	    	    	
    	
    	daoHibernate.Add(genero1);
    	daoHibernate.Add(genero2);
    	daoHibernate.Add(genero3);
    	daoHibernate.Add(genero4);
    	daoHibernate.Add(genero5);


       	Libro libro1 = new Libro();
       	Libro libro2 = new Libro();
       	Libro libro3 = new Libro();
       	Libro libro4 = new Libro();
       	Libro libro5 = new Libro();
       	
       	libro1.setIsbn("1");	
       	libro1.setTitulo("harry1");
       	libro1.setCantidadPaginas("10");
       	libro1.setIdioma("ingles");
       	libro1.setFechaLanzamiento("22/10/2019");
       	libro1.setDescripcion("Duis semper elit magna, nec dapibus tellus sodales aliquam. Etiam.");
       	libro1.setIdAutor(autor1);
       	libro1.setGenero(listGenero1);
       	
     	libro2.setIsbn("2");	
     	libro2.setTitulo("harry2");
     	libro2.setCantidadPaginas("20");
     	libro2.setIdioma("ingles");
     	libro2.setFechaLanzamiento("05/07/2020");
     	libro2.setDescripcion("Pellentesque lacinia ante eget aliquet suscipit. Pellentesque et est consectetur.");
     	libro2.setIdAutor(autor2);
       	libro2.setGenero(listGenero2);

     	libro3.setIsbn("3");	
       	libro3.setTitulo("harry3");
       	libro3.setCantidadPaginas("30");
       	libro3.setIdioma("ingles");
       	libro3.setFechaLanzamiento("12/07/2017");
       	libro3.setDescripcion("Vivamus rhoncus suscipit ullamcorper. Phasellus justo arcu, vulputate at tincidunt.");
       	libro3.setIdAutor(autor3);
       	libro3.setGenero(listGenero3);
       	
     	libro4.setIsbn("4");	
       	libro4.setTitulo("harry4");
       	libro4.setIdioma("ingles");
       	libro4.setCantidadPaginas("40");
       	libro4.setFechaLanzamiento("05/08/2014");
       	libro4.setDescripcion("Maecenas at scelerisque ante. Morbi sollicitudin ipsum ut tortor mattis.");
       	libro4.setIdAutor(autor4);
       	libro4.setGenero(listGenero4);
       	
     	libro5.setIsbn("5");	
       	libro5.setTitulo("harry5");
       	libro5.setIdioma("ingles");
       	libro5.setCantidadPaginas("50");
       	libro5.setFechaLanzamiento("21/11/2001");
       	libro5.setDescripcion("Praesent luctus nisl lacus, at eleifend lorem pharetra dictum. Nulla.");
       	libro5.setIdAutor(autor5);
       	libro5.setGenero(listGenero5);
       	
       	
    	daoHibernate.Add(libro1);
    	daoHibernate.Add(libro2);
    	daoHibernate.Add(libro3);
    	daoHibernate.Add(libro4);
    	daoHibernate.Add(libro5);
       	
    	
    }
}
