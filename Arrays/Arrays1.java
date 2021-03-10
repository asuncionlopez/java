package Arrays;

import java.util.Scanner;

public class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declarado e inicializado

		int[] array1 = new int[10]; // [10] es el tamaño del array
		String[] frases = new String[5]; // [5] es el tamaño del array
		int[] array2 = { 10, 20, 30 }; // {} es el valor de cada posición

		// Pedir 3 nombres, los ponemos en el array frases y luego los visualizamos

		Scanner entrada = new Scanner(System.in);
		
		for (int posicion = 0; posicion <= 2; posicion++) {
			frases[posicion] = entrada.nextLine();
		}
		for (int posicion = 0; posicion <= 2; posicion++) {
			System.out.println("El nombre es: " + frases[posicion]);
			
			}
		}
	}

