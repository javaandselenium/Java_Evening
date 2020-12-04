package interface1;

public class Student implements StudentDetails{

	@Override
	public void studentName() {
		System.out.println("student name");
		
	}

	@Override
	public void rollName() {
		System.out.println("rollName");
		
	}

	@Override
	public void dob() {
		System.out.println("dob");
		
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.studentName();
		s.rollName();
		s.dob();
		StudentDetails.sub();
	}

	

}
