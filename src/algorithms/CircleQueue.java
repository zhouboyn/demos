package algorithms;

/**
 * @desc:
 * @author: zhoubo
 * @date: 2019-06-07
 **/
public class CircleQueue {
    private int[] elements;
    int head;
    int tail;
    CircleQueue(int k) {
        elements = new int[k];
        head = -1;
        tail = -1;
    }

    private boolean isFull() {
        return (tail + 1) % elements.length == head;
    }
    private boolean isEmpty(){
        return head == -1 && tail == -1;
    }

    public boolean enqueue(int k) {
        if (isFull()) return false;
        if (isEmpty()) {
            head = 0;
            tail = 0;
            elements[0] = k;
            return true;
        }
        tail = (tail + 1) % elements.length;
        elements[tail] = k;
        return true;
    }

    public  boolean dequeue() {
        if (isEmpty()) return false;
        if (head == tail) {
            head = -1;
            tail = -1;
            return true;
        }

        head = (head+ 1) % elements.length;
        return true;
    }
}
