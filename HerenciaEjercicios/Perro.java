package HerenciaEjercicios;

public class Perro extends Animal {

	// PROPIEDADES

	private boolean peligroso;

	// SETTERS AND GETTERS

	public final boolean isPeligroso() {
		return peligroso;
	}

	public final void setPeligroso(boolean peligroso) {
		this.peligroso = peligroso;
	}

	// METODOS
	@Override
	public String Sonido() {
		// TODO Auto-generated method stub
		return "El sonido es: Guauuuu";
	}

}
