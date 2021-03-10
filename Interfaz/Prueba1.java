package Interfaz;

public interface Prueba1 extends Prueba {

	@Override
	default String responsable() {
		// TODO Auto-generated method stub
		return Prueba.super.responsable();
	}

	@Override
	default int horas_trabajo() {
		// TODO Auto-generated method stub
		return Prueba.super.horas_trabajo();
	}

}
