package edu.kis.vh.nursery;

public class IntArrayStack {
    private static final int INITIAL = -1;
    private static final int MAX_SIZE = 12;
    private static final int DEFAULT_VALUE = -1;
    private static final int FULL = MAX_SIZE - 1;

    private final int[] numbers = new int[MAX_SIZE];

    private int total = INITIAL;

    public int getTotal() {
        return total;
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == INITIAL;
    }

    public boolean isFull() {
        return total == FULL;
    }

    protected int peekaboo() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[total--];
    }
}
