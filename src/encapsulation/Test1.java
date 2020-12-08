package encapsulation;

public class Test1 {

	public static void main(String[] args) {
	Test0 t=new Test0();
	System.out.println(t.getEmailId());
	System.out.println(t.getPassword());
	t.setEmailId("after restting the emailid "+"selenium@gmail.com");
	System.out.println(t.getEmailId());
	t.setPassword(56789);
	System.out.println(t.getPassword());

	}

}
