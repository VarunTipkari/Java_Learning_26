package streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapStreamDemo {

	public static void main(String[] args) {

		Map<String,String> people = new HashMap<>();
		people.put("Polo", "Pune");
		people.put("Milli", "Mumbai");
		people.put("Deny","Delhi");
		
		//people.values().stream().forEach(System.out::println);
		
		List<String> cities = people.values().stream().map(c -> c.toUpperCase()).sorted().collect(Collectors.toList());
		cities.forEach(System.out::println);
		
		
		Map<String,List<String>> contacts = new HashMap<>();
		contacts.put("Varun", Arrays.asList("853-045","458-123"));
		contacts.put("Swapnil", Arrays.asList("996-060","608-121","853-045"));
		contacts.put("Rohit", Arrays.asList("853-028","281-234","608-121"));
		
		//contacts.values().stream().flatMap(Collection::stream).forEach(System.out::println);
		
	//	System.out.println("\nNumbers containing digit 8:");
	//	contacts.values().stream().flatMap(Collection::stream).filter(n -> n.contains("8")).forEach(System.out::println);
		
		System.out.println("\nNumbers excluding (-) :");
		contacts.values().stream().flatMap(Collection::stream).map(n -> n.replace("-", "")).forEach(System.out::println);
		
	}

}
