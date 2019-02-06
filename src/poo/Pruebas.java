package poo;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleados trabajador1 = new Empleados("paco");
		Empleados trabajador2 = new Empleados("Ana");
		Empleados trabajador3 = new Empleados("Antonio");
		Empleados trabajador4 = new Empleados("Maria");
		
		trabajador1.cambiaSeccion("RRHH");
		//trabajador1.cambiaNombre("Maria");
		
		System.out.println(trabajador1.devuelveDatos());

		System.out.println(trabajador2.devuelveDatos());

		System.out.println(trabajador3.devuelveDatos());
		
		System.out.println(trabajador4.devuelveDatos());
	}

}

class Empleados	{
	
	private final String nombre;
	private String seccion;
	private int Id;
	private static int IdSiguiente =1;
	
	public Empleados(String nom) {
		nombre = nom;
		seccion = "Admnistracion";
		Id=IdSiguiente;
		IdSiguiente++;
	}
	
	public void cambiaSeccion(String seccion) { //setter
		
		this.seccion=seccion;
	}
	
	/*public void cambiaNombre(String nombre) {
		this.nombre = nombre;
	}*/
	
	public String devuelveDatos() {
		return "el nombre es: " +nombre+ ", la seccion es " +seccion+ " y el ID es "+Id ;
	}
	
}