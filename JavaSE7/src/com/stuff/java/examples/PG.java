package com.stuff.java.examples;

public class PG extends ProgG
{
	//Base
	protected long base;
	
	//herda as varíaveis atual e primeiro
	
	//Construtor default inicializa o valor com base 2
	PG()
	{
		this(2);
	}
	/*
	 * Construtor paramétrico fornece o valor da base
	 * 
	 * @param base é o valor da base de progressão
	 */
	PG(long b)
	{
		base = b;
		primeiro = 1;
		atual = primeiro;
	}
	
	/*
	 * Avança a progressão multiplicando a base pelo valor corrente
	 */
	protected long proximoValor()
	{
		atual *= base;
		return atual;
	}
	//Herda os métodos primeiroValor e imprimePG()
}
