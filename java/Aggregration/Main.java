package Aggregration;

public class Main {
	public static void main(String[] args) {
		Address address = new Address(101,"wb","khayra");
		Student s= new Student(101, address);
		s.display();
	}

}
