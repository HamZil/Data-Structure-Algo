package doubly;



public class DoublyLinklist {

	class Node {
		int element ;
		Node next , pre ;
		public Node (int element ,Node next ,Node pre) {
			this.element=element;
			this.next = next;
			this.pre = pre;
			
		}
		
	}
	
	private Node head;
	private Node tail;
	private int size;
	
	public DoublyLinklist() {
		 Node head=null;
		 Node tail=null;
		 int size=0;	
	}

	
	public int search(int key) {
		Node p= head;
		int index = 0;
		while (p!=null) {
			if(p.element==key) {
				return index;
			}
			p=p.next;
			index ++;
		}
		
		return -1;
		
		
	}
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void addEnd(int element) {
		Node Newest = new Node(element , null,null);
		if(isEmpty()) {
			head = Newest ;
		}else {
			tail.next= Newest;
			Newest.pre = tail;
			
		}
		tail = Newest;
		size ++;
		
	}
	
	public void display() {
		Node p = head;
		
		while (p!= null) {
			System.out.print(p.element + "   next:  ==> ");
			p=p.next;
		}
		System.out.println(" null");
		
		
	}
	
	
	public int length() {
		return size;
	}
	
	public void addFirst(int e) {
		Node newest = new Node(e, null,null); 
		if(isEmpty()) {
				head = newest;
				tail = newest;
		}else {
				head.pre = newest;
				newest.next = head;
				head = newest;
				
			}
		size++;
		
		
	}
	
	public int removehead() {
		int  e;
		if(isEmpty()) {
			System.out.print("Empty LiskList");
			return -1;
		}
		e = head.element;
		head = head.next;
		size --;
		if(isEmpty()) {
			tail = null;
		}else {
			head.pre = null;
		}
		
		return e;
	}
		
	public int removeTail() {
			int  e;
			if(isEmpty()) {
				System.out.print("Empty LiskList");
				return -1;
			}
			e = tail.element;
			tail=tail.pre;
			tail.next = null;
			size --;
			if(isEmpty()) {
				tail = null;
			}
		
		return e;
	}

	public int removeAny(int position) {
        if(position <= 0 || position >= size-1) {
            System.out.println("Invalid Position");
            return -1;
        }
        Node p = head;
        int i = 1;
        while(i < position-1) {
            p = p.next;
            i = i + 1;
        }
        int e = p.next.element;
        p.next = p.next.next;
        p.next.pre = p;
        size = size - 1;
        return e;
    }

	public void addAny(int e , int positon) {
		if(positon < 0 && positon >= size) {
			System.out.print("Invalidate Postion");
		}
		
		Node newest = new Node(e , null,null);
		
		Node p = head;
		int i = 1;
		while(i<positon-1) {
			p = p.next;
			i++;	
		}
		
		p.next.pre = newest;
		newest.next=p.next;
		p.next = newest;
		newest.pre = p;
		size++;
				
		
	}
	
	public static void main (String Args[]) {
		
		DoublyLinklist LL = new DoublyLinklist();
		
		LL.addEnd(4);
		LL.addEnd(56);
		LL.addEnd(24);
		LL.addEnd(90);
		LL.addFirst(89);
		LL.addAny(0,4);
		

		
		System.out.println("Size :  "+ LL.length());
		System.out.println("Index of 56 :  "+ LL.search(56));
		System.out.println("Removed element  at head " + LL.removehead());
		//System.out.println("Removed element  at head " + LL.removeTail());
		LL.display();
		
	}

}
