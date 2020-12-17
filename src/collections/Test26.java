package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;



public class Test26 {

	public static void main(String[] args) {
		PriorityQueue a=new PriorityQueue();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		Iterator t=a.iterator();
		while(t.hasNext()) {
		System.out.println(t.next());
	
		}

	}

}
