package modelo;

import java.util.ArrayList;
import java.util.List;

public class GrupoBloques2 {
	
	private int x = 25, y = 35;
	private int n;
	private List<Bloque> bloques2;

	private int ancho = 90;
	// private int RANGO_ANCHO_MIN = 50;

	private int alto = 40;
	// private int RANGO_ALTO_MIN = 30;

	private int ANCHO_PANTALLA = 1100;
	private int ALTO_PANTALLA = 720;

	public GrupoBloques2(int x, int y, int n) {
		this.x = x;
		this.y = y;
		this.n = n; /// numero de bloques
		generarBloques2();
	}

	public GrupoBloques2 () {
		this.n = n;
		generarBloques2();
	}
	private void generarBloques2() {// level 2
		bloques2 = new ArrayList<Bloque>();
		int aux=0;
		for (int i = 0; i < 7; i++) {
			int con=0;
			for (int j = 0; j < 11; j++) {
				Bloque bloque2 = null;
				if(aux==0 || aux==6){
			    bloque2 = new Bloque(j * ancho + 45, i * alto + 75, ancho - 5, alto - 5);
				System.out.println(bloque2);
				bloques2.add(bloque2);	
				}else if(con==0||con==1||con==9 ||con==10){
					 bloque2 = new Bloque(j * ancho + 45, i * alto + 75, ancho - 5, alto - 5);
						System.out.println(bloque2);
						bloques2.add(bloque2);	
				}
				con=con+1;
				
			}
			aux=aux+1;
		}
	}

	public List<Bloque> getBloques() {
		return bloques2;
	}

}
