package Clases;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona p1 = new Persona();
		Persona p2 = new Persona();
		
		p1.mostrar();
		System.out.println(p1.saludar("hola"));
		
		p1.setNombre(" asuncion ");
		p2.setNombre(" rosa ");
		System.out.println(p1.getNombre() + p2.getNombre());
		
		p1.setSalario(1200);
		System.out.println(p1.getSalario());
	
	}
}
