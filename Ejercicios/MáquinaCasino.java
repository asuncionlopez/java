package Ejercicios;

public class MáquinaCasino {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// array de 3 posiciones que pueda tener de forma aleatoria
		// un numero entre el 1 y el 3 cada posicion Math.random()*3
		// si 3 numeros iguales premio gordo
		// si 2 numeros premio mediano
		// si 3 distintos sin premio

		char[] tragaperras = new char[3];
		int contador = 0;
		int numero = 0;

		for (int i = 0; i < 3; i++) {
			numero = (int) (Math.random() * 3);
			if (numero == 1) {

				tragaperras[i] = '*';

			} else if (numero == 2) {

				tragaperras[i] = 'X';

			} else {
				tragaperras[i] = 'O';
			} 
				
			
		}

		// mostrar tirada
		for (int i = 0; i < tragaperras.length; i++) {
			System.out.print(tragaperras[i]);
		}

		System.out.println();

		// comprobar con bucles
		for (int i = 0; (i < tragaperras.length - 1) && (contador == 0); i++) {
			for (int j = i + 1; j < tragaperras.length; j++) {
				if (tragaperras[i] == tragaperras[j]) {
					++contador;
				}
			}
		}

		// mostrar resultado
		if (contador == 1) {

			System.out.println("Premio mediano");

		} else if (contador == 2) {

			System.out.println("Premio gordo!!!");

		} else {

			System.out.println("Has perdido la pasta");

		}

		/*
		 * //comprobar con if if ((tragaperras[0] == tragaperras[1]) && (tragaperras[0]
		 * == tragaperras[2])){
		 * 
		 * System.out.println("Premio gordo!!!");
		 * 
		 * }else if ((tragaperras[0] == tragaperras[1]) && (tragaperras[0] !=
		 * tragaperras[2])){
		 * 
		 * System.out.println("Premio mediano");
		 * 
		 * }else if ((tragaperras[0] != tragaperras[1]) && (tragaperras[0] ==
		 * tragaperras[2])) {
		 * 
		 * System.out.println("Premio mediano");
		 * 
		 * }else if ((tragaperras[0] != tragaperras[1]) && (tragaperras[1] ==
		 * tragaperras[2])) {
		 * 
		 * System.out.println("Premio mediano");
		 * 
		 * }else{
		 * 
		 * System.out.println("Has perdido la pasta");
		 * 
		 * }
		 */

	}

}
