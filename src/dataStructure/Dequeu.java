package dataStructure;

public class Dequeu<T> {
	LinkedLists<T> deque = new LinkedLists<T>();
	int size = 0;

	/**
	 * To insert data from front.
	 * 
	 */
	public void addFront(T data) {
		deque.addFirst(data);
		size++;
	}

	/**
	 * To insert data from rear.
	 */
	public void addRear(T data) {
		deque.add(data);
		size++;
	}

	/**
	 * To remove element from front.
	 */
	public void deleteFront() {
		deque.removeFirst();
		size--;
	}

	/**
	 * To remove element from rear.
	 */
	public void deleteRear() {
		deque.removeLast();
		size--;
	}

	/**
	 * To get value from the front.
	 */
	public T getFront() {
		return deque.get(--size);
	}

	/**
	 * To get value from the rear.
	 */
	public T getRear() {
		return deque.get(size - 1);
	}
}
