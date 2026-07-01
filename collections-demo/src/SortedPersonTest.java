import java.util.Comparator;
import java.util.TreeSet;

public class SortedPersonTest {

	public static void main(String[] args) {

		/*we need special comparison logic implemented using Comparator when the class is not 
		Comparable or you cant / want to touch the existing object
		*/
		
		Comparator<Person> ageComp = (p1,p2) -> p1.getAge() - p2.getAge();
		Comparator<Person> nameComp = (p1,p2) -> p1.getName().compareTo(p2.getName());
		
		TreeSet<Person> tset = new TreeSet<Person>();
		
		tset.add(new Person("varun",21));
		tset.add(new Person("rohit",20));
		tset.add(new Person("dinesh",19));
		
		tset.forEach(System.out::println);
		
	}

}
