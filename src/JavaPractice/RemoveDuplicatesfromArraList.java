package JavaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesfromArraList {

	public static void main(String[] args) {
		ArrayList<Integer> duplicatesNumbers = new ArrayList<Integer>(Arrays.asList(1,0,2,6,2,3,4,8,9,5,6,7,3,2,6,5,8,9,4,10,2,1,0,7,3,2,9,3,2,5,4,10,9,2,1,0,10,8,5));
		
		// you can use LinkedHashSet if you want insertion order to be preserved else we can use HashSet as well if our requirement is not insertion order
		
		LinkedHashSet<Integer> numberWithoutDuplicates = new LinkedHashSet<Integer>(duplicatesNumbers);
		System.out.println(numberWithoutDuplicates);
		
		// remove duplicates using stream().distinct().collect
		ArrayList<Integer> duplicatesMarks = new ArrayList<Integer>(Arrays.asList(1,0,2,6,2,3,4,8,9,5,6,7,3,2,6,5,8,9,4,10,2,1,0,7,3,2,9,3,2,5,4,10,9,2,1,0,10,8,5));
		
		List<Integer> marksSWithoutDuplicates =  duplicatesMarks.stream().distinct().collect(Collectors.toList());
		System.out.println(marksSWithoutDuplicates);
		
		}

}
