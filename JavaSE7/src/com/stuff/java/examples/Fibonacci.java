package com.stuff.java.examples;

public class Fibonacci extends ProgG 
{
	//Valor inteiro
	long prev;
	
	//Herda primeiro e atual
	
	Fibonacci()
	{
		this(0,1);
	}
	/*
	 * Construtor, fornece o primeiro e o segundo valor
	 * 
	 * @param valor1 é o primeiro valor
	 * @param valor2 é o segundo valor
	 */
	Fibonacci(long valor1, long valor2)
	{
		primeiro = valor1;
		prev = valor2 - valor1; //valor fictício que antecede o primeiro
	}
	
	/*
	 * Avança a progressão somando o valor anterior ao atual
	 * 
	 * @return próximo valor da progressão
	 */
	protected long proximoValor()
	{
		long temporario = prev;
		prev = atual;
		atual += temporario;
		return atual;
	}
	//Herda os métodos primeiroValor e imprimePG()
	
}
