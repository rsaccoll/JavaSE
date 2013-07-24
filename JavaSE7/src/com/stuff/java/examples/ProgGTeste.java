package com.stuff.java.examples;

public class ProgGTeste 
{
	//Testa as classes de progressão
	public static void main(String []args)
	{
		ProgG progressao;
		//Testa PA
		System.out.println("PA com incremento inicial");
		progressao = new PA();
		progressao.imprimePG(10);
		
		System.out.println("PA com incremento inicial 5");
		progressao = new PA(5);
		progressao.imprimePG(10);
		
		//Testa PG
		System.out.println("PG com base inicial");
		progressao = new PA();
		progressao.imprimePG(10);
		
		System.out.println("PG com base inicial 3");
		progressao = new PA(3);
		progressao.imprimePG(10);
		
		//Testa Fibonacci
		System.out.println("Fibonacci com Valores iniciais");
		progressao = new Fibonacci();
		progressao.imprimePG(10);
		
		System.out.println("Fibonacci com Valores iniciais 4 e 6");
		progressao = new Fibonacci(4,6);
		progressao.imprimePG(10);
	}
}
