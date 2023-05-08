package UTNFRGP.tp3_grupo_3.entidad;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="Genero")
public class Genero implements Serializable {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idgenero;

	@Column
	private String descripción;
	
	
	public Genero()
	{
	
	}
	
	
	public int getIdgenero() {
		return idgenero;
	}


	public void setIdgenero(int idgenero) {
		this.idgenero = idgenero;
	}


	public Genero(int idgenero, String descripción) {
		super();
		this.idgenero = idgenero;
		this.descripción = descripción;
	}


	public String getDescripción() {
	return descripción;
	}
	
	public void setDescripción(String descripción) {
	this.descripción = descripción;
	}
	
	
	@Override
	public String toString() {
	return "Genero [idgenero=" + idgenero + ", descripción=" + descripción + "]";
	}
	
	

}

