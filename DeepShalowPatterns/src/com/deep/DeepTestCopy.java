package com.deep;

public class DeepTestCopy 
{
	public static void main(String[] args) {
		System.out.println("\n\t \t Deep Copy\n");
		//Original Object
		Person p = new Person("Person-A", "Civic");
		System.out.print("Original (orginal values): " +p.getName()+"- " + p.getCar().getName());
		System.out.println();
		
		Person q = (Person) p.clone(); //Clone as a deep copy
		System.out.println("Clone (before change): " + q.getName() + " - " + q.getCar().getName());
		q.setName("Person-B");
		
		//change the lower-level object
		q.getCar().setName("Accord");
		System.out.println("Clone (after change): " +q.getName() + " - " +q.getCar().getName());
		System.out.println("Original (after clone is modified): " +
		p.getName() + " - " + p.getCar().getName());
	}
}
