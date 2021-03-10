package Ejercicios3;

public class Tablas {

	public String Saludar(String nombre) {

		return "hola como te llamas " + nombre;
	}

	public void media() {
		double array1[] = new double[5];

		// Rellenar Array
		for (int i = 0; i < array1.length; i++) {

			// Meter numeros entre -50 y 50
			array1[i] = (Math.random() * -100) + 50;
			System.out.println(array1[i]);
		}

		// Comprobamos par/impar/cero
		int ceros = 0, positivos = 0, negativos = 0;
		double sum_positivos=0, sum_negativos=0;
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] == 0) {
				ceros = ceros++;
			} else if (array1[i] > 0) {
				positivos = ++positivos;
				sum_positivos=sum_positivos+array1[i];
			} else {
				negativos = ++negativos;
				sum_negativos=sum_negativos+array1[i];
			}
		}
		//operador ternario
		System.out.println("La media de los positivos es " + (sum_positivos/((positivos==0)?1:positivos)) + " y la media de los negativos es " + (sum_negativos/((negativos==0)?1:negativos)));
		System.out.println("Y el número de ceros es " + ceros);
	}

}
