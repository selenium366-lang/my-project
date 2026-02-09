package Polymorphism.Method.Shadowing;

public class Child extends Parent {

	static void show() {
	    System.out.println("Child static show()");
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Parent();
        Parent.show();  // Output: Parent static show()

        Child c = new Child();
        Child.show();  // Output: Child static show()

        Parent pr = new Child();
        Parent.show();  // Output: Parent static show() shadowing!

	}

}
