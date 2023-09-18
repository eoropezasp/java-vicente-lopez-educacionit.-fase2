package ar.com.educacionit.universidad.interfaces;

import java.util.Arrays;

public class Persona {
	private String nombre;
	private IIDioma idiomaNativo;
	private IIDioma[] otrosIdiomas;

	public Persona(String nombre, IIDioma idiomaNativo) {
		this.setNombre(nombre);
		this.setIdiomaNativo(idiomaNativo);
		this.setOtrosIdiomas(new IIDioma[0]);
	}

	public void setNombre(String nombre) {
		if (nombre == null) System.out.println("debe tener un nombre");
		this.nombre = nombre;

	}

	public void setIdiomaNativo(IIDioma idiomaNativo) {
		if (idiomaNativo == null) System.out.println("debe hablar un idioma");
		this.idiomaNativo = idiomaNativo;
	}

	public void setOtrosIdiomas(IIDioma[] otrosIdiomas) {
		this.otrosIdiomas = otrosIdiomas;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", idiomaNativo=" + idiomaNativo + ", otrosIdiomas="
				+ Arrays.toString(otrosIdiomas) + "]";
	}

	public void decir(String palabra) {
		this.idiomaNativo.decir(palabra);
	}

	public void aprender(IIDioma idioma) {
		if(idioma == null) {System.out.println("idioma nulo");
		return;
		}
		
		if(this.idiomaNativo.getClass().isAssignableFrom(idioma.getClass())) {
			System.out.println("ya habla este idioma " + idioma.getClass());
			return; 
		}
		
		for(IIDioma aux: this.otrosIdiomas) {
			if(aux.getClass().isAssignableFrom(idioma.getClass())) {
				System.out.println("ya habla este idioma " + idioma.getClass());
				return; 
			}
		}
		
		
		
		 
	}
	
}
