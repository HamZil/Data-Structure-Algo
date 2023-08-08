package ShallowCopy;

public class ShallowTestCopy{
	public static void main(String[] args){
		Person p = new Person("Person-A" ,"Civic"); //Original Object
		System.out.println("Original (orginal values): " +  p.getName()+" "+ p.getCar().getName());
		Person q = (Person) p.clone(); //Clone as a shallow copy-reference the real object
		System.out.println("Clone (before change): " + q.getName() + " - " + q.getCar().getName());
		
		q.setName("Person-B"); //change the primitive member
		q.getCar().setName("Accord"); //change the lower-level object
		System.out.println("Clone (after change): " + q.getName() + " - " + q.getCar().getName());
		System.out.println("Original (after clone is modified-premitive member remained the same while lower level object changed): " 
		+p.getName() + " - " + p.getCar().getName());
		} 
	}