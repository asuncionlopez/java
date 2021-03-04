package Ejercicios2;

import java.util.Scanner;

public class AdivinarNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int aleatorio = (int) (Math.random() * 100);
		int pulse = 0;
		boolean repetir = false;

		System.out.println("Adivina el número del 1 al 100");

		while (!repetir) {

			int num = scan.nextInt();

			if (num < aleatorio) {
				System.out.println("Tiene que ser mayor.");

			} else if (num > aleatorio) {
				System.out.println("Tiene que ser menor");
			} else {
				repetir = true;
				System.out.println("Enhorabuena, has adivinado el número");
			}

		}

		scan.close();
	}

}
