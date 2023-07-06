package p2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Sample1 {

	public static void main(String[] args) throws Exception {

		System.out.println("Main Before");

		foo();

		System.out.println("Main After");
	}

	private static void foo() throws FileNotFoundException, IOException {

		System.out.println("Foo Before");

		File file = new File("D:\\nepstaff11.txt");

		FileReader fileReader = new FileReader(file);

		BufferedReader br = new BufferedReader(fileReader);
		
		System.out.println(br.readLine());

		System.out.println("Foo After");

	}

}
