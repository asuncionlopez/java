package Ejercicios2;

import java.util.Scanner;

public class ContarNumerosde7en7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// contar de 7 en 7
		for (int i = 0; i <= 100; i += 7)
			System.out.print(i + " ");

		// pedir numero y contar desde ese numero al 100

		System.out.println("\n\tIntroduzca un numero: ");
		Scanner n = new Scanner(System.in);

		int numero = n.nextInt();

		for (int i = numero; i <= 100; i += 7)
			System.out.print(i + " ");

	}

}
