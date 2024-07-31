package org.example.bai1_9_schoolmanagement;

public class Data {
    String name;
    int age;
    String gender;
    String className;
    Float score;

    public Data(String name, int age, String gender, String className, Float score) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.className = className;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getClassName() {
        return className;
    }

    public Float getScore() {
        return score;
    }
}
