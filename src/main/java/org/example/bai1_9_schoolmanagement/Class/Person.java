package org.example.bai1_9_schoolmanagement.Class;

public abstract class Person {
    String name;
    int age;
    String gender;

    // Constructor ko có tham số
    public Person() {
        this.name = "";
        this.age = 0;
        this.gender = "";
    }

    // Constructor có tham số
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public String printHello() {
        return "Hello, I am a Person!";
    }

    private void Hello() {
        System.out.println("Person here!");
    }
}
