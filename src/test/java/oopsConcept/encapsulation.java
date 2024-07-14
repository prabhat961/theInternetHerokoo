package oopsConcept;

public class encapsulation {

	    private String name;
	    private int age;

	    // Getter method for name
	    public String getName() {
	        return name;
	    }

	    // Setter method for name
	    public void setName(String name) {
	        this.name = name;
	    }

	    // Getter method for age
	    public int getAge() {
	        return age;
	    }

	    // Setter method for age
	    public void setAge(int age) {
	        if (age >= 0 && age <= 120) { // Assume age is valid within a certain range
	            this.age = age;
	        } else {
	            System.out.println("Invalid age!");
	        }
	    }
	

	public static void main(String[] args) {
		encapsulation obj = new encapsulation();
	        obj.setName("John");
	        obj.setAge(30);

	        System.out.println("Name: " + obj.getName());
	        System.out.println("Age: " + obj.getAge());

	        // Trying to set an invalid age
	        obj.setAge(150); // This will print "Invalid age!"

	        // Accessing private variables directly (not recommended)
	        // System.out.println(obj.name); // This will give a compilation error because 'name' is private

	}

}
