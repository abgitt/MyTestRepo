package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapHashMap {

	public static void main(String[] args)
	{
		HashMap<Integer,String> hm=new HashMap<Integer,String>();  
		  hm.put(100,"Amit");  
		  hm.put(101,"Vijay");  
		  hm.put(102,"Abhi");
		  hm.put(102,"Rahul");
		  hm.put(104,"Rahul");
		  System.out.println(hm);
		  CommonMethods.displayHashMap(hm.entrySet());
	}

}
