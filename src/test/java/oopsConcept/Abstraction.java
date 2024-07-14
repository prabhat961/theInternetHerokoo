package oopsConcept;
//Abstract class representing a shape
abstract class Shape {
 // Abstract method to calculate area
 public abstract double calculateArea();
 
 // Abstract method to calculate perimeter
 public abstract double calculatePerimeter();
}

//Concrete subclass representing a Circle
class Circle extends Shape {
 private double radius;
 
 public Circle(double radius) {
     this.radius = radius;
 }
 
 // Implementation of abstract method to calculate area
 @Override
 public double calculateArea() {
     return Math.PI * radius * radius;
 }
 
 // Implementation of abstract method to calculate perimeter
 @Override
 public double calculatePerimeter() {
     return 2 * Math.PI * radius;
 }
}

//Concrete subclass representing a Rectangle
class Rectangle extends Shape {
 private double length;
 private double width;
 
 public Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }
 
 // Implementation of abstract method to calculate area
 @Override
 public double calculateArea() {
     return length * width;
 }
 
 // Implementation of abstract method to calculate perimeter
 @Override
 public double calculatePerimeter() {
     return 2 * (length + width);
 }
}

public class Abstraction {

	public static void main(String[] args) {
		 Circle circle = new Circle(5);
	        Rectangle rectangle = new Rectangle(4, 6);
	        
	        // Calculating and printing area and perimeter
	        System.out.println("Circle - Area: " + circle.calculateArea() + ", Perimeter: " + circle.calculatePerimeter());
	        System.out.println("Rectangle - Area: " + rectangle.calculateArea() + ", Perimeter: " + rectangle.calculatePerimeter());
	    }

	}

