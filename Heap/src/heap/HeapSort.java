package heap;

public class HeapSort {
	
	public void Sort(int A[] , int n) {
		 Heap h = new Heap();
	        for(int i=0;i<n;i++)
	            h.insert(A[i]);
	        int k = n-1;
	        for(int i=0;i<n;i++) {
	            A[k] = h.DeleteMax();
	            k = k - 1;
	        }
		
	}
	public void display(int A[]) {
		
		for(int i= 0 ; i<5;i++) {
			System.out.print(A[i]+" ");
		}
		System.out.println();
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {34,54,45,13,53};
		HeapSort b= new HeapSort();
		b.display(A);
		b.Sort(A, 5);
		b.display(A);
		
		

	}

}
