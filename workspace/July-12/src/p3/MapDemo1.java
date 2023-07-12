package p3;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();

		System.out.println(map.size());
		System.out.println(map.isEmpty());
		System.out.println(map);

		map.put("India", "New Delhi");
		map.put("Nepal", "Kathmandu");
		map.put("Pakistan", "Islamabad");
		map.put("USA", "Washington DC");
		map.put("France", "Paris");
		map.put("KSA", "Riyadh");
		map.put("France", "Berlin");

		System.out.println("-----------------");

		System.out.println(map.size()); //6
		System.out.println(map.isEmpty());
		System.out.println(map);
		

		System.out.println("-----------------");

		System.out.println(map.get("India")); // New Delhi
		System.out.println(map.get("China")); // null
		
		System.out.println("-----------------");

		System.out.println(map.containsKey("India")); // true
		System.out.println(map.containsKey("China")); // false
		
		System.out.println("-----------------");

		System.out.println(map.containsValue("Newyork")); // false
		System.out.println(map.containsValue("Riyadh")); // true
		
		System.out.println("-----------------");
		map.remove("France");
		System.out.println(map);
		
		
		System.out.println("-----------------");
		map.clear();
		System.out.println(map);
		
		
		
	}

}
