package JavaPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapPractice {

	public static void main(String[] args) {
		HashMap<String, String> hashmapOperation = new HashMap<String, String>();
		hashmapOperation.put("vivek", "fadat");
		hashmapOperation.put("Amar", "kolekar");
		hashmapOperation.put("joseph", "kishor");
		hashmapOperation.put("vivek", "nnnnnn");
		hashmapOperation.put(null, "rameshwar");
		hashmapOperation.put("sujay", null);
		hashmapOperation.put("bhaskar", null);
		hashmapOperation.put(null, "martin");
		
		//System.out.println(hashmapOperation);
		//System.out.println(hashmapOperation.get("vivek"));
		//System.out.println(hashmapOperation.get(null));
		
		//Iterator: using the keyset
		
		Iterator<String> iteratorUsingKeySet = hashmapOperation.keySet().iterator();
		
		while(iteratorUsingKeySet.hasNext()) {
			String key = iteratorUsingKeySet.next();
			String value = hashmapOperation.get(key);
			System.out.println("key =" + key + "  " + "value = " + value);
		}
		
		System.out.println("------------------------------------------------------------------");
		//Iteration: by entrySet
		
		Iterator<Entry<String, String>> iteratorUsingEntrySet = hashmapOperation.entrySet().iterator();
		while (iteratorUsingEntrySet.hasNext()) {
			Entry<String, String> entrySet = iteratorUsingEntrySet.next();
			System.out.println("key = " + entrySet.getKey() + " " + "values = " + entrySet.getValue());
		}
		
		System.out.println("----------------------------------------------------------------");
		
		//Iterate Hasmap using java 8 for each and lamba
		hashmapOperation.forEach((k, v) -> System.out.println("key = "+ k + " " + "value = "+ v));

	}

}
