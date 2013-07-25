package com.stuff.java.examples;

public class EntradaJogo 
{
	String nome;
	protected int score;
	
	public EntradaJogo(String n, int s)
	{
		nome = n;
		score = s;
	}
	
	//Recupera o campo nome
	public String getNome()
	{
		return nome;
	}
	
	//Recupera campo score
	public int getScore()
	{
		return score;
	}
	
	//Retorna uma string com a representação deste registro
	public String toString()
	{
		return"(" + nome + ", " + score + ")";
	}
}
