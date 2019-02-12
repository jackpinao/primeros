package poo;

import javax.swing.*;
import java.awt.event.*;
import java.util.Date; 

public class PruebaTemporizador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DameLaHora oyente = new DameLaHora();
		Timer miTemporizador = new Timer(5000, oyente);
		
		miTemporizador.start();
		
		JOptionPane.showMessageDialog(null," pulsa Aceptar para detener ");
		
		System.exit(0);
	}

}

class DameLaHora implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		
		Date ahora = new Date();
		
		System.out.println("cada 5 segundos te voy a dar la hora: "+ahora);
	}
	
}
