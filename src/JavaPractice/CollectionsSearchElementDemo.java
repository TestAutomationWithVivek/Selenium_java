package JavaPractice;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSearchElementDemo {

	public static void main(String[] args) {
		ArrayList<String> allStrings = new ArrayList<String>();
		allStrings.add("Z");
		allStrings.add("M");
		allStrings.add("B");
		allStrings.add("P");
		allStrings.add("a");
		allStrings.add("b");
		
		System.out.println(allStrings);
		Collections.sort(allStrings);
		System.out.println(allStrings);
		
		//Collections.binarySearch(List, element); use this method to search element of List,
		//It will return Index of element if element is present else insertion point
		System.out.println(Collections.binarySearch(allStrings, "a"));
		System.out.println(Collections.binarySearch(allStrings, "z"));
		System.out.println(Collections.binarySearch(allStrings, "C"));

	}

}
