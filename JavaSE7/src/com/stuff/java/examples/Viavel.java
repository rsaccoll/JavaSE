package com.stuff.java.examples;
/*
 * Interface para objetos que podem ser vendidos
 */
public interface Viavel 
{
	//Descrição do objeto
	public String descricao();
	
	//Lista de preços em centavos
	public int listadePreco();
	
	//preço mais baixo em centavos que se pode aceitar
	public int precoBaixo();
	
}
