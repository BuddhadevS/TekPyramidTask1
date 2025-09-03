package Aggregration;

public class Student {
	private int id;
	private Address address;
	
	public Student(int id, Address address) {
		this.id=id;
		this.address=address;
	}
	public void display() {
		System.out.println("Id "+ id);
		System.out.println("Address"+ address);
		
	}

}
