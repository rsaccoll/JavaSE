package com.stuff.java.examples;

public class Soma 
{
	//Soma todos os valores de um arranjo de inteiros
	public static int Soma(int[] a)
	{
		int total = 0;
		for(int i = 0; i<a.length; i++)
		{
			total += a[i];
		}
		return total;
	}
	
	public static int procuraContador(int[] a, int k)
	{
		int contador = 0;
		for(e:a)
		{
			if(e == k)
			{
				contador++;
			}
		}
		return contador;
	}
	
	
}
