package java_practice;

import java.util.function.Predicate;

public class Prime {

	public static void main(String[] args) {
		
		Predicate<Integer> isPrime = s1 -> {
			
			if (s1<0) return false;
			
			
			for (int n=2; n<=Math.sqrt(s1); n++) {
				
				if (s1%n==0) return false;
			}
			
			return true;
		};
		
		
		int n1 = 17;
		
		boolean res = isPrime.test(n1);
		
		System.out.println(res);
		
		
		

	}

}
