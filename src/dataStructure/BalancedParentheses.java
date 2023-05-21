package dataStructure;

import java.util.*;

public class BalancedParentheses {

	/**
	 * This method is created to checke whether the given expression is balanced or
	 * not.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an arithmetic expression: ");
		String expression = sc.nextLine();

		boolean isExpressionBalanced = isBalancedOrNot(expression);
		System.out.println("Arithmetic expression is balanced: " + isExpressionBalanced);

	}

	public static boolean isBalancedOrNot(String expression) {
		Stack<Object> stack = new Stack<Object>(expression.length());

		for (int i = 0; i < expression.length(); i++) {
			char ch = expression.charAt(i);
			if (ch == '(') {
				stack.push(ch);
			} else if (ch == ')') {
				if (stack.isEmpty()) {
					return false;
				}
				stack.pop();
			}
		}
		return stack.isEmpty();
	}
}
