package com.buck.production;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/student")
public class StudentController {


    @RequestMapping("/showForm")
    public String showForm (Model themodel){
        //create student object
        Student theStudent = new Student();
        //add student to model
        themodel.addAttribute("student",theStudent);
        return "student-form";
    }
    @RequestMapping("/processForm")
    public String processForm (@Valid @ModelAttribute("student") Student theStudent, BindingResult theBindingresult) {
        if (theBindingresult.hasErrors()) {
            return "student-form";
        } else {
            return "student-confirmation";
        }

    }
    @InitBinder
    public void initBinder(WebDataBinder dataBinder) {
        StringTrimmerEditor stringTrimmerEditor= new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class,stringTrimmerEditor);
    }
    }

