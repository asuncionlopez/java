package HerenciaEjercicios;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Objeto de la clase ANIMAL
		Animal animal1 = new Animal();
		animal1.setTipo("Animal");
		animal1.setPatas(4);
		animal1.setColor("Blanco");

		System.out.println("\n" + animal1); // identificativo en la memoria Java que animal1
		System.out.println(animal1.Sonido());
		System.out.println(animal1.chip());

		// Objeto de la clase GATO
		Gatos gato1 = new Gatos();
		gato1.setTipo("Gato");
		gato1.setColor("Negro");
		gato1.setPatas(4);

		System.out.println("\n" + gato1);
		System.out.println(gato1.Sonido());
		System.out.println(gato1.chip());

		// Objeto de la clase PERRO

		Perro perro1 = new Perro();
		perro1.setTipo("Perro");
		perro1.setColor("Blanco");
		perro1.setPatas(4);

		System.out.println("\n" + perro1);
		System.out.println(perro1.Sonido());
		System.out.println(perro1.chip());

		// Objeto de la clase HAMSTER

		Hamster hams1 = new Hamster();
		hams1.setTipo("Hamster");
		hams1.setColor("Marrón");
		hams1.setPatas(4);

		System.out.println("\n" + hams1);
		System.out.println(hams1.Sonido());
		System.out.println(hams1.chip());

		// Objeto de la clase RAPAZ
		Rapaces rapaz1 = new Rapaces();
		rapaz1.setTipo("Ave Rapaz");
		rapaz1.setColor("Marrón");
		rapaz1.setPatas(2);

		System.out.println("\n" + rapaz1);
		System.out.println(rapaz1.Sonido());
		System.out.println(rapaz1.chip());

		// Objeto de la clase PERIQUITO
		Periquitos peri1 = new Periquitos();
		peri1.setTipo("Ave Doméstico");
		peri1.setColor("Amarillo");
		peri1.setPatas(2);

		System.out.println("\n" + peri1);
		System.out.println(peri1.Sonido());
		System.out.println(peri1.chip());
	}

}
