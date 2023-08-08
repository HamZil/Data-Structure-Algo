package com.shallow;

class Person implements Cloneable {
	private Car car; //Lower-level object
	private String name;
	
	public Car getCar() {
		return car;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String s) {
		name = s;
	}
	
	public Person(String s, String t) {
		name = s;
		car = new Car(t);
	}
	
	@Override
	public Object clone() {
		try {
			//shallow copy
			return super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
	
}
