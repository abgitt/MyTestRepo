package Collections;

import java.util.Stack;

public class ListStack {

	public static void main(String[] args) {
		Stack<String> st = new Stack<String>();
		for(int i=0;i<5;i++)
		{
			st.push(Integer.toString(i));
		}
		int k = st.size();
		for(int i=0;i<k;i++)
		{
		//	System.out.println(st.peek());
			System.out.println(st.pop());
		}
		System.out.println("After pop is Statck empty ???  "+st.isEmpty());
	}

}
