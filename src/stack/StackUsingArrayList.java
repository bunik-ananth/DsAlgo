package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackUsingArrayList {

	private List<String> elements = new ArrayList<>();
	
	public boolean isEmpty() {
		return elements.isEmpty();
	}
	
	public String peek() {
		if(elements.isEmpty()) {
			return null;
		}
		return elements.get(elements.size()-1);
	}
	
	public String pop() {
		if(elements.isEmpty()) {
			return null;
		}
		String top = elements.get(elements.size()-1);
		elements.remove(elements.size()-1);
		return top;
	}
	
	public int size() {
		return elements.size();
	}
	
	public void push(String str) {
		elements.add(str);
	}
	
	public static void main(String[] args) {
		StackUsingArrayList stack = new StackUsingArrayList();
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
		stack.push("a");
		stack.push("b");
		System.out.println(stack.size());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.isEmpty());
		System.out.println(stack.size());
		System.out.println(stack.peek());
	}
}
