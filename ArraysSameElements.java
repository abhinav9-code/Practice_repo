package java_practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ArraysSameElements {

	public static void main(String[] args) {
		int[] a1 = {1, 2, 4, 5, 6};
		int[] a2 = {1, 2, 4, 5, 6};
		int[] a3 = {1, 2, 4, 5, 0};
		
		System.out.println(sameElements(a1,a2));
		
		

	}
	
	
	public static boolean sameElements(int[] arr1, int[] arr2) {
		Set<Integer> s1 = new HashSet<>(Arrays.stream(arr1).boxed().collect(Collectors.toList()));
		Set<Integer> s2 = new HashSet<>(Arrays.stream(arr2).boxed().collect(Collectors.toList()));
		
		if (s1.size() != s2.size()) {
			return false;
		}
		
		else {
			for (Integer i: s1) {
				if (!(s2.contains(i))) return false;
			}
			
		}
		
		return true;
		
		
	}

}
