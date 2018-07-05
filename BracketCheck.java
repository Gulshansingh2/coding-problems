import java.util.Stack;


public class BracketCheck {

	public static boolean isBalanced(String expression) {

		// to check if the length is even
		if ((expression.length() & 1) == 1) return false;
		else {
		  char[] brackets = expression.toCharArray();
		  Stack<Character> s = new Stack<>();
		  for (char bracket : brackets)
		    switch (bracket) {
		      case '{': s.push('}'); break;
		      case '(': s.push(')'); break;
		      case '[': s.push(']'); break;
		      default :
		        if (s.empty() || bracket != s.peek())
		          return false;
		        s.pop();
		    }
		  return s.empty();
		}

		}
	
	public static void main(String[] args) {
		System.out.println(isBalanced("()[]{}(([])){[()][]}"));
		System.out.println(isBalanced("())[]{}")); 
		System.out.println(isBalanced("[(])")); 
	}

}
