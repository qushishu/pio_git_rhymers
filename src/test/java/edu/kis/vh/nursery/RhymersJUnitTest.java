package edu.kis.vh.nursery;

import edu.kis.vh.nursery.dataStructures.IntArrayStack;
import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {

	@Test
	public void testPush() {
		IntArrayStack intArrayStack = new IntArrayStack();
		int testValue = 4;
		intArrayStack.push(testValue);

		int result = intArrayStack.top();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testIsEmpty() {
		IntArrayStack intArrayStack = new IntArrayStack();
		boolean result = intArrayStack.isEmpty();
		Assert.assertTrue(result);

		intArrayStack.push(888);

		result = intArrayStack.isEmpty();
		Assert.assertFalse(result);
	}

	@Test
	public void testIsFull() {
		IntArrayStack intArrayStack = new IntArrayStack();
		final int STACK_CAPACITY = 12;
		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = intArrayStack.isFull();
			Assert.assertFalse(result);
			intArrayStack.push(888);
		}

		boolean result = intArrayStack.isFull();
		Assert.assertTrue(result);
	}

	@Test
	public void testTop() {
		IntArrayStack intArrayStack = new IntArrayStack();
		final int EMPTY_STACK_VALUE = 0;

		int result = intArrayStack.top();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		intArrayStack.push(testValue);

		result = intArrayStack.top();
		Assert.assertEquals(testValue, result);
		result = intArrayStack.top();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testPop() {
		IntArrayStack intArrayStack = new IntArrayStack();
		final int EMPTY_STACK_VALUE = 0;

		int result = intArrayStack.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		intArrayStack.push(testValue);

		result = intArrayStack.pop();
		Assert.assertEquals(testValue, result);
		result = intArrayStack.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

}
