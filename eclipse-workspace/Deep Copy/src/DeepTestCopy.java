public class DeepTestCopy {
	public static void main(String[] args) {
		Person p = new Person("Person-A", "Civic");//Original Object
		System.out.println("Original (orginal values): " +p.getName());
		System.out.println(p.getCar().getName());
		Person q = (Person) p.clone(); //Clone as a deep copy
		System.out.println("Clone (before change): " + q.getName() + " - " + q.getCar().getName());
		//change the primitive member
		
		q.setName("Person-B");
		//change the lower-level object
		q.getCar().setName("Accord");
		System.out.println("Clone (after change): " +q.getName() + " - " +q.getCar().getName());
		System.out.println("Original (after clone is modified): " +p.getName() + " - " + p.getCar().getName());
		}
	}