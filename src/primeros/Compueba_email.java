package primeros;

import javax.swing.JOptionPane;

public class Compueba_email {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arroba=0;
		boolean punto=false;
		String email=JOptionPane.showInputDialog("Ingrese email");
		
		for(int i=0;i<email.length();i++) {
			if(email.charAt(i)=='@') {
				arroba=1;
			}
			
			if(email.charAt(i)=='.') {
				punto=true;
			}
		}
		
		if (arroba==1 && punto==true) {
			System.out.println("Es correcto");
		} else {
			System.out.println("Es incorrecto");
		}
	}

}
