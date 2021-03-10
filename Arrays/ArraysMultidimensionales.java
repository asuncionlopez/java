package Arrays;

public class ArraysMultidimensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// permiten tener arrays de arrays

		int x[][] = new int[2][3]; // tiene 2*3 posiciones (0,0 - 0,1 - 0,2 - 1,0 - 1,1 - 1,2)

		x[0][0] = 1;
		x[1][0] = 1;
		x[1][1] = 1;

		// System.out.println(x[0][0]);

		for (int z = 0; z < x.length; z++) // filas
		{
			for (int h = 0; h < x[z].length; h++) // columnas
			{
				System.out.print(x[z][h]);
			}
			System.out.println();
		}

	}

}
