package Ejercicios1;

import java.util.Scanner;

public class PositivoNegativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);

		System.out.println("Dime un número y te diré si es positivo o negativo");
		double numero = scan.nextDouble();
		
		if (numero >=0) {
			System.out.println(numero + " es un número positivo");
		} else
		System.out.println(numero + " es un número negativo");
		
		scan.close();
	}	
}
