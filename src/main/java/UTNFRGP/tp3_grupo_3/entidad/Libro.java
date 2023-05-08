package UTNFRGP.tp3_grupo_3.entidad;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Libro")
public class Libro implements Serializable {
	
    @Id
    @Column
    private String isbn;

    @Column
    private String titulo;

    @Column
    private String  fechaLanzamiento;

    @Column
    private String idioma;

    @Column
    private String cantidadPaginas;
      
    @Column
    private String descripcion;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "idAutor")
    private Autor idAutor;
    
	@ManyToMany(cascade= (CascadeType.ALL))
	@JoinTable(name="Libros_x_genero",joinColumns= {@JoinColumn(name="isbn")}, inverseJoinColumns= {@JoinColumn(name="idgenero")})
	private Set<Genero> genero = new HashSet<Genero>();
   
    
    @Column
    private Biblioteca biblioteca;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(String fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getCantidadPaginas() {
        return cantidadPaginas;
    }

    public void setCantidadPaginas(String cantidadPaginas) {
        this.cantidadPaginas = cantidadPaginas;
    }


    public Autor getIdAutor() {
		return idAutor;
	}

	public void setIdAutor(Autor idAutor) {
		this.idAutor = idAutor;
	}

	public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


	public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }
    
	public Libro() {

	}

	public Set<Genero> getGenero() {
		return genero;
	}

	public void setGenero(Set<Genero> genero) {
		this.genero = genero;
	}

	public Libro(String isbn, String titulo, String fechaLanzamiento, String idioma, String cantidadPaginas,
			Autor idAutor, String descripcion, Set<Genero> genero, Biblioteca biblioteca) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.fechaLanzamiento = fechaLanzamiento;
		this.idioma = idioma;
		this.cantidadPaginas = cantidadPaginas;
		this.idAutor = idAutor;
		this.descripcion = descripcion;
		this.genero = genero;
		this.biblioteca = biblioteca;
	}








}
