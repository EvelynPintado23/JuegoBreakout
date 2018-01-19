package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JPanel;

import modelo.Bloque;
import modelo.GrupoBloques;

public class Juego extends JPanel {

	private List<GrupoBloques> bloques;
	Random r = new Random();
	Color[] colores = new Color[55];

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
				// for(int xbloque=0; xbloque!=55;xbloque++) {
				// colores[xbloque]=new Color(r.nextInt(255));
				g.setColor(Color.BLUE);
				g.fillRect(bloque.getX(), bloque.getY(), bloque.getAncho(), bloque.getAlto());
			}
		}

	}

}

