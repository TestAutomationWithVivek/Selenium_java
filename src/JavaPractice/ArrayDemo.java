package JavaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayDemo {

	public static void main(String[] args) {
	
	ArrayList<Integer> listViewOfArray = new ArrayList<Integer>(Arrays.asList(10, 15, 20, 30, 45, 50, 60, 25, 36, 89));
	Collections.sort(listViewOfArray);

	listViewOfArray.remove(8);
	listViewOfArray.remove(8);
	System.out.println(listViewOfArray);
	
	for(int i = listViewOfArray.size() -1; i >= 0; i--) {
		System.out.println(listViewOfArray.get(i));
	}

	}
	
	//------------------------------------------------------------------
	//if it is array of string
	ArrayList<String> listViewOfOriginalArray = new ArrayList<String>(Arrays.asList("sf","dl", "dml", "dk", "ls", "sr", "vb", "lr", "bv", "sm"));
	//get create duplicate array of given array except two last two number
	ArrayList<String> listViewOfDemoArray = new ArrayList<String>(Arrays.asList("sf","dl", "dml", "dk", "ls", "sr", "vb", "lr"));

}