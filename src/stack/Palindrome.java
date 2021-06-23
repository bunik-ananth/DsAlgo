package stack;

import java.util.Stack;
import java.util.StringJoiner;
import java.util.stream.Stream;

public class Palindrome {

	public static void main(String[] args) {
		//isPalindrome("ABCCBA");
		isPali("aabaa");
	}
	
	public static void isPalindrome(String str) {
		Stack stack = new Stack();
		for(int i=0; i<str.length(); i++) {
			stack.push(str.charAt(i));
		}
		
		String reverse = "";
		while(!stack.isEmpty()) {
			reverse+=stack.pop();
		}
		if(str.equals(reverse)) {
			System.out.println(str+" is Palindrome");
		}
		else {
			System.out.println(str+" is not Plaindrome");
		}
	}
		
	
	@SuppressWarnings("unchecked")
	public static void isPali(String str) {
		Stack stack1 = new Stack();
		//aabbaa
		boolean flag=false;
		for(int i=0 ; i<str.length()/2 ; i++) {
			stack1.push(str.charAt(i));
		}
		
		for(int j = str.length()/2; j<str.length(); j++ ) {
			if(stack1.pop().equals(str.charAt(j)))
				flag= true;
			else {
				flag=false;
				break;
			}
//			rev+=stack1.pop();
		}
		if(flag) {
			System.out.println("Palindrrrrooo");
		}
//		System.out.println(rev);
//		if(rev.equals(st)) {
//			System.out.println("Plaindrome");
//		}
		
		
//		for()
//		System.out.println();
		System.out.println(str.substring(0, str.length()/2).toCharArray());
		StringJoiner sj = new StringJoiner("");
		Stream.of(str.substring(0, str.length()/2).toCharArray()).forEach(s -> stack1.push(s));
		stack1.forEach(System.out::println);
		System.out.println(stack1.size());
		
		Stream.of(str.substring(str.length()/2, str.length()).toCharArray()).forEach(s ->{
//			sj.add((stack1.pop()).toString());
			if(s == stack1.pop()) {
				System.out.println("Palindrome");
			}
//			if(str.equals(sj)) {
//				System.out.println("Pali");
//			}
		});
	}
}
