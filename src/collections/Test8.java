package collections;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class Test8 {

	public static void main(String[] args) {
		PriorityQueue p=new PriorityQueue();
		LinkedList p=new LinkedList();
		p.add(30);
		p.add(10);
		p.add(90);
		p.add(60);
		p.add(20);
		System.out.println(p);
		for(int i=0;i<p.size();i++)
		{
			System.out.println(p.get(i));
		}
		
	}

}
