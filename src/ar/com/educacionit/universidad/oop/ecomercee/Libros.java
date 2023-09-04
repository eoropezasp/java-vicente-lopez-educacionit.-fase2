package ar.com.educacionit.universidad.oop.ecomercee;

public class Libros extends Resultado {

	private String editorial;
	private int cantidadPagonas;
	private String idioma;



	public Libros(String titulo, String imagen, float precio, String autor, String editorial, int cantidadPagonas,
			String idioma) {
		super(titulo, imagen, precio, autor);
		this.editorial = editorial;
		this.cantidadPagonas = cantidadPagonas;
		this.idioma = idioma;
	}

	public String getEditorial() {
		return editorial;
	}

	public int getCantidadPagonas() {
		return cantidadPagonas;
	}

	public String getIdioma() {
		return idioma;
	}

	@Override
	public String toString() {
		return "Libros [editorial=" + editorial + ", cantidadPagonas=" + cantidadPagonas + ", idioma=" + idioma + "]";
	}

}
