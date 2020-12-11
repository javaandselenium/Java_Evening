package collections;

import java.util.PriorityQueue;

public class Test9 {

	public static void main(String[] args) {
		PriorityQueue p=new PriorityQueue<>();
		p.add(30);
		p.add(10);
		p.add(90);
		p.add(60);
		p.add(20);
		System.out.println(p);
		System.out.println(p.poll());
		System.out.println(p);

	}

}
