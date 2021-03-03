package Ejercicios1;

import java.util.Scanner;

public class Multipos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Dime un número");
		double  n1 = scan.nextDouble();
		System.out.println("Dime otro número y te digo si el anterior es múltiplo");
		double  n2= scan.nextDouble();
		
		if (n1%n2==0) {
			System.out.println(n1 + " es múltiplo de " + n2);
		} else
			System.out.println(n1 + " no es múltiplo de " + n2);
		
		scan.close();
	}

}
