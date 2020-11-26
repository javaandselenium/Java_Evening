package methods;

public class Whatsup1 {
	public void status() {
		System.out.println("message");
	}

}
class Whatsup2 extends Whatsup1
{
	public void status() {
		System.out.println("photos video ");
		super.status();
	}
}

class Whatsup3 extends Whatsup2{
	public void status() {
		System.out.println("location,gif");
		super.status();
	}
		public static void main(String[] args) {
			Whatsup3 w=new Whatsup3();
			w.status();
	
}}


	
