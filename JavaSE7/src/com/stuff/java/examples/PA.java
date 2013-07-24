package com.stuff.java.examples;

public class PA extends ProgG 
{
	//Incrementa
	protected long inc;
	//Herda as variaveis primeiro e atual
	//Construtor default inicializa com incremento 1
	PA()
	{
		this(1);
	}
	
	PA(long incremento)
	{
		inc = incremento;
	}
	
	/*
	 * Avança a progressão acrescentando o incremento ao valor atual
	 * 
	 * @return próximo valor da progressão
	 */
	protected long proximoValor()
	{
		atual += inc;
		return atual;
	}
	//herda os métodos primeiroValor() e imprimePG(int)
}
