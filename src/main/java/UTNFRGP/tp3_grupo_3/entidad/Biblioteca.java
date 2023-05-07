package UTNFRGP.tp3_grupo_3.entidad;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="Biblioteca")
public class Biblioteca implements Serializable {
	
	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column (name = "id")
    private Long id;

    @OneToMany(mappedBy="biblioteca", cascade=CascadeType.ALL)
    @Column (name = "Libro")
    private List<Libro> libro;

    @Temporal(TemporalType.TIMESTAMP)
    @Column (name = "fechaAlta")
    private Date fechaAlta;

    @Column (name = "estado")	
    private int estado;

    public Biblioteca() {}

    public Biblioteca(List<Libro> libro, Date fechaAlta, int estado) {
        this.libro = libro;
        this.fechaAlta = fechaAlta;
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Libro> getLibro() {
        return libro;
    }

    public void setLibro(List<Libro> libro) {
        this.libro = libro;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
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
        return "Biblioteca{" +
                "id=" + id +
                ", libro=" + libro +
                ", fechaAlta=" + fechaAlta +
                ", estado='" + estado + '\'' +
                '}';
    }
}
