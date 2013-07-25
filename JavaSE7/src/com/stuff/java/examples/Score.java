package com.stuff.java.examples;

public class Score 
{
	public static final int maxEntradas = 10;
	protected int numEntradas;
	protected EntradaJogo[] entrada;
	
	//Construtor
	public Score()
	{
		entrada = new EntradaJogo[maxEntradas];
		numEntradas = 0;
	}
	
	//Retorna uma representação string da lista de scores
	public String toString()
	{
		String s = "[";
		for(int i = 0; i<numEntradas; i++)
		{
			if(i>0)
			{
				s +=","; //Separa os registros por vírgula
				s += entrada[i];
			}
		}
		return s + "]";
	}
}
