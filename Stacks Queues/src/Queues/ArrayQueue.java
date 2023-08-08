package Queues;

public class ArrayQueue {
	private int [] data;
	private int rear;
	private int front;
	private int size;
	
	public ArrayQueue(int n) {
		data = new int [n];
		this.rear = 0;
		this .front= 0;
		this.size=0;
	}
	
	public int length() {
		return size;
	}
	public boolean isEmpty() {
		
		return size == 0;
		
	}
	
	public boolean isFull() {
		return size==data.length;
	}
	
	public int dequeue() {
		int e;
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}else {
			e=data[front];
			front ++;
			size --;
			return e;
			
			
		}
		
	}
	
	public void display() {
		for(int i = front ; i<rear;i++) {
			System.out.print(data[i] + " -- ");
		}
		System.out.println();
		
	}
	public void enqueue(int e) {
		if(isFull()) {
			System.out.println("Queue is Full");
			
		}else {
			data[rear]=e;
			rear++;
			size++;
			
			
		}
		
		
		
	}

	public static void main(String[] args) {
		ArrayQueue Q = new ArrayQueue(10);
		Q.enqueue(15);
		Q.enqueue(14);
		Q.enqueue(21);
		Q.enqueue(33);
		Q.display();
		System.out.println("dequeue element : "+ Q.dequeue());
		 System.out.println(" Length : "+Q.length());
		
	}

}
