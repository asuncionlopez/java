package HerenciaEjercicios;

public class Rapaces extends Pajaro {

	// PROPIEDADES

	private int envergadura;
	private double velocidad;

	// SETTERS AND GETTERS

	public int getEnvergadura() {
		return envergadura;
	}

	public void setEnvergadura(int envergadura) {
		this.envergadura = envergadura;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	// METODOS

	@Override
	public String Sonido() {
		// TODO Auto-generated method stub
		return "El sonido que hace es: Aaaaaaaaaaah aaaaaaaaaaaah";
	}
}
