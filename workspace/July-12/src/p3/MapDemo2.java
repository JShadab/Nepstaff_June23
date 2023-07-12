package p3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo2 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();

		map.put("India", "New Delhi");
		map.put("Nepal", "Kathmandu");
		map.put("Pakistan", "Islamabad");
		map.put("USA", "Washington DC");
		map.put("France", "Paris");
		map.put("KSA", "Riyadh");
		map.put("France", "Berlin");

		System.out.println("----- using keySet()-------------");

		Set<String> allKeys = map.keySet();

		for (String key : allKeys) {
			String value = map.get(key);
			System.out.println(key + "=" + value);
		}

		System.out.println("----- using values()-------------");

		Collection<String> allValues = map.values();

		for (String val : allValues) {
			System.out.println(val);
		}

		System.out.println("----- using entrySet()-------------");

		Set<Entry<String, String>> allEntries = map.entrySet();

		for (Entry<String, String> entry : allEntries) {

			String key = entry.getKey();
			String value = entry.getValue();

			System.out.println(key + "=" + value);
		}

		System.out.println("----- using  Java8 forEach method -------------");
		map.forEach((k, v) -> System.out.println(k + "=" + v));

	}

}
