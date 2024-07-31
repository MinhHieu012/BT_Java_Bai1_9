package org.example.bai1_9_schoolmanagement.Class;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student extends Person {
    private String className;
    private Float score;

    // Constructor ko có tham số
    public Student() {}

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
        /**
         * Super sẽ tham chiếu đến thuộc tính của cha => Ko thể thay đổi thuộc tính của cha khi tham chiếu
         *
         * => Khi call API get ra dữ liệu mà khởi tạo đối tượng thay đổi/thêm giá trị
         * => Ko hiển thị và thay đổi được
         * => Nên lúc call API xong chỉ hiển thị 2 thuộc tính của class con Student -> className & score
         */
        super(name, age, gender);
    }

    @Override
    public String printHello() {
        return "Hello, I am a student! " + "My info is secret!";
    }

    public String printHello(String name, int age) {
        return "Hello, I am a student, my name is " + name + ", i am " + age + " years old";
    }

    public String printHello(int age) {
        return "Hello, I am a student, i am " + age + " years old";
    }

    /**
     * Không thể override (triển khai lại hàm "private void Hello()" của class cha Person
     * => Vì hàm này đang được khai báo phạm vi truy cập là private
     * => private chỉ truy cập được trong class nó khai báo
     *
     * => Cố khai báo => Lỗi
     */
    @Override
    public void Hello() {
        System.out.println("Học sinh ngoan!");
    }

    public void Hello(String text) {
        System.out.println("Học sinh ngoan được overload!");
    }
}
