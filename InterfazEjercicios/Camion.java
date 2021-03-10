package InterfazEjercicios;

public class Camion implements IntVehiculo {

	private int peso;
	
	//SETTERS AND GETTERS
	
	public final int getPeso() {
		return peso;
	}

	public final void setPeso(int peso) {
		this.peso = peso;
	}
	
	//METODOS

	@Override
	public String frenar(int velocidad) {
		// TODO Auto-generated method stub
		double metros = ((velocidad * velocidad) / 180 + (this.getPeso()/100)*2);
		return "La distancia de frenado es: " + metros + " metros";
	}

	@Override
	public String acelerar(int velocidad) {
		// TODO Auto-generated method stub
		String marcha="";
		if (velocidad > 0 && velocidad <= 20) marcha="primera";
		if (velocidad > 20 && velocidad <= 40) marcha="segunda";
		if (velocidad > 40 && velocidad <= 60) marcha="tercera";
		if (velocidad > 60 && velocidad <= 80) marcha="cuarta";
		if (velocidad > 80) marcha="quinta";
		
		if (velocidad > VELOCIDAD_MAXIMA) {
			return "Vas a " + velocidad + " kms por hora por encida de la permitida que es " + VELOCIDAD_MAXIMA + " y llevas puesta la marcha " + marcha;
		} else {
			return "Vas a " + velocidad + " kms por hora"+ " y llevas puesta la marcha " + marcha;
		}

	}

	@Override
	public Double calcularPrecio(int pvp) {
		// TODO Auto-generated method stub
		return (double) (pvp + (pvp * 10 / 100));
	}

}
