package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Test18 {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("Apple");
		a.add("Orange");
		a.add("Grapes");
		a.add("Banana");
		a.add("Papayaa");
		System.out.println("Before sorting "+a);
		Collections.sort(a);
		System.out.println("Ater sorting "+a);
		Collections.sort(a,Collections.reverseOrder());
		System.out.println("After sorting in descending order"+a);
		Collections.reverse(a);
		System.out.println(a);
	}

}
