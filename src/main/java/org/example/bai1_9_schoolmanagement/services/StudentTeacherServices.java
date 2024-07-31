package org.example.bai1_9_schoolmanagement.services;

import org.example.bai1_9_schoolmanagement.ResponseAPI.ResponseAPI;
import org.springframework.stereotype.Service;

@Service
public interface StudentTeacherServices {
    ResponseAPI getStudentClassName();

    ResponseAPI getStudentInfo();

    ResponseAPI getTeacherTinhTrangHonNhan();

    ResponseAPI getTeacherInfo();

    ResponseAPI getAllPerson();

    ResponseAPI helloStudent();

    ResponseAPI helloTeacher();
}
