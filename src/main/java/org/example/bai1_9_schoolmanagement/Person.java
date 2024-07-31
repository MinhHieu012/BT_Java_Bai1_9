package org.example.bai1_9_schoolmanagement;

public abstract class Person {
    String name;
    int age;
    String gender;

    /**
     * Khai báo 3 kiểu constructor
     */
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

    // Constructor sao chép
    public Person(Person person) {
        this.name = person.name;
        this.age = person.age;
        this.gender = person.gender;
    }
}
