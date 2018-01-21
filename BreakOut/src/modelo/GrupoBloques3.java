package modelo;

import java.util.ArrayList;
import java.util.List;

public class GrupoBloques3 {

	private int x = 25, y = 35;
	private int n;
	private List<Bloque> bloques3;

	private int ancho = 90;
	// private int RANGO_ANCHO_MIN = 50;

	private int alto = 40;
	// private int RANGO_ALTO_MIN = 30;

	private int ANCHO_PANTALLA = 1100;
	private int ALTO_PANTALLA = 720;

	public GrupoBloques3(int x, int y, int n) {
		this.x = x;
		this.y = y;
		this.n = n; /// numero de bloques
		generarBloques3();
	}

	public GrupoBloques3 () {
		this.n = n;
		generarBloques3();
	}
	private void generarBloques3() {// level 3
		bloques3 = new ArrayList<Bloque>();
		int aux=0;
		for (int i = 0; i < 7; i++) {
			int con=0;
			for (int j = 0; j < 11; j++) {
				Bloque bloque3 = null;
				if(aux==0 ){
					if(con==0 || con==2 || con==4 ||con==5 || con==6 || con==8 ||con==9 ||con==10 ){
			    bloque3 = new Bloque(j * ancho + 45, i * alto + 75, ancho - 5, alto - 5);
				System.out.println(bloque3);
				bloques3.add(bloque3);	
					}
				}
				if(aux==1){
					if(con==0 || con==2 || con==4 || con==6 || con==8 ){
					    bloque3 = new Bloque(j * ancho + 45, i * alto + 75, ancho - 5, alto - 5);
						System.out.println(bloque3);
						bloques3.add(bloque3);	
				}
				}
				if(aux==2){
					if(con==0 || con==2 || con==4 ||con==5|| con==6 || con==8 ||con==9 ||con==10){
					    bloque3 = new Bloque(j * ancho + 45, i * alto + 75, ancho - 5, alto - 5);
						System.out.println(bloque3);
						bloques3.add(bloque3);	
				}
				}
				if(aux==3){
					if(con==0 || con==2 || con==4 || con==10 ){
					    bloque3 = new Bloque(j * ancho + 45, i * alto + 75, ancho - 5, alto - 5);
						System.out.println(bloque3);
						bloques3.add(bloque3);	
				}
				}
				
				if(aux==4){
					if(con==0 || con==1|| con==2 || con==4 || con==8 ||con==9 ||con==10 ){
					    bloque3 = new Bloque(j * ancho + 45, i * alto + 75, ancho - 5, alto - 5);
						System.out.println(bloque3);
						bloques3.add(bloque3);	
				}
				}
				con=con+1;	
			}
			aux=aux+1;
		}
	}

	public List<Bloque> getBloques() {
		return bloques3;
	}

}
