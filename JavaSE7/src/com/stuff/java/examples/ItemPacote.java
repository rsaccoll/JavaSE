package com.stuff.java.examples;

public class ItemPacote implements Viavel, Transporte 
{
	String descricao;
	private int preco;
	private int peso;
	private boolean perig;
	private int altura = 0;
	private int largura = 0;
	private int profundidade = 0;
	
	//Construro
	public ItemPacote(String desc, int p, int pe, boolean a)
	{
		descricao = desc;
		preco = p;
		peso = pe;
		perig = a;
	}
	
	public String descricao()
	{
		return descricao;
	}
	
	public int listadePreco()
	{
		return preco;
	}
	
	public int peso()
	{
		return peso;
	}
	
	public boolean ePerigoso()
	{
		return perig;
	}
	
	public int precoBaixo1()
	{
		return preco*2;
	}
	
	public void setItemPacote(int a, int p, int d)
	{
		altura = a;
		peso = p;
		profundidade = d;
	}



	@Override
	public int precoBaixo() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
