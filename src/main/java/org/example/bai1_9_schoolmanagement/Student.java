package org.example.bai1_9_schoolmanagement;

public class Student extends Person {
    String className;
    Float score;

    // Constructor ko có tham số
    public Student() {
        this.className = "";
        this.score = 0.0f;
    }

    // Constructor nhận tên lớp
    public Student(String className) {
        this.className = className;
    }

    /**
     * Constructor dùng super
     * - Khi cần tham chiếu đến thuộc tính, đối tượng của class cha đã kế thừa
     * => Sử dụng super(attribute_cần_tham_chiếu) để tham chiếu đến
     */
    public Student(String name, int age, String gender) {
        super(name, age, gender);
    }
}
