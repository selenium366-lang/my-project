package This.Super;

public class StudentName {
	    String name;

	    // Invoking current class constructor
	    StudentName() {
	        this("Default Name"); // Calls the 2-arg constructor
	        System.out.println("Default constructor called");
	    }

	    //  Using 'this' to refer to instance variables
	    StudentName(String name) {
	        this.name = name; // Refers to the instance variable
            System.out.println("parameterized constructor with this keyword");
	    }

	    //  Using 'this' to invoke current class method
	    void display() {
	        this.showDetails(); // Invokes current class method
	    }

	    void showDetails() {
	        System.out.println("Name: " + this.name );
	    }

	    public static void main(String[] args) {
	        StudentName s1 = new StudentName();       // Calls no-arg constructor
	        s1.display();                     // Calls method using 'this'

	        StudentName s2 = new StudentName("AB");
	        s2.display();
	    }
	}



