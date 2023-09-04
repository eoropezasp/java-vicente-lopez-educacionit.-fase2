package ar.com.educacionit.universidad.oop.polimorfismo;

public final class Xbox360 extends Consola {

	private boolean tieneConeccionAInternet;
	private int puertosUsb;
	private int memoria;
	private boolean digital;
	

	private DiscoExterno discoExterno;

	public Xbox360(String serie, String color, boolean tieneCotieneConeccionAInternetnexion, int memoria,
			boolean digital) {
		super(serie, "microsoft", "Xbox360", color);

		this.tieneConeccionAInternet=tieneCotieneConeccionAInternetnexion;
		this.digital=digital;


	}

	public DiscoExterno getDiscoExterno() {
		return discoExterno;
	}

	public void setDiscoExterno(DiscoExterno discoExterno) {
		this.discoExterno = discoExterno;
	}

	public boolean isTieneConeccionAInternet() {
		return tieneConeccionAInternet;
	}

	public int getPuertosUsb() {
		return puertosUsb;
	}

	public int getMemoria() {
		return memoria;
	}

	public boolean isDigital() {
		return digital;
	}

	

}
