package com.stuff.java.examples;

public class Fotografia implements Viavel
{
	private String descricao;
	private int preco;
	private boolean cor;
	
	public Fotografia(String desc, int p, boolean c)
	{
		descricao = desc;
		preco = p;
		cor = c;
	}

	public String descricao()
	{
		return descricao;
	}
	
	public int listadePreco()
	{
		return preco;
	}
	
	public int precoBaixo()
	{
		return preco/2;
	}
	
	public boolean eColorido()
	{
		return cor;
	}
}



