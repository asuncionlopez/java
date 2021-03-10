package Abstractas;

public abstract class Avion {

	// PROPIEDADES

	private double tonelaje;
	private int potencia;

	// SETTERS AND GETTERS

	public final double getTonelaje() {
		return tonelaje;
	}

	public final void setTonelaje(double tonelaje) {
		this.tonelaje = tonelaje;
	}

	public final int getPotencia() {
		return potencia;
	}

	public final void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	// METODOS

	public String despegar() {
		return "Estoy despegando";
	}

	public String aterrizar() {
		return "Estoy aterrizando";
	}
	
	// METODO ABSTRACTO O PLANTILLA, lo tienen que definir las clases hijas Y ES OBLIGATORIO
	
	public abstract String repostar();
}
