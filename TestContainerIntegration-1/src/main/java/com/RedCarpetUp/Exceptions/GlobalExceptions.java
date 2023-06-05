package com.RedCarpetUp.Exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalExceptions {

	@ExceptionHandler(Exception.class)
	public static ResponseEntity<MyErrotDetails> allExceptionsHandler(Exception e,WebRequest web){
		MyErrotDetails errotDetails = new MyErrotDetails();
		errotDetails.setDateStamp(LocalDateTime.now());
		errotDetails.setMessage(e.getMessage());
		errotDetails.setDesc(web.getDescription(true));
		
		return new ResponseEntity<>(errotDetails,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public static ResponseEntity<MyErrotDetails> noHandlerExceptionsHandler(NoHandlerFoundException e,WebRequest web){
		MyErrotDetails errotDetails = new MyErrotDetails();
		errotDetails.setDateStamp(LocalDateTime.now());
		errotDetails.setMessage(e.getMessage());
		errotDetails.setDesc(web.getDescription(true));
		
		return new ResponseEntity<>(errotDetails,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public static ResponseEntity<MyErrotDetails> methodArgumentNotValidExceptionHanlder(MethodArgumentNotValidException e,WebRequest web){
		MyErrotDetails errotDetails = new MyErrotDetails();
		errotDetails.setDateStamp(LocalDateTime.now());
		errotDetails.setMessage(e.getMessage());
		errotDetails.setDesc(web.getDescription(true));
		
		return new ResponseEntity<>(errotDetails,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(StudentExceptions.class)
	public static ResponseEntity<MyErrotDetails> studentExceptionHandler(StudentExceptions e,WebRequest web){
		MyErrotDetails errotDetails = new MyErrotDetails();
		errotDetails.setDateStamp(LocalDateTime.now());
		errotDetails.setMessage(e.getMessage());
		errotDetails.setDesc(web.getDescription(true));
		
		return new ResponseEntity<>(errotDetails,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(AddressExceptions.class)
	public static ResponseEntity<MyErrotDetails> addresExceptionHandler(AddressExceptions e,WebRequest web){
		MyErrotDetails errotDetails = new MyErrotDetails();
		errotDetails.setDateStamp(LocalDateTime.now());
		errotDetails.setMessage(e.getMessage());
		errotDetails.setDesc(web.getDescription(true));
		
		return new ResponseEntity<>(errotDetails,HttpStatus.BAD_REQUEST);
	}
	
}
