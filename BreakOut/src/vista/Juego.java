package vista;
import java.awt.Color;
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
	Color[] colores=new Color[55];
	
	public Juego() {
		bloques = new ArrayList<>();
	}
	
	public void setNumeroBloques() {
		GrupoBloques bloq= new GrupoBloques();
		System.out.println(bloq.getBloques());
		bloques.add(bloq);
	}
	
	public void paint(Graphics g) {
		super.paint(g);
     	//int color; 
		g.setColor(new Color(0,0,15));
		g.fillRect(0, 0, 1100, 720);
//		g.setColor(new Color(255,50,50));
//		g.drawLine(20, 30, 1060, 680);
		for(GrupoBloques gb:bloques) {
			for(Bloque bloque:gb.getBloques()) {
//				for(int xbloque=0; xbloque!=55;xbloque++) {
//				colores[xbloque]=new Color(r.nextInt(255));
				g.setColor(Color.BLUE);
				g.fillRect(bloque.getX(),bloque.getY(), bloque.getAncho(),bloque.getAlto());			}
		}
	}
//	public void run() {
//		Color[] colores=new Color[30];
//		for(int x=0; x!=30;x++) {
//			colores[x]=new Color(r.nextInt(256) r.nextInt(256),r.nextInt(256));
//		}
	//}

}
//}
