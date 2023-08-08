package Stack;

public class StackArray {
	
	private int [] size ;
	private int top;
	
	public StackArray(int n) {
	
		size = new int[n];
		
	}
	
	public boolean isFull() {
		return top == size.length;
	}
	
	public int length() {
		return top;
		
	}
	public boolean isEmpty() {
		return top == 0;
	}
	
	public void push(int e) {
		if (isFull()) {
			System.out.println("Stack is full");
			
		}else {
			size[top]=e;
			top ++;
		}
	}
	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is Empty");
			return -1;
		}else {
			int e = size[top-1];
			top--;
			if(isEmpty()) {
				System.out.print("Stack is now Empty");
				return -1;
			}
			return e;
			
		}
		
	}
	public void display() {
		for(int i = 0 ; i<top;i++) {
			System.out.print(size[i] + " -- ");
		}
		System.out.println();
	}
	
	public static void main (String args[]) {
		
		StackArray stack = new StackArray(7);
		  stack.push(4);
		  stack.display();
		  stack.pop();
		  stack.display();
		  stack.push(56);
		  stack.push(89);
		  stack.push(24);
		  stack.display();
		  
		  System.out.println(" " + stack.length());
		
	}
	

}

