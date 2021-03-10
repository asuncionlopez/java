package Herencia;

public class Principal {

	public static void main(String[] args) {

		/*
		 * Padre p1=new Padre(1,"hola");
		 * 
		 * System.out.println(p1.getDato()); System.out.println(p1.getCod());
		 * 
		 * Hijo1 h1=new Hijo1(100, "Pedro"); h1.setPaga_semanal(200);
		 * 
		 * System.out.println(h1.getDato()); System.out.println(h1.getCod());
		 * System.out.println(h1.getPaga_semanal());
		 * System.out.println(h1.paga_mensual());
		 */
		/*
		 * Expediente ex1 = new Expediente(10, "A"); ex1.setCodexpediente(100000);
		 * ex1.setDescripcion("Desripcionvckls ajnmkfjdkflasl");
		 * ex1.setResponsable("Pedro"); ex1.setTipo("Z"); ex1.verdatos();
		 * 
		 * Multa m1 = new Multa(20, "B"); m1.setCodexpediente(90000);
		 * m1.setDescripcion("fmlsfklafkldsjaklfjflka"); m1.setTipo("X");
		 * m1.setResponsable("pepito"); m1.setImporte(1000);
		 * 
		 * m1.verdatos(); m1.getImporte();
		 */

		Multa_Trafico mt1 = new Multa_Trafico(20, "B");
		mt1.setResponsable("Paco");
		mt1.setDescripcion("Exceso de velocidad");
		mt1.setMatricula("MK");
		mt1.setFecha("Viernes");
		mt1.verdatos();

		Multa_Covid mc2 = new Multa_Covid(10, "C");
		mc2.setResponsable("Pepa");
		mc2.setDescripcion("No llevaba mascarilla");
		mc2.setMascarilla(false);
		mc2.setFecha("Jueves");
		mc2.verdatos();

		// Para saber de qué tipo es una clase, objeto, etc... con instanceof
		// Método saberTipo

		Expediente expe1 = new Expediente(10, "A");
		System.out.println(saberTipo(expe1));
		System.out.println(saberTipo(mt1));
		System.out.println(saberTipo(mc2));

		Multa m3 = new Multa(10, "A"); // variables del metodo ImporteMayor
		Multa m4 = new Multa(10, "B");
		m3.setDescripcion("Multa");
		m3.setResponsable("Alberto");
		m3.setImporte(200);
		m4.setImporte(2000);

		System.out.println(ImporteMayor(m3, m4));
		System.out.println(conocerTipo(m3));
		System.out.println(m3);

		// array de 50 posiciones para el método MultaMayor

		Multa multas[] = new Multa[50];

		for (int i = 0; i < multas.length; i++) { // Relleno con descripción e importe
			multas[i] = new Multa(i, "A");
			multas[i].setDescripcion("Descripción" + i);
			multas[i].setImporte(Math.random() * 1000 + 25);
		}
		System.out.println(CalcularMayor(multas));

	}
	// metodo para saber el tipo

	public static String saberTipo(Expediente c1) {

		if (c1 instanceof Multa_Trafico) {
			return "Eres multa de tráfico";
		}
		if (c1 instanceof Multa_Covid) {
			return "Eres multa de Covid";
		}
		if (c1 instanceof Multa) {
			return "Eres multa";
		}
		if (c1 instanceof Expediente) {
			return "Eres Expediente";
		}

		return "No lo sé";
	}
	// Método: Recibir dos objetos de tipo multa y que nos diga cuál es el de mayor
	// importe

	public static String ImporteMayor(Multa m3, Multa m4) {

		if (m3.getImporte() > m4.getImporte()) {
			return "El primer importe " + m3.getImporte() + " es el mayor";
		} else if (m4.getImporte() > m3.getImporte()) {
			return "El segundo importe " + m4.getImporte() + " es el mayor";
		}
		return "Los dos importes son iguales";

	}

	// object

	public static String conocerTipo(Object x) {
		return "Es del tipo --> " + x.toString();
	}

	// metodo para array

	public static String CalcularMayor(Multa[] multarray) {
		double mayor = 0;
		int codigo = 0;
		for (int x = 0; x < multarray.length; x++) {
			if (multarray[x].getImporte() > mayor) {
				mayor = multarray[x].getImporte();
				codigo = multarray[x].getCodexpediente();
			}
		}
		return "La multa mayor es de un importe de: " + mayor + " . " + "Y su código es: " + codigo;
	}

}
