package com.william.apidemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    //CRUD
    @Autowired
        StudentService studentService;

    @RequestMapping(method = RequestMethod.POST, value = "/student")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }

}
