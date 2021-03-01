package Ejercicios;

import java.util.Scanner;

public class DelReves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//dos cadenas de enteros de 5 posiciones
		//rellenamos una cadena con numeros
		//pasamos los numeros de una cadena a otra dandoles la vuelta, del reves.
		//cadena 1 = 1,2,3,4,5
		//cadena 2 = 5,4,3,2,1
		
			
		//hecho pero con un solo array
		int[] array = {1, 2, 3, 4, 5};
		
		System.out.println("Hacia delante");
		for (int contador = 0; contador <= 4; contador++) {
			System.out.print(array[contador] + "  ");
		}
		System.out.println(" ");
		System.out.println("Hacia atrás");
		for (int contador = 4 ; contador >= 0 ; contador--) {
			System.out.print(array[contador] + "  ");
		}

		//ejemplo alberto
		int[] array2 = {1, 2, 3, 4, 5};
		int[] array3 = new int[5];
		
		int longitud = array2.length-1;
		
		//rellenar array
		
		for (int x=longitud;x>=0;x--) {
			array3[x]=array2[longitud-x];
		}
		
		System.out.println(" ");
		
		//Pintar  array
		System.out.println("Hacia atrás de nuevo");
		for (int x=0;x<=longitud;x++) {
			System.out.print(array3[x] + "  ");
		}
		
		
		
		
		
		
		
		
	}

}
