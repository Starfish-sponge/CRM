package com.bjpowernode.service;

import com.bjpowernode.domain.Student;

import java.util.List;

/**
 * Created by Mz on 2021/9/16 14:24
 */
public interface StudentService {
    int addStudent(Student student);

    List<Student> findStudent();


}
