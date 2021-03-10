package Herencia;



	public class Utilidades extends Expediente{
// Método: Recibir dos objetos de tipo multa y que nos diga cuál es el de mayor
// importe

	public Utilidades(int codexpediente, String tipo) {   //Constructor de Expediente
			super(codexpediente, tipo);
			// TODO Auto-generated constructor stub
		}

	public static String ImporteMayor(Multa m3, Multa m4) {

		if (m3.getImporte() > m4.getImporte()) {
			return "El primer importe " + m3.getImporte() + " es el mayor";
		} else if (m4.getImporte() > m3.getImporte()) {
			return "El segundo importe " + m4.getImporte() + " es el mayor";
		}
		return "Los dos importes son iguales";

	}
}
