
public class Car extends Vehicle {
	
	private String gear; 
	
	public Car(String name, int condition, int topSpeed, String inputGear, int ID) {
		
		super(name, condition, topSpeed, ID);
		this.gear = inputGear;
		
		
	}
	public String getGear() {
		
		return gear;
	}
	public String toString() {
		String s = super.toString();
		return s + " " + "And it is an " + getGear() + " Vehicle";
	}
}