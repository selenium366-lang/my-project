package Inheritance.Has.A.Relation;

public class Car {
	
	Engine e = new Engine();
	
	void drive() {
		System.out.println("this is drive method from car class");
		e.start();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
        c.drive(); 
	}

}
