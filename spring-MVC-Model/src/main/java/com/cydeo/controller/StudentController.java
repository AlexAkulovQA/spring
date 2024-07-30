package com.cydeo.controller;

import com.cydeo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {
@RequestMapping("/welcome")
public String welcome(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
    model.addAttribute("name","Alex");
    model.addAttribute("course","MVC");

    Student student1=new Student(1,"Ben","Daubenspeck");

    model.addAttribute(student1);
    return "student/welcome";
}
}
