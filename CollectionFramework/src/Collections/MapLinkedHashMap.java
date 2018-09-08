package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class MapLinkedHashMap {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> lhm=new LinkedHashMap<Integer,String>();  
		  lhm.put(100,"Amit");  
		  lhm.put(101,"Vijay");  
		  lhm.put(102,"Abhi");
		  lhm.put(102,"Rahul");
		  lhm.put(104,"Rahul");
		  System.out.println(lhm);
		  System.out.println("Check for isempty : "+ lhm.isEmpty());
		  CommonMethods.displayHashMap(lhm.entrySet());

	}

}
