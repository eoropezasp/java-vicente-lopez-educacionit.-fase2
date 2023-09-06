package ar.com.educacionit.universidad.oop.interfaces;

import java.util.Arrays;

public class Persona {
	private String nombre;
	private IIDioma idiomaNativo;
	private IIDioma[] otrosIdiomas;

	public Persona(String nombre, IIDioma idiomaNativo) {
		this.setNombre(nombre);
		this.setIdiomaNativo(idiomaNativo);
		setOtrosIdiomas(new IIDioma[0]);
	}

	public void setNombre(String nombre) {
		if (nombre == null) {
			System.out.println("debe tener un nombre");
			this.nombre = nombre;
		}
	}

	public void setIdiomaNativo(IIDioma idiomaNativo) {
		if (idiomaNativo == null) {
			System.out.println("debe hablar un idioma");

		}
		this.idiomaNativo = idiomaNativo;
	}

	public void setOtrosIdiomas(IIDioma[] idiomas) {
		this.otrosIdiomas = idiomas;
	}

	public String getNombre() {
		return nombre;
	}

	public IIDioma getIdiomaNativo() {
		return idiomaNativo;
	}

	public IIDioma[] getOtrosIdiomas() {
		return otrosIdiomas;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", idiomaNativo=" + idiomaNativo + ", otrosIdiomas="
				+ Arrays.toString(otrosIdiomas) + "]";
	}

	public void decir(String palabra) {

		this.idiomaNativo.decir(palabra);
	}

	public void decir(String palabra, IIDioma idioma) {

		if (idioma == null || !sabeHablarIdioma(idioma)) {
			if(idioma instanceof )
			System.out.println("no sabe hablar...en "+ idioma.getClass().getSimpleName());
			return;
		}

		idioma.decir(palabra);
	}

	
	
	public boolean sabeHablarIdioma(IIDioma idioma) {
		if (this.idiomaNativo.getClass().isAssignableFrom(idioma.getClass()))
			return true;

		boolean habla = false;

		for (int i = 0; !habla && i < this.otrosIdiomas.length; i++) {
			habla = this.otrosIdiomas[i].getClass().getClass().isAssignableFrom(idioma.getClass());
		}
		return habla;

	}

	public void aprender(IIDioma idioma) {
		if (idioma == null) {
			System.out.println("idioma nulo");
			return;
		}

		if (this.idiomaNativo.getClass().isAssignableFrom(idioma.getClass())) {
			System.out.println("ya habla " + idioma.getClass());
			return;
		}

		for (IIDioma aux : this.otrosIdiomas) {
			if (aux.getClass().isAssignableFrom(idioma.getClass())) {
				System.out.println("ya habla " + idioma.getClass());
				return;
			}
		}

		IIDioma[] aux = new IIDioma[this.otrosIdiomas.length + 1];
		for (int i = 0; i < this.otrosIdiomas.length; i++) {
			aux[i] = this.otrosIdiomas[i];
		}
		aux[this.otrosIdiomas.length] = idioma;
		this.setOtrosIdiomas(aux);
	}
}
