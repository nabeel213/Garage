
public class Bike extends Vehicle {
	
	private int fuelCapacity;
	
	public Bike(String name, int condition, int topSpeed, int fuelCapacity, int ID) {
		
		super(name, condition, topSpeed, ID);
		this.fuelCapacity = fuelCapacity;
	}
	public int getFuelCap() {
		return fuelCapacity;
	}
	public String toString() {
		
		String s = super.toString();
		return s + " " + "And has a fuel capacity of: " + getFuelCap();
		
	}

}
