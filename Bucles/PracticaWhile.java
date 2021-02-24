package Bucles;

import java.util.Scanner;

public class PracticaWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// pedir dos numeros entre 10 y 40 y visualizar todos los números entre ellos

		Scanner numero = new Scanner(System.in);

		int n1;
		int n2;
		n1 = numero.nextInt();
		n2 = numero.nextInt();

		while (n1 <= n2) {
			System.out.print(n1 + " - ");
			n1++;
		}
		numero.close();
	}

}
