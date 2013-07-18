package com.stuff.java.examples;

import javax.swing.JFrame;
import java.awt.Graphics;

public class HappyFaceJFrame extends JFrame
{
	public static final int DIAMETRO_FACE = 200;
	public static final int X_FACE = 100;
	public static final int Y_FACE = 50;
	
	public static final int OLHO_WIDTH = 10;
	public static final int OLHO_HEIGHT = 20;
	public static final int X_DIREITO_OLHO = 155;
	public static final int Y_DIREITO_OLHO = 100;
	public static final int X_ESQUERDO_OLHO = 230;
	public static final int Y_ESQUERDO_OLHO = X_ESQUERDO_OLHO;
	
	public static final int BOCA_WIDTH = 100;
	public static final int BOCA_HEIGHT = 50;
	public static final int X_BOCA = 150;
	public static final int Y_BOCA = 160;
	public static final int BOCA_ANGULO_INICIAL = 180;
	public static final int BOCA_GRAUS_SHOW = 180;
	
	public void paint(Graphics canvas)
	{
		canvas.drawOval(X_FACE, Y_FACE, DIAMETRO_FACE, DIAMETRO_FACE);
		canvas.fillOval(X_DIREITO_OLHO, Y_DIREITO_OLHO, OLHO_WIDTH, OLHO_HEIGHT);
		canvas.fillOval(X_ESQUERDO_OLHO, Y_ESQUERDO_OLHO, OLHO_WIDTH, OLHO_HEIGHT);
		canvas.drawArc(X_BOCA, Y_BOCA, BOCA_WIDTH, BOCA_HEIGHT, BOCA_ANGULO_INICIAL, BOCA_GRAUS_SHOW);
		
	}
	public HappyFaceJFrame()
	{
		setSize(600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String []args)
	{
		HappyFaceJFrame janela = new HappyFaceJFrame();
		janela.setVisible(true);
	}
}
