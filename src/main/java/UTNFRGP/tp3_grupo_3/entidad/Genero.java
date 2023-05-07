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

@ManyToMany(cascade= (CascadeType.ALL))
private HashSet listaLibros= new HashSet;

@JoinTable(name="Libros_x_genero",joinColumns= {@JoinCoumn(name="idgenero")}, inverseJoinColumn= {@JoinColumn(name="idlibro")})

public Genero()
{

}


public HashSet getListaLibros() {
return listaLibros;
}


public void setListaLibros(HashSet listaLibros) {
this.listaLibros = listaLibros;
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



}
