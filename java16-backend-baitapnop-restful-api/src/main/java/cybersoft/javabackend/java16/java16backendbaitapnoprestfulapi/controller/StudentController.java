package cybersoft.javabackend.java16.java16backendbaitapnoprestfulapi.controller;
/*
 * Mục đích: Quản lý đối tượng Student
 * Người tạo: Trần Kim Phú
 * Ngày tạo: 28/02/2022
 * Version: 1.0
 * */
import java.util.ArrayList;
import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cybersoft.javabackend.java16.java16backendbaitapnoprestfulapi.model.Student;

@RestController
public class StudentController {
	List<Student> students = new ArrayList<Student>();
	
	@GetMapping("/students")
	public Object addStudentByRequestParam(@RequestParam String name, @RequestParam int age) {
		students.add(new Student(name,age));
		return students;	
	}
	
	@GetMapping("/students/{name}/{age}")
	public Object addStudentByPathVariable(@PathVariable(name = "name",required = false) String name,
			@PathVariable(name = "age",required = false) int age) {
		students.add(new Student(name,age));
		return students;
		
	}
	
	@PostMapping("/students")
	public Object addStudentByRequestBody(@RequestBody Student student) {
		Student entity = new Student(student.getName(),student.getAge());		
		students.add(entity);
		return students;	
	}
	
}
