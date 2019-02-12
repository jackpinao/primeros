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
		
		
		/*Empleado2[] misEmpleados = new Empleado2[5];
		misEmpleados[0]= new Empleado2("Paco gomes", 85000, 1990, 12, 17);
		
		misEmpleados[1]= new Empleado2("Ana Lopez", 95000, 1995, 06, 02);
		
		misEmpleados[2] = new Empleado2("Maria Martin", 105000, 2002, 03, 15);
		
		misEmpleados[3] = jefe_RRHH; //poliformismo en accion. principio de sustitucion.
		
		misEmpleados[4] = new Jefatura("maria", 95000, 1999, 5, 26);*/
		
		Empleado[] misEmpleados = new Empleado[5];
		misEmpleados[0]= new Empleado("Paco gomes", 85000, 1990, 12, 17);
		
		misEmpleados[1]= new Empleado("Ana Lopez", 95000, 1995, 06, 02);
		
		misEmpleados[2] = new Empleado("Maria Martin", 105000, 2002, 03, 15);
		
		misEmpleados[3] = jefe_RRHH; //poliformismo en accion. principio de sustitucion.
		
		misEmpleados[4] = new Jefatura("maria", 95000, 1999, 5, 26);
		
		Jefatura jefa_finanzas = (Jefatura) misEmpleados[4];
		jefa_finanzas.estableceIncentivo(55000);
		
		System.out.println(jefa_finanzas.tomar_decisiones("aumentar los dias de vacaciones"));
		
		System.out.println("El jefe "+jefa_finanzas.dameNombre()+" tiene un bonus de: "+jefa_finanzas.establece_bonus(500));
		
		System.out.println(misEmpleados[3].dameNombre()+" tiene un bonus de: "+misEmpleados[3].establece_bonus(200));
		
		//Ejmplo de uso de instanceoff
		/*Empleado Director_comercial = new Jefatura("Julia", 85000, 2012, 05, 05);
		Comparable ejemplo = new Empleado("Sandra", 45000, 2011, 06, 04);
		
		if (Director_comercial instanceof Empleado) {
			System.out.println("Es de tipo jefatura");
		}
		if (ejemplo instanceof Comparable ) {
			System.out.println("Implementa la interface comparable");
		}*/
		
		
		/*for(int i=0;i<3;i++) {
			misEmpleados[i].subeSueldo(5);
		}
		
		for(int i=0;i<3;i++) {
			System.out.println("nombre : "+misEmpleados[i].dameNombre()+" sueldo: "+misEmpleados[i].dameSueldo()+
					" fecha de alta: "+misEmpleados[i].dameFechaContrato());
		}*/
		
		/////////////////////////////////////////////////
		
		
		for(Empleado e: misEmpleados) {
			e.subeSueldo(5);
		}
		
		
		Arrays.sort(misEmpleados);
		
		for(Empleado e: misEmpleados) {
			System.out.println("nombre : "+e.dameNombre()+
					" sueldo: "+e.dameSueldo()+
					" fecha de alta: "+e.dameFechaContrato());
		}
		
	}

}

class Empleado implements Comparable, Trabajadores {
	public Empleado(String nom, double sue, int anio, int mes, int dia) {
		nombre= nom;
		sueldo= sue;
		GregorianCalendar calendario = new GregorianCalendar(anio, mes-1, dia);
		altaContrato = calendario.getTime();
		++IdSiguiente;
		Id=IdSiguiente;
	}
	
	public double establece_bonus(double gratificacion) {
		
		return Trabajadores.bonus_base+gratificacion;
	}
	
	public String dameNombre() {//getter
		return nombre +" Id: "+ Id;
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
	
	public int compareTo(Object miObjeto) {
		Empleado otroEmpleado = (Empleado) miObjeto;
		if(this.Id<otroEmpleado.Id) {
			return -1;
		}
		if(this.Id>otroEmpleado.Id) {
			return 1;
		}
		return 0;
	}
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private static int IdSiguiente;
	private int Id;
}


class Jefatura extends Empleado implements Jefes{
	
	public Jefatura(String nom, double sue, int anio, int mes, int dia) {
		super(nom, sue, anio, mes, dia);
	}
	
	public String tomar_decisiones(String decision) {
		return "un miembro de la direccion ha tomado la decision de: "+decision; 
	}
	
	public double establece_bonus(double gratificacion) {
		double prima = 2000;
		return Trabajadores.bonus_base+gratificacion+prima;
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

