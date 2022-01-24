package edu.kis.vh.nursery;

import edu.kis.vh.nursery.dataStructures.IntArrayStack;
import edu.kis.vh.nursery.dataStructures.IntLinkedList;
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
		final int EMPTY_STACK_VALUE = intArrayStack.DEFAULT;

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
		final int EMPTY_STACK_VALUE = intArrayStack.DEFAULT;

		int result = intArrayStack.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		intArrayStack.push(testValue);

		result = intArrayStack.pop();
		Assert.assertEquals(testValue, result);
		result = intArrayStack.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

	@Test
	public void testPush2() {
		IntLinkedList intLinkedList = new IntLinkedList();
		int testValue = 4;
		intLinkedList.push(testValue);

		int result = intLinkedList.top();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testIsEmpty2() {
		IntLinkedList intLinkedList = new IntLinkedList();
		boolean result = intLinkedList.isEmpty();
		Assert.assertTrue(result);

		intLinkedList.push(888);

		result = intLinkedList.isEmpty();
		Assert.assertFalse(result);
	}

	@Test
	public void testTop2() {
		IntLinkedList intLinkedList = new IntLinkedList();
		final int EMPTY_LIST_VALUE = intLinkedList.DEFAULT;

		int result = intLinkedList.top();
		Assert.assertEquals(EMPTY_LIST_VALUE, result);

		int testValue = 4;
		intLinkedList.push(testValue);

		result = intLinkedList.top();
		Assert.assertEquals(testValue, result);
		result = intLinkedList.top();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testPop2() {
		IntLinkedList intLinkedList = new IntLinkedList();
		final int EMPTY_LIST_VALUE = intLinkedList.DEFAULT;

		int result = intLinkedList.pop();
		Assert.assertEquals(EMPTY_LIST_VALUE, result);

		int testValue = 4;
		intLinkedList.push(testValue);

		result = intLinkedList.pop();
		Assert.assertEquals(testValue, result);
		result = intLinkedList.pop();
		Assert.assertEquals(EMPTY_LIST_VALUE, result);
	}


}
