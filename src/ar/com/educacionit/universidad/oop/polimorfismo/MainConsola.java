package ar.com.educacionit.universidad.oop.polimorfismo;

public class MainConsola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Play play1 = new Play("123","gris",1,false,32,false);
		Play play2 = new Play("123-5","negro",2,false,64,false);		
		
		Play play5 = new Play("123-6","blamco",5,true,64,true);	
		
		
		
		Xbox360 xbox360 = new Xbox360("32543","negro",true,500,true);
		
//		play1.play();
//		play2.play();
//		play5.play();
//		
//		xbox360.play();
		
		
		Consola[]consolas = new Consola[] {play1,play2,xbox360};		
		
		
		for (Consola consola : consolas) {
			consola.play();
		
			if(consola instanceof Play p) {
				p.getMemoria();
			}
			if(consola instanceof Play x) {
				x.getMemoria();
			}
		}
		
		
		
		
	}

}
