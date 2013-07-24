package com.stuff.java.examples;

public class ProgG 
{
	//Primeiro valor da progressão
	protected long primeiro;
	//Valor atual da progressão
	protected long atual;
	
	//Construtor
	ProgG()
	{
		atual = primeiro = 0;
	}
	
	/*
	 * Reinicializa a progressão com valor inicial
	 * 
	 * @return valor inicial
	 */
	protected long primeiroValor()
	{
		atual = primeiro;
		return atual;
	}
	
	/*
	 * Avança a progressão para o próximo valor
	 * 
	 * @return próximo valor da progressão
	 */
	protected long proximoValor()
	{
		
		return ++atual;
	}
	
	/*
	 * Imprime os primeiros valores de n progressão
	 * 
	 * @param número n de valores a serem impressos
	 */
	public void imprimePG(int n)
	{
		System.out.println(primeiroValor());
		for(int i = 2; i <=n; i++)
		{
			System.out.print(" "+proximoValor());
			System.out.println();
		}
	}
}
