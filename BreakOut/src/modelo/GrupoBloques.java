package modelo;

import java.util.ArrayList;
import java.util.List;

public class GrupoBloques {

	private int x = 25, y = 35;
	private int n;
	private List<Bloque> bloques;

	private int ancho = 90;
	// private int RANGO_ANCHO_MIN = 50;

	private int alto = 40;
	// private int RANGO_ALTO_MIN = 30;

	private int ANCHO_PANTALLA = 1100;
	private int ALTO_PANTALLA = 720;

	public GrupoBloques(int x, int y, int n) {
		this.x = x;
		this.y = y;
		this.n = n; /// numero de bloques
		generarBloques();
	}

	public GrupoBloques() {
		this.n = n;
		generarBloques();
	}

	private void generarBloques() {
		bloques = new ArrayList<Bloque>();
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 11; j++) {
				Bloque bloque2 = null;
				bloque2 = new Bloque(j * ancho + 45, i * alto + 75, ancho - 5, alto - 5);
				System.out.println(bloque2);
				bloques.add(bloque2);
			}
		}
	}

	public List<Bloque> getBloques() {
		return bloques;
	}
}
