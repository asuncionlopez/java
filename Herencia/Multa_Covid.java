package Herencia;

public class Multa_Covid extends Expediente {

	public Multa_Covid(int codexpediente, String tipo) {    //método del padre "Expediente"
		super(codexpediente, tipo);
		// TODO Auto-generated constructor stub
	}

	private boolean mascarilla;
	private String fecha;

	public final boolean isMascarilla() {		//es el getter de un booleano
		return mascarilla;
	}

	public final void setMascarilla(boolean mascarilla) {
		this.mascarilla = mascarilla;
	}

	public final String getFecha() {
		return fecha;
	}

	public final void setFecha(String fecha) {
		this.fecha = fecha;
	}

	@Override
	public void verdatos() {
		// TODO Auto-generated method stub
		super.verdatos();
		System.out.println("¿Llevaba mascarilla? " + mascarilla + ". Y la fecha es " + fecha);
	}

}
