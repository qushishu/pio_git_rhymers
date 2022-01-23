package edu.kis.vh.nursery;

import edu.kis.vh.nursery.dataStructures.IntArrayStack;

public class DefaultCountingOutRhymer {

	private IntArrayStack intArrayStack = new IntArrayStack();

	public DefaultCountingOutRhymer(IntArrayStack intArrayStack) {
		this.intArrayStack = intArrayStack;
	}

	public DefaultCountingOutRhymer(){
	}

	public int getTotal() {
		return intArrayStack.getTotal();
	}

	public void push(int in) {
		intArrayStack.push(in);
	}

	public boolean isEmpty() {
		return intArrayStack.isEmpty();
	}

	public boolean isFull() {
		return intArrayStack.isFull();
	}

	public int top() {
		return intArrayStack.top();
	}

	public int pop() {
		return intArrayStack.pop();
	}
}
