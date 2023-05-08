package dao;

import org.hibernate.Session;

import UTNFRGP.tp3_grupo_3.entidad.Biblioteca;

public class daoHibernate {

	public static void Add(Biblioteca biblioteca)
	{
		ConfigHibernate ch = new ConfigHibernate();
		Session session= ch.abrirConexion();
		
	        
	    session.beginTransaction();
	    session.save(biblioteca);
	    
	    session.getTransaction().commit();    
		ch.cerrarSession();
	}
	
	public static Biblioteca ReadOne(int id)
	{
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
		
		session.beginTransaction();
		Biblioteca biblioteca=(Biblioteca)session.get(Biblioteca.class,id);
        
        config.cerrarSession();
        
        return biblioteca;
	}
	
	public static void Update(Biblioteca biblioteca)
	{
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
		
        session.beginTransaction();
        session.update(biblioteca);
        session.getTransaction().commit();        
        
        config.cerrarSession();
	}
	
	public static void Delete(Biblioteca biblioteca)
	{
		
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
		
        session.beginTransaction();
        session.delete(biblioteca);
        session.getTransaction().commit();        
        
        config.cerrarSession();

	}
}
