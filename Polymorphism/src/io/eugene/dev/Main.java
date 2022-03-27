package io.eugene.dev;

//Static Polymorphism
public class Main {

    public static void main(String[] args) {
//creating instance of Person class
        Person person = new Person();
        //this is the same object of person but behaves in a different manner
        Person person1 = new Person("Kwame");
        //this is the same object of person but behaves in a different manner
        Person person2 = new Person("Becky", 20);

        person.info();
        person.info("Becky");
    }
}
