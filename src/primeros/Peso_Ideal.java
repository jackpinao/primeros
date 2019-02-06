package primeros;

import javax.swing.JOptionPane;

public class Peso_Ideal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String genero="";
		
		do {
			genero=JOptionPane.showInputDialog("introduce tu genero(H/M)");
		} while (genero.equalsIgnoreCase("H")== false && genero.equalsIgnoreCase("M")==false);
		
		int altura= Integer.parseInt(JOptionPane.showInputDialog("introduce altura en cm"));
		
		int pesoideal=0;
		
		if (genero.equalsIgnoreCase("H")) {
			pesoideal=altura-110;
		} else{
			pesoideal= altura-120;
		} 
		
		System.out.println("tu peso ideal es "+pesoideal+" kg");
	}

}
