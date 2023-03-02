package com.spring.carebookie.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.carebookie.entity.BookTypeEntity;
import com.spring.carebookie.service.TestService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/test")
public class TestController {
	
	private TestService testService;
	
	@GetMapping("/get/bookTypes")
	public ResponseEntity<List<BookTypeEntity>> getAllBookTypes() {
		return ResponseEntity.ok(testService.getAllBookTypes());
	}

}
