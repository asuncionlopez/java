package Condiciones;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int x=1;
		
		switch(x)
		{
		case 0: System.out.println("cero");
			break;
		case 1: System.out.println("uno");
			break;	
		case 2: System.out.println("dos");
			break;
		default:
			System.out.println("Ninguna");
			
		}
		
		
		Scanner numero= new Scanner(System.in); 
		
		String letra;
		letra=  numero.nextLine();
		
		
		switch(letra)
		{
		case "a": System.out.println("Letra a");
			break;
		case "e": System.out.println("Letra e");
			break;	
		case "i": System.out.println("Letra i");
			break;
		case "o": System.out.println("Letra o");
			break;
		case "u": System.out.println("Letra u");
			break;
		
		default:
			System.out.println("Consonante " + letra);
		}
	}

}
