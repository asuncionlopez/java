package Metodos;

public class Metodo {

	//primer metodo
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * publico privado / estados Static / retorno(void) nombreMetodo (p1,p2,p2)
		 * {
		 * 		devolver algo
		 * 
		 * 
		 * publico estático nada 
		 * 
		 * String [] args --> array de Strings
		 * }
		 */
		
		int x=m1();
		System.out.println(x);
		m2();
		System.out.println(nombre());
		System.out.println(sumar(10, 20));
		System.out.println(iniciales("ejemplo"));
		String dato="prueba";
		System.out.println(iniciales(dato));
		System.out.println(mayus("hola"));
		System.out.println(numeroPrimo(7));
		
	}
	
	//segundo metodo / funcion
	static int m1()
	{
		return 1;
			 
	 }
	//procedimiento
	public static void m2() 
	{
		System.out.println("Estoy en un metodo void");
	}	

	//De cadena
	public static String nombre()
	{
		return "Asunción";
	}
	
	//Con argumentos
	public static int sumar (int num1, int num2)
	{
		return num1+num2;
	}
	
	//Inicial
	//pasamos una cadena y me devuelve la 1º en mayus 
	//String x.charAt(0)
	
	public static char iniciales(String inicial)
	{
		String mayus = inicial.toUpperCase();
		return mayus.charAt(0);
		
	}
	
	//otra forma de poner la 1º en mayus y el resto en minusculas
	
	public static String mayus(String cadena) {
		
		char[] tempCharArray = cadena.toCharArray();
		tempCharArray[0] =  Character.toUpperCase(tempCharArray[0]) ;
		cadena = String.valueOf(tempCharArray);
		
		return cadena;
	}

	//iniciales 3 argumentos, nombre y 2 apellidos
	//devolver iniciales
	
	public static String nombreapellido(String n, String ap1, String ap2) 
	{
			
		return n.toUpperCase().charAt(0) + ". " + ap1.toUpperCase().charAt(0) + ". " + ap2.toUpperCase().charAt(0);
	}

	//numeros primos
	
	public static String numeroPrimo(double n1) {
		//Comprobar que es divisible por dos
		if (n1 % 2 == 0) {
			return "Numero No Primo";
		} 
		else 
		{
			// Contador
			int x = 2;
			
			// Comprobar si es primo
			while (x < n1) {
				if (n1 % x == 0) {
					// System.out.println("Divisible por:" + x);
								return "Numero No Primo";
				}
				x++;
			}			
				return "Numero Primo";
		}
	}
}

