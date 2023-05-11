package dataStructure;

public class LinkedList<T extends Comparable<T>> {

	Node<T> head = null;

	public Node<T> addNode(T data, Node<T> head) {

		Node<T> newNode = new Node<T>(data);

		if (head == null) {
			head = newNode;

		} else {
			Node<T> temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
		return head;
	}

	/**
	 * function to check if the list is empty or not
	 *
	 * @return true if empty and false if not empty
	 */
	public boolean isEmpty() {

		if (head == null) {

			return true;
		}
		return false;
	}

	/**
	 * Funtion to check the size of list and return it
	 *
	 * @return the size of the list
	 */
	public int size() {

		return 0;
	}

	/**
	 * function to search the item in the list
	 *
	 * @param item the item to be searched
	 * @return true if found and false if not found
	 */
	public boolean search(T item) {

		Node<T> n = head;

		while (n.next != null) {

			if (n.data.equals(item)) {

				return true;
			}

			n = n.next;
		}
		return false;
	}

	public static <T> void printMaximum(Node<T> head) {
		if (head == null) {
			System.out.print("LinkedList is empty");
		} else {
			Node<T> temp = head;
			while (temp != null) {
				System.out.print(temp.data + " -> ");
				temp = temp.next;
			}
		}
	}
}
