package Ejercicios2;

import java.util.Scanner;

public class OperacionesNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Pedir numeros, y sumarlos, dar la media, y contar cuantos numeros se han
		// introducido

		Scanner scan = new Scanner(System.in);

		double numero;
		double suma = 0;
		double contador = 0;
		boolean juego = true;

		do {
			System.out.println("Escribe un número:");

			numero = scan.nextInt();

			if (numero != 0) {
				suma = suma + numero;
				contador++;
			} else {
				juego = false;
			}

		} while (juego);
		System.out.println("Has escrito " + contador + " números.");
		System.out.println("La suma de los números es: " + suma);
		System.out.println("La media de los números es: " + (suma / contador));
		scan.close();

	}

}
