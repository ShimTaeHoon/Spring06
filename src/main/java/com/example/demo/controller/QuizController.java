package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/method/q")
@Controller
public class QuizController {

	@ResponseBody
	@GetMapping
	public String list() {
		System.out.println("get방식");
		return "get";
	}

	@ResponseBody
	@PostMapping
	public String save() {
		System.out.println("post방식");
		return "post";
	}
	
	@ResponseBody
	@PutMapping
	public String modify() {
		System.out.println("put방식");
		return "put";
	}
	
	@ResponseBody
	@DeleteMapping
	public String remove() {
		System.out.println("delete방식");
		return "delete";
	}
	
}
