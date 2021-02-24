package Bucles;

public class BucleFor {

	int x = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * for (int i=0; i<=10; i++){ System.out.println(i);
		 */
		// Scopes de variables
		// ---------------------------
		// BUCLE
		// for(expresion_inicial ; condicion ; incremento)
		int i;
		// Scopes de variables (ambitos)

		for (i = 1; i <= 10; i++)
			;
		{
			System.out.println(i);
		}
		// ---------------------------
		System.out.println(i);
	}
}
