package Ejercicios;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Pedir por teclado 3 datos:
		// 2 números
		// Una operación ( + - / *)
		// Switch
		// Calculo
		// Controlar la operación
		// Nos metemos en un bucle hasta que pulsemos una f en operación

		Scanner nombre = new Scanner(System.in);
		
		boolean juego = true;
		
		do {
			
			System.out.println("Dime qué quieres hacer (+ - / *):");
			String operacion = nombre.next();
			
			if (operacion.equals("f")) {
				juego = false;
				System.out.println("Hasta pronto...");
				break;
			} 
			else if (operacion.equals("+") && operacion.equals("-")&& operacion.equals("/") && operacion.equals("*"))	//controlador de operacion
			{
				System.out.println("Operación incorrecta");
			}
			else{
				
			System.out.println("Dime el primer número:");
			int num1 = nombre.nextInt();
			System.out.println("Dime el segundo número número:");
			int num2 = nombre.nextInt();
			

			switch (operacion) {
			case "+":
				System.out.println("La suma de " + num1 + " y " + num2 + " es " + (num1 + num2));
				break;
			case "-":
				System.out.println("La resta de " + num1 + " y " + num2 + " es " + (num1 - num2));
				break;
			case "/":
				System.out.println("La división de " + num1 + " y " + num2 + " es " + (num1 / num2));
				break;
			case "*":
				System.out.println("La multiplicación  de " + num1 + " y " + num2 + " es " + (num1 * num2));
				break;
			default:
				System.out.println("Operación incorrecta");
				}		
			}	

		}while(juego);
		nombre.close();
	}
	
}
