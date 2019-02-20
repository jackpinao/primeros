package poo;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;

//CLASE INTERNA

public class PruebaTemporizador2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Reloj mireloj = new Reloj(3000,true);
		
		mireloj.enMarcha();
		
		JOptionPane.showMessageDialog(null, "pulse Aceptar para terminar");
		System.exit(0);
		
	}

}

class Reloj{
	
	public Reloj(int intervalo, boolean sonido) {
		this.intervalo = intervalo;
		this.sonido = sonido;
	}
	
	public void enMarcha() {
		ActionListener oyente = new DameLaHora2();
		Timer miTemporizador = new Timer(intervalo,oyente);
		miTemporizador.start(); 
		
	}
	
	private int intervalo;
	private boolean sonido;
	
	private class DameLaHora2 implements ActionListener {
		public void actionPerformed(ActionEvent evento) {
			Date ahora = new Date();
			System.out.println("Tengo la hora cada 3 seg. "+ahora);
			if(sonido) {
				Toolkit.getDefaultToolkit().beep();
			}
		}
	}
	
}
