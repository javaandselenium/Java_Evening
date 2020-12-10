package collections;

import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(10.00);
		a.add("Hello");
		
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a.addAll(1,a1);
		//a.addAll(a1);
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}

	}

}
