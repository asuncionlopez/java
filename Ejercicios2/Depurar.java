package Ejercicios2;

public class Depurar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		String cadena = "Esto es una prueba";
		int[] array = new int[5];

		num = 10;
		if (num > 10) {
			System.out.println("Mayor que 10");
		} else {
			System.out.println("Menor que 10");
		}

		cadena = cadena.toUpperCase();

		for (int contador = 0; contador < 5; contador++) {
			System.out.println(array[contador]);
		}
	}

}
