package com.onito.Exceptions;

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
	public ResponseEntity<MyErrorDetails> mainException(Exception ex,WebRequest web){
		
		MyErrorDetails errorDetails = new MyErrorDetails();
		errorDetails.setLct(LocalDateTime.now());
		errorDetails.setDesc(web.getDescription(false));
		errorDetails.setMessage(ex.getMessage());
		
		return new ResponseEntity<>(errorDetails,HttpStatus.BAD_GATEWAY);
		
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<MyErrorDetails> noArgumentExceptionHandler(MethodArgumentNotValidException ex,WebRequest web){
		
		MyErrorDetails errorDetails = new MyErrorDetails();
		errorDetails.setLct(LocalDateTime.now());
		errorDetails.setDesc(web.getDescription(false));
		errorDetails.setMessage(ex.getMessage());
		
		return new ResponseEntity<>(errorDetails,HttpStatus.BAD_GATEWAY);
		
	}
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<MyErrorDetails> noHandlerException(NoHandlerFoundException ex,WebRequest web){
		
		MyErrorDetails errorDetails = new MyErrorDetails();
		errorDetails.setLct(LocalDateTime.now());
		errorDetails.setDesc(web.getDescription(false));
		errorDetails.setMessage(ex.getMessage());
		
		return new ResponseEntity<>(errorDetails,HttpStatus.BAD_GATEWAY);
		
	}
	
	
	@ExceptionHandler(MovieExceptions.class)
	public ResponseEntity<MyErrorDetails> movieExceptionHandler(MovieExceptions ex,WebRequest web){
		
		MyErrorDetails errorDetails = new MyErrorDetails();
		errorDetails.setLct(LocalDateTime.now());
		errorDetails.setDesc(web.getDescription(false));
		errorDetails.setMessage(ex.getMessage());
		
		return new ResponseEntity<>(errorDetails,HttpStatus.BAD_GATEWAY);
		
	}
	
	@ExceptionHandler(RatingExceptions.class)
	public ResponseEntity<MyErrorDetails> ratingExceptionHandler(RatingExceptions ex,WebRequest web){
		
		MyErrorDetails errorDetails = new MyErrorDetails();
		errorDetails.setLct(LocalDateTime.now());
		errorDetails.setDesc(web.getDescription(false));
		errorDetails.setMessage(ex.getMessage());
		
		return new ResponseEntity<>(errorDetails,HttpStatus.BAD_GATEWAY);
		
	}
	
}
