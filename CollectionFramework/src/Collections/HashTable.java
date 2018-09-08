package Collections;

import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
		Hashtable<Integer,String>  h = new Hashtable<Integer,String>();  
		h.put(100,"Amit");  
		h.put(101,"Vijay");  
		h.put(102,"Abhi");
		h.put(102,"Rahul");
		h.put(104,"Rahul");
		System.out.println(h);
		System.out.println("Check for isempty : "+ h.isEmpty());
		CommonMethods.displayHashMap(h.entrySet());

	}

}
