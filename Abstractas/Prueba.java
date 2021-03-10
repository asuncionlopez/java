package Abstractas;

public class Prueba {

	public static void main(String[] args) {

		// No se pueden instanciar objetos de una clase abstracta
		// Avion avion1 = new Avion();

		// Objeto de la clase CAZA
		Caza caza1 = new Caza();
		caza1.setModelo("F-18 Hornet");
		caza1.setNum_misiles(2);
		caza1.setPotencia(1000);
		caza1.setTonelaje(0);

		System.out.println(caza1);

		// Objeto de la clase PASAJEROS
		AvionPasajeros avion1 = new AvionPasajeros();
		avion1.setModelo("Airbus A-380");
		avion1.setNum_pasajeros(1000);
		avion1.setTonelaje(90000);

		System.out.println(avion1);
		System.out.println("El beneficio es: " + avion1.Beneficio(100));

		// Ordenar - Comparar

		Caza caza2 = new Caza();
		caza2.setPotencia(1000);

		// Así siempre mirará la id en memoria
		// if (caza1==caza2) {
		// System.out.println("Son iguales");
		// }else {
		// System.out.println("Son distintos"); }

		// Así se puede hacer, pero no es la mejor forma
		// if (caza1.getPotencia==caza2.getPotencia) {
		// System.out.println("Son iguales");
		// }else {
		// System.out.println("Son distintos"); }

		// Comparar con equals
		if (caza1.equals(caza2)) {
			System.out.println("Son iguales");
		} else {
			System.out.println("No son iguales");
		}
		
		
		AvionPasajeros avion2 = new AvionPasajeros();
		avion2.setModelo("Airbus A-380");
		avion2.setNum_pasajeros(2000);

		if (avion1.equals(avion2)) {
			System.out.println("Son iguales");
		} else {
			System.out.println("No son iguales");
		}
	}
}
