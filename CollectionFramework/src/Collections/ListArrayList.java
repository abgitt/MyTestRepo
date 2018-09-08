package Collections;

import java.util.ArrayList;
import java.util.List;

public class ListArrayList {

	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		for(int i=0;i<5;i++)
		{
			al.add(Integer.toString(i));
		}
		
		CommonMethods.display(al);
		System.out.println();
		List<String> al2 = new ArrayList<String>();
		al2.add("A");al2.add("B");al2.add("C");
		al2.addAll(al);
		CommonMethods.display(al2);
		System.out.println("Removing 0 and A");
		al2.remove("0");al2.remove("A");
		CommonMethods.display(al2);
		System.out.println();
		System.out.println(al2.size());
		System.out.println("Checking is empty ????"+al2.isEmpty());
		System.out.println("Check for One --> "+al2.contains("1"));
		System.out.println("Check for Hundred --> "+al2.contains("100"));
		
	}

}
