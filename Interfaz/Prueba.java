package Interfaz;

public interface Prueba extends Libreria {

	@Override
	default String responsable() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	default int horas_trabajo() {
		// TODO Auto-generated method stub
		return 0;
	}

}
