package Code;
import java.util.Scanner;

 //name : Qusay-16j1814000

public class Controlling {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Yoga person = new Yoga();
		
		 Scanner myObj = new Scanner(System.in);
		 Scanner obj2 = new Scanner(System.in);
		 
		 	System.out.println("Input Zoom Id");
		    person.Zoom_id = myObj.nextInt(); 
		    
		    System.out.println("Practice Name");
		    person.Practice_Name=obj2.nextLine();
		    
		    System.out.println("Username is: " +  person.Zoom_id);
		    System.out.println("Username is: " +   person.Practice_Name);
		    
		    System.out.println(" [1] Online yoga Payment");
		    System.out.println(" [2] Online yoga yearly payment");
		    System.out.println(" [3] Quit");
		    
		    System.out.print("Enter choicse");
		   
		    	int x =myObj.nextInt();

		    
		    
		    switch (x) {
		    case 1 :
		    	System.out.println("Practise Type");
		    	int j =myObj.nextInt();
		    	System.out.println("Online Yoga Detail");
		    	System.out.println("Online yoga Id "+ person.Zoom_id);
		    	System.out.println("Practice Name "+person.Practice_Name);
		    	System.out.println("Online Payment:"+ person.OnlinePayment(j));
		    	
		    	break ;
		    case 2 :
		    	System.out.println("Number of Months: ");
		    	int mon=myObj.nextInt();
		    	System.out.print("Input Internet cost");
		    	int net=myObj.nextInt();
		    	System.out.println("Online Yoga Detail");
		    	System.out.println("Input Internet cost"+ person.Zoom_id);
		    	System.out.println("Practice Name "+person.Practice_Name);
		    	System.out.println("Yearly Payment "+ person.OnlinePayment(net ,mon));
		    
		    	break;
		    case 3:
		    	System.out.print("SystemExist");
		    	break;
		    default:
		    	System.out.print("Not corret option");
		    		
		    	
		    }
		
	}

}
