package constructor;

public class Test1 {
	
	Test1()
	{
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	
	Test1(int a,int b){
		System.out.println(a-b);
	}
	

	public static void main(String[] args) {
		//without parameter
		Test1 t=new Test1();
		//with parameter
		Test1 t1=new Test1(10,5);
	}

}
