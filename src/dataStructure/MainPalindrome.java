package dataStructure;

import java.util.Scanner;

public class MainPalindrome {
	/*
	 * This method is created to find the given string is palindrome or not.
	 */
	public static void main(String[] args) {
		Scanner cs = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = cs.nextLine();

		String removeFront = "";
		String removeRear = "";
		Dequeu<Character> deque = new Dequeu<Character>();

		/*
		 * Add characters to the rear of the deque
		 */
		for (int i = 0; i < str.length(); i++) {
			deque.addRear(str.charAt(i));
		}

		/*
		 * Remove characters from the front of the deque.
		 */
		for (int i = 0; i < str.length(); i++) {
			removeFront += deque.getFront();
			deque.deleteFront();
		}

		/*
		 * Remove characters from the rear of the deque.
		 */
		for (int i = 0; i < str.length(); i++) {
			removeRear += deque.getRear();
			deque.deleteRear();
		}

		/*
		 * Compare characters from both ends of the deque.
		 */
		if (removeFront.equals(removeRear)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}
		cs.close();
	}
}
