package br.stuff.exemplos;


public class Env 
{
	public static void main (String []args)
	{
		for (String env: args)
		{
			String valor = System.getenv(env);
			if(valor != null)
			{
				System.out.format("%s=%s%n",env, valor);
			} else
			{
				System.out.format("%s não" +"foi encontrado.%n",env);
			}
		}
	}
}
