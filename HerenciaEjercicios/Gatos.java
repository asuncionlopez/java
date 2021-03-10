package HerenciaEjercicios;

public class Gatos extends Animal {

	// PROPIEDADES

	private boolean ronronea;

	// SETTERS Y GETTERS

	public final boolean isRonronea() {
		return ronronea;
	}

	public final void setRonronea(boolean ronronea) {
		this.ronronea = ronronea;
	}

	// METODOS

	@Override
	public String Sonido() {
		// TODO Auto-generated method stub
		return "Sonido: Miau";
	}
}
