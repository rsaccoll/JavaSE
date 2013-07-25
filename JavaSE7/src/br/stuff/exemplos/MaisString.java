package br.stuff.exemplos;

public class MaisString 
{
	public static void main(String []args)
	{
		String exemplo = "Essa é uma string que tem espaço.      ";
		System.out.println(exemplo);
		System.out.println(exemplo.trim());
		
		String exemplo1 = "Outra String para altera as letras";
		System.out.println(exemplo1.toUpperCase());
		System.out.println(exemplo1.toLowerCase());
		
		String exemplo2 = "uma string ";
		String exemplo3 = "que precisa virar uma frase";
		String resultado = exemplo2.concat(exemplo3);
		String resultado1 = exemplo2 + "" + exemplo3;
		StringBuffer buffer = new StringBuffer();
		buffer.append(exemplo2).append("").append(exemplo3);
		String resultado3 = buffer.toString();
		System.out.println(resultado);
		System.out.println(resultado1);
		System.out.println(resultado3);
	}
}