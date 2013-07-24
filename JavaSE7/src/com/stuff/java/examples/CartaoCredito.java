package com.stuff.java.examples;

public class CartaoCredito 
{
	//Variáveis
	private String numero;
	private String nome;
	private String banco;
	private double balanco;
	private int limite;
	
	//Construtor
	CartaoCredito(String nu, String nm, String bc, double bl, int limi)
	{
		numero = nu;
		nome = nm;
		banco = bc;
		balanco = bl;
		limite = limi;
	}
	
	//Métodos de acesso
	public String getNumero()
	{
		return numero;
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public String getBanco()
	{
		return banco;
	}
	
	public double getBalanco()
	{
		return balanco;
	}
	
	public int getLimite()
	{
		return limite;
	}
	
	//Métodos de ação
	public boolean	 debita(double preco)
	{
		if(preco + balanco > (double)limite)
		{
			return false; //não há dinheiro suficiente para debitar
		}
		balanco += preco;
		return true; //foi debitado com sucesso
	}
	
	public void fazPagamento(double pagamento)
	{
		//Faz um pagamento
		balanco -= pagamento;
	}
	
	public static void imprimeCartao(CartaoCredito c)
	{
		//Imprime informações sobre o cartão
		System.out.println("Número: "+c.getNumero());
		System.out.println("Nome: "+c.getNome());
		System.out.println("Banco: "+c.getBanco());
		System.out.println("Balanco: "+c.getBalanco());
		System.out.println("Limite: "+c.getLimite());
	}
}

	