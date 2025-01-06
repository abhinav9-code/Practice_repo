package java_practice;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 1;
		int c = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			
			
			System.out.print(a + ", ");
			
			a=b;
			b=c;
			c=a+b;
			}
		

	}

}
