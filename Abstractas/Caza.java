package Abstractas;

public class Caza extends Avion {

	// PROPIEDADES

	private int num_misiles;

	// SETTERS AND GETTERS

	public final int getNum_misiles() {
		return num_misiles;
	}

	public final void setNum_misiles(int num_misiles) {
		this.num_misiles = num_misiles;
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

	@Override // DEL METODO ABSTRACTO
	public String repostar() {
		// TODO Auto-generated method stub
		return "Reposto en tierra y en vuelo";
	}

	@Override // SIRVE PARA COMPARAR OBJETOS CON OTROS OBJETOS
	public boolean equals(Object obj) {
		// Convertimos obj a Caza
		Caza caza2 = (Caza) obj;

		if (this.getPotencia() == caza2.getPotencia()) {
			return true;
		} else {
			return false;
		}

	}

}
