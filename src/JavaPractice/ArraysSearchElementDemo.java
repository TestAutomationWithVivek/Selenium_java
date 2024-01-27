package JavaPractice;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSearchElementDemo {

	public static void main(String[] args) {
		int [] a = {1,10,5,7,8,6};
		System.out.println("element of int arrays before sorting");
		
		for(int a1 : a) {
			System.out.println(a1);
		}
		
		Arrays.sort(a);
		System.out.println("element of int arrays after sorting");
		for(int a2 : a) {
			System.out.println(a2);
		}
		
		String [] stringArray = {"vivek", "amar", "soham", "golu","rajendra"};
		
		System.out.println("element of string array before sorting");
		for(String s : stringArray) {
			System.out.println(s);
		}
		
		System.out.println("element of array string after sorting");
		Arrays.sort(stringArray);
		for(String s2 : stringArray) {
			System.out.println(s2);
		}
		
		System.out.println("element of array string after customised sorting");
		//Arrays.sort(stringArray, new MyComparator()); 

	}

class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		return s2.compareTo(s1);
	}
}
}
