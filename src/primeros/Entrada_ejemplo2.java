package primeros;

import javax.swing.JOptionPane;

public class Entrada_ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre_usuario = JOptionPane.showInputDialog("introduce tu nombre, por favor");
		
		int edad = Integer.parseInt( JOptionPane.showInputDialog("introduce la edad por favor"));
		
		edad++;
		
		System.out.println("Hola "+nombre_usuario+" el año que viene "+(edad)+" años.");
	}

}
