package p1;

public class UseCase2 {

	public static void main(String[] args) {

		int x = 10;
		
		// Convert a Number into a String
		
		//First way
		 String s1 = x + "";
		 System.out.println(s1);
		 
			//Second way
		 String s2 =String.valueOf(x);
		 System.out.println(s2);
		 
		 
		// Convert a String into a Number (IMPORTANT)
		 
		 String str = "1025"; // "1025" + 5 => "10255"
		 
			int a = Integer.parseInt(str);
		 
		  int b = a + 5; // 1025 + 5 => 1030
		  System.out.println(b);

	}

}
