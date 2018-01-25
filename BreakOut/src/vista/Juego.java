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
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javax.swing.Timer;

import modelo.Base;
import modelo.Bloque;
import modelo.GrupoBloques;
import modelo.GrupoBloques2;
import modelo.GrupoBloques3;
import modelo.Pelota;
import modelo.Pelotamn;

public class Juego extends JPanel implements ActionListener {
	private JButton nivel1;
	private JButton nivel2;
	private JButton nivel3;
	private JButton next;
    private int x1=350;
    private int x2=320;
    int numLadrillos=0;
    private int y1=420;
    private int y2=380;
    private int alto1=110;
    private int alto2=20;
    private int ancho1=18;
    private int ancho2=20;
    private int ancho3=9;
	private int width=1100;
	private int height=720;
    private int incrementox=20;
    private int incrementoy=20;
    private int contador;
    private int contador2;
    private boolean band=true;
	private int vidas=3,puntos=0,nivel=3;
	private Pelotamn pelota = new Pelotamn(0, 0);
	private Timer timer;
	private List<GrupoBloques> bloques;
	private List<GrupoBloques2> bloques2;
	private List<GrupoBloques3> bloques3;
	Random ra = new Random();	
	public Juego() {
		bloques = new ArrayList<>();
		bloques2 = new ArrayList<>();
		bloques3 = new ArrayList<>();
		pelota.LimitesXY((width),(height));
		timer = new Timer(1600, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pelota.move();
				repaint();
			}
		});
//		Pelota p=new Pelota(x2,y2,alto2,ancho2);
//	    p.paintComponent(grphcs);
	}

	public void setNumeroBloques() {
		if(nivel==1){
		GrupoBloques bloq = new GrupoBloques();
		System.out.println(bloq.getBloques());
		bloques.add(bloq);
		}else if(nivel==2){
			GrupoBloques2 bloq2 = new GrupoBloques2();
			System.out.println(bloq2.getBloques());
			bloques2.add(bloq2);
		}else if(nivel==3){
			GrupoBloques3 bloq3 = new GrupoBloques3();
			System.out.println(bloq3.getBloques());
			bloques3.add(bloq3);
		}
	}
	
	 public void animar(boolean turnOnOff) {
	        if (turnOnOff) {
	            pelota.setVelocidadXY();
	            timer.start();
	        } else {
	            timer.stop();
	        }
	    }

	public void paint(Graphics g) {
		super.paint(g);
		
	    //p.paintComponent(g);
		if(nivel==0){
			Pelota p=new Pelota(x2,y2,alto2,ancho2);
			g.setColor(new Color(0, 0, 15));
			g.fillRect(0, 0, 1100, 720);
			g.setColor(new Color(0,255,100));
			g.setFont( new Font( "Serif", Font.PLAIN, 120) );
			g.drawString( "BREAKOUT UPS", 20, 250);
			g.setColor(new Color(255,200,255));// color inventada de la linea
			g.drawRect(40, 73,996 ,590 );//marco de el fondo 
			 p.paintComponent(g);
		}
		if(nivel==1){
			Base b=new Base(450,632,120,30);
			Pelota p=new Pelota(x2,y2,alto2,ancho2);
			g.setColor(new Color(0, 0, 15));
			g.fillRect(0, 0, 1100, 720);
			g.setColor(Color.RED);
			g.setFont( new Font( "Serif", Font.HANGING_BASELINE, 50) );
			g.drawString( "NIVEL 1", 50, 60);
			g.setColor(Color.RED);
			g.setFont( new Font( "Serif", Font.BOLD, 50) );
			g.drawString( "VIDAS :"+vidas, 300, 60);
			g.setColor(Color.RED);
			g.setFont( new Font( "Serif", Font.BOLD, 50) );
			g.drawString( "PUNTUACION:"+puntos, 600, 60);
//			g.setFont( new Font( "Serif", Font.BOLD, 250) );//level 2
//			g.drawString( "UPS ", 300, 280);
			
			g.setColor(new Color(255,200,255));// color inventada de la linea
			g.drawRect(40, 73,996 ,590 );//marco de el fondo 
			b.paintComponent(g);
			for (GrupoBloques gb : bloques) {
				for (Bloque bloque : gb.getBloques()) {
					int rojo=0, verde=0, azul=0;
					g.setColor(new Color(rojo+ra.nextInt(255),verde+ra.nextInt(255),azul+ra.nextInt(255)));
					g.fillRect(bloque.getX(), bloque.getY(), bloque.getAncho(), bloque.getAlto());
				}
			}
		}
		if(nivel==2){
			Base b=new Base(450,632,120,30);
			Pelota p=new Pelota(x2,y2,alto2,ancho2);
			g.setColor(new Color(0, 0, 15));
			g.fillRect(0, 0, 1100, 720);
			g.setColor(Color.RED);
			g.setFont( new Font( "Serif", Font.HANGING_BASELINE, 50) );
			g.drawString( "NIVEL 2", 50, 60);
			g.setColor(Color.RED);
			g.setFont( new Font( "Serif", Font.BOLD, 50) );
			g.drawString( "VIDAS :"+vidas, 300, 60);
			g.setColor(Color.RED);
			g.setFont( new Font( "Serif", Font.BOLD, 50) );
			g.drawString( "PUNTUACION:"+puntos, 600, 60);
			g.setFont( new Font( "Serif", Font.BOLD, 250) );//level 2
			g.drawString( "UPS ", 300, 280);		
			g.setColor(new Color(255,200,255));// color inventada de la linea
			g.drawRect(40, 73,996 ,590 );//marco de el fondo 
			b.paintComponent(g);
			for (GrupoBloques2 gb2 : bloques2) {
				for (Bloque bloque2 : gb2.getBloques()) {
					int rojo=0, verde=0, azul=0;
					g.setColor(new Color(rojo+ra.nextInt(255),verde+ra.nextInt(255),azul+ra.nextInt(255)));
					g.fillRect(bloque2.getX(), bloque2.getY(), bloque2.getAncho(), bloque2.getAlto());
				}
			}
			 p.paintComponent(g);
		}
		if(nivel==3){
			Base b=new Base(450,632,120,30);
			Pelota p=new Pelota(x2,y2,alto2,ancho2);
			g.setColor(new Color(0, 0, 15));
			g.fillRect(0, 0, 1100, 720);
			g.setColor(Color.RED);
			g.setFont( new Font( "Serif", Font.HANGING_BASELINE, 50) );
			g.drawString( "NIVEL 3", 50, 60);
			g.setColor(Color.RED);
			g.setFont( new Font( "Serif", Font.BOLD, 50) );
			g.drawString( "VIDAS :"+vidas, 300, 60);
			g.setColor(Color.RED);
			g.setFont( new Font( "Serif", Font.BOLD, 50) );
			g.drawString( "PUNTUACION:"+puntos, 600, 60);
			g.setColor(new Color(255,200,255));// color inventada de la linea
			g.drawRect(40, 73,996 ,590 );//marco de el fondo 
			b.paintComponent(g);
			for (GrupoBloques3 gb3 : bloques3) {
				for (Bloque bloque3 : gb3.getBloques()) {
					int rojo=0, verde=0, azul=0;
					g.setColor(new Color(rojo+ra.nextInt(255),verde+ra.nextInt(255),azul+ra.nextInt(255)));
					g.fillRect(bloque3.getX(), bloque3.getY(), bloque3.getAncho(), bloque3.getAlto());
				}
			}
			 p.paintComponent(g);
		}
		g.setColor(Color.WHITE);
		 pelota.dibujar(g);
	}
	
	public void MovPelota() {  
        if((x2>this.getWidth()-20)||(x2<0)){
            incrementox=incrementox*-1;   
        }
       
        if(y2<0){
            incrementoy=incrementoy*-1;    
        }
            
        int posBasefinalx=0;
        posBasefinalx=x1;
        posBasefinalx=posBasefinalx+110;
            
        int posBasefinaly=0;
        posBasefinaly=y1;
        posBasefinaly=posBasefinaly+18;
            
        if((x2>=x1-20)&&(x2<=posBasefinalx)&&(y2==y1-20)){ 
            incrementoy=incrementoy*-1;  
        }
        
        int posLadrillofinalx=0;
        int posLadrillofinaly=0;
        
        
      for (GrupoBloques gb : bloques) {
        for (Bloque bloque : gb.getBloques()) {
      posLadrillofinalx=bloque.getX()+70;
      posLadrillofinaly=bloque.getY()+15;
			int rojo=0, verde=0, azul=0;
//			g.setColor(new Color(rojo+ra.nextInt(255),verde+ra.nextInt(255),azul+ra.nextInt(255)));
//			g.fillRect(bloque.getX(), bloque.getY(), bloque.getAncho(), bloque.getAlto());
       if((x2>=bloque.getX())&&(x2<=posLadrillofinalx)&&(y2>=bloque.getY())&& (y2<=posLadrillofinaly)){     
          incrementoy=incrementoy*-1;
        //  bloque.setVisible(false);
          bloque.setVisible(false);
          bloque.setX(-20);
          contador++;
          contador2++;
          numLadrillos--;
          System.out.println("Contador "+contador2);
		}
	}     
        if(((x2<x1)||(x2>posBasefinalx))&&(y2>posBasefinaly)){
            JOptionPane.showMessageDialog(this,"Juego Terminado");
            band=false;
            System.exit(WIDTH); 
        }
        
        if(contador2==98) {
            JOptionPane.showMessageDialog(this,"Haz ganado!");
            band=false;
            System.exit(WIDTH);
        }       
    }
}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}

