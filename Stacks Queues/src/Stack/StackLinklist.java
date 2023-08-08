package Stack;

public class StackLinklist {
	class Node {
        int element;
        Node next;
        public Node(int e, Node n) {
            element = e;
            next = n;
        }
    }

    private Node top;
    private int size;

    public StackLinklist() {
        top = null;
        size = 0;
    }

    public int length() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(int e) {
        Node newest = new Node(e, null);
        if(isEmpty()) {
            top = newest;
        }
        else {
            newest.next = top;
            top = newest;
        }
        size = size + 1;
    }

    public int pop() {
        if(isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        int e = top.element;
        top = top.next;
        size = size - 1;
        return e;
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return top.element;
    }

    public void display() {
        Node p = top;
        while(p!=null) {
            System.out.print(p.element + "-->");
            p = p.next;
        }
        System.out.println();
    }

}
