package dao;

import org.hibernate.Session;

import UTNFRGP.tp3_grupo_3.entidad.Biblioteca;

public class daoHibernate {

	public static <T> void Add(Object o)
	{
		ConfigHibernate ch = new ConfigHibernate();
		Session session= ch.abrirConexion();
			        
	    session.beginTransaction();
	    session.save(o);
	    
	    session.getTransaction().commit();    
		ch.cerrarSession();
	}
	
}
