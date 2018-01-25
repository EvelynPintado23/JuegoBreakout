package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

import modelo.Pelotamn;

public class VentanaVerdadera extends JFrame {
	
	 private Pelotamn pelota = new Pelotamn(500, 500);
	 private Timer timer;

	public VentanaVerdadera() {
		initComponentes();
		setSize(1100, 720);
		setResizable(false);
		setVisible(true);

//		pelota.LimitesXY(getWidth(), getHeight());
//		Timer timer = new Timer(1600, new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				pelota.move();
//				repaint();
//			}
//		});
//		timer.start();
	}

	public void initComponentes() {
		// TODO Auto-generated method stub
		getContentPane().setLayout(new BorderLayout());
		Juego juego = new Juego();
		juego.setNumeroBloques();
		getContentPane().add(juego, BorderLayout.CENTER);

	    }

	}


