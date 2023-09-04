package ar.com.educacionit.universidad.oop.polimorfismo;

public class Play extends Consola {

	private boolean tieneConeccionAInternet;
	private int puertosUsb;
	private int memoria;
	private boolean digital;
	private int version;

	private DiscoExterno discoExterno;

	public Play(String serie, String color, int version, boolean tieneCotieneConeccionAInternetnexion, int memoria,
			boolean digital) {
		super(serie, "sony", "Play" + version, color);

		this.version = version;

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

	public int getVersion() {
		return version;
	}

	@Override
	public void play() {
		System.out.println("jugando con la play");
	}

	@Override
	public String toString() {
		return "Play [tieneConeccionAInternet=" + tieneConeccionAInternet + ", puertosUsb=" + puertosUsb + ", memoria="
				+ memoria + ", digital=" + digital + ", version=" + version + ", discoExterno=" + discoExterno + "]";
	}
	
	
}
