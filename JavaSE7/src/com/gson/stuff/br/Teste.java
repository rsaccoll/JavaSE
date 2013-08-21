package com.gson.stuff.br;

public class Teste 
{
	private int Id;
	private String Cenario;
	private String Caso;
	private String Status;
	
	public Teste(int Id, String Cenario, String Caso, String Status)
	{
		this.Id = Id;
		this.Cenario = Cenario;
		this.Caso = Caso;
		this.Status = Status;
	}
	
	public String toString()
	{
		return "Id = " +Id+ ", Cenário = " +Cenario + ", Caso de Teste = " +Caso + ", Status = " +Status;
	}
}
