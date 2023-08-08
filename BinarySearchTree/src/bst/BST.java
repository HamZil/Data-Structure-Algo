package bst;

public class BST {
	
	class Node{
		Node left , right;
		int element;
		
		public Node(int e ,Node L ,Node R) {
			this.left = L;
			this.right = R;
			this.element = e;
			
		}
	}
	
	private Node root;
	
	public BST() {
		root = null;
	}

	public boolean delete(int e) {
		Node p = root; //parent
		Node pp = null; //Grand Parent
		//search element
		while(p!=null && p.element!=e) {
			pp=p;
			if(e<p.element) {
				p=p.left;
				
			}else {
				p=p.right;
			}
			
		}
		//not found Element
		if(p==null)
			return false;
		//Case 3rd node has both Childs
		if(p.left != null && p.right !=null) {
			Node s =p.left;
			Node ps = p;
			while(s.right != null) {
				ps = s;
				s = s.right;
			}
			p.element = s.element;
			p=s;
			pp=ps;
		}
		Node c = null;
		//if its has right or left subtree
		//assigning refrence to c 
		if(p.left != null) 
			c=p.left;
		else
			c=p.right;
		
		//checking is it root node
		if(p==root) 
			root = null; 
		else
			if(p==p.left)
				pp.left = c;// assigning to parrent
			else
				pp.right = c;// assigning to parrent
		return true;
		
	}
	public int count(Node temproot) {
        if(temproot!=null) {
            int x = count(temproot.left);
            int y = count(temproot.right);
            return x + y + 1;
        }
        return 0;
    }

	 public int height(Node temproot) {
		 // subtract -1 whe geting length
	        if(temproot!=null) {
	            int x = height(temproot.left);
	            int y = height(temproot.right);
	            if(x > y)
	                return x + 1;
	            else
	                return y + 1;
	        }
	        return 0;
	 }
	public void insert(Node temproot, int e) {
        Node temp = null;
        while(temproot!=null) {
            temp = temproot;
            if(e== temproot.element)
                return;
            else if(e< temproot.element)
                temproot = temproot.left;
            else if(e> temproot.element)
                temproot = temproot.right;
        }
        Node n = new Node(e,null,null);
        if(root!=null) {
            if(e < temp.element)
                temp.left = n;
            else
                temp.right = n;
            
        }
        else
            root = n;
    }
	public void Inorder(Node temproot) {
	  if (temproot != null ) {
			Inorder(temproot.left);
			System.out.print(temproot.element + "  ");
			Inorder(temproot.right);
			
		}
	}
	
	public void preorder(Node temproot) {
		if (temproot != null) {
			System.out.print(temproot.element + "  ");
			preorder(temproot.left);
			preorder(temproot.right);
			
		}
	
	}
	
	public void postorder(Node troot) {
		if (troot != null) {
			postorder(troot.left);
			postorder(troot.right);
			System.out.print(troot.element + "  ");
		}
	}
	
	public void levelOrder() {
		LinkedQueue Q = new LinkedQueue();
		 Node t =root;
		 System.out.print(t.element + "  ");
		 Q.enqueue(t);
		 while (!Q.isEmpty()) {
			 t= (Node)Q.dequeue();
			 if(t.left != null) {
				 System.out.print(t.left.element+ "  ");
				 Q.enqueue(t.left);
				  
			 }
			 if (t.right != null ) {
				 System.out.print(t.right.element+ "  ");
				 Q.enqueue(t.right);
			 }
			
			 
		 }
	}
	
	public boolean search(int key) {
        Node temproot = root;
        while(temproot!=null) {
            if(key== temproot.element)
                return true;
            else if(key < temproot.element)
                temproot = temproot.left;
            else if(key > temproot.element)
                temproot = temproot.right;
        }
        return false;
    }
	
	 public boolean rSearch(Node temproot, int key) {
	        if(temproot!=null) {
	            if(key== temproot.element)
	                return true;
	            else if(key < temproot.element)
	                return rSearch(temproot.left, key);
	            else if(key > temproot.element)
	                return rSearch(temproot.right, key);
	        }
	        return false;
	    }
	
	public Node rInsert(Node temproot, int e) {
	        if(temproot!=null) {
	            if(e< temproot.element)
	                temproot.left = rInsert(temproot.left, e);
	            else if(e > temproot.element)
	                temproot.right = rInsert(temproot.right, e);
	        }
	        else {
	            Node n = new Node(e, null, null);
	            temproot = n;
	        }
	        return temproot;
	    }

	public static void main(String[] args) {
		
		int a[] = {15, 45,52,56,60,65,90};
		
		//tree 1
		BST t = new BST();
		BST tree = new BST();
		t.insert(t.root, 15);
		t.insert(t.root, 45);
		t.insert(t.root, 52);
		t.insert(t.root, 56);
		t.insert(t.root, 60);
		t.insert(t.root, 65);
		t.insert(t.root, 90);
		//tree 2
		tree.insert(tree.root, 10);
		tree.insert(tree.root, 30);
		tree.insert(tree.root, 40);
		tree.insert(tree.root, 70);
		tree.insert(tree.root, 65);
		tree.insert(tree.root, 75);
		tree.insert(tree.root, 80);
		tree.insert(tree.root, 60);
		
		
		
		System.out.println("\n\nInOrder Tervasal\n");
		tree.Inorder(tree.root);
		System.out.println("\n\nPreOrder Tervasal\n");
		tree.preorder(tree.root);
		System.out.println("\n\nPostOrder Tervasal\n");
		tree.postorder(tree.root);
		System.out.println("\n\nLevel Order Tervasal\n");
		tree.levelOrder();
		System.out.println("\n\nAfter Deletion  ? "+tree.delete(34)+"\n");
		tree.Inorder(tree.root);
		System.out.println("\n\nHeight :" + (tree.height(tree.root)-1));
		
		
	}
}
