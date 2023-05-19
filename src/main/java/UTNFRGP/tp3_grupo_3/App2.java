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
import dao.ConfigHibernate;
import dao.daoHibernate;

/**
 *Tp 3
 *
 */
public class App2 
{
	
    public static void main( String[] args )
    {
    	
    	OrderedBooksDesc();
    	BorrowedBooks();
	showBookWithIsbn();
    	showBookWithMaxIsbn();
    }
    
    public static void OrderedBooksDesc()
	{
		ConfigHibernate ch = new ConfigHibernate();
		Session session= ch.abrirConexion();
		
        List<Object[]> listaLibrosxAutorxNacionalxGen= (List<Object[]>) session.createQuery("from Libro l "
        		+ "INNER JOIN l.idAutor a"
        		+ " INNER JOIN a.nacionalidad n"
        		+ "INNER JOIN l.genero g"
        		+ " order by l.isbn desc ").list();
        
        
        System.err.println("Libros:");
          
        /*Los campos que se deben mostrar son los siguientes: ISBN, Titulo, fecha de lanzamiento, idioma, cantidad de páginas, 
         * autor (ID, Nombre, Apellido, Email, Nacionalidad(ID, Descripción)), descripción 
         * y la lista de géneros (ID Genero, descripción) */
        
        
        for (Object[] obj : listaLibrosxAutorxNacionalxGen) {

        	  Libro libro = (Libro) obj[0];
        	  Autor autor = (Autor) obj[1];
        	  Nacionalidad nac = (Nacionalidad) obj[2];
        	  Genero gen = (Genero) obj[3];
        	  
        	  System.out.println("ISBN: " + libro.getIsbn() + ", Titulo: " + libro.getTitulo() + ", Fecha Lanzamiento: " + libro.getFechaLanzamiento()
        	  + ", Idioma: " + libro.getIdioma() + ", Cantidad de paginas: " + libro.getCantidadPaginas() + ", Autor: " + autor.getId() + ", Nombre: "
        	  + autor.getNombre() + ", Apellido: " + autor.getApellido() + ", Email: " + autor.getEmail() + ", Nacionalidad: " + nac.getId() + 
        	  ", Descripcion Nacionalidad: " + nac.getDescripcion() + ", Descripcion Libro: " + libro.getDescripcion() + ", Genero: " + gen.toString());
		}
        
        ch.cerrarSession();
	}
    
    public static void BorrowedBooks()
	{
		ConfigHibernate ch = new ConfigHibernate();
		Session session= ch.abrirConexion();
		
        List<Object[]> librosPrestados = (List<Object[]>) session.createQuery("from Libro l "
        		+ "INNER JOIN l.idBiblioteca b"
        		+ " where b.estado = 2 ").list();
        
        
        System.err.println("Libros:");
          
        /*Los campos que se deben mostrar son los siguientes: ISBN, Titulo, fecha de lanzamiento, idioma, cantidad de páginas, 
         * autor (ID, Nombre, Apellido, Email, Nacionalidad(ID, Descripción)), descripción 
         * y la lista de géneros (ID Genero, descripción) */
        
        
        for (Object[] obj : librosPrestados) {

        	  Libro libro = (Libro) obj[0];
        	  Biblioteca biblioteca = (Biblioteca) obj[1];
        	  
        	  System.out.println(libro.toString() + ' ' + biblioteca.toString());
		}
        
        ch.cerrarSession();
	}





	public static void showAllAuthors()
	{
		ConfigHibernate ch = new ConfigHibernate();
		Session session= ch.abrirConexion();

		List<Object[]> listAuthorsAndNation = (List<Object[]>) session.createQuery("from Autor as a "
				+ "INNER JOIN a.nacionalidad as n where n.descripcion = 'Argentina'").list();

		System.err.println("Autores argentina:");

		for (Object[] object : listAuthorsAndNation) {
			Autor autor = (Autor) object[0];

			System.out.println(autor);
		}

		ch.cerrarSession();
	}

	public static void showBookWithIsbn()
	{
		ConfigHibernate ch = new ConfigHibernate();
		Session session= ch.abrirConexion();

		List<Object[]> listAuthorsAndNation = (List<Object[]>) session.createQuery("from Libro as l "
				+ "INNER JOIN l.genero as g where l.isbn = '12345'").list();

		System.err.println("Autores argentina:");

		for (Object object : listAuthorsAndNation.get(0)) {
			System.out.println(object);
			break;
		}

		ch.cerrarSession();
	}
	
	public static void showBookWithMaxIsbn()
	{
	    ConfigHibernate ch = new ConfigHibernate();
	    Session session= ch.abrirConexion();

	    String maxIsbn = (String) session.createQuery("select max(l.isbn) from Libro as l").uniqueResult();

	    System.out.println("El libro con el mayor ISBN es: " + maxIsbn);

	    ch.cerrarSession();
	}
}
