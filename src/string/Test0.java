package string;

public class Test0 {

	public static void main(String[] args) {
		String s=" I LOVE JAVA ";

		System.out.println(s.length());
		System.out.println(s.charAt(4));
		System.out.println(s.concat("Selenium"));
		System.out.println(s.contains("LOVE"));
		System.out.println(s.endsWith(" "));
		System.out.println(s.compareTo(" I LOVE JAVA "));
		System.out.println(s.contentEquals(" I LOVE JAVA "));
		System.out.println(s.compareToIgnoreCase(" i love java "));
		System.out.println(s.equals("i love java"));
		System.out.println(s.equalsIgnoreCase(" i love java "));
		System.out.println(s.indexOf('E'));
		System.out.println(s.indexOf("LOVE"));
		System.out.println(s.isBlank());
		System.out.println(s.isEmpty());
		System.out.println(s.lastIndexOf('A'));
//		System.out.println(s.lastIndexOf('J',5));
//	System.out.println(s.lastIndexOf("JAVA",8));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.trim());
		
		
	}

}
