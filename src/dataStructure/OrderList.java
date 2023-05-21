package dataStructure;

public class OrderList<T extends Comparable<T>> {

	private Node<T> head;
	private int size = 0;

	/**
	 * To add a new item in the list.
	 *
	 * @param data the item which to be added
	 */

	public void add(T data) {

		/*
		 * Creates a new node with data.
		 * 
		 */

		Node<T> n = new Node<T>(data);
		if (head == null) {
			head = n;
			size++;
		} else {
			Node<T> node = head;
			while (node.next != null) {
				node = node.next;
			}
			node.next = n;
			size++;
		}
	}

	/**
	 * To remove a item from the list.
	 *
	 * @param item-element to be removed.
	 */
	public void remove(T item) {

		Node<T> current = head;
		Node<T> previous = null;

		if (head.data.equals(item)) {
			head = head.next;
			size -= 1;
			return;
		}
		while (!current.data.equals(item)) {
			previous = current;
			current = current.next;
		}
		current = current.next;
		previous.next = current;
		current = null;
		size -= 1;
	}

	/**
	 * To sort the elements in ascending order.
	 * 
	 * @return
	 */
	public void sortList() {

		Node<T> Node1 = head;
		Node<T> Node2;
		T temp;

		if (head == null) {
			return;
		} else {
			while (Node1 != null) {
				/**
				 * Node element will point to the current's next node
				 */
				Node2 = Node1.next;

				while (Node2 != null) {
					/**
					 * If Node1 data is greater than Node2 data. Then swap the data between them.
					 * 
					 */

					if ((Node1.data.compareTo(Node2.data)) > 0) {
						temp = Node1.data;
						Node1.data = Node2.data;
						Node2.data = temp;
					}
					Node2 = Node2.next;
				}
				Node1 = Node1.next;
			}
		}
	}

	/**
	 * To search the item in the list.
	 *
	 * @param item-the item to be searched.
	 * @return true-if found and false if not found.
	 */
	public boolean search(T item) {
		Node<T> n = head;
		while (n != null) {
			if (n.data.equals(item)) {
				return true;
			}
			n = n.next;
		}
		return false;
	}

	/**
	 * To check if the list is empty or not.
	 *
	 * @return-true if it is empty and false if it is not empty.
	 */
	public boolean isEmpty() {
		if (head == null) {
			return true;
		}
		return false;
	}

	/**
	 * To check the size of list.
	 *
	 * @return-the size of the list.
	 */
	public int size() {

		return size;

	}

	public void printLinkedList() {
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
