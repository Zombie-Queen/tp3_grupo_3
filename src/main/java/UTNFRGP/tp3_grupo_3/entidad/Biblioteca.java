package UTNFRGP.tp3_grupo_3.entidad;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="Biblioteca")
public class Biblioteca implements Serializable {
	
	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column (name = "id")
    private int id;

    @Column (name = "fechaAlta")
    private String fechaAlta;

    @Column (name = "estado")	
    private int estado;

    public Biblioteca() {}

    public Biblioteca(String fechaAlta, int estado) {
        this.fechaAlta = fechaAlta;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
	public String toString() {
		return "Biblioteca [Id =" + id + ", fechaAlta=" + fechaAlta + ", estado=" + estado + "]";
	}
}
