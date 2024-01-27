package JavaPractice;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add("vivek");
		l.add(30);
		l.add(null);
		l.add("Ashok");
		System.out.println(l);
		
		System.out.println("---------------------------");
		
		l.set(0, "Rajnikant");
		System.out.println(l);
		
		System.out.println("---------------------------");
		
		l.add(0, "Saraf");
		System.out.println(l);
		
		System.out.println("---------------------------");
		
		l.removeLast();
		System.out.println(l);
		System.out.println("---------------------------");
		
		l.addFirst("Ramu");
		System.out.println(l);
		System.out.println("---------------------------");
	}

}
