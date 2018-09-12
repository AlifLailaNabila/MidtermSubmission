package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		Queue<String> color = new LinkedList<>();
		color.add("Red");
		color.add("Black");
		color.add("Yellow");
		color.add("White");
		System.out.println("peek : "+color.peek());
		System.out.println("size"+color.size());
		System.out.println("remove : "+color.remove());
		System.out.println("peek"+color.peek());
		System.out.println("poll : "+color.poll());
		for(String x : color ){
			System.out.println("for each loop : "+x);
		}
		Iterator it = color.iterator();
		while(it.hasNext()){
			System.out.println("Iterator : "+it.next());
		}







	}

}
