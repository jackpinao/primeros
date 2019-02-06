package poo;

public class Furgoneta extends Coche{
	
	private int capacidad_carga;
	private int plazas_extras;
	
	public Furgoneta (int plazas_extra, int capacidad_carga) {
		super();
		this.capacidad_carga= capacidad_carga;
		this.plazas_extras=capacidad_carga;
	}
	
	public String dimeDatosFurgoneta() {
		return "la capacidad de carga es: "+capacidad_carga+ "y las plazas son: "+plazas_extras;
	}
}
