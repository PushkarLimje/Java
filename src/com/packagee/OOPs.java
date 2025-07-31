package com.packagee;

public class OOPs {
    public static void main(String [] args ){
        Person person1 = new Person("Pushkar", 30,12411858);

        Person person2 = new Person();          // using default constructor e.g.  Person(
        person2.name = "Alex";
        person2.age = 27;

//        person1.displayInfo();
//        person1.eat();
//        person2.walk();
//        person1.walk(1500);

        System.out.println("Total Person Count: " + Person.count); // accessing static property

        Developer developer1 = new Developer("John", 18, 12411859);
        developer1.walk();

//        child d1 = (child) person1;
//        Person p1 = d1; // upcasting
//        d1.walk();

        Developer developer2 = new Developer("alisha", 22, 12411860);
        Person p2 = developer2; // upcasting
        p2.walk();
    }
}

class Person {
    String name;                        // method : properties to identify
    int age;
    int id;

    static int count=0;                 // static keyword is to use for creating a class property and it doesn't belong to object property

    public Person() {
        count ++;
        System.out.println("creator is in this program ");
    }

    public Person(String newName, int newAge, int id) {// constructor to initialize properties

//        this();                                        // calling default constructor to increment count
        name = newName;
        age = newAge;

        this.id = id;                                  // 'this' keyword is used to refer to the current object in this class
    }

    public void displayInfo() {                 // method to display information or behavior
        System.out.println("Name: " + name + ", Age: " + age);
    }
    void walk() { // method to define behavior
        System.out.println(name + " is walking.");
    }
    void eat() {                            // method to define behavior
        System.out.println(name + " is eating.");
    }
    void walk(int steps) {                  // method to define behavior with parameter
        System.out.println(name + " was walking " + steps + " steps.");
    }
    void working() {                        // method to define behavior
        System.out.println(name + " is working.");
    }
}

class Manager extends Person {

    // child class inheriting from Person class
    // this class can have its own properties and methods or override parent class methods
    public Manager (String newName, int newAge, int id) {
        super(newName, newAge, id); // calling parent class constructor

    }

    void meeting() { // overriding the walk method from parent class
        System.out.println(name + " is meeting with team members and clients .");

    }

}

class Developer extends Person {

    // child class inheriting from Person class
    // this class can have its own properties and methods or override parent class methods

    public Developer(String newName, int newAge, int id) {
        super(newName, newAge, id); // calling parent class constructor

    }

    @Override
    void walk() { // overriding the walk method from parent class
        System.out.println(name + " is walking in a different way.");

    }
}


//Polymorphism is calling the same name function having different parameters
//compile time polymorphism is differntiate by parameters in same class
//runtime polymorphism is differntiate by parameters in different class such as inheritance or child class

// constructor is a special method that is called when an object is created

//public means we can call that function in any class or any package
// private means we can call that function only in the same class
// protected means we can call that function in the same class and in the child class

//encapsulation is a way to restrict access to the properties and methods of a class

//question
// how to call parent walk method through child class as it is also contained in both classes