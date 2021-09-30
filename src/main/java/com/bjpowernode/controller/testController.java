package com.bjpowernode.controller;

import com.bjpowernode.domain.Student;
import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mz on 2021/9/27 18:34
 */
@Controller
public class testController {
    @RequestMapping(value = "/test.do",method = RequestMethod.GET)
    @ResponseBody
    public List<Student> test(HttpServletRequest request, HttpServletResponse response) throws IOException, InterruptedException {
        Student student1 = new Student(1,"zs",20);
        Student student2 = new Student(2,"ls",21);
        ArrayList<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        return list;
    }
}
