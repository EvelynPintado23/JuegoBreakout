package vista;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

import modelo.Pelota;

public class VentanaVerdadera extends JFrame {

	public VentanaVerdadera() {
		initComponentes();
		setSize(1100, 720);
		setResizable(false);
		setVisible(true);
		
	}

	public void initComponentes() {
		// TODO Auto-generated method stub
		getContentPane().setLayout(new BorderLayout());
		Juego juego = new Juego();
		juego.setNumeroBloques();
		getContentPane().add(juego, BorderLayout.CENTER);
	}

}
