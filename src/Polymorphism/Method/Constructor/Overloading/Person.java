package Polymorphism.Method.Constructor.Overloading;

public class Person {

    String name;
    int age;

    // Constructor 1: No parameters
    Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Constructor 2: One parameter
    Person(String name) {
        this.name = name;
        this.age = 0;
    }

    // Constructor 3: Two parameters
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Person p1 = new Person();                   // Uses constructor 1
        Person p2 = new Person("Alice");            // Uses constructor 2
        Person p3 = new Person("Bob", 30);          // Uses constructor 3

        p1.display();
        p2.display();
        p3.display();
    }

}
