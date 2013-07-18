package com.stuff.java.examples;
/*
 * ainda estou com um problema no if...
 */
import java.util.Scanner;

public class IMC 
{
	public static void main(String []args)
	{
		Scanner teclado = new Scanner(System.in);
		
		int peso;
		double altura;
		float imc;
		System.out.println("Digite sua peso: ");
		peso = teclado.nextInt();
		
		System.out.println("Digite sua altura");
		altura = teclado.nextDouble();
		
		imc = (float) ((peso)/(altura*altura));
		float resultado = imc;
		
		System.out.println(resultado);
		
		if(resultado <= 18.5)
		{
			System.out.println("Sua categoria é abaixo do peso normal");
		}
		else if(resultado <= 25)
		{
			System.out.println("Sua categoria é peso normal");
		}
		else if(resultado <= 30)
		{
			System.out.println("Obesidade Morbida");
		}
		else
		{
			System.out.println("Seu IMC é: "+imc);
		}
	}
}
