package Clases;

public class Vehiculo {

	// tipo String
	// ruedas int
	// bastidor String
	// cv int
	// pvp double.

	// Atributos de la clase
	private int tipo;
	private int ruedas;
	private String bastidor;
	private int cv;
	private double pvp;

	// constructor para inicializar propiedades
	Vehiculo() {
		ruedas = 4;
		tipo = 0;
		pvp = 0;
		cv = 0;
		bastidor = "Sin bastidor";
	}

	Vehiculo(int ruedas) {
		this.ruedas = ruedas;
		tipo = 0;
		pvp = 0;
		cv = 0;
		bastidor = "Sin bastidor";
	}

	// Constructor que recibe un char
	// A tipo 1 ruedas 2
	// B tipo 2 ruedas 4
	// C tipo 3 ruedas 8
	Vehiculo(char p1) {
		switch (p1) {
		case 'A':
			tipo = 1;
			ruedas = 2;
			break;
		case 'B':
			tipo = 2;
			ruedas = 4;
			break;
		case 'C':
			tipo = 3;
			ruedas = 8;
			break;
		default:
			ruedas = 4;
			tipo = 0;

		}
		pvp = 0;
		cv = 0;
		bastidor = "Sin bastidor";
	}
	
	//constructor que inicialice el pvp y bastidor
	
	Vehiculo (double precio, String bastidor){
		this.pvp=precio;
		this.bastidor=bastidor;
		ruedas=4;
		tipo=1;
		cv=0;
	}
	
	

	// Ver datos --> print de todas las variables
	public void datos() {
		System.out.println("Tipo: " + tipo + " - " + "Ruedas: " + ruedas + " - " + "Bastidor: " + bastidor + " - "
				+ "CV: " + cv + " - " + "PVP: " + pvp);
	}

	/*
	 * private int potencia;
	 * 
	 * public int getPotencia() { return potencia; }
	 * 
	 * public void setPotencia() { this.potencia = (cv*2); }
	 */

	// getters y setters
	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		if (tipo == 1 || tipo == 2 || tipo == 3) {
			this.tipo = tipo;
		} else {
			System.out.println("Los datos son del 1 al 3");
		}

	}

	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	public String getBastidor() {
		return bastidor;
	}

	public void setBastidor(String bastidor) {
		this.bastidor = bastidor;
	}

	public int getCv() {
		return cv;
	}

	public void setCv(int cv) {
		this.cv = cv;
	}

	public double getPvp() {
		return pvp;
	}

	public void setPvp(float pvp) {
		this.pvp = pvp;
	}

	public int getPotencia() {
		return cv * 2;
	}

	// crear metodo llamado precio
	// Precio --> pvp + impuestos. Tipo 1 = 10 ; Tipo 2 = 12; Tipo 3 = 15
	//
	// cambiar el metodo serTipo
	// solo debe admitir del 1 al 3

	public double precio() {
		double impuestos = 0;
		if (tipo == 0) {
		} else if (tipo == 1) {
			impuestos = 10;
			return pvp + (pvp * (impuestos / 100));
		} else if (tipo == 2) {
			impuestos = 12;
			return pvp + (pvp * (impuestos / 100));
		} else if (tipo == 3) {
			impuestos = 15;
			return pvp + (pvp * (impuestos / 100));
		}
		return 0;
	}

}
