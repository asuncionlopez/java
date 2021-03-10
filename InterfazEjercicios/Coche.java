package InterfazEjercicios;

public class Coche implements IntVehiculo {

	// PROPIEDADES

	private int ruedas;
	private double potencia;
	private double velocidad;

	// SETTERS AND GETTERS

	public final double getVelocidad() {
		return velocidad;
	}

	public final void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	public final int getRuedas() {
		return ruedas;
	}

	public final void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	public final double getPotencia() {
		return potencia;
	}

	public final void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	// METODOS

	@Override
	public String frenar(int velocidad) {
		// TODO Auto-generated method stub
		double metros = ((velocidad * velocidad) / 180);
		// return Double.toString(metros); //También se puede hacer así
		return "La distancia de frenado es: " + metros + " metros";
	}

	@Override
	public String acelerar(int velocidad) {
		// TODO Auto-generated method stub
		if (velocidad > VELOCIDAD_MAXIMA) {
			return "Vas a " + velocidad + " kms por hora por encida de la permitida que es " + VELOCIDAD_MAXIMA;
		} else {
			return "Vas a " + velocidad + " kms por hora";
		}

	}

	@Override
	public Double calcularPrecio(int pvp) {
		// TODO Auto-generated method stub
		return (double) (pvp + (pvp * 21 / 100));
	}

}
