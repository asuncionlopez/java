package Arrays;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 0; // declaración e inicialización
		int z; // declaración

		// Dos opciones:
		// Estilo c++

		int array1[]; // declaración

		// Estilo Java
		int[] array2; // declaración

		// Se pueden inicializar

		int[] array3 = { 20, 30, 40, 34, 37 }; // declaración e inicialización

		System.out.println("Recorro el bucle");
		
		for (int contador = 0; contador <= 4; contador++) { //para recorrer las posiciones del array
			System.out.print(array3[contador] + " - ");
		}
		System.out.println("\nRecorro el bucle del revés");
		for (int contador = 4; contador >= 0; contador--) {
			System.out.print(array3[contador] + " - ");
		}


	}

}
