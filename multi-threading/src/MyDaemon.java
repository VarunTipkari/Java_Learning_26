
public class MyDaemon extends Thread {

	private int limit;
	
	public MyDaemon(String name,int limit) {
		super(name);
		this.limit = limit;
	}
	
	public void run() {
		Thread ct = Thread.currentThread();
		String tname = ct.getName();
		for(int c=1;c<=limit;c++) {
			System.out.println(tname+" : "+c);
		}
	}
	
	public static void main(String[] args) {
		MyDaemon t1 = new MyDaemon("First",30);
		MyDaemon t2 = new MyDaemon("Second", 50);
		MyDaemon t3 = new MyDaemon("Third", 100);
		
		MyDaemon md = new MyDaemon("Daemon", 1500);
		md.setDaemon(true);		// stops when all working threads ends
		
		t1.start();
		t2.start();
		t3.start();
		md.start();
	}
	
}
