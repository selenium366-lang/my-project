package Inheritance_Hierarichical;

class Cat extends Animal {
	void meow() {
		System.out.println("Cat meow");

	}

	public static void main(String[] args) {
		Dog d =new Dog();
		d.sound();
		d.bark();
		
		Cat c = new Cat();
		c.sound();
		c.meow();
	}
}
