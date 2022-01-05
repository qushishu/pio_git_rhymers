package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;

	public interface Rhymersfactory {
	
		DefaultCountingOutRhymer getStandardRhymer();
		
		DefaultCountingOutRhymer getFalseRhymer();
		
		DefaultCountingOutRhymer getFifoRhymer();
		
		DefaultCountingOutRhymer getHanoiRhymer();
		
	}
