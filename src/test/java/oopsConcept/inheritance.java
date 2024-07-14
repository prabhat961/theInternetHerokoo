package oopsConcept;

//Parent class
class Vehicle {
 String brand;
 int year;

 public Vehicle(String brand, int year) {
     this.brand = brand;
     this.year = year;
 }

 public void display() {
     System.out.println("Brand: " + brand);
     System.out.println("Year: " + year);
 }
}

//Subclass inheriting from Vehicle
class Jeep extends Vehicle {
 int numberOfDoors;

 public Jeep(String brand, int year, int numberOfDoors) {
     super(brand, year); // Calling the superclass constructor
     this.numberOfDoors = numberOfDoors;
 }

 // Overriding display method of the superclass
 @Override
 public void display() {
     super.display(); // Calling the display method of the superclass
     System.out.println("Number of doors: " + numberOfDoors);
 }
}

public class inheritance {

	public static void main(String[] args) {
		 // Creating an instance of the Jeep class
        Jeep myJeep = new Jeep("Toyota", 2022, 4);
        
        // Calling display method of Jeep class
        myJeep.display();

	}

}
