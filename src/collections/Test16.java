package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Test16 {

	public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add(10);
	a.add(30);
	a.add(50);
	a.add(90);
	System.out.println("Before suffling "+a);
	Collections.shuffle(a);
	System.out.println("After suffling"+a);
	
	
	}

}
