package Herencia;

public class Multa extends Expediente {

	public Multa(int codexpediente, String tipo) { // Invoca el constructor expediente de la clase padre
		super(codexpediente, tipo); 			   // Los constructores NO SE HEREDAN automaticamente
		// TODO Auto-generated constructor stub
	}

	private double importe = 0;

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	@Override
	public void verdatos() { // con super, llamamos el método "verdatos" de la clase padre "Expediente"
		// TODO Auto-generated method stub
		super.verdatos();
		System.out.println("El importe de la multa del expediente es: " + importe);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getDescripcion() + " y el responsable es " +  getResponsable();
	}
	

}