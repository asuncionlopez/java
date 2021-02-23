package Variables;

public class OperadoresLogicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * == != <= >= < >
		 *
		 */
		
		int z=10;
		int r=9;
		System.out.println(z>r);
		System.out.println(z<r);
		
		/*
		 * Operadores relacionales
		 * && --> NAD
		 * || --> OR
		 * ! --> NOT
		 */
		
		int x=90;
		System.out.println(z<r || x>r);
		System.out.println(z<r && x>r);
		System.out.println(!(z<r && x>r));
		
		
		/* 
		 * El operador ternario devuelve un valor si se cumple una expresion
		 */
		
		String v1=z<r?"Si":"No";  //Si se cumple devuelve lo que hay detras de la interrogacion, y si no lo que hay detras de los ":"
		System.out.println(v1);
		
		//Que nos diga si un número es par o impar
		
		int num1=10;
		int num2=2;
		System.out.println(num1%num2==0?"Par" : "Impar");
		
		
	}

}
