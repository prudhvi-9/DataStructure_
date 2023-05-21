package dataStructure;

import java.util.Scanner;

public class MainOrderList {
	/**
	 * This method is created to find a number in the list, if the number is not
	 * found then it is add to the list, and if it is found then it is removed from
	 * the List.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * New unorderList object is created.
		 */

		OrderList<Integer> linkedList = new OrderList<Integer>();
		Scanner sc = new Scanner(System.in);
		linkedList.add(40);
		linkedList.add(59);
		linkedList.add(89);
		linkedList.add(99);
		linkedList.add(90);
		linkedList.add(83);
		linkedList.add(2);
		linkedList.printLinkedList();
		System.out.println();
		linkedList.sortList();
		linkedList.printLinkedList();

		System.out.println("\nIs the list empty:" + linkedList.isEmpty());
		System.out.println("Size of the list:" + linkedList.size());

		System.out.println("Enter the number to be search:");
		int item = sc.nextInt();
		if (linkedList.search(item)) {
			System.out.println(item + " found in LinkedList.");
			linkedList.remove(item);
			System.out.println(item + " removed from the list.");
			System.out.println("Size of the list:" + linkedList.size());
			linkedList.sortList();
			linkedList.printLinkedList();
		} else {
			System.out.println(item + " not found in LinkedList.");
			linkedList.add(item);
			System.out.println("so " + item + " is added to the list.");
			System.out.println("Size of the list:" + linkedList.size());
			linkedList.sortList();
			linkedList.printLinkedList();
		}
		sc.close();
	}

}
