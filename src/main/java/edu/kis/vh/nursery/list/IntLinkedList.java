package edu.kis.vh.nursery.list;

public class IntLinkedList {
	/***
	 * class represent LinkedList
	 */

	private Node last;
	private int i;

	private static final int EMPTY = -1;


	/***
	 * Push an element at the starting(top) of the stack represented by LinkedList
	 * @param i the element to push
	 */
	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	/***
	 * check the LinkedList is empty or not
	 * @return true if LinkedList is empty or false otherwise
	 */
	public boolean isEmpty() {
		return last == null;
	}

	/***
	 * check the LinkedList is full or not
	 * @return the boolean type depend on the LinkedList is full or not
	 */
	public boolean isFull() {
		return false;
	}

	/***
	 * return the top element of LinkedList
	 * @return value of top element
	 */
	public int top() {
		if (isEmpty())
			return EMPTY;
		return last.getValue();
	}

	/***
	 * remove last element from LinkedList
	 * @return removed element
	 */
	public int pop() {
		if (isEmpty())
			return EMPTY;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

}
