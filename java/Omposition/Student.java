package Omposition;

public class Student {
	private String name;
	private int age;
	private String subjet;
	
	
	public Student(String name, int age, String subjet) {
		this.name = name;
		this.age = age;
		this.subjet = subjet;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", subjet=" + subjet + "]";
	}
}
