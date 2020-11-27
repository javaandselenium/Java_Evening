package typecasting;

public class Display {
public void blackdisp() {
	System.out.println("Black dispaly");
}
}

class Channel extends Display{
	public void whitedisp() {
		System.out.println("white dispaly");
	}
}

class Test9{
	public static void main(String[] args) {
		//upcating
		Display d=new Channel();
		d.blackdisp();
		
		Channel c=(Channel)d;
		c.blackdisp();
		c.whitedisp();
	}
}