package code;

public class QueuesLinked {

    class Node {
        int element;
        Node next;
        public Node(int e) {
            this.element = e;
            this.next = null;
        }
    }

    private Node front;
    private Node rear;
    private int size;
    public QueuesLinked() {
        front = null;
        rear = null;
        size = 0;
    }
    public int length() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int e) {
        Node newest = new Node(e);
        if(isEmpty())
            front = newest;
        else
            rear.next = newest;
        rear = newest;
        size = size + 1;
    }

    public int dequeue() {
        if(isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int e = front.element;
        front = front.next;
        size = size - 1;
        if(isEmpty())
            rear = null;
        return e;
    }

    public void display() {
        Node p = front;
        while(p!=null) {
            System.out.print(p.element+" --> ");
            p = p.next;
        }
        System.out.println();
    }

}
