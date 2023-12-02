package com.autoproject.globalexception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.autoproject.Exception.PriceNotFoundException;

@RestControllerAdvice
public class GlobalException {
	@ExceptionHandler(PriceNotFoundException.class)
	public ResponseEntity<Object> globalHanding() {
		return new ResponseEntity<>("This is so costly", HttpStatus.BAD_REQUEST);
	}
}
