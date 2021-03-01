package Ejercicios;

public class ArrayAsteriscos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Array de enteros de 10 --> Math.random()*10+1
		// lo rellenamos con números del 1 al 10
		// por cada numero pintamos el mismo número de asteriscos
		// 2,3,4 --> **, ***, ****

		int array1[] = new int[10];

		// rellenar de num aleatorios
		for (int x = 0; x < array1.length; x++) 
		{
			array1[x] = (int) (Math.random() * 10 + 1);
		}
			// por cada numero del array...
			for (int x = 0; x < array1.length; x++) 
			{
				System.out.print("Numero:" + array1[x] + "->");

				// pinto asteriscos
				for (int asteriscos = 0; asteriscos < array1[x]; asteriscos++) 
				{
				System.out.print("*");
				}
			System.out.println();
			}
	}

}
