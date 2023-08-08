package problem1b;

public class wbc extends Thread implements Runnable { 
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