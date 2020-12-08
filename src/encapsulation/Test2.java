package encapsulation;

public class Test2 {
	private String name="Dinesh";
	private String courseName="Java";
	private String address="#123 ABC layout BTM Banagalore";
	private int pincode=560098;
	private String currentjob="HCL";
	private double salary=5678.900;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCurrentjob() {
		return currentjob;
	}
	public void setCurrentjob(String currentjob) {
		this.currentjob = currentjob;
	}
	public String getAddress() {
		return address;
	}
	public int getPincode() {
		return pincode;
	}
	public double getSalary() {
		return salary;
	}
	

}
