package Ejercicios2;

import java.util.Scanner;

public class NumerosDe1a10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Pedir 100 números entre el 0 y el 10. Mostrar la media de los números pares,
		// la media
		// de los números impares y la cantidad de ceros.

		int numero = 0;
		int pares = 0;
		int impares = 0;
		int ceros = 0;
		int mediaPares = 0;
		int mediaImpares = 0;

		for (int i = 0; i <= 100; i++) {

			numero = (int) (Math.random() * 10);
			if (numero % 2 == 0) {

				pares = pares + numero;
				mediaPares++;
				if (numero == 0) {

					ceros++;
				}

			} else if (numero % 2 != 0) {

				impares = impares + numero;
				mediaImpares++;

			}

		}

		System.out.println("La suma de pares es: " + pares);
		System.out.println("Pares generados: " + mediaPares);
		System.out.println("La media de pares es: " + (pares / mediaPares));
		System.out.println(" ");
		System.out.println("La suma de impares es: " + impares);
		System.out.println("Impares generados: " + mediaImpares);
		System.out.println("La media de impares es: " + (impares / mediaImpares));
		System.out.println(" ");
		System.out.println("Los ceros son: " + ceros);

	}

}
