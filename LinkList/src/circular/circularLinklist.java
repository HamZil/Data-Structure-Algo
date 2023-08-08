package circular;

public class circularLinklist {

	class Node {
		int element ;
		Node next ;
		public Node (int element ,Node next) {
			this.element=element;
			this.next = next;
			
		}
		
	}
	
	private Node head;
	private Node tail;
	private int size;
	
	public circularLinklist() {
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
		Node Newest = new Node(element , null);
		if(isEmpty()) {
			head = Newest ;
			head.next=head;
		}else {
			tail.next= Newest;
			tail.next = head;
		}
		tail = Newest;
		size ++;
		
	}
	
	public void display() {
		Node p = head;
		int i = 0;
		
		while (i<length()) {
			System.out.print(p.element + "   next:  ==> ");
			p=p.next;
			i++;
		}
		System.out.println(" null");
		
		
	}
	
	
	public int length() {
		return size;
	}
	
	public void addFirst(int e) {
		Node newest = new Node(e, null); 
		if(isEmpty()) {
				head = newest;
				tail = newest;
		}else {
				newest.next = head;
				tail.next  = newest; 
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
		tail.next = head.next;
		head = head.next;
		size --;
		if(isEmpty()) {
			tail = null;
		}
		
		return e;
	}
		
	public int removeTail() {
			int  e;
			Node p = head ;
			int i = 1;
					
			if(isEmpty()) {
				System.out.print("Empty LiskList");
				return -1;
			}
			
			while(i < length()-1) {
				p=p.next;
				i++;	
			}
			tail=p;
			e = p.element;
			tail.next = head;
			size --;
			if(isEmpty()) {
				tail = null;
			}
		
		return e;
	}
	
	public void addAny(int e , int positon) {
		if(positon < 0 && positon >= size) {
			System.out.print("Invalidate Postion");
		}
		
		Node newest = new Node(e , null);
		
		Node p = head;
		int i = 1;
		while(i<positon-1) {
			p = p.next;
			i++;	
		}
		newest.next= p.next;
		p.next = newest;
		
		
	}
	
	public int removeAny(int position) {
        if(position < 0 || position > size-1) {
            System.out.println("Invalid Position");
            return -1;
        }
        if(position==0) {
            int e = removehead();
            return e;
        }
        else {
            Node p = head;
            int i = 0;
            while(i < position-1) {
                p = p.next;
                i = i + 1;
            }
            int e = p.next.element;
            p.next = p.next.next;
            size = size - 1;
            return e;
        }
        }
	
	public static void main (String Args[]) {
		
		circularLinklist LL = new circularLinklist();
		
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
