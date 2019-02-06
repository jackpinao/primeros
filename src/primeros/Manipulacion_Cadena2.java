package primeros;

public class Manipulacion_Cadena2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String frase ="Hoy es un dia estupendo para aprender Java";
		
		String frase_resumen=frase.substring(3);
		
		System.out.println(frase_resumen);
		
		String alumno1="David", alumno2="david";
		
		System.out.println(alumno1.equalsIgnoreCase(alumno2));
		System.out.println(alumno1.equals(alumno2));

	}

}
