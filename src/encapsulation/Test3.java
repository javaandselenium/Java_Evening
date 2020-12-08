package encapsulation;

public class Test3 {

	public static void main(String[] args) {
		Test2 t = new Test2();
		System.out.println(t.getName());
		t.setName("Tejesh");
		System.out.println(t.getName());

		System.out.println(t.getCourseName());
		t.setCourseName("Selenium");
		System.out.println(t.getCourseName());
		
		System.out.println(t.getAddress());
		
		System.out.println(t.getPincode());
		
		System.out.println(t.getCurrentjob());
		t.setCurrentjob("Apple");
		System.out.println(t.getCurrentjob());
		
		System.out.println(t.getSalary());
	

	}

}
