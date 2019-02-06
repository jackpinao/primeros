package primeros;

import javax.swing.*;

public class Entrada_numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num=10000.0;
		
		System.out.printf("%1.4f",num/3);
	
		System.out.print("\n");
		
		String num1= JOptionPane.showInputDialog("introduce un numero");
		
		double num2 = Double.parseDouble(num1);
		
		System.out.print("la raiz de "+num2+" es: ");
		
		System.out.printf("%1.2f", Math.sqrt(num2));
	}
}
