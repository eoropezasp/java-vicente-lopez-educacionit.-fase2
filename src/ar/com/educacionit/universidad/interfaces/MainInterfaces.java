package ar.com.educacionit.universidad.interfaces;

public class MainInterfaces {

	public static void main(String[] args) {

		IIDioma idioma = new Ingles();

		var persona1 = new Persona("carlos", idioma);

		
		String palabra = "hola";
		
		
		persona1.decir(palabra);
		
		idioma = new Espaniol();
		
		persona1.aprender(idioma);
		
	}

}
