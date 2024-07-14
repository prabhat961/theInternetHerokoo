package oopsConcept;

class car{
	String brand;
	String model;
	int year;
	
	void displayInfo() {
		System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
	}
}
public class ClassesAndObject {

	public static void main(String[] args) {
		car myCar = new car();
        // Set values to the fields of the object using dot notation
        myCar.brand = "Toyota";
        myCar.model = "Camry";
        myCar.year = 2022;

        // Call the method to display information about the car
        System.out.println("Information about my car:");
        myCar.displayInfo();

        // Create another object of the Car class
        car friendCar = new car();

        // Set values to the fields of the object using dot notation
        friendCar.brand = "Honda";
        friendCar.model = "Civic";
        friendCar.year = 2019;

        // Call the method to display information about the car
        System.out.println("\nInformation about friend's car:");
        friendCar.displayInfo();

	}

}
