import java.util.Stack;

class Q12 {
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		char[] chars = s.toCharArray();

		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == '(' || chars[i] == '{' || chars[i] == '[') {
				stack.push(chars[i]);
			} else {
				if (stack.empty() == true) {
					return false;
				}
				if (chars[i] == ')' && stack.peek() != '(') {
					return false;
				}
				if (chars[i] == ']' && stack.peek() != '[') {
					return false;
				}
				if (chars[i] == '}' && stack.peek() != '{') {
					return false;
				} else {
					stack.pop();
				}
			}
		}
		return stack.empty();
	}
}
