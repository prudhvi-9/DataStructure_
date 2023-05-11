package dataStructure;

public class UnOrderList<T> {

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

}
