package java_practice;

import java.util.ArrayList;
import java.util.List;

public class UpperLower {

	public static void main(String[] args) {
		
		List l1 = new ArrayList<String>();
		l1.add("Hi");
		l1.add("hello");
		l1.add("gap");
		l1.add("inc");
		
		System.out.println(l1);
		
		l1.replaceAll( str -> ((String) str).toUpperCase());
		
		
		System.out.println("After uppercase " +l1);
		
		l1.replaceAll( str -> ((String) str).toLowerCase());
		
		
		System.out.println("After lowercase " +l1);

	}

}



