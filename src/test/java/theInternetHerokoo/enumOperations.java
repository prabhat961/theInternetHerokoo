package theInternetHerokoo;

enum colour{
	RED,
	GREEN,
	BLUE;
	
	//constructor in enum
	private colour() {
		System.out.println("Constructor called for : "
                + this.toString());
	}
	
	// Method in enum
	public void colorInfo(){
		System.out.println("Universal Color");
	}
	
}

public class enumOperations {
	

	public static void main(String[] args) {
		colour c1 = colour.RED;
		System.out.println(c1);
		c1.colorInfo();
		colour c2 = colour.GREEN;
		System.out.println(c2);
		c2.colorInfo();
		// Calling values()
        colour arr[] = colour.values();
 
        // enum with loop
        for (colour col : arr) {
            // Calling ordinal() to find index
            // of color.
            System.out.println(col + " at index "
                               + col.ordinal());
        }
 
        // Using valueOf(). Returns an object of
        // Color with given constant.
        // Uncommenting second line causes exception
        // IllegalArgumentException
        System.out.println(colour.valueOf("RED"));

	}

}
