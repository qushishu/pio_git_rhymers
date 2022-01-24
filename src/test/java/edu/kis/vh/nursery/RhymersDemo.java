package edu.kis.vh.nursery;

import edu.kis.vh.nursery.dataStructures.IntLinkedList;
import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.LinkedListFactory;
import edu.kis.vh.nursery.factory.Rhymersfactory;
import edu.kis.vh.nursery.factory.StackFactory;

class RhymersDemo {

	public static void main(String[] args) {

		Rhymersfactory factory = new DefaultRhymersFactory();

		StackFactory stackFactory = new StackFactory();
		operationFactory(stackFactory);

		LinkedListFactory linkedListFactory = new LinkedListFactory();
		operationFactory(linkedListFactory);

		operationFactory(factory);

	}

	private static void operationFactory(Rhymersfactory factory) {
		DefaultCountingOutRhymer[] rhymers = { factory.getStandardRhymer(), factory.getFalseRhymer(),
				factory.getFifoRhymer(), factory.getHanoiRhymer()};

		for (int i = 1; i < 15; i++)
			for (int j = 0; j < 3; j++)
				rhymers[j].push(i);

		java.util.Random rn = new java.util.Random();
		for (int i = 1; i < 15; i++)
			rhymers[3].push(rn.nextInt(20));

		for (DefaultCountingOutRhymer rhymer : rhymers) {
			while (!rhymer.isEmpty())
				System.out.print(rhymer.pop() + "  ");
			System.out.println();
		}

		System.out.println("total rejected is "
				+ ((HanoiRhymer) rhymers[3]).reportRejected());
	}

}