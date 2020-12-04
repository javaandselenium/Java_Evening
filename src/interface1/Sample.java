package interface1;

public class Sample implements Interface1,Interface2{
public void demo() {
	System.out.println("deom is the property from sample class");
}

public static void main(String[] args) {
	Sample s=new Sample();
	s.demo();
Interface1.blackbox();
Interface2.whitebox();
		
	
}
}
