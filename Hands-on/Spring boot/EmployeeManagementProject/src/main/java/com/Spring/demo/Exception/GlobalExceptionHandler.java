package com.Spring.demo.Exception;

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
	@ExceptionHandler(EmployeeIdNotFoundException.class)
	public ResponseEntity<ErrorMessage> handleEmployeeException(EmployeeIdNotFoundException ex, WebRequest request)
	{
		ErrorMessage em=new ErrorMessage(HttpStatus.NOT_FOUND,ex.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(em);
	}
	
	@ExceptionHandler(DepartmentIdNotFoundException.class)
	public ResponseEntity<ErrorMessage> handleDepartmentException(DepartmentIdNotFoundException ex, WebRequest request)
	{
		ErrorMessage em=new ErrorMessage(HttpStatus.NOT_FOUND,ex.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(em);
	}
	
	@ExceptionHandler(ManagerIdNotFoundException.class)
	public ResponseEntity<ErrorMessage> handleManagerIdNotFoundException(ManagerIdNotFoundException ex, WebRequest request)
	{
		ErrorMessage em=new ErrorMessage(HttpStatus.NOT_FOUND,ex.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(em);
	}
	
	@ExceptionHandler(UserIdNotFoundException.class)
	public ResponseEntity<ErrorMessage> handleUserIdNotFoundException(UserIdNotFoundException ex, WebRequest request)
	{
		ErrorMessage em=new ErrorMessage(HttpStatus.NOT_FOUND,ex.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(em);
	}
	
	@ExceptionHandler(RoleIdNotFoundException.class)
	public ResponseEntity<ErrorMessage> handleRoleIdNotFoundException(RoleIdNotFoundException ex, WebRequest request)
	{
		ErrorMessage em=new ErrorMessage(HttpStatus.NOT_FOUND,ex.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(em);
	}
	
	@ExceptionHandler(LeaveIdNotFoundException.class)
	public ResponseEntity<ErrorMessage> handleLeaveIdNotFoundException(LeaveIdNotFoundException ex, WebRequest request)
	{
		ErrorMessage em=new ErrorMessage(HttpStatus.NOT_FOUND,ex.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(em);
	}
	
	@ExceptionHandler(AdminNotFoundException.class)
	public ResponseEntity<ErrorMessage> handleAdminNotFoundException(AdminNotFoundException ex, WebRequest request)
	{
		ErrorMessage em=new ErrorMessage(HttpStatus.NOT_FOUND,ex.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(em);
	}
	
	@ExceptionHandler(HolidayListNotFoundException.class)
	public ResponseEntity<ErrorMessage> handleHolidayListNotFoundException(HolidayListNotFoundException ex, WebRequest request)
	{
		ErrorMessage em=new ErrorMessage(HttpStatus.NOT_FOUND,ex.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(em);
	}
	
	
	
}