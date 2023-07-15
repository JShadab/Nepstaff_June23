package p3;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class Test4 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList();

		long sum = list.stream().mapToInt(n -> n).sum();
		System.out.println(sum);

//		OptionalInt opt = list.stream().mapToInt(n -> n).max();
//		
//		if(opt.isPresent())
//		{
//			int max = opt.getAsInt();
//			System.out.println(max);
//		}
//		
		int max = list.stream().mapToInt(n -> n).max().orElse(0);
		System.out.println(max);

	}

}
