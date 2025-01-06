package java_practice;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc123";
		System.out.println(reverse(str));

	}
	
	


	public static String reverse(String in) {
		
		
		if (in == null) {
			throw new IllegalArgumentException("not a valid input");
		}
		
		StringBuilder sb = new StringBuilder();
		
		char[] ch = in.toCharArray();
		
		for (int i = ch.length - 1; i >=0; i--) {
			
			sb.append(ch[i]);
			
			
		}
		
		return sb.toString();
		
	}

}
