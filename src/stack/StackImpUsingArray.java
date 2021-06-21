package stack;

public class StackImpUsingArray {

	private int array[];
	private int capacity;
	private int top;
	
	StackImpUsingArray(int capacity){
		this.array = new int[capacity];
		this.capacity = capacity;
		this.top = -1;
	}
	
	public void push(int item) {
		if(isFull()) {
			throw new RuntimeException("Full");
		}
		array[++top] = item;
		
	}
	
	public int pop() {
		if(isEmpty()) {
			throw new RuntimeException("Emplty");
		}
		return array[top--];// not removing the value adjusting the pointer	
	}
	
	public int peek() {
		if(isEmpty()) {
			throw new RuntimeException("Emplty");
		}
		return array[top];
	}
	
	public boolean isEmpty(){
		if(top == -1) {
			return true;
		}
		return false;
	}
	
	public  boolean isFull() {
		if(top == capacity-1) {
			return true;
		}
		return false;
	}
}
