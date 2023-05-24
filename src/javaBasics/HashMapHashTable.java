package javaBasics;

import java.util.*;
import java.util.Map.Entry;

public class HashMapHashTable {
	
	// HashMap & Hashtable -> class, key-value(entry) pair | handling null

	public static void main(String[] args) {
		// HashMap:
		HashMap<String, Integer> hm = new HashMap<String, Integer>(); // <String, Integer> -> <Key,Value>
		
		// insert data
		hm.put("Messi", 10);
		hm.put("C.Ronaldo", 7);
		hm.put("Neymar", 9);
		
		System.out.println(hm);
		
		// getting data
		System.out.println("Jersey number for Neymar: "+hm.get("Neymar"));
		System.out.println("Jersey number for neymar: "+hm.get("neymar"));
		
		// validation for key or value
		System.out.println(hm.containsKey("Messi"));
		System.out.println(hm.containsValue(11));
		
		// delete entry
//		System.out.println(hm);
//		hm.remove("Neymar");
//		System.out.println(hm);
		
//		Object cloneHashMap = hm.clone();
//		System.out.println(hm.equals(cloneHashMap));
//		hm.clear();
//		System.out.println(hm.equals(cloneHashMap));
//		System.out.println(hm.isEmpty());
		
		// replace
		System.out.println(hm);
		hm.replace("Neymar", 11);
		System.out.println(hm);
		
		hm.replace("Neymar", 11, 8);
		System.out.println(hm);
		
		// all keys
		Set<String> keys = hm.keySet();	
		System.out.println(keys.size());
		System.out.println(keys);
		
		// all values
		Collection<Integer> allValues = hm.values();
		System.out.println(allValues.size());
		System.out.println(allValues);
		
		// all entries
		Set<Entry<String, Integer>> entries = hm.entrySet();
		System.out.println(entries.size());
		System.out.println(entries);
		
		// traversing
		for (String key : keys) {
			System.out.print(hm.get(key) + " ");
		}

		// Hashtable:
		Hashtable<String, Integer> ht = new Hashtable<String, Integer>(); // <String, Integer> -> <Key,Value>

		// insert data
		ht.put("Messi", 10);
		ht.put("C.Ronaldo", 7);
		ht.put("Neymar", 9);

		System.out.println(ht);

		// getting data
		System.out.println("Jersey number for Neymar: " + ht.get("Neymar"));
		System.out.println("Jersey number for neymar: " + ht.get("neymar"));

		// validation for key or value
		System.out.println(ht.containsKey("Messi"));
		System.out.println(ht.containsValue(11));

		// delete entry
//		System.out.println(ht);
//		ht.remove("Neymar");
//		System.out.println(ht);
//
//		Object cloneHashtable = ht.clone();
//		System.out.println(ht.equals(cloneHashtable));
//		ht.clear();
//		System.out.println(ht.equals(cloneHashtable));
//		System.out.println(ht.isEmpty());

		// replace
		System.out.println(ht);
		ht.replace("Neymar", 11);
		System.out.println(hm);

		ht.replace("Neymar", 11, 8);
		System.out.println(ht);

		// all keys
		Set<String> keysHt = ht.keySet();
		System.out.println(keysHt.size());
		System.out.println(keysHt);

		// all values
		Collection<Integer> allValuesHt = ht.values();
		System.out.println(allValuesHt.size());
		System.out.println(allValuesHt);

		// all entries
		Set<Entry<String, Integer>> entriesHt = ht.entrySet();
		System.out.println(entriesHt.size());
		System.out.println(entriesHt);

		// traversing
		for (String keyHt : keysHt) {
			System.out.print(ht.get(keyHt) + " ");
		}

	}

}
