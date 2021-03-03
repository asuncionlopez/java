package Ejercicios1;

import java.util.Scanner;

public class NotaAlumnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		boolean menu = true;

		while (menu) {
			System.out.println("...Bienvenido al programa de Notas...");
			System.out.println(" ");
			System.out.println("Dime una nota");
			int nota = scan.nextInt();

			switch (nota) {
			case -1: // interruptor apagado
				menu = false;
				break;
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
				System.out.println("Insuficiente. Estudia más!!");
				System.out.println("-------------------");
				System.out.println(" ");
				break;
			case 5:
				System.out.println("Suficiente. Estudia más!!");
				System.out.println("-------------------");
				System.out.println(" ");
				break;
			case 6:
			case 7:
				System.out.println("Bien!");
				System.out.println("-------------------");
				System.out.println(" ");
				break;
			case 8:
				System.out.println("Notable");
				System.out.println("-------------------");
				System.out.println(" ");
				break;
			case 9:
			case 10:
				System.out.println("SOBRESALIENTE!! BIEN HECHO!");
				System.out.println("-------------------");
				System.out.println(" ");
				break;

			default:
				System.out.println("Escribe un número correcto"); // control scanner
				System.out.println("-------------------");
				System.out.println(" ");
				break;

			}

		}

		System.out.println("Adiós!!!");
		scan.close();
	}
}
