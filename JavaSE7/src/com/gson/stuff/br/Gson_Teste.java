package com.gson.stuff.br;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;
import java.util.ArrayList;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;


public class Gson_Teste 
{
	private static final String jsonCaminho = "/home/ramses/Dev/exemplo.json";
	
	public static void main(String []args)
	{
		List<Teste> objList = new ArrayList<Teste>();
		objList.add(new Teste(0,"Estoque" , "Teste item um", "Passou"));
	    objList.add(new Teste(1,"Estoque" , "Teste item dois", "Falhou"));
	    objList.add(new Teste(2,"Estoque" , "Teste item tres", "Passou"));
	    objList.add(new Teste(3,"Estoque" , "Teste item quatro", "Passou"));
	    objList.add(new Teste(4,"Estoque" , "Teste item cinco", "Falhou"));
	    objList.add(new Teste(5,"Estoque" , "Teste item seis", "Passou"));
	    objList.add(new Teste(6,"Estoque" , "Teste item sete", "Passou"));
	    objList.add(new Teste(7,"Caixa" , "Teste item um", "Passou"));
	    objList.add(new Teste(8,"Caixa" , "Teste item dois", "Falhou"));
	    objList.add(new Teste(9,"Caixa" , "Teste item tres", "Passou"));
	    objList.add(new Teste(10,"Home" , "Teste item quatro", "Passou"));
	    objList.add(new Teste(11,"Home" , "Teste item cinco", "Falhou"));
	    objList.add(new Teste(12,"Home" , "Teste item seis", "Passou"));
	    objList.add(new Teste(13,"Home" , "Teste item sete", "Passou"));
	    
	    Gson gson = new GsonBuilder().setPrettyPrinting().create();
	    String json = gson.toJson(objList);
	    System.out.println(json);
	    
	    for(int i = 0; i < objList.size(); i++)
	    {
	    	try
	    	{
	    		FileWriter escreve = new FileWriter(jsonCaminho);
	    		escreve.write(json);
	    		escreve.close();
	    	} catch(IOException e)
	    	{
	    		e.printStackTrace();
	    	}
	    	
	    }
	}
}
