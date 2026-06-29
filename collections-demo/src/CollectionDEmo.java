import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class CollectionDEmo {

	public static void main(String[] args) {
		
		System.out.println("LinkedList from Collections api demo :\n");
		
		LinkedList<String> lst = new LinkedList<String>();
		lst.add("MSoft");
		lst.add("Google");
		lst.add("Nvidia");
		lst.add("Apache");
		
		System.out.println("Traversing using for-loop:");
		for(int i=0;i<lst.size();i++) {
			System.out.println(lst.get(i));
		}
		
		System.out.println("\nTraversing using Iterator:");
		Iterator<String> itr = lst.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("\nTraversing using for-each loop");
		for(String i : lst) {
			System.out.println(i);
		}
		
		System.out.println("\nTraversing using for-each method");
		lst.forEach(System.out::println);
		
		
		//----------------------------------------------------------------
		
		ArrayList<String> arl = new ArrayList<String>();
		arl.add("IBM");
		arl.add("Google");
		arl.add("IMAX");
		
		arl.addAll(lst); 	//merging a collection into another
		
		System.out.println("\nTraversing over merged collection");
		for(String i : arl) {
			System.out.println(i);
		}
		
		//----------------------------------------------------------------
		
		HashSet<String> hs = new HashSet<String>(arl);
		System.out.println("\nTraversing over set collection:");
		for(String i : hs) {
			System.out.println(i);
		}
		
		TreeSet<String> ts = new TreeSet<String>(hs);	//ordered set
		System.out.println("\nTraversing over sorted (tree-set) collection:");
		for(String i : ts) {
			System.out.println(i);
		}
		
	}

}
