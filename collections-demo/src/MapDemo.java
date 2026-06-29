import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("varun", "tipkari");
		map.put("dinesh", "rathod");
		map.put("rohit", "pawar");
		
		System.out.println("Varun: "+map.get("varun"));
		System.out.println("Dinesh: "+map.get("dinesh"));
		System.out.println("Rohit: "+map.get("rohit"));
		
		
		System.out.println("\nAll keys and values without feeding keys manually:");
		for(String key : map.keySet()) {
			System.out.println(key + " " + map.get(key));
		}
		
		System.out.println("\nUsing foreach lambda:");
		map.forEach((key,value) -> System.out.println(key + " " + value));
		
	}

}
