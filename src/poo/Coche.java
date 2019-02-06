package poo;

public class Coche {

	private int rueda, largo, ancho, motor, peso_plataforma, peso_total;
	private String color;
	private boolean asiento_cuero, climatizador;
	
	public  Coche () {
		rueda=4;
		largo=2000;
		ancho=300;
		motor=1600;
		peso_plataforma=500;
		asiento_cuero=true;
		climatizador=true;
		
	}

	public String dime_largo() {
		return "el largo del coche es "+largo;
	}
	
	public void establecer_color(String color) {
		this.color=color;
	}
	
	
	
	public String dime_color() {
		return "El color del coche es " +color;
	}
	
	public void configurar_asiento (String respuesta) {
		if(respuesta.equalsIgnoreCase("si")) {
			this.asiento_cuero=true;
		}
	}
	
	public String dime_asiento() {
		if(asiento_cuero==true) {
			return "Tiene asientos: si";
		}else {
			return "Tiene asientos: no";
		}
	}
	
	
	public void configura_climatizador(String respuesta) {
		if(respuesta.equalsIgnoreCase("no")) {
			this.climatizador=false;
		}else {
			this.climatizador=true;
		}
	}
	
	public String dime_climatizador() {
		
		if(climatizador==true) {
			return "Tiene climatizador: si"+climatizador;
		}else {
			return "Tiene climatizador: no"+climatizador;
		}
		
	}
		
	
	public String dime_datos_generales() {
		return dime_color()+" "+dime_largo()+" "+dime_asiento()+" "+dime_climatizador();
	}
}
