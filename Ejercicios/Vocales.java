package Ejercicios;

import java.util.Scanner;

public class Vocales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// pedir un texto por pantalla
		// pintar solo las consonantes
		// prueba --> prb

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime una frase");
		String frase = entrada.nextLine();

	
		
		for (int contador = 0; contador < frase.length(); contador++) {
			
			char letra=frase.charAt(contador);
			
			if (letra == 'a' || letra == 'e' || letra == 'i' || letra== 'o' || letra == 'u') {
				continue;
			} else {
				System.out.print(letra);
			}

		}
			entrada.close();
	}

}
