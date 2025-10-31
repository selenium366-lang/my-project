package Encapsulation;

public class Student {

	private String name;
	private int age;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>=5 && age <=100) {
			this.age=age;
		}
		else {
			System.out.println("age is invalid");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s = new Student();
		s.setName("Abhijeet");
		s.setAge(26);
		System.out.println("StudentName name is:" + s.getName() + " and age is:" + s.getAge());


	}

}
