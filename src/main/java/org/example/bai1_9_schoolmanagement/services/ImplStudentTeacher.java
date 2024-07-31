package org.example.bai1_9_schoolmanagement.services;

import org.example.bai1_9_schoolmanagement.Class.Person;
import org.example.bai1_9_schoolmanagement.Data.Data;
import org.example.bai1_9_schoolmanagement.ResponseAPI.ResponseAPI;
import org.example.bai1_9_schoolmanagement.Class.Student;
import org.example.bai1_9_schoolmanagement.Class.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ImplStudentTeacher implements StudentTeacherServices {
    @Autowired
    private Data data;

    @Override
    public ResponseAPI getStudentClassName() {
        List<Student> studentClassList = new ArrayList<>();
        studentClassList.add(data.getStudentClass());
        return new ResponseAPI(studentClassList);
    }

    @Override
    public ResponseAPI getStudentInfo() {
        List<Student> studentInfoList = new ArrayList<>();
        studentInfoList.add(data.getStudentInfo());
        return new ResponseAPI(studentInfoList);
    }

    @Override
    public ResponseAPI getTeacherTinhTrangHonNhan() {
        List<Teacher> teacherTinhTrangHonNhanList = new ArrayList<>();
        teacherTinhTrangHonNhanList.add(data.getTeacherTinhTrangHonNhan());
        return new ResponseAPI(teacherTinhTrangHonNhanList);
    }

    @Override
    public ResponseAPI getTeacherInfo() {
        List<Teacher> teacherInfoList = new ArrayList<>();
        teacherInfoList.add(data.getTeacherInfo());
        return new ResponseAPI(teacherInfoList);
    }

    @Override
    public ResponseAPI getAllPerson() {
        List<Person> personList = new ArrayList<>();
        personList.add(data.getStudentClass());
        personList.add(data.getStudentInfo());
        personList.add(data.getTeacherTinhTrangHonNhan());
        personList.add(data.getTeacherInfo());
        return new ResponseAPI(personList);
    }

    @Override
    public ResponseAPI helloStudent() {
        List<String> helloStudent = new ArrayList<>();
        helloStudent.add(data.getStudent().printHello("Le Minh A", 12));
        helloStudent.add(data.getStudent().printHello(12));
        return new ResponseAPI(helloStudent);
    }

    @Override
    public ResponseAPI helloTeacher() {
        List<String> helloTeacher = new ArrayList<>();
        helloTeacher.add(data.getTeacher().printHello("Le Minh B", 31));
        helloTeacher.add(data.getTeacher().printHello(31));
        return new ResponseAPI(helloTeacher);
    }
}
