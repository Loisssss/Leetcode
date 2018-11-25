    // Complete the isBalanced function below.
    static String isBalanced(String s) {

        String result = "YES";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else {
                if (stack.empty() == true) {
                    return result = "NO";
                }
                if (s.charAt(i) == ')' && stack.peek() != '(') {
                    return result = "NO";
                }
                if (s.charAt(i) == ']' && stack.peek() != '[') {
                    return result = "NO";
                }
                if (s.charAt(i) == '}' && stack.peek() != '{') {
                    return result = "NO";
                } else {
                    stack.pop();
                }
            }
        }
        if (stack.empty()) {
            return result;
        } else {
            return result = "No";
        }
    }
