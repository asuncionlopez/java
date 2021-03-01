package Ejercicios;

import java.util.Scanner;

public class Asteriscos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Pedir nombre y que escriba tantos * como longitud de lo introducido.
		//ahora cambiamos el caracter y pedimos que introduzcan uno y se imprima

		Scanner entrada = new Scanner(System.in);
		String frase;

		System.out.println("Dime tu nombre");
		frase = entrada.nextLine();
		
		System.out.println("Dime un caracter");
		String caracter = entrada.next();
		
		// averiguar la longitud

		int longitud = frase.length();
		System.out.println("la cadena mide " + longitud);

		// Pintar asteriscos

		for (int i = 0; i < longitud; i++) {
			System.out.print(caracter);

		}
		entrada.close();
	}
}