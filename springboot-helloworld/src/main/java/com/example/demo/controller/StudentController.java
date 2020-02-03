package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.StudentDAO;
import com.example.demo.dto.StudentDTO;
import com.example.demo.entity.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
@Autowired
	private StudentDAO studentDAO;
	@RequestMapping("/showForm")
	public String showForm(Model theModel)
	{
		theModel.addAttribute("student",new Student());
		return "show-form";
	}
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student student,Model model)
	{
		model.addAttribute("student",student);
		studentDAO.createStudent(student);
		return "process-form";
	}
}
