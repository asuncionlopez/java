package Bucles;

import java.util.Scanner;

public class PracticaDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Pedir un número y retroceder hasta 0
		
		Scanner numero = new Scanner(System.in); 
		
		int n1;
		n1=numero.nextInt();
		
		
		do 
		{
			System.out.println(n1+"-");
			n1--;
			
		} while(n1>=0);
		
		numero.close();
	}

}
