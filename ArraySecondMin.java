package java_practice;

public class ArraySecondMin {

	public static void main(String[] args) {
		
	
		
		int[] a1 = {1,5,66,22,10,9};
		int[] a2 = {1,1,1,1};
		
		System.out.println("second highest number is :" + SecondHighest(a2));
		
		
	
		
		

	}
	
	
	public static int SecondHighest(int[] arr) {
		
		int maxval = Integer.MIN_VALUE;
		int secmax = Integer.MIN_VALUE;
		
		if ((arr == null) || (arr.length < 2)) {
			
			throw new IllegalArgumentException("Array must contain atleast 2 elements");
			
		}
		
		for (int i : arr) {
			
			if (i > maxval) {
				
				secmax = maxval;
				maxval = i;
				
			}
			
			else if(i> secmax && i< maxval) {
				
				
				secmax = i;
				
				
			}
			
			
		}
		
		if (secmax == Integer.MIN_VALUE) {
			
			throw new IllegalArgumentException("there is no second largest element in the array");
			
		}
		
		return secmax;
		
	
	}

}
