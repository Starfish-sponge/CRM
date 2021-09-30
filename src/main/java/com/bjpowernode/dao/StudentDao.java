package com.bjpowernode.dao;

import com.bjpowernode.domain.Student;

import java.util.List;

/**
 * Created by Mz on 2021/9/16 14:14
 */
public interface StudentDao {
    int addStudent(Student student);

    List<Student> queryStudent();
}
