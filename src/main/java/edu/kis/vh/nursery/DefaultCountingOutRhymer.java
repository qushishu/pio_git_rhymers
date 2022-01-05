package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private final int[] numbers = new int[12];

	private int total = -1;

	public int getTotal() {
		return total;
	}

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == -1;
	}
		
	public boolean isFull() {
		return total == 11;
	}
		
	protected int peekaboo() {
		if (callCheck())
			return -1;
		return numbers[total];
	}
			
	public int countOut() {
		if (callCheck())
			return -1;
		return numbers[total--];
	}

}
