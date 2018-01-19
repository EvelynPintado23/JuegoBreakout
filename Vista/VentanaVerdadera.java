package Vista;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaVerdadera extends JFrame {
	
	public VentanaVerdadera() {
		initComponentes();
		setSize(1100,720);
	}

	public void initComponentes() {
		// TODO Auto-generated method stub
		getContentPane().setLayout(new BorderLayout());
		Juego juego = new Juego();
		juego.setNumeroBloques();
		getContentPane().add(juego, BorderLayout.CENTER);
		
		JLabel label =  new JLabel("BREAKOUT");
		getContentPane().add(label, BorderLayout.NORTH);
	}
	

}
