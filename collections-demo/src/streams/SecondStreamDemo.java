package streams;

import java.util.Arrays;
import java.util.List;

public class SecondStreamDemo {

	public static void main(String[] args) {

		List<String> basket = Arrays.asList("Cherry","Mango","Papaya","Gauva","Banana","Apple");
	
	//	basket.forEach(System.out::println);
		
	//	basket.stream().sorted().forEach(System.out::println);
		
	//	basket.stream().map(s -> s.toUpperCase()).sorted().forEach(System.out::println);
		
	//	basket.stream().filter(s -> s.contains("a")).forEach(System.out::println);
		
		System.out.println(basket.stream().filter(s -> s.contains("a")).count());
		
	}

}
