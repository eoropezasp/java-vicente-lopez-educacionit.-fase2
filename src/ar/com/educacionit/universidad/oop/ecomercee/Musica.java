package ar.com.educacionit.universidad.oop.ecomercee;

public class Musica extends Resultado {

	private String selloDiscografico;
	private int codigo;
	private String clasificacion;

	

	public Musica(String titulo, String imagen, float precio, String autor, String selloDiscografico, int codigo,
			String clasificacion) {
		super(titulo, imagen, precio, autor);
		this.selloDiscografico = selloDiscografico;
		this.codigo = codigo;
		this.clasificacion = clasificacion;
	}

	public String getSelloDiscografico() {
		return selloDiscografico;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getClasificacion() {
		return clasificacion;
	}

	@Override
	public String toString() {
		return "Musica [selloDiscografico=" + selloDiscografico + ", codigo=" + codigo + ", clasificacion="
				+ clasificacion + "]";
	}

}
