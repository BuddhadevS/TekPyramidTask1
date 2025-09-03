package Aggregration;

public class Address {
	private int pin;
	
	private String state;
	private String village;
	public Address(int pin, String state, String village) {
		this.pin = pin;
		this.state = state;
		this.village = village;
	}
	@Override
	public String toString() {
		return "= [pin=" + pin + ", state=" + state + ", village=" + village + "]";
	}
	

}
