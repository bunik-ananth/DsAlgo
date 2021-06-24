package stack;

import java.util.Stack;

public class ParanthesisCheck {

	public static void main(String[] args) {
		System.out.println(isBalanced("{{}}(){}[{}]"));
	}
	
	public static boolean isBalanced(String str) {
		if(str.isEmpty())
			return true;
		Stack stack = new Stack();
		for(int i=0; i<str.length();i++) {
			char present = str.charAt(i);
			 if (present == '{' || present == '(' || present == '[')
		            stack.push(present);
			 if (present == '}' || present == ')' || present == ']') {
				 if(stack.isEmpty())
					 return false;
				 char last = (char) stack.peek();
		            if (present == '}' && last == '{' || present == ')' && last == '(' || present == ']' && last == '[')
		                stack.pop();
		            else 
		                return false;
			 }
		}
		return stack.isEmpty();
	}
	
	public static boolean check(String str) {
		str = str.replaceAll("[^\\{\\}\\[\\]\\(\\)]", "");//regex just to remove paranthesis
		while(str.contains("()") || str.contains("[]") || str.contains("{}")){
			str = str.replaceAll("\\(\\)", "").replaceAll("\\[\\]", "").replaceAll("\\{\\}", "");
		}
		if(str.length()==0) {
			return true;
		}
		return false;
	}
}




