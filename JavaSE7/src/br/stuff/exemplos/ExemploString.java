package br.stuff.exemplos;

public class ExemploString 
{
	public static void main(String []args)
	{
		String original = "Essa é a string original";
		System.out.println(original.substring(0, original.length()));
		System.out.println(original.substring(5,20));
		System.out.println(original.substring(12));
	}
}
