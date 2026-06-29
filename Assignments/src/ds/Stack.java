package ds;

public class Stack {
	
	private int top;
	private int[] arr;
	private int size;
	
	public Stack(int size) {
		top = -1;
		this.size = size;
		arr = new int[this.size];
	}
	
	public int peek() {
		return arr[top];
	}
	
	public void push(int data) {
		if(top == size-1) {
			System.out.println("Stack Overflowed!");
		}
		else {
			top++;
			arr[top] = data;
		}
	}
	
	public void pop() {
		if(top == -1) {
			System.out.println("Stack Underflow!");
		}
		else {
			top--;
		}
	}
	
	public void print() {
		if(top != -1) {			
			for(int n : arr) {
				if(n != 0) {					
					System.out.println(n);
				}
			}
		}
	}
	
}
