package This.Super;


//Child Class
class Student extends Person {
String name = "Child Name";  // Same variable as parent

// Constructor
Student() {
   super(); // 3 Invoking parent class constructor
   System.out.println("Student (Child) Constructor Called");
}

void showNames() {
   System.out.println("Child name: " + name);           // Child's variable
   System.out.println("Parent name: " + super.name);    //  Refers to parent class variable
}

void greetBoth() {
   super.greet();  //  Invoking parent class method
   System.out.println("Hello from Student class");
}

public static void main(String[] args) {
   Student s = new Student();
   s.showNames();      // Demonstrates access to parent variable
   s.greetBoth();      // Demonstrates calling parent me
}}


