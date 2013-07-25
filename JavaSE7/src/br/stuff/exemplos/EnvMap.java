package br.stuff.exemplos;

import java.util.Map;

public class EnvMap 
{
	public static void main(String []args)
	{
		Map<String, String> env = System.getenv();
		for(String envNome : env.keySet())
		{
			System.out.format("%s=%s%n", envNome, env.get(envNome));
		}
	}
}
