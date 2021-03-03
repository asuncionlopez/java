package Ejercicios1;

import java.util.Scanner;

public class Ordenar2numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Dime un número");
		double n1 = scan.nextDouble();
		System.out.println("Dime otro número y te los pongo en orden");
		double n2 = scan.nextDouble();

		if (n1 > n2) {
			System.out.println("El orden es: " + n1 + " - " + n2);
		} else if (n2 > n1) {
			System.out.println("El orden es: " + n2 + " - " + n1);
		} else if (n1 == n2) {
			System.out.println("Pon números distintos!!");
		}

		System.out.println("Programa terminado");

		scan.close();

	}

}
