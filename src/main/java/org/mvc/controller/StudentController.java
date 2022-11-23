package org.mvc.controller;

import org.mvc.entity.Student;
import org.mvc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {


    @RequestMapping(value = "/studentDetails",method = RequestMethod.POST)
    public ModelAndView employeeData(@ModelAttribute Student student)
    {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("student",student);
           modelAndView.setViewName("student");
        return modelAndView;
    }
}
