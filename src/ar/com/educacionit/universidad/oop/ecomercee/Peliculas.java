package ar.com.educacionit.universidad.oop.ecomercee;



public class Peliculas extends Resultado {

	private String productora;
	private String formato;
	


	
	

	public Peliculas(String titulo, String imagen, float precio, String autor, String productora, String formato) {
		super(titulo, imagen, precio, autor);
		this.productora = productora;
		this.formato = formato;
		
	}



	public String getProductora() {
		return productora;
	}

	public String getFormato() {
		return formato;
	}

	@Override
	public String toString() {
		return "Peliculas [productora=" + productora + ", formato=" + formato +  "]";
	}

}
