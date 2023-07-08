package p1;

public class Sample1 {

	public static void main(String[] args) {

		String name = "PYJAC TECHNOLOGIES";

		int len = name.length();
		System.out.println("length: " + len);
		
		String part1 = name.substring(6);
		System.out.println(part1); // TECHNOLOGIES
		
		String part2 = name.substring(6, 10);
		System.out.println(part2); // TECHN

		String s1 = "   ";
		System.out.println(s1.length() + " : " + s1.isEmpty() + " : " + s1.isBlank());

		char ch = name.charAt(9);
		System.out.println(ch);

		String s2 = "I want to eat kabab and paratha";
		System.out.println(s2.indexOf('a')); // 3
		System.out.println(s2.lastIndexOf('a')); // 30

		String newName = name.concat(", India");
		System.out.println(newName);

		System.out.println(name.toLowerCase());
		System.out.println(s2.toUpperCase());

		String s3 = "  Hello Dost   ";
		s3 = s3.trim();
		System.out.println(s3.length() + " : " + s3);// 15 -> 10

		System.out.println("Starts With: " + name.startsWith("PY"));// true
		System.out.println("Starts With: " + name.startsWith("PYT")); // false

		System.out.println("Ends With: " + name.endsWith("IES")); // true
		System.out.println("Ends With: " + name.endsWith("LIES")); // false

		System.out.println("Contains: " + name.contains("TECH"));

		s2 = s2.replace('a', '@');
		System.out.println("After replace: " + s2);

	}

}
