package Variables;

public class Variables1 
{

	public static void main(String[] args)
	{
	
		boolean v=true;
		char letra='x';
		double d1=3.10;
		long l=189090;
		int i=10;		//32 bits
		short s=200;	//16 bits
		float f=2.4f;
		byte b=100; 	//8 bits
		
		
		/*
		 * Variables con nombre y apellido. Variables con salario e IRPF
		 * Visualizar todo (Te llamas..., ganas... euros y tus impuestos son... euros
		 */
		
		String nombre="Asunción";
		String apellido="López-Cepero García";
		long sueldo= 1500;
		int irpf=10;
		long impuesto=sueldo/irpf;
		
		System.out.println("Te llamas " + nombre + " " + apellido + ". Tu sueldo es " + sueldo + " euros, y tus impuestos son " + (sueldo/irpf) + " euros");
		System.out.println("Te llamas " + nombre + " " + apellido + ". Tu sueldo es " + sueldo + " euros, y tus impuestos son " + impuesto + " euros");
	}
	
}
