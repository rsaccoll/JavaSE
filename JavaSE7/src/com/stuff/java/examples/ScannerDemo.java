package com.stuff.java.examples;

import java.util.Scanner;

public class ScannerDemo 
{
	public static void main(String []args)
	{
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite dois numeros");
		System.out.println("separados por um ou mais espaços");
		
		int n1, n2;
		
		n1 = teclado.nextInt();
		n2 = teclado.nextInt();
		System.out.println("Você digitou "+n1+" e "+n2);
		
		System.out.println("Proximos dois numeros");
		System.out.println("decimais são OK");
		
		double d1, d2;
		d1 = teclado.nextDouble();
		d2 = teclado.nextDouble();
		
		System.out.println("Você digitou "+d1+" e "+d2);
		
		System.out.println("Proximos dois:");
		
		String s1, s2;
		s1 = teclado.next();
		s2 = teclado.next();
		
		System.out.println("Você digitou \""+s1+"\" e \""+s2);
		s1 = teclado.nextLine();
		
		System.out.println("Proximo item a ser digitado");
		s1 = teclado.nextLine();
		System.out.println("Foi digitado: \""+s1+"\"");
	}
}
