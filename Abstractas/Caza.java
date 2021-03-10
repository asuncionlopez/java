package Abstractas;

public class Caza extends Avion {

	// PROPIEDADES

	private int num_misiles;
	private String modelo;

	// SETTERS AND GETTERS

	public final int getNum_misiles() {
		return num_misiles;
	}

	public final void setNum_misiles(int num_misiles) {
		this.num_misiles = num_misiles;
	}

	public String getModelo() {
		return modelo;
	}

	public final void setModelo(String modelo) {
		this.modelo = modelo;
	}

	// METODOS

	public String misiles(int num_misiles) {
		return "Disparando " + getNum_misiles() + " misiles";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Es un caza modelo: " + getModelo() + " con una potencia de fuego de: " + getNum_misiles() + " misiles";
	}

	@Override		//DEL METODO ABSTRACTO
	public String repostar() {
		// TODO Auto-generated method stub
		return "Reposto en tierra y en vuelo";
	}
}
