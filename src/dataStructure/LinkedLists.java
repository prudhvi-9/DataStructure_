package dataStructure;

public class LinkedLists<T> {
	Node<T> head;
	int size = 0;

	/**
	 * To insert node.
	 */
	public void add(T data) {
		Node<T> nodenew = new Node<T>(data);
		nodenew.data = (T) data;
		if (head == null) {
			head = nodenew;
			size++;
		}

		else {
			Node<T> n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = nodenew;
			size++;
		}
	}

	/**
	 * To insert node at start
	 */
	public void addFirst(T data) {
		Node<T> nodenew = new Node<T>(data);
		nodenew.data = data;
		nodenew.next = null;
		nodenew.next = head;
		head = nodenew;
		size++;
	}

	public T get(int index) {
		if (index == 0)
			return head.data;
		else {
			Node<T> n = head;
			for (int i = 0; i < index; i++) {
				if (n.next != null) {
					n = n.next;
				} else {
					return null;
				}
			}
			return n.data;
		}
	}

	/**
	 * To delete node at start.
	 */
	public void removeFirst() {
		head = head.next;
		size--;
	}

	/**
	 * To delete node at last.
	 */
	public void removeLast() {
		if (!isEmpty()) {
			Node<T> n = head;

			while (n.next != null) {
				n = n.next;
			}
			n.next = null;
		} else {
			System.out.println("Linked list is empty.");
		}
		size--;
	}

	/**
	 * To check list is empty or not.
	 */
	public boolean isEmpty() {
		return head == null;
	}

	/**
	 * To find the size of linked list.
	 */
	public int size() {
		return size;
	}
}
