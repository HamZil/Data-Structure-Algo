package problem1a;



/**
 *
 *
 */
	public class Problem1A { 
		
		public static void main(String[] args) { 
		//Declare the snal number upto which the sum is calculated.
		int maximumlimit = 100000000; 
		//Get the start time in milliseconds 
		long strtingTime = System.currentTimeMillis(); 
		int maximumlimitPlus1 = maximumlimit + 1;
		int sum = 0;
		for(int i = 1; i < maximumlimitPlus1;i++) {
		    sum += i; 
		}
		long endingTime = System.currentTimeMillis();
		System.out.println("Sum is: " + sum);
		System.out.println("Execution time is: " + ((endingTime - strtingTime) / 1000.0) + " seconds");
    }
}
