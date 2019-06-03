package com.controllers;

import com.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

import java.util.ArrayList;

@Controller
public class HomeController {

    @RequestMapping(value="/home", method = RequestMethod.GET)
    public String printMyFirstProgram(ModelMap model) {
        model.addAttribute("message", "My First Program");
        return "home";
    }

    @RequestMapping(value="/student/details", method = RequestMethod.GET)
    public String student(ModelMap model) {
        Student st = new Student("Mihai", "Poli");
        //model.addAttribute("student", st.getName());
        //model.addAttribute("college", st.getCollege());
        model.addAttribute("student", st);
        return "student";
    }


    @RequestMapping(value = "/student/add", method = RequestMethod.POST)
    public String student(Model model, @RequestParam("name") String name, @RequestParam("college") String college) {
        model.addAttribute("result", name + ": " + college);
        return "student";
    }


    @RequestMapping(value="/studentList/all", method = RequestMethod.GET)
    public String getList(ModelMap model) {
        ArrayList<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("Dan", "ETTI"));
        studentList.add(new Student("Andrei", "Calculatoare"));
        studentList.add(new Student("Alex", "Automatica"));

        model.addAttribute("list", studentList);

        return "studentList";
    }


    @RequestMapping(value = "/studentList/find/{name}", method = RequestMethod.GET)
    public String findStudent(Model model, @PathVariable("name") String name) {
        ArrayList<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("Dan", "ETTI"));
        studentList.add(new Student("Andrei", "Calculatoare"));
        studentList.add(new Student("Alex", "Automatica"));

        for (int i = 0; i < studentList.size(); i++) {
            if (name.equals(studentList.get(i).getName())) {

                model.addAttribute("result", "testResponse");
            }
        }


        return "student";
    }





}
