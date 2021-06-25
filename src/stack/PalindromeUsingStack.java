package stack;

import java.util.Stack;


public class PalindromeUsingStack {

	public static void main(String[] args) {
		isPalindrome("ABABA");
	}
	
	public static void isPalindrome(String str) {
		Stack stack = new Stack();
		for(int i=0; i<str.length(); i++) {
			stack.push(str.charAt(i));
		}
		
		StringBuilder sb = new StringBuilder();
		while(!stack.isEmpty()) {
//			reverse += stack.pop();
			sb.append(stack.pop());
		}
		if(str.equals(sb.toString())) {
			System.out.println(str+" is  Palindrome");
		}
		else {
			System.out.println(str+" is not Palindrome");
		}
	}
	

}
