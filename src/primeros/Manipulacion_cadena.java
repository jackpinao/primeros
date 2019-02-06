package primeros;

public class Manipulacion_cadena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre= "Juan";
		
		System.out.println(nombre);
		
		System.out.println("Mi nombre tiene "+nombre.length());
		
		System.out.println("la primera letra del nombre es " +nombre.charAt(0));
		
		int ultima_letra;
		
		ultima_letra=nombre.length();
		
		System.out.println("la ultima letra es "+nombre.charAt(ultima_letra-1));

	}

}
