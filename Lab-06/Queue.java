public class Queue {
    private int[] elements;
    private int size; 
    public static final int DEFAULT_CAPACITY = 8;

    Queue () {
        this(DEFAULT_CAPACITY);
    }

    Queue (int capacity){
        elements = new int[capacity];
    }

    public void enqueue(int v) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = v;
    }

    public int dequeue() {
        int temp = elements[0];
        size--;
        for (int i = 0; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        return temp;
    }

    public boolean empty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}
