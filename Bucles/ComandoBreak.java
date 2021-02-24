package Bucles;

import java.util.Scanner;

public class ComandoBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner numero = new Scanner(System.in);

		int n1;
		int n2;
		n1 = numero.nextInt();
		n2 = numero.nextInt();

		while (n1 <= n2) {
			System.out.print(n1 + "-");
			n1++;
			if (n1 == 12)
				break;
		}
		System.out.println("Te has salido con un valor:" + n1);
	}

}
