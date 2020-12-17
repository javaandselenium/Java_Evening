package interface1;

import accessSpecifiers.Test1;

public class Test2 extends Test{

	public void add() {
	System.out.println("adding");
	}
	
	public static void main(String[] args) {
	Test2 t=new Test2();
	t.add();
	t.sub();
	
	

	}

}
