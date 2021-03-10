package HerenciaEjercicios;

public class Periquitos extends Pajaro {

	// PROPIEDADES

	private boolean canta;

	// SETTERS AND GETTERS

	public boolean isCanta() {
		return canta;
	}

	public void setCanta(boolean canta) {
		this.canta = canta;
	}

	// METODOS

	@Override
	public String Sonido() {
		// TODO Auto-generated method stub
		return "El sonido que hace es: Pio pio pio";
	}
}
