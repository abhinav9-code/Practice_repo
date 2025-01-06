package java_practice;

import java.util.function.Predicate;

public class LamdasEx2 {

	public static void main(String[] args) {
		
		Predicate isEmptyString = str -> ((String) str).isEmpty();
		
		String s1 = "";
		String s2 = "Hi I am Abhinav";
		
		System.out.println("String iss empty "+ isEmptyString.test(s1));

	}

}
