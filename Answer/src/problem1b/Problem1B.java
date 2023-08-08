package problem1b;



public class Problem1B {
     public static void main(String[] args) {
    	 
         long startTime = System.currentTimeMillis();
         
         SumThreadClass th1 = new SumThreadClass(1, 25000000);
         SumThreadClass th2 = new SumThreadClass(25000001, 50000000); 
         SumThreadClass th3 = new SumThreadClass(50000001, 75000000); 
         SumThreadClass th4 = new SumThreadClass(75000001, 100000000);
         
     th1.start();
     th2.start();
     th3.start();
     th4.start();
     try {
			th1.join(); 
			th2.join();
			th3.join();
			th4.join();
			int SnalSum = th1.getResult() + th2.getResult() + th3.getResult() + th4.getResult();
			long endTime = System.currentTimeMillis();
			System.out.println("Sum is: " + SnalSum);
			System.out.println("Execution time is: " + ((endTime - startTime) / 1000.0) + " seconds");
			} 
	catch(InterruptedException e) {
	System.out.println("Interrupted"); }
	}
        
  }

class SumThreadClass extends Thread implements Runnable { 
    private int startingValue;
    private int endingValue;
    private int result; 
    private int endingValuePlus1;
   
    
	public SumThreadClass(int startingValue, int endingValue) {
		// TODO Auto-generated constructor stub
		this.startingValue = startingValue; 
		this.endingValue = endingValue;
		this.endingValuePlus1 = endingValue + 1; 
		result = endingValuePlus1;
	}
	
	@Override
     public void run() {
        for(int i = startingValue;
                i < endingValuePlus1; i++) {
            //In each iteration add i and result //At the end of execution variable result will be having the  summation from startValue to endValue result += i;
        } 
    }
    
    public int getResult() { 
		//by calling this getter method, we get the sum. 
		return result;
		}
}
