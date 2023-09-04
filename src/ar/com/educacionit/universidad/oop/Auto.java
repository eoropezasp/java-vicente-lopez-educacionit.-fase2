package ar.com.educacionit.universidad.oop;

public class Auto {

	/* atributos */

	private String marca;
	private String modelo;
	private short anio;
	private String color;
	private String patente;
	private static short velocidad = 0;

	/* constructor */
	public Auto(String marca, String modelo, short anio, String color, String patente) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		this.color = color;
		this.patente = patente;

	}

	public Auto(String marca2, String modelo2, int i, String color2, String patente2) {
		
	}

	/* metodos */
/* dos metodos con mismo nombre pero distinto argumento es polimorfismo*/
	public void acelerar() {
this.velocidad++;
	}

	public void acelerar(float v) {
this.velocidad+= v;
	}

	public void frenar() {

	}

	public void encender() {

	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public short getAnio() {
		return anio;
	}

	public void setAnio(short anio) {
		this.anio = anio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public static short getVelocidad() {
		return velocidad;
	}

	public static void setVelocidad(short velocidad) {
		Auto.velocidad = velocidad;
	}

	@Override
	public String toString() {
		return "Auto [marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", color=" + color + ", patente="
				+ patente + "]";
	}

}
