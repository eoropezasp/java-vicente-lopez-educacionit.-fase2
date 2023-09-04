package ar.com.educacionit.universidad.oop;

public class MainAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Auto auto1 = new Auto("renault","clio mio",(short) 2016,"blanco","123456");
		Auto auto2 = new Auto("renault","clio mio",(short) 2016,"blanco","123456");
		Auto auto3 = new Auto("renault","clio mio",(short) 2016,"blanco","123456");
		Auto auto4 = new Auto("renault","clio mio",(short) 2016,"blanco","123456");
		
		
		auto1.setVelocidad((short) 5);
		auto2.setVelocidad((short) 10);
		auto3.setVelocidad((short) 28);
		
		
		System.out.println(auto3.getVelocidad());
		System.out.println(auto4.getVelocidad());
		
		
		Auto auto = new Auto("ford","falcon",1986,"negro","sdsfsf");
		
		
		
	}

}
