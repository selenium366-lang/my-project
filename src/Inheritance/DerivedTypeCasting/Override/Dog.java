package Inheritance.DerivedTypeCasting.Override;

class Dog extends Animal {

	@Override
	void sound() {
	System.out.println("Animal makes sound");
	}

	void bark() {
		System.out.println("Dog barks");
	}
}
