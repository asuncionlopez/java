package Ejercicios1;

public class Parentesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// preferencias de operadores

		double calculo = 10 + 20 - 30;
		System.out.println(calculo);

		calculo = 10 + 20 * 30; // 20*30+10
		System.out.println(calculo);

		calculo = (10 + 20) * 30; // 10+20*30
		System.out.println(calculo);

		
		double impuesto = 0.21;
		double neto = 1000;
		double bruto = neto - (neto*impuesto);
		System.out.println(bruto);
		
		
	}

}
