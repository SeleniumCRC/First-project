package javaPrograms;

import java.util.HashMap;
import java.util.Map;

public class occrString {

	public static void main(String[] args) {
		
		String str = "Avvc";
		Map<Character, Integer> mp = new HashMap<Character, Integer>();
		
		char strArr[]  = str.toCharArray();
		for(char c : strArr)
		{
			if(mp.containsKey(c))
			{
				mp.put(c, mp.get(c)+1);
			}
			else
			{
				mp.put(c, 1);
			}
		}
		
		for(Map.Entry entry :mp.entrySet())
		{
			System.out.println(entry.getKey()+": "+entry.getValue());
		}
		

	}

}
