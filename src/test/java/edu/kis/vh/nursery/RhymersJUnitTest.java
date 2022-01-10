package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {

	@Test
	public void testCountIn() {
		IntArrayStack intArrayStack = new IntArrayStack();
//		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		int testValue = 4;
		intArrayStack.countIn(testValue);
//		rhymer.countIn(testValue);

//		int result = rhymer.peekaboo();
		int result = intArrayStack.peekaboo();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testCallCheck() {
//		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		IntArrayStack intArrayStack = new IntArrayStack();
//		boolean result = rhymer.callCheck();
		boolean result = intArrayStack.callCheck();
		Assert.assertTrue(result); //simplify assertion

//		rhymer.countIn(888);
		intArrayStack.countIn(888);

//		result = rhymer.callCheck();
		result = intArrayStack.callCheck();
		Assert.assertFalse(result); //simplify assertion
	}

	@Test
	public void testIsFull() {
//		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		IntArrayStack intArrayStack = new IntArrayStack();
		final int STACK_CAPACITY = 12;
		for (int i = 0; i < STACK_CAPACITY; i++) {
//			boolean result = rhymer.isFull();
			boolean result = intArrayStack.isFull();
			Assert.assertFalse(result); //simplify assertion
//			rhymer.countIn(888);
			intArrayStack.countIn(888);
		}

//		boolean result = rhymer.isFull();
		boolean result = intArrayStack.isFull();
		Assert.assertTrue(result); //simplify assertion
	}

	@Test
	public void testPeekaboo() {
//		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		IntArrayStack intArrayStack = new IntArrayStack();
		final int EMPTY_STACK_VALUE = -1;

//		int result = rhymer.peekaboo();
		int result = intArrayStack.peekaboo();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
//		rhymer.countIn(testValue);
		intArrayStack.countIn(testValue);

//		result = rhymer.peekaboo();
		result = intArrayStack.peekaboo();
		Assert.assertEquals(testValue, result);
//		result = rhymer.peekaboo();
		result = intArrayStack.peekaboo();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testCountOut() {
//		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		IntArrayStack intArrayStack = new IntArrayStack();
		final int EMPTY_STACK_VALUE = -1;

//		int result = rhymer.countOut();
		int result = intArrayStack.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
//		rhymer.countIn(testValue);
		intArrayStack.countIn(testValue);

//		result = rhymer.countOut();
		result = intArrayStack.countOut();
		Assert.assertEquals(testValue, result);
//		result = rhymer.countOut();
		result = intArrayStack.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

}
