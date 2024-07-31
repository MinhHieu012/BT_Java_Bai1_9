package org.example.bai1_9_schoolmanagement.Data;

import lombok.Getter;
import org.example.bai1_9_schoolmanagement.Class.Person;
import org.example.bai1_9_schoolmanagement.Class.Student;
import org.example.bai1_9_schoolmanagement.Class.Teacher;
import org.springframework.stereotype.Component;

@Component
@Getter
public class Data {
    Student student = new Student();
    Student studentClass = new Student("Class 1A");
    Student studentInfo = new Student("Le Minh A", 12, "Male");

    Teacher teacher = new Teacher();
    Teacher teacherTinhTrangHonNhan = new Teacher("Married");
    Teacher teacherInfo = new Teacher("Le Minh B", 31, "Male");
}
