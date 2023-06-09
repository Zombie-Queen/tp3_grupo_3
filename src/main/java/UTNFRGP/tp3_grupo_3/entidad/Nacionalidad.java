package UTNFRGP.tp3_grupo_3.entidad;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Nacionalidad")
public class Nacionalidad implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "Descripcion")
    private String descripcion;

    public Nacionalidad() {
    }

    public Nacionalidad(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Nacionalidad{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
    

	public Nacionalidad(Long id, String descripcion) {
		super();
		this.id = id;
		this.descripcion = descripcion;
	}
    

    
   
}
