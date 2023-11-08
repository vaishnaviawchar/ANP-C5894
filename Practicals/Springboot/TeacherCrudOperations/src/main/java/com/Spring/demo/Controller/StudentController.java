package com.Spring.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.demo.entity.Student;
import com.Spring.demo.entity.Teacher;
import com.Spring.demo.service.StudentService;

import jakarta.validation.Valid;

@RestController
public class StudentController 
{
	@Autowired
	StudentService ss;
	
	@PostMapping("/Student/addStudent")
	public ResponseEntity<Student> saveStudentEntity(@Valid @RequestBody Student student)
	{
		return new ResponseEntity<Student>(ss.addStudetns(student), HttpStatus.CREATED);
		
	}
	
	@GetMapping("/Student/getStudent/{sid}")
	public ResponseEntity<Student> getStudent(@PathVariable("sid") int sid)
	{
		return new ResponseEntity<Student> (ss.getStudentDetails(sid), HttpStatus.OK);
		
	}
	
	@PutMapping("/Student/updateStudent/{sid}")
	public ResponseEntity<Student> updateStudent(@PathVariable("sid") int sid, @RequestBody Student student)
	{
		return new ResponseEntity<Student> (ss.UpdateStudentDetails(student, sid), HttpStatus.OK);
		
	}
	
	@DeleteMapping("/Student/deleteStudent/{sid}")
	public ResponseEntity<String> deleteStudent(@PathVariable("sid") int sid)
	{
		ss.deleteStudentDetails(sid);
		return new ResponseEntity<String> ("Student id deleted successfully", HttpStatus.OK);
		
	}
	

	 @GetMapping("/Student/getAllStudents") // New endpoint for getting all teacher records
	    public ResponseEntity<List<Student>> getAllStudents()
	    {
	        List<Student> student = ss.getAllStudents();
	        return new ResponseEntity<List<Student>>(student, HttpStatus.OK);
	    }
	 
	 @GetMapping("/Student/getStudentsByEdu/{seduc}")
	 public ResponseEntity<List<Student>> getStudentsByEdu(@PathVariable("seduc") String seduc) 
	 {
		    List<Student> studentsWithEducation = ss.getStudentbyseduc(seduc);
		    return new ResponseEntity<>(studentsWithEducation, HttpStatus.OK);
		}
	 
	 @GetMapping("/students/getStudentsByName/{sname}")
	    public ResponseEntity <List<Student>> getStudentsByName(@PathVariable String sname) 
	 {
		 List<Student> studentbyName = ss.getStudentbyName(sname);
		return new ResponseEntity <List<Student>> (studentbyName, HttpStatus.OK) ;
		 
	        
	    }
	 
	 
	

}
