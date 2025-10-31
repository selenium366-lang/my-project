package Inheritance.DerivedTypeCasting.Override;

public class TestMethoOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal a = new Dog(); //Up-casting
		a.sound();
		// a.bark();  //Not allowed directly

		Dog d = (Dog) a; //Down casting
		d.bark();
	}

}
