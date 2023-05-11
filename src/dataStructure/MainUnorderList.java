package dataStructure;

import java.util.Scanner;

public class MainUnorderList {

	/**
	 * This method is created to find a words in the list, if the Word is not found
	 * then it is add to the list, and if it is found then it is removed from the
	 * List.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * New unorderList object is created.
		 */

		UnOrderList<String> linkedList = new UnOrderList<String>();
		Scanner sc = new Scanner(System.in);
		linkedList.add("hello");
		linkedList.add("how");
		linkedList.add("are");

		System.out.println("Is the list empty:" + linkedList.isEmpty());
		System.out.println("Size of the list:" + linkedList.size());

		System.out.println("Enter the word to be search:");
		String item = sc.next();
		if (linkedList.search(item)) {
			System.out.println(item + " found in LinkedList.");
			linkedList.remove(item);
			System.out.println(item + " removed from the list.");
			System.out.println("Size of the list:" + linkedList.size());
		} else {
			System.out.println(item + " not found in LinkedList.");
			linkedList.add(item);
			System.out.println("so " + item + " is added to the list.");
			System.out.println("Size of the list:" + linkedList.size());
		}
		sc.close();
	}
}
