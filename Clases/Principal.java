package Clases;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona p1 = new Persona();
		Persona p2 = new Persona();

		p1.mostrar();
		System.out.println();
		System.out.println("Yo te saludo..." + p1.saludar("hola"));
		System.out.println();

		p1.setNombre("asuncion ");
		p2.setNombre("rosa ");
		System.out.println("Nombre1: " + p1.getNombre() + "Nombre2: " + p2.getNombre());
		System.out.println();

		p1.setSalario(1200);
		System.out.println("Salario: " + p1.getSalario());
		System.out.println();

		// PROBANDO LA CLASE VEHÍCULO

		Vehiculo v1 = new Vehiculo();

		/*v1.setTipo(1);
		v1.setRuedas(4);
		v1.setBastidor("A8");
		v1.setCv(15);
		v1.setPvp(1000);

		System.out.println("Tipo: " + v1.getTipo() + " - " + "Ruedas: " + v1.getRuedas() + " - " + "Bastidor: "
				+ v1.getBastidor() + " - " + "CV: " + v1.getCv() + " - " + "PVP: " + v1.getPvp() + " - " + "Potencia: "
				+ v1.getPotencia() + " - " + "Precio Final: " + v1.precio());*/

		// PROBANDO UTILIDADES

		// Utilidades ut1 = new Utilidades();
		System.out.println("¿Es primo?: " + Utilidades.numeroPrimo(2));
		System.out.println();
		System.out.println("¿Es par?: " + Utilidades.parImpar(2));
		
		System.out.println();

		if (Utilidades.numeroPrimo(v1.getPvp())) {
			System.out.println("El pvp es primo");

		} else {
			System.out.println("El pvp no es primo");

		}System.out.println();

		if (Utilidades.parImpar(v1.getPvp())) {
			System.out.println("El pvp es par");

		} else {
			System.out.println("El pvp no es par");

		}System.out.println();
		
		//Constructores permiten crear un objeto de la clase, pasando una de las propiedades que ya tenemos
		
		Vehiculo v2=new Vehiculo();
		v2.datos();
		
		//probar constructor con parametros
		System.out.println();
		
		Vehiculo v3 = new Vehiculo (2);
		v3.datos();
		System.out.println();
		
		Vehiculo v4 = new Vehiculo ('A');
		v4.datos();
		System.out.println();
		
		Vehiculo v5 = new Vehiculo ('B');
		v5.datos();
		System.out.println();
		
		Vehiculo v6 = new Vehiculo ('C');
		v6.datos();
		System.out.println();
		
		Vehiculo v7 = new Vehiculo (12000, "Bastidor 1");
		v7.datos();
	
	}
}
