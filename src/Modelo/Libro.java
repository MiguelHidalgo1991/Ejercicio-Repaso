package Modelo;

public class Libro {
	private String ISBN;
	private String titulo;
	private Autor autor;
	private float precio;
	private String resumen;

	public Libro() {

	}

	public Libro(String iSBN, String titulo, Autor autor, float precio, String resumen) {
		ISBN = iSBN;
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
		this.resumen = resumen;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String getResumen() {
		return resumen;
	}

	public void setResumen(String resumen) {
		this.resumen = resumen;
	}

}
