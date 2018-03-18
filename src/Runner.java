import java.util.Arrays;

//import java.util.ArrayList;
//import java.util.Arrays;

// import java.util.Scanner; // For Scanner below

public class Runner {

	public static void main(String[] args) {
		
		/* Easier for testing
		System.out.println("Enter the name of your car ");
		Scanner s = new Scanner(System.in);
		String inputName = s.nextLine();
		
		System.out.println("Enter vehicle condition ");
		//System.out.println();
		int inputCondition = s.nextInt();
		
		System.out.println("Enter your top Speed ");
		int inputMaxSpeed = s.nextInt();
		
		System.out.println("Enter vehicle gear ");
		String inputGear = s.next();
		
		System.out.println("Enter vehicle ID");
		int vehicleID = s.next();
		s.close();
		*/

		// goes with the above scanner ^ Car car1 = new Car(inputName, inputCondition, inputMaxSpeed, inputGear, );
		
		
		Car car1 = new Car("Lambo", 1, 100, "Manual", 123456);
		Plane plane1 = new Plane("Plane", 2, 200, "Super Engine 1.0", 789012);
		Bike bike1 = new Bike("Cool Bike", 3, 50, 25, 345678);
		
		Garage garage1 = new Garage();
		
		garage1.addVehicle(car1);
		garage1.addVehicle(plane1);
		garage1.addVehicle(bike1);
		garage1.calc();
		
		//System.out.println("Remove Vehicle by ID"); Code for when scanner is enabled
		//int ID = s.nextInt();
		
		garage1.removeVehicleByID(123456);
		//System.out.println(Arrays.toString(list1));

	}
}
