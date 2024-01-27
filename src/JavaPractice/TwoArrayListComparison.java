package JavaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collector;

public class TwoArrayListComparison {

	public static void main(String[] args) {
		//1. comparision Using sort method and equals method
		// use sort() and then equals()
		
		ArrayList<String> array1 = new ArrayList<String>(Arrays.asList("A", "B","C", "D", "F"));
		ArrayList<String> array2 = new ArrayList<String>(Arrays.asList("A", "B","C", "D", "E"));
		
		Collections.sort(array1);
		Collections.sort(array2);
		
		System.out.println(array1.equals(array2));
		
		ArrayList<String> array3 = new ArrayList<String>(Arrays.asList("A", "B","C", "D", "E"));
		Collections.sort(array3);
		System.out.println(array2.equals(array3));
		
		//find additional element in l4
		//array1.removeAll(array2);
		//System.out.println(array1);
		
		//remove additional element in l5
		array2.removeAll(array1);
		System.out.println(array2);
		
		//find common elements
		ArrayList<String> arrayString1 = new ArrayList<String>(Arrays.asList("java", "dotnet","php", "csharp", "shell"));
		ArrayList<String> arrayString2 = new ArrayList<String>(Arrays.asList("java", "dotnet","php", "csharp", "s"));
		arrayString1.retainAll(arrayString2);
		System.out.println(arrayString1);

	}

}
