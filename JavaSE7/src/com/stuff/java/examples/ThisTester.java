package com.stuff.java.examples;

public class ThisTester 
{
	public int numero = 5;
	public void estranho()
	{
	int numero = 25;
	System.out.println("Numero de variavel local "+numero);
	System.out.println("Numero publico "+this.numero);
	}
	
	public static void main(String []args)
	{
		ThisTester teste = new ThisTester();
		teste.estranho();
	}
}
