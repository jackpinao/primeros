package poo;

public class Uso_Vehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Coche Renault = new Coche();
		
		Coche miCoche = new Coche();
		
		System.out.println(Renault.dime_largo());
		
		miCoche.establecer_color();
		
		System.out.println(miCoche.dime_color());*/
		
		//System.out.println("este coche tiene "+ Renault.getRueda() +" ruedas");
		
		Coche miCoche1 = new Coche();
		
		miCoche1.establecer_color("Rojo");
		
		Furgoneta mifurgontea1 = new Furgoneta(7, 580);
		
		mifurgontea1.establecer_color("azul");
		
		mifurgontea1.configurar_asiento("si");
		
		mifurgontea1.configura_climatizador("no");
		
		System.out.println(mifurgontea1.dime_datos_generales());

	}

}
