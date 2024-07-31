package org.example.bai1_9_schoolmanagement.controller;

import org.example.bai1_9_schoolmanagement.services.StudentTeacherServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bai1_9")

public class StudentTeacherController {
    @Autowired
    public StudentTeacherServices studentTeacherServices;

    @GetMapping("/get_student_class_name")
    public ResponseEntity<?> getStudentClassName() {
        return new ResponseEntity<>(studentTeacherServices.getStudentClassName(), HttpStatus.OK);
    }

    @GetMapping("/get_student_info")
    public ResponseEntity<?> getStudentInfo() {
        return new ResponseEntity<>(studentTeacherServices.getStudentInfo(), HttpStatus.OK);
    }

    @GetMapping("/get_teacher_tinh_trang_hon_nhan")
    public ResponseEntity<?> getTeacherTinhTrangHonNhan() {
        return new ResponseEntity<>(studentTeacherServices.getTeacherTinhTrangHonNhan(), HttpStatus.OK);
    }

    @GetMapping("/get_teacher_info")
    public ResponseEntity<?> getTeacherInfo() {
        return new ResponseEntity<>(studentTeacherServices.getTeacherInfo(), HttpStatus.OK);
    }

    @GetMapping("/get_all_person")
    public ResponseEntity<?> getAllPerson() {
        return new ResponseEntity<>(studentTeacherServices.getAllPerson(), HttpStatus.OK);
    }

    @GetMapping("/hello_student")
    public ResponseEntity<?> helloStudent() {
        return new ResponseEntity<>(studentTeacherServices.helloStudent(), HttpStatus.OK);
    }

    @GetMapping("/hello_teacher")
    public ResponseEntity<?> helloTeacher() {
        return new ResponseEntity<>(studentTeacherServices.helloTeacher(), HttpStatus.OK);
    }
}
