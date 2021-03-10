package HerenciaEjercicios;

public class Animal {

	// PROPIEDADES

	private String tipo;
	private int patas;
	private String color;
	private boolean castrado;
	private char sexo;

	// SETTERS Y GETTERS

	public final int getPatas() {
		return patas;
	}

	public final void setPatas(int patas) {
		this.patas = patas;
	}

	public final String getColor() {
		return color;
	}

	public final void setColor(String color) {
		this.color = color;
	}

	public final String getTipo() {
		return tipo;
	}

	public final void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public final boolean isCastrado() {
		return castrado;
	}

	public final void setCastrado(boolean castrado) {
		this.castrado = castrado;
	}

	public final char getSexo() {
		return sexo;
	}

	public final void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String Sonido() {
		return "No tengo todavía ningún sonido";
	}

	// METODOS

	@Override
	public String toString() {
		return "El animal es de tipo: " + tipo + ". Es un animal de color: " + color + ", y tiene " + patas + " patas.";
	}

	public String chip() {
		return "CHIP:" + "Código-AA-" + (Math.random() * 10 + 5000);
	}
}
