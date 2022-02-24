package com.example.demo.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(NullPointerException.class)
	public String SpringLogExpetionHandler() {
		
		return "global nullpointer exception " + new NullPointerException();
	}

}
