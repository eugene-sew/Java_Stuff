package io.eugene.dev;

public class Person {
//    int age = 0;

    Person(){
        System.out.println("base person class ");
    }

    Person(String name){
        System.out.println("person with name"+ name);
    }

    Person(String name, int age){
        System.out.println("Person with name and age"+ name + " "+ age);
    }

    void info(){
        System.out.println("This is the info panel with base info");
    }

    void info(String name){
        System.out.println("this is info panel for "+ name);
    }


}
