package java_practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDuplicate {

	public static void main(String[] args) {
		
		List<Integer> l1 = Arrays.asList(10,20,40,1,3,66,70,1,20,3);
		
		List<Integer> l2 = l1.stream().distinct().collect(Collectors.toList());
		
		System.out.println("Distinct Arrays " + l2);
		
		List < String > colors = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");
	    System.out.println("Original list of strings (colors): " + colors);
	    char startingLetter = 'B';
	    // Count strings starting with a specific letter
	    long ctr = colors.stream()
	      .filter(s -> s.startsWith(String.valueOf(startingLetter)))
	      .count();
	    System.out.println("\nNumber of colors starting with '" + startingLetter + "': " + ctr);
	    char startingLetter1 = 'Y';
	    // Count strings starting with a specific letter
	    ctr = colors.stream()
	      .filter(s -> s.startsWith(String.valueOf(startingLetter1)))
	      .count();
	    System.out.println("\nNumber of colors starting with '" + startingLetter1 + "': " + ctr);

	}

}
