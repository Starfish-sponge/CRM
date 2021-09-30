package com.bjpowernode.controller;

import com.bjpowernode.domain.Student;
import com.bjpowernode.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by Mz on 2021/9/17 21:41
 */
@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/addStudent.do")
    public ModelAndView addStudent(Student student, HttpServletResponse response){
        response.setContentType("application/json");
        ModelAndView modelAndView = new ModelAndView();
        int nums = studentService.addStudent(student);
        String msg = "注册失败";
        if(nums > 0){
          msg = "学生【"+student.getName()+"】注册成功";
        }
        modelAndView.addObject("msg", msg);
        modelAndView.setViewName("result");
        return modelAndView;
    }

    /*使用ajax三部曲,jackson，annotation-driven，ResponseBody*/

    /*  @ResponseBody的作用其实是将java对象转为json格式的数据。
        @responseBody注解的作用是将controller的方法返回的对象通过"适当的转换器"转换为指定的格式之后，
        写入到response对象的body区，通常用来返回JSON数据或者是XML数据。
        */

    /*
    *   注意：在使用 @RequestMapping后，返回值通常解析为跳转路径，
    *   但是加上 @ResponseBody 后返回结果不会被解析为跳转路径，而是直接写入 HTTP response body 中。
    *   比如异步获取 json 数据，加上 @ResponseBody 后，会直接返回 json 数据。
    *   @RequestBody 将 HTTP 请求正文插入方法中，使用适合的 HttpMessageConverter 将请求体写入某个对象。
    * */
    @ResponseBody
    @RequestMapping("/queryStudent.do")
    public List<Student> queryStudent(){
        ModelAndView modelAndView = new ModelAndView();
        List<Student> studentList = studentService.findStudent();
        return studentList;
    }

}
