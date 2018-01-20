package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JPanel;

import modelo.Bloque;
import modelo.GrupoBloques;

public class Juego extends JPanel implements ActionListener {
	private JButton nivel1;
	private JButton nivel2;
	private JButton nivel3;
	private JButton next;
	private List<GrupoBloques> bloques;
	Random ra = new Random();

	public Juego() {
		bloques = new ArrayList<>();
	}

	public void setNumeroBloques() {
		GrupoBloques bloq = new GrupoBloques();
		System.out.println(bloq.getBloques());
		bloques.add(bloq);
	}

	public void paint(Graphics g) {
		super.paint(g);
		// int color;
		g.setColor(new Color(0, 0, 15));
		g.fillRect(0, 0, 1100, 720);
		g.setColor(Color.RED);
		g.setFont( new Font( "Serif", Font.HANGING_BASELINE, 50) );
		g.drawString( "NIVEL 1", 50, 60);
		g.setColor(Color.RED);
		g.setFont( new Font( "Serif", Font.BOLD, 50) );
		g.drawString( "VIDAS :", 300, 60);
		g.setColor(Color.RED);
		g.setFont( new Font( "Serif", Font.BOLD, 50) );
		g.drawString( "PUNTUACION:", 600, 60);
		g.setColor(new Color(255,200,255));// color inventada de la linea
		g.drawRect(40, 73,996 ,590 );//marco de el fondo 
		
		for (GrupoBloques gb : bloques) {
			for (Bloque bloque : gb.getBloques()) {
				int rojo=0, verde=0, azul=0;
				g.setColor(new Color(rojo+ra.nextInt(255),verde+ra.nextInt(255),azul+ra.nextInt(255)));
				g.fillRect(bloque.getX(), bloque.getY(), bloque.getAncho(), bloque.getAlto());
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando= e.getActionCommand();
		
		
	}

}

