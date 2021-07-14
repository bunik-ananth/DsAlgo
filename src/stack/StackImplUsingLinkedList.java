package stack;

import java.util.EmptyStackException;

public class StackImplUsingLinkedList {

	private Node top;
	private int size;
	
	private class Node{
		private int data;
		private Node next;
		Node(int data){
			this.data = data;
		}
	}
	
	public void push(int data) {
		Node tempNode = new Node(data);
		tempNode.next =top;
		top = tempNode;
		size++;
	}
	
	public int pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		int result = top.data;
		top = top.next;
		size--;
		return result;
	}

	public int peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return top.data;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int size() {
		return size;	
	}
	
	public static void main(String[] args) {
		
		StackImplUsingLinkedList stack = new StackImplUsingLinkedList();
		System.out.println(stack.size());
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
		
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		
		System.out.println(stack.size());
	}
}
