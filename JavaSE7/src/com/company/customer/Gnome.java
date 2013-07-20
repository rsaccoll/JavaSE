package com.company.customer;

public class Gnome 
{
	//Variáveis da instância
	public String nome;
	public int idade;
	public Gnome gnomeBuddy;
	private boolean magico = false;
	protected double altura = 2.6;
	public static final int ALT_MAX = 3; //Altura máxima
	
	//Construtores
	Gnome(String nm, int id, Gnome bud, double alt)
	{
		nome = nm;
		idade = id;
		gnomeBuddy = bud;
		altura = alt;
	}
	//Construtor default
	Gnome()
	{
		nome = "Ramses";
		idade = 30;
		gnomeBuddy = null;
		altura = 1.7;
	}
	
	//Métodos
	public static void facaRei(Gnome h)
	{
		h.nome = "Rei "+h.getNomeReal();
	}
	
	public void facaMeRei()
	{
		nome = "Rei "+getNomeReal();
	}
	
	public boolean eMagico()
	{
		return magico;
	}
	
	public void setAltura(int novaAltura)
	{
		altura = novaAltura;
	}
	
	public String getNome()
	{
		return "Não vou dizer!!!";
	}
	
	public String getNomeReal()
	{
		return nome;
	}
	
	public void renomeiaGnome(String s)
	{
		nome = s;
	}
}
