package Ejercicios2;

public class Sumar15Numeros {

	public static void main(String[] args) {

		int suma = 0;
		for (int i = 0; i < 15; i++) {
			int n = (int) (1 + Math.random() * 100);
			suma = suma + n;
			System.out.print(n + " ");
		}
		System.out.print("\n" + "La suma es " + suma);

	}

}
