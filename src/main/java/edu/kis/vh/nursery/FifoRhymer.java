package edu.kis.vh.nursery;

import edu.kis.vh.nursery.dataStructures.IntArrayStack;
import edu.kis.vh.nursery.dataStructures.IntLinkedList;

public class FifoRhymer extends DefaultCountingOutRhymer {

	private final IntArrayStack temp = new IntArrayStack();

	public FifoRhymer(){
		super();
	}
	public FifoRhymer(IntArrayStack intArrayStack){
		super(intArrayStack);
	}

	public FifoRhymer(IntLinkedList intLinkedList){
		super(intLinkedList);
	}

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
