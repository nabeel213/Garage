import java.util.ArrayList;

public class Garage {

	public int a = 100;

	private ArrayList<Vehicle> list1 = new ArrayList<Vehicle>();
	
	public Garage() {
	}

	public void addVehicle(Vehicle v) {
		list1.add(v);

	}

	public void removeVehicle(Vehicle v) {
		list1.remove(v);
	}

	public ArrayList<Vehicle> getArrayList() {
		return list1;
	}

	public void calc() {

		for (Vehicle v : list1) {

			if (v instanceof Car) {

				a = 100;
				int carTotalCost = calculateBill();
				System.out.println("its a car and will cost you: " + carTotalCost);
			} else if (v instanceof Bike) {

				a = 200;
				int bikeTotalCost = calculateBill();
				System.out.println("its a bike and will cost you: " + bikeTotalCost);
			} else {
				a = 300;

				int planeTotalCost = calculateBill();
				System.out.println("its a plane and will cost you: " + planeTotalCost);
			}

		}

	}
	
	public void removeVehicleByID(int ID) {	
		
		for(int i = 0; i < list1.size(); i++) {
			if(list1.get(i).getID()== ID) {
				
				//System.out.println("Vehicle with ID " + id + " removed from Garage");
				list1.remove(i);
				System.out.println(list1);
				//System.out.println(" ");
			}
		} 
		
	}

	public int calculateBill() {

		int fixedCost = 100;
		int totalCost = fixedCost + a;

		return totalCost;

	}
}

	
	/*
	public void removeVehicleByID(int ID) {

	
		int inputVehicleID = 123456;
		for (Vehicle vv : list2) {
			System.out.println(vv);

			if (vv.getID() == inputVehicleID) {
				list2.remove(vv);
				
				System.out.println(list2);
			}
			list2 = list1;
		}
	}
*/
	// Data objt = new Data(name, address, contact); // Creating a new object
	// Contacts.add(objt); // Adding it to the list
//}

// below method I wanted to calculate the bill and return value to be printed;
// public int calculateBill() {

// if(v instance of car)
// return 100 * car

/*
 * for(Human person : hL) { if(person.toString().contains("is: " + name)) {
 * return true; } BELOW SHOULD WORK public void calculateBill(ArrayList<Vehicle>
 * list1) { //this.list1 = list1; Vehicle myCar = list1.get(0);
 * System.out.println(myCar.getClass().getName()); if(myCar instanceof Car) {
 * System.out.println("its a car"); }
 */
