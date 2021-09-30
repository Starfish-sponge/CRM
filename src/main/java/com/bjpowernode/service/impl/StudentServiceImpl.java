package com.bjpowernode.service.impl;

import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.domain.Student;
import com.bjpowernode.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Mz on 2021/9/16 14:25
 */
@Service
public class StudentServiceImpl implements StudentService {

    //在spring的配置文件中，已经创建了对象，此处只需要引用即可
    @Resource
    private StudentDao studentDao;
    @Override
    public int addStudent(Student student) {
        int nums = studentDao.addStudent(student);
        return nums;
    }

    @Override
    public List<Student> findStudent() {
       return studentDao.queryStudent();
    }
}
