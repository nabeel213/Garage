
public class Plane extends Vehicle {
	
	private String engine;
	
	public Plane(String name, int condition, int topSpeed, String engine, int ID) {
		
		super(name, condition,topSpeed, ID);
		this.engine = engine;
	}
	public String getEngine() {
		return engine;
	}
	public String toString() {
		
		String s = super.toString();
		return s + " " + "And the Engine name is " + getEngine();
	}
}
