package java_practice;

public class LambdasEx1 {

	public static void main(String[] args) {
		
		SumIntegers si = (x, y) -> x+y;
		int result = si.sum(2, 200);
		System.out.println(result);
		

	}

}


interface SumIntegers {
	
	int sum(int a, int b);
	
	
	
	
}
