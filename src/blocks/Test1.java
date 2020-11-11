package blocks;

import methods.Test0;

public class Test1 {
	static {
		System.out.println("first");
	}
	
	static {
		System.out.println("second");
	}
	
	static {
		int a=10;
		int b=20;
		System.out.println(a+b);
		System.out.println("Third");
	}
	
	 {
		System.out.println("non first");
	}
	 
	 {
		System.out.println("non second");
	}
	 
	 public void add()
	 {
		 System.out.println("add");
	 }

	public static void main(String[] args) {
		Test1 t=new Test1();
		t.add();
		Test0.add();
	

	}

}
