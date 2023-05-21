package dataStructure;

public class Stack<T> {

	private char[] array;
	private int top;

	/**
	 * Constructor.
	 */
	public Stack(int capacity) {
		array = new char[capacity];
		top = -1;
	}

	/**
	 * To add elements to the stack.
	 * 
	 * 
	 */
	public void push(char item) {
		array[++top] = item;
	}

	/**
	 * To delete elements to the stack.
	 */

	public char pop() {
		return array[top--];
	}

	/**
	 * To view the top element of the stack.
	 */

	public char peek() {
		return array[top];
	}

	/**
	 * To check whether the stack is empty or not.
	 */
	public boolean isEmpty() {
		return top == -1;
	}

	/**
	 * To know the size of the stack.
	 */
	public int size() {
		return top + 1;
	}

}
