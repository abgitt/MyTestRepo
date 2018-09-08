package Collections;

import java.util.LinkedList;
import java.util.List;

public class ListLinkedList {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		for(int i=0;i<5;i++)
		{
			ll.add(Integer.toString(i));
		}
		System.out.println(ll.pollLast());
		System.out.println();
		CommonMethods.display(ll);
		ll.addFirst("A");
		ll.add(1,"B");
		ll.addLast("Z");
		CommonMethods.display(ll);
		System.out.println(ll.peek());
		System.out.println(ll.peekFirst());
		System.out.println(ll.peekLast());
		CommonMethods.display(ll);
		System.out.println();
		System.out.println(ll.poll());
		CommonMethods.display(ll);
		System.out.println();
		System.out.println(ll.pollFirst());
		CommonMethods.display(ll);
		System.out.println(ll.pollLast());
		System.out.println();
	}

}
