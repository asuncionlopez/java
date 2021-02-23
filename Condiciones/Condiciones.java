package Condiciones;

import java.util.Scanner;

public class Condiciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * if (condicion) comando1;
		 * {
		 * s1;
		 * s2;
		 * s3;
		 * }
		 * else
		 * if (condicion);
		 * {
		 * s1;
		 * s2;
		 * }
		 * else
		 * * if (condicion);
		 * {
		 * s1;
		 * s2;
		 * }
		 */
		
		//Decir si un número es par o impar
		
		int n1=10;
		int n2=2;
		
		if (n1%n2==0)
		{
			System.out.println("Es par");
		} 
		else
		{
			System.out.println("Es impar");
		}

		//Pedir una cadena por teclado
		
		System.out.println("Por favor, introduce tu nombre: "); 

        Scanner nombre = new Scanner(System.in); 

        String cadena = nombre.nextLine(); 
        System.out.println(cadena);

		
		
		
	}

}
