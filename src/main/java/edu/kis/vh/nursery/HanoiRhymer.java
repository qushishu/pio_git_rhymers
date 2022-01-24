package edu.kis.vh.nursery;

import edu.kis.vh.nursery.dataStructures.IntArrayStack;
import edu.kis.vh.nursery.dataStructures.IntLinkedList;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	private int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}

	public HanoiRhymer(){
		super();
	}

	public HanoiRhymer(IntArrayStack intArrayStack){
		super(intArrayStack);
	}

	public HanoiRhymer(IntLinkedList intLinkedList){
		super(intLinkedList);
	}

	@Override
	public void push(int in) {
		if (!isEmpty() && in > top()) //was incorrect format
				totalRejected++;
		else //was incorrect format
			super.push(in); //was incorrect format
	}
}
