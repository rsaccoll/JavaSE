package br.stuff.exemplos;

public class TesteJDK 
{
	public static void main(String []args)
	{
		try
		{
			Class.forName("java.lang.reflect.Constructor");
		} catch (ClassNotFoundException e)
		{
			String falha = "Algo não deu certo..";
			System.err.println(falha);
			throw new IllegalArgumentException(falha);
		}
		System.out.println("Ok, captou o JDK");
		return;
	}
}
