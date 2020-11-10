package methods;

public class Whatsup {
	public static void send(int numb)
	{
		System.out.println("Sending numb");
	}
	
	public static void send(String picture,String videos)
	{
		System.out.println("Sending pictures and videos");
	}
	
	public static void send(String documents,double location,String pictures)
	{
		System.out.println("sending docs loc and pic");
	}
	
	public static void main(String[] args) {
		Whatsup.send(".png",".mp4");
	}
	
	
	

}
