package Omposition;

public class IdCard {
	private int id;
	private int Qr;
	private Student student;
	
	public IdCard(int id,int Qr) {
		
		this.id = id;
		this.Qr=Qr;
		student= new Student("sahu",25,"History");
	}
	
	public void displayName() {
		System.out.println(id);
		System.out.println(Qr);
		System.out.println(student);
	}
}
