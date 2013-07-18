package com.stuff.java.examples;

import java.util.Scanner;


public class Circulo_Calculo 
{
	public static final double PI = 3.14159;
	
	public static void main(String []args)
	{
		double raio;
		double area;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Entre o valor do raio: ");
		raio = teclado.nextDouble();
		
		area = PI * raio * raio;
		
		System.out.println("O raio é: "+raio+" cm");
		System.out.println("E sua area é: "+area+" cm");
	}
}
