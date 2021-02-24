package Bucles;

import java.util.Scanner;

public class PracticaBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Pedir 1 numero y pintar todos los numeros entre ellos. Hacer un break
		// primos --> divisible solo por si mismo y por el uno (una division exacta no
		// es primo)

		Scanner numero = new Scanner(System.in);

		int n1;
		n1 = numero.nextInt();

		if (n1 % 2 == 0) {
			System.out.println("Número No Primo");
		} else {

			// contador
			int x = 2;
			// switch
			boolean primo = true;

			// comprobar si es primo
			while (x < n1) {
				if (n1 % x == 0) {
					System.out.println("Número No Primo");
					System.out.println("Divisible por: " + x);
					primo = false;
					break;
				}
				x++;
			}
			if (primo) {
				System.out.println("Número Primo");
			}
		}
	}

}
