package ar.com.educacionit.universidad.oop.interfaces;

public class MainInterfaces {

	public static void main(String[] args) {
	
		IIDioma idioma = new Ingles();
		
		var persona = new Persona("carlos",idioma);

String palabra = "hola";

persona.decir(palabra);
		
		

// aprende un nuevo idioma
		
		//idioma=new Español();
		
		//persona.aprender(idioma);
		
//		persona.decir(palabra);
		
		
		persona.decir(palabra,new Español());
		
		
		idioma = new Español();
		
		persona.aprender(idioma);
		
		persona.decir(palabra,new Español());
		
		
	}

}
