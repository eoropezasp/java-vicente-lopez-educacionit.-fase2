package ar.com.educacionit.universidad.oop.interfaces;

public class Ingles implements IIDioma{

	@Override
	public void decir(String algo) {
		System.out.println("decir: " + algo);
		
	}

}
