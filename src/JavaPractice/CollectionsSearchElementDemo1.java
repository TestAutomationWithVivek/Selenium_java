package JavaPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsSearchElementDemo1 {

	public static void main(String[] args) {
		ArrayList<Integer> allSearchableNumbers = new ArrayList<Integer>();
		allSearchableNumbers.add(10);
		allSearchableNumbers.add(0);
		allSearchableNumbers.add(20);
		allSearchableNumbers.add(8);
		allSearchableNumbers.add(9);
		allSearchableNumbers.add(5);
		
		System.out.println(allSearchableNumbers);
		Collections.sort(allSearchableNumbers);
		System.out.println(Collections.binarySearch(allSearchableNumbers, 8, new MyComparator()));

	}

}

class MyComparator implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		int i1 = (Integer) obj1;
		int i2 = (Integer) obj2;
		
		return compare(i1, i2);
	}
}
