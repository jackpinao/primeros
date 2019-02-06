package poo;

import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Empleado empleado1 = new Empleado("Jose Mendoza", 85000, 1990, 12, 17);
		
		Empleado empleado2 = new Empleado("Ana Lopez", 95000, 1995, 06, 02);
		
		Empleado empleado3 = new Empleado("Maria Martin", 105000, 2002, 03, 15);
		
		empleado1.subeSueldo(5);
		empleado2.subeSueldo(5);
		empleado3.subeSueldo(5);
		
		System.out.println("nombre : "+empleado1.dameNombre()+" sueldo: "+empleado1.dameSueldo()+
				" fecha de alta: "+empleado1.dameFechaContrato());*/
		
		//////////////////////////////////////////
		
		Jefatura jefe_RRHH = new Jefatura("Jack", 55000, 2006, 9, 25);
		
		jefe_RRHH.estableceIncentivo(2570);
		
		
		Empleado2[] misEmpleados = new Empleado2[5];
		misEmpleados[0]= new Empleado2("Paco gomes", 85000, 1990, 12, 17);
		
		misEmpleados[1]= new Empleado2("Ana Lopez", 95000, 1995, 06, 02);
		
		misEmpleados[2] = new Empleado2("Maria Martin", 105000, 2002, 03, 15);
		
		misEmpleados[3] = jefe_RRHH; //poliformismo en accion. principio de sustitucion.
		
		misEmpleados[4] = new Jefatura("maria", 95000, 1999, 5, 26);
		
		/*for(int i=0;i<3;i++) {
			misEmpleados[i].subeSueldo(5);
		}
		
		for(int i=0;i<3;i++) {
			System.out.println("nombre : "+misEmpleados[i].dameNombre()+" sueldo: "+misEmpleados[i].dameSueldo()+
					" fecha de alta: "+misEmpleados[i].dameFechaContrato());
		}*/
		
		/////////////////////////////////////////////////
		
		for(Empleado2 e: misEmpleados) {
			e.subeSueldo(5);
		}
		
		for(Empleado2 e: misEmpleados) {
			System.out.println("nombre : "+e.dameNombre()+
					" sueldo: "+e.dameSueldo()+
					" fecha de alta: "+e.dameFechaContrato());
		}
		
	}

}

class Empleado{
	public Empleado(String nom, double sue, int anio, int mes, int dia) {
		nombre= nom;
		sueldo= sue;
		GregorianCalendar calendario = new GregorianCalendar(anio, mes-1, dia);
		altaContrato = calendario.getTime();
	}
	
	
	
	public String dameNombre() {//getter
		return nombre;
	}
	
	public double dameSueldo() {//getter
		return sueldo;
	}
	
	public Date dameFechaContrato() { //getter
		return altaContrato;
	}
	
	public void subeSueldo(double porcentaje) {
		double aumento = sueldo*porcentaje/100;
		sueldo+=aumento;
	}
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private static int idSiguiente;
	private int id;
}


class Jefatura extends Empleado2{
	
	public Jefatura(String nom, double sue, int anio, int mes, int dia) {
		super(nom, sue, anio, mes, dia);
	}
	
	public void estableceIncentivo(double b) {
		incentivo=b;
	}
	
	public double dameSueldo() {
		double sueldoJefe= super.dameSueldo();
		
		return sueldoJefe + incentivo;
	}
	 
	private double incentivo;
	
	
}


class Director extends Jefatura{
	
	public Director(String nom, double sue, int anio, int mes, int dia) {
		super(nom, sue, anio, mes, dia);
	}
	
}


//Final : sirve para finalizar la herencia

