package ar.com.educacionit.universidad.ciclos;

import java.util.Scanner;

public class Condicionales {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("ingrese cantidad de pedidos");

		int cantPedidos = Integer.parseInt(input.nextLine());
		int aux = 0;

		for (int i = 0; i < cantPedidos; i++) {

			System.out.println("ingrese el valor del pedido nª: " + (i + 1));

			int numDePedido = Integer.parseInt(input.nextLine());
			aux += numDePedido;

		}

		double resultado = (double) aux / cantPedidos;

		System.out.println("el promedio es: " + resultado);

	}

}
