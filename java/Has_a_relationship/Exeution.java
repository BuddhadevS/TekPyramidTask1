package Has_a_relationship;

public class Exeution {
	public static void main(String[] args) {
		Laptop laptop = new Laptop(10,"Dell",50000,"aer aspire 7");
		Musix musix = new Musix(111,"Main hoon na",laptop);
		musix.display();
	}

}
