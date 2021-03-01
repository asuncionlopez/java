package Clases;

public class Persona {
//Puede tener propiedades (variables)

	//propiedades
	private String nombre;
	private long salario;
	
	//metodos especiales para las propiedades privates: setters y getters
	
	
	public String getNombre() 
	{
		return nombre;
	}
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	public long getSalario() 
	{
		return salario;
	}
	public void setSalario(long salario) 
	{
		this.salario = salario;
	}
	
	
	//Metodos
	public void mostrar()
	{
		System.out.println("Estoy en una instancia de la clase Persona");	
	}
	
	
		private void metodo_privado ()
		{
			System.out.println("Esto es un método privado");
		}
		
		//crear metodo que imprima mi nombre y me salude
		
		public String saludar (String nombre)
		{
			return nombre.toUpperCase();
		}
}
