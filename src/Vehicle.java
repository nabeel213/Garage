
public abstract class Vehicle {
	
	private String name;
	private int condition;
	private int topSpeed;
	private int ID;
	
	public Vehicle (String name, int condition, int topSpeed, int ID) {
		
		this.name = name;
		this.condition = condition;
		this.topSpeed = topSpeed;
		this.ID = ID;
	}
	
	public String getName() {
		
		return name;
	}
	public int getCondition() {
		return condition;
		
	}
	public int getTopSpeed() {
		
		return topSpeed;
	}
	public String toString() {
		return "The vehicle name is " + name + " The condition rating is: " + condition + " Its top speed is: " + topSpeed +" " + ID;
	}
	public int getID() {
		return ID;
		
	}
	
}
