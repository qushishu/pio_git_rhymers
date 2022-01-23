package edu.kis.vh.nursery;

public class FifoRhymer extends DefaultCountingOutRhymer {

	private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();
	
	@Override
	public int pop() {
		while (!isEmpty())
			temp.push(super.pop());
		
		int ret = temp.pop();
		
		while (!temp.isEmpty())
			push(temp.pop());
		
		return ret;
	}
}
