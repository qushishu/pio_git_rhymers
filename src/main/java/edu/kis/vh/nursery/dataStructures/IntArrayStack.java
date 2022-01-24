package edu.kis.vh.nursery.dataStructures;

public class IntArrayStack implements IntDataStructure {
    private static final int INITIAL = DEFAULT;
    private static final int MAX_SIZE = 13;
    private static final int DEFAULT_VALUE = DEFAULT;
    private static final int FULL = MAX_SIZE - 1;

    private final int[] numbers = new int[MAX_SIZE];

    private int total = INITIAL;

    @Override
    public int top() {
        if (isEmpty())
            return DEFAULT_VALUE;
        return numbers[total];
    }

    @Override
    public int pop() {
        if (isEmpty())
            return DEFAULT_VALUE;
        return numbers[total--];
    }

    @Override
    public boolean isFull() {
        return total == FULL;
    }

    @Override
    public boolean isEmpty() {
        return total == INITIAL;
    }

    @Override
    public void push(int i) {
        if (!isFull())
            numbers[++total] = i;
    }

    public int getTotal() {
        return total;
    }
}
