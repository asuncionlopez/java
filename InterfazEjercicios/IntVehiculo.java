package InterfazEjercicios;

public interface IntVehiculo {

	int VELOCIDAD_MAXIMA = 120;
	
	// DECLARACION DE METODOS
	
	String frenar (int velocidad);
	String acelerar (int velocidad);
	Double calcularPrecio (int pvp);
	
}
