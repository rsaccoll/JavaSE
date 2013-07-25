package br.stuff.exemplos;

public class StringComparacao 
{
	public static void main(String []args)
	{
		String um = "treze";
		String dois = "cinco";
		
		String var1 = "treze";
		String var2 = "cinco";
		
		String pedaco1 = "t";
		String pedaco2 = "reze";
		
		if(um.equals(var1))
		{
			System.out.println("String um é igual a var 1 equals");
		}
		
		if(um.equals(dois))
		{
			System.out.println("String um é igual a dois usando equals");
		}
		
		if(dois.equals(var2))
		{
			System.out.println("String dois é igual a var usando equals");
		}
		
		if(um == var1)
		{
			System.out.println("String um é igual a var1 usando ==");
		}
		
		if(dois.equalsIgnoreCase(var2))
		{
			System.out.println("String dois é igual a dois usando equals");
		}
		
	}
}
