package com.stuff.java.examples;

import java.io.*;
import java.util.Scanner;


public class entradaDados 
{
	public static void main(String []args)
	{
		Scanner entrada = new Scanner(System.in);
		System.out.println("Entre  sua altura: ");
		float altura = entrada.nextFloat();
		System.out.println("Entre o seu peso: ");
		float peso = entrada.nextFloat();
		float imc = peso/(altura*altura)*1000;
		System.out.println("Seu IMC é: ");
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um inteiro: ");
		while(!teclado.hasNextInt())
		{
			teclado.nextLine();
			System.out.println("não é um inteiro, digite um inteiro aí pow!!: ");
		}
		int i = teclado.nextInt();
	}
}
