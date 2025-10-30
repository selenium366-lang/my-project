package Polymorphism.Instance.Variable.Shadowing;

public class Child extends Parent {
	
	int a = 20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent c = new Child();
		System.out.println(c.a);

	}

}
