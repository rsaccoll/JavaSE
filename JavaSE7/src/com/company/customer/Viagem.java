package com.company.customer;

public class Viagem 
{
	public enum Dia
	{
		SEG, TER, QUA, QUI, SEX, SAB, DOM
	}
	
	public static void main(String []args)
	{
		Dia d = Dia.SEG;
		System.out.println("Inicialmente o d é dia "+d);
		
		d = Dia.QUI;
		System.out.println("E agora ficou "+d);
		
		Dia t = Dia.valueOf("QUI");
		System.out.println("E digo que tanto d como t sao iguais: "+(d==t));
		
		int i = 8;
		int b = 8;
		int j = i++;
		System.out.println(j);
		int k = ++i;
		System.out.println(j);
		int z = ++b;
		System.out.println(z);
		int m = i--;
		System.out.println(m);
		int n = 0 + i++;
		System.out.println(n);
	}
}
