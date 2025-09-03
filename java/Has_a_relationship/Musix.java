package Has_a_relationship;

public class Musix {
	private int NoOfSong;
	private String name;
	private Laptop laptop;//aggrigation
	
	public Musix(int NoOfSong, String name, Laptop laptop) {
		this.NoOfSong=NoOfSong;
		this.name=name;
		this.laptop=laptop;
				
	}
	public void display() {
		System.out.println("No of song is "+ NoOfSong);
		System.out.println("Name :" +name);
		System.out.println("Laptop details is "+ laptop);
		
	}

}
