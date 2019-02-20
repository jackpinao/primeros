package poo;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;


//CLASE INTERNA LOCAL

public class PruebaTemporizador2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Reloj1 mireloj = new Reloj1();
		
		mireloj.enMarcha(3000,true);
		
		JOptionPane.showMessageDialog(null, "pulse Aceptar para terminar");
		System.exit(0);
		

	}

}

class Reloj1{
		
	public void enMarcha(int intervalo, final boolean sonido) {
		
		class DameLaHora2 implements ActionListener {
			public void actionPerformed(ActionEvent evento) {
				Date ahora = new Date();
				System.out.println("Tengo la hora cada 3 seg. "+ahora);
				if(sonido) {
					Toolkit.getDefaultToolkit().beep();
				}
			}
		}
		
		ActionListener oyente = new DameLaHora2();
		Timer miTemporizador = new Timer(intervalo,oyente);
		miTemporizador.start(); 
		
	}
	
}
