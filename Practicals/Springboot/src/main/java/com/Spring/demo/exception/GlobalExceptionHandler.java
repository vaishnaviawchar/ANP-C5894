package com.Spring.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@ResponseStatus
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler
{
	@ExceptionHandler(TeacherIdNotFoundException.class)
	public ResponseEntity<ErrorMessage> handleTeacherException(TeacherIdNotFoundException ex, WebRequest request)
	{
		ErrorMessage em=new ErrorMessage(HttpStatus.NOT_FOUND,ex.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(em);
	}
	
	@ExceptionHandler(StudentIdNotFoundException.class)
	public ResponseEntity<ErrorMessage> handleStudentException(StudentIdNotFoundException ex, WebRequest request)
	{
		ErrorMessage em =new ErrorMessage(HttpStatus.NOT_FOUND, ex.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(em);
	}
	
	@ExceptionHandler(DepartmentIdNotFoundException.class)
	public ResponseEntity<ErrorMessage> handleDepartmentException(DepartmentIdNotFoundException ex, WebRequest request)
	{
		ErrorMessage em =new ErrorMessage(HttpStatus.NOT_FOUND, ex.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(em);
	}
	
	@ExceptionHandler(CourseIdNotFoundException.class)
	public ResponseEntity<ErrorMessage> handleCourseException(CourseIdNotFoundException ex, WebRequest request)
	{
		ErrorMessage em =new ErrorMessage(HttpStatus.NOT_FOUND, ex.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(em);
	}
	
	@ExceptionHandler(BatchIdNotFoundException.class)
	public ResponseEntity<ErrorMessage> handleBatchException(BatchIdNotFoundException ex, WebRequest request)
	{
		ErrorMessage em =new ErrorMessage(HttpStatus.NOT_FOUND, ex.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(em);
	}
	
	
}
