package comm.example;

import lombok.ToString;

@ToString
public class Person extends Object {
	
	private String name;
	private Address address;
	private int age;
	public Person() {
		
		this("John");
		System.out.println("in default constructor..!");
		
	}
	public Person(String name) {
		this(name,new Address("ABC","xyz",1999999));
		System.out.println("in one argument constructor...!");
		
	}
	public Person(String name, Address address) {
		
		this(name,address,34);
		System.out.println("in two arguments constructor...!");
	}
	public Person(String name, Address address, int age) {
		
		this.name = name;
		this.address = address;
		this.age = age;
		System.out.println("in three arguments constructor...!");
	}
	/*
	 * @Override public String toString() { return "Person [name=" + name +
	 * ", address=" + address + ", age=" + age + "]"; }
	 */
	
	
	

}
