package Ejercicios1;

import java.util.Locale;
import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner area = new Scanner(System.in);
		area.useLocale(Locale.ENGLISH);				//para poder utilizar los puntos para los decimales y no vernos obligados a usar las comas, porque las comas no se usan
		
		System.out.println("Dime el radio del círculo para calcular su área");
		double radio = area.nextDouble();

		double operacion = Math.PI * (radio * radio);

		System.out.println("El área del círculo es: " + operacion);

		area.close();
	}
}
