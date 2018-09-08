package Collections;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CommonMethods {
	public static void display(List<String> al)
	{
		for(String obj:al)
		{
			System.out.print(obj+" ");
		}
	}
	public static void displayHashMap(Set<Entry<Integer, String>> set)
	{
		for(Map.Entry<Integer,String> m:set)
		  {  
			  System.out.println(m.getKey()+" "+m.getValue());  

		  }
	}
	

}
