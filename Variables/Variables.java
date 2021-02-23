package Variables;

public class Variables {

	public static void main(String[] args)
	// TODO Auto-generated method stub
	{
		/*
		 * 
		 * Esto es un comentario Con múltiples líneas
		 */

		// Esto es un comentario

		@SuppressWarnings("unused") // Esto suprime el "warnig" por no estar usando "v1"
		int v1;
		int v2;
		System.out.println("Esto es una prueba");
		v1 = 10;
		System.out.println(v1);
		v2 = 20;
		System.out.println(v1 + v2);
		System.out.println("El resultado de sumar estos dos números es " + v1 + v2);
		// cast = convertir un tipo a otro tipo. Ha convertido todo en cadenas. (cast to
		// string)

		int v3 = v1 + v2;
		// Aquí se suma
		System.out.println("El resultado de sumar estos dos números es " + v3);
		// Aquí se imprime el resultado que hemos optenido en v3
		System.out.println("El resultado de sumar estos dos números es " + (v1 + v2));
		// Aquí obligamos a hacer primero la suma, y luego print. Los () predominan. Es mejor usar este método.
		// No haría falta poner la variable v3.
	}

}
