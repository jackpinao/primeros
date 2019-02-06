package primeros;

import javax.swing.JOptionPane;

public class Uso_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] paises = new String[8];
		
		
		/*paises[0]="España";
		paises[1]="Colombia";
		paises[2]="Peru";
		paises[3]="Chile";
		paises[4]="Ecuador";
		paises[5]="Francia";
		paises[6]="Bolivia";
		paises[7]="Mexico";*/
		
		
		for (int i = 0; i < 8; i++) {
			paises[i]=JOptionPane.showInputDialog("Introduce pais "+(i+1));
		}
		
		for (String elemento : paises) {
			System.out.println(elemento);
		}
		
		int [] matriz_aleatorio = new int[150];
		
		for (int i = 0; i < matriz_aleatorio.length; i++) {
			matriz_aleatorio[i]=(int)Math.round(Math.random()*100);
		}
		
		for(int numeros:matriz_aleatorio) {
			System.out.println(numeros);
		}
	}

}
