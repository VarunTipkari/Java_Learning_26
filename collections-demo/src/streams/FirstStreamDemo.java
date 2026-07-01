package streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FirstStreamDemo {

	public static void print(Object obj) {
		System.out.println(obj);
	}
	
	public static int add(int a,int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		
		Integer[] arr = {2,3,4,5,8,5,2};
		List<Integer> numbers = Arrays.asList(arr);
		
		/*
		for(int n: numbers) {
			System.out.println(n);
		}
		*/
		
		/*
		Stream<Integer> str1 = numbers.stream();		//reference become useless after one terminal operation
		str1.forEach(System.out::println);		//foreach is a terminal operation
		//stream gets closed by terminal operation
		//following line give an exception as stream is closed now
		System.out.println(str1.count());		//count is a terminal operation
 		*/
		
	//	numbers.stream().distinct().forEach(System.out::println);	//distinct is a intermediate operation
	//	System.out.println(numbers.stream().distinct().count());     //count is terminal op
		
	//	System.out.println(numbers.stream().filter(n -> n > 5).count());   //filter is intermediate op
		
	//	numbers.stream().distinct().sorted().forEach(System.out::println);  //sorted is a intermediate op
		
	//	System.out.println(numbers.stream().reduce(0, (n,m) -> n + m));    //reduce is a terminal op
	//	System.out.println(numbers.stream().reduce(0, Integer::sum));
	//	System.out.println(numbers.stream().reduce(0, FirstStreamDemo::add));
		
	//	numbers.stream().limit(5).forEach(System.out::println);
		
		IntStream istr = IntStream.range(1, 99);
	//	System.out.println(istr.count());
	//	System.out.println(istr.sum());
	//	System.out.println(istr.skip(50).sum());
		
		
	//	IntStream istr2 = IntStream.of(5,7,6,9,3,2,4);
	//	System.out.println(istr2.count());
	//	System.out.println(istr2.sum());
		
		IntSummaryStatistics statics = istr.summaryStatistics();
		System.out.println(statics);
		
	}
	
}
