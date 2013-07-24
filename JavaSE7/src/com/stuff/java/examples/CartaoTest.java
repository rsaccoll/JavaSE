package com.stuff.java.examples;

public class CartaoTest 
{
	public static void main(String []args)
	{
		CartaoCredito carteira[] = new CartaoCredito[10];
		carteira[0] = new CartaoCredito("3591 0375 5555 9090", "Ramses Sacol", "Banrisul", 0.0, 2500);
		carteira[1] = new CartaoCredito("3581 0275 5455 1090", "Ramses Almeida", "HSBC", 0.0, 3500);
		carteira[2] = new CartaoCredito("3291 0275 5555 9091", "Ramses Jose", "Itau", 0.0, 2500);
		
		for(int i = 0; i<16; i++)
		{
			carteira[0].debita((double)i);
			carteira[1].debita(2.0*i); //conversão implicita
			carteira[2].debita((double)3*i);	//conversão explicita
		}
		
		for(int i = 0; i<3; i++)
		{
			CartaoCredito.imprimeCartao(carteira[i]);
			while(carteira[i].getBalanco() > 100.0)
			{
				carteira[i].fazPagamento(100.0);
				System.out.println("Novo Balanco: "+carteira[i].getBalanco());
			}
		}
	}
}
