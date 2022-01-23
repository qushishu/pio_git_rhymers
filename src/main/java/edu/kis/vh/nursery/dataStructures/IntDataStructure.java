package edu.kis.vh.nursery.dataStructures;

public interface IntDataStructure {
    public final static int DEFAULT = 0;

    public int top();

    public int pop();

    public boolean isFull();

    public boolean isEmpty();

    public void push(int i);
}
