package Has_a_relationship;

public class Laptop {
	private int id;
	private String name;
	private int value;
	private String model;
	
	public Laptop(int id, String name, int value, String model) {
		
		this.id=id;
		this.name=name;
		this.value=value;
		this.model=model;
	}
	@Override
	public String toString() {
		return "["+"id : "+id+"name : "+name+"value : "+value+"model : "+model+"]";
	}
}
