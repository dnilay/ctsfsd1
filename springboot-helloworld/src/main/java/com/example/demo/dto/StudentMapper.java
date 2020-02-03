package com.example.demo.dto;

import org.mapstruct.Mapper;

import com.example.demo.entity.Student;

@Mapper
public interface StudentMapper {

	public Student studentDtoToStudent(StudentDTO dto);
	public StudentDTO studentToStudentDto(Student student);
}
