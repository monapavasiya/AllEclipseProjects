package com.telusko;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo 
{

	public static void main(String[] args)
	{
		Map<String,String> map = new HashMap<>();        //Map takes key and value
		map.put("myName", "Navin");
		map.put("actor", "John");
		map.put("ceo","Marisa");
		
		Set<String> keys = map.keySet();
        
		for(String key : keys)
		{
			System.out.println(key + " " + map.get(key));
		}
		

	}

}
