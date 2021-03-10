package Abstractas;

public class AvionPasajeros extends Avion {

	// PROPIEDADES

	private int num_pasajeros;
	private int num_pilotos;

	// SETTERS AND GETTERS

	public final int getNum_pasajeros() {
		return num_pasajeros;
	}

	public final void setNum_pasajeros(int num_pasajeros) {
		this.num_pasajeros = num_pasajeros;
	}

	public final int getNum_pilotos() {
		return num_pilotos;
	}

	public final void setNum_pilotos(int num_pilotos) {
		this.num_pilotos = num_pilotos;
	}

	// METODOS

	public double Beneficio(double pvp_billete) {
		return (pvp_billete * num_pasajeros);
	}

	@Override
	public String repostar() {
		// TODO Auto-generated method stub
		return "Reposto en el aeropuerto y en la Base";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Es un avion " + getModelo() + " con un número de pasajeros de " + getNum_pasajeros();
	}

	@Override // SIRVE PARA COMPARAR OBJETOS CON OTROS OBJETOS
	public boolean equals(Object obj) {
		// Convertimos obj en AvionPasajeros
		AvionPasajeros comparar = (AvionPasajeros) obj;

		if ((this.getModelo() == comparar.getModelo()) && (this.getNum_pasajeros() == comparar.num_pasajeros)) {
			return true;
		} else {
			return false;
		}

	}

}
