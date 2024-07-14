package oopsConcept;
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass 1
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Subclass 2
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class polymorphism {
	

	public static void main(String[] args) {
		 Animal animal1 = new Dog(); // Upcasting
	        Animal animal2 = new Cat(); // Upcasting

	        animal1.sound(); // Calls Dog's sound() method
	        animal2.sound(); // Calls Cat's sound() method

	}

}
