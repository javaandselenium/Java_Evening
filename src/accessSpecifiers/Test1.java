package accessSpecifiers;

import ac.Test0;
import ac.Test2;
import ac.Test3;
import ac.Test4;

public class Test1 extends Test4{

	public static void main(String[] args) {
		Test0 t=new Test0();
		System.out.println(t.a);
		t.add();
		
		Test1 t1=new Test1();
		System.out.println(t1.a);
		t1.demo();
		
		
		
	}

}
