package HerenciaEjercicios;

public class Hamster extends Animal {

	// PROPIEDADES

	private String raza;

	// SETTERS AND GETTERS

	public final String getRaza() {
		return raza;
	}

	public final void setRaza(String raza) {
		this.raza = raza;
	}

	// METODOS
	@Override
	public String Sonido() {
		// TODO Auto-generated method stub
		return "El sonido del Hamster es: ñiñiñiñiñiñi";
	}

}
