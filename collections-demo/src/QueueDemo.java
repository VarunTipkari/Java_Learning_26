import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {

		Queue<String> que = new LinkedList<String>();
		
		que.add("Apple");
		que.add("Banana");
		que.add("Grapes");
		
		System.out.println(que.peek());	//fetch peek but doesnt remove
		
		while(!que.isEmpty()) {
			System.out.println(que.poll());	//fetch value and remove from queue
		}
		
		System.out.println();
		
		Deque<String> dque = new LinkedList<String>();
		
		dque.offerLast("Apple");
		dque.offerLast("Banana");
		dque.offerLast("Grapes");
		
		dque.offerFirst("Avacardo");
		dque.offerFirst("Chiku");


		while(!dque.isEmpty()) {
			System.out.println(dque.pollFirst());
		}
		
		
	}

}
