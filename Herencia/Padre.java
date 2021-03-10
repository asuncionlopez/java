package Herencia;

public class Padre {

	private int cod;
	private String dato;

	public final int getCod() {
		return cod;
	}

	public final void setCod(int cod) {
		this.cod = cod;
	}

	public final String getDato() {
		return dato;
	}

	public final void setDato(String dato) {
		this.dato = dato;
	}

	public Padre(int cod, String dato) {
		super();
		this.cod = cod;
		this.dato = dato;
	}

}
