package Ejercicios;

import javax.swing.SortOrder;

public class OrdenarNumerosAlgoritmo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Ordenar arrays con un array auxiliar
		// 1 - recorrer el bucle para averiguar el mayor
		// 2 - grabamos en el segundo array
		// 3 - marcar a true la posición seleccionada en el array auxiliar
		// 4 - volver a la repetición

		// crear y rellenar el array
		int[] array1 = { 90, 34, 51, 676, 2 };

		// crear el booleano y el array final
		int[] array2 = new int[5];
		boolean[] auxiliar = new boolean[5];

		// recorrer el array de destino

		for (int contador = 0; contador < array1.length; contador++) 
		{

			// definir variable auxiliar
			int aux = -1;
			int pos = 0;

			// recorrer segundo bucle
			for (int contador1 = 0; contador1 < array1.length; contador1++)

			{
				// esa posicion ya ha sido eliminada?
				if (!auxiliar[contador1])
					if (array1[contador1] > aux) 
					{
						aux = array1[contador1];
						pos = contador1;
					}

			} // Fin del bucle anidado
			array2[contador] = aux;
			auxiliar[pos] = true;

		} // fin del bucle principal

		// comprobar el array ordenado
		for (int i = 0; i < array2.length; i++) 
		{
			System.out.print(array2[i] + " ");
		}
	}
}
