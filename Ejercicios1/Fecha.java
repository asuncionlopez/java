package Ejercicios1;

import java.util.Scanner;

public class Fecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Dime un día del mes");
		int dia = scan.nextInt();
		System.out.println("Dime un mes (en números)");
		int mes = scan.nextInt();
		System.out.println("Dime un año");
		int año = scan.nextInt();

		if (dia < 1 || dia > 30) {
			System.out.println("Día introducido incorrecto");
			System.out.println("");
		}

		if (mes < 1 || mes > 12) {
			System.out.println("Mes introducido incorrecto");
			System.out.println("");
		} else {
			System.out.println("La fecha introducida es: " + dia + "/" + mes + "/" + año);
			System.out.println(" ");
		}
		System.out.println("-- ADIOS --");
	}
}
