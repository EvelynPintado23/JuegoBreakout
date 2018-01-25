package modelo;

import java.awt.Color;
import java.awt.Graphics;

public class Base {
	private int x;
	private int y;
	private int alto;
	private int ancho;

	public Base(int x, int y, int alto, int ancho) {
		this.x = x;
		this.y = y;
		this.alto = alto;
		this.ancho = ancho;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public void paintComponent(Graphics grphcs) {
		grphcs.setColor(Color.BLUE);
		grphcs.fillRect(x, y, alto, ancho);

	}

}
