package Abstractas;

public class Prueba {

	public static void main(String[] args) {

		// No se pueden instanciar objetos de una clase abstracta
		// Avion avion1 = new Avion();

		Caza caza1 = new Caza();
		caza1.setModelo("F-18 Hornet");
		caza1.setNum_misiles(2);
		caza1.setPotencia(1000);
		caza1.setTonelaje(0);

		System.out.println(caza1);
	}
}
