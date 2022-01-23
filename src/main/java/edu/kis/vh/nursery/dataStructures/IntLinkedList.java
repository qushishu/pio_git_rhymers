package edu.kis.vh.nursery.dataStructures;

public class IntLinkedList implements IntDataStructure {
	/***
	 * class represent LinkedList
	 */

	private Node last;
	private int i;

	private static final int EMPTY = DEFAULT;


	/***
	 * Push an element at the starting(top) of the stack represented by LinkedList
	 * @param i the element to push
	 */
	@Override
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
	@Override
	public boolean isEmpty() {
		return last == null;
	}

	/***
	 * check the LinkedList is full or not
	 * @return the boolean type depend on the LinkedList is full or not
	 */
	@Override
	public boolean isFull() {
		return false;
	}

	/***
	 * return the top element of LinkedList
	 * @return value of top element
	 */
	@Override
	public int top() {
		if (isEmpty())
			return EMPTY;
		return last.getValue();
	}

	/***
	 * remove last element from LinkedList
	 * @return removed element
	 */
	@Override
	public int pop() {
		if (isEmpty())
			return EMPTY;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

}
