package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dto.CarDTO;
import com.example.demo.dto.StudentDTO;

@RequestMapping("/param")
@Controller
// 모든 메소드가 JSON형식으로 응답을 반환함 (@ResponseBody)를 위로올려줌 공통이라
@ResponseBody
public class QuizController2 {

//	@ResponseBody
	@GetMapping("/q1")
	public String strGet(@RequestParam(name = "str") String str) {
		System.out.println("String타입 파라미터 수집: " + str);
		return "String 수집완료"; 
	}
	
//	@ResponseBody
	@GetMapping("/q2")
	public String floatGet(@RequestParam(name = "flo") float flo,
						   @RequestParam(name = "bool") boolean bool) {
		System.out.println("float타입 파라미터 수집: " + flo + ", boolean타입 파라미터 수집: " + bool);
		return "실수형, 논리형 수집완료"; 
	}
	
//	@ResponseBody
	@GetMapping("/q3")
	public String charGet(@RequestParam(name = "cha") char[] cha) {
		System.out.println("char형 배열 수집: " + Arrays.toString(cha));
		
		for(int i = 0; i < cha.length; i++) {
			System.out.println(cha[i]);
		}
		
		System.out.println("배열의 개수: " + cha.length);
		return "문자열 배열 수집완료";
	}
	
	//4,5,6번: 복잡한 파라미터는 메세지 바디에 데이터를 담을 것
	//@RequestBody 사용하여 JSON형식의 문자열을 클래스로 변환
//	@ResponseBody
	@PostMapping("/q4")
	public String stuGet(@RequestBody StudentDTO stu) {
		System.out.println("객체 수집: " + stu);
		return "학생정보DTO 수집완료";
	}
	
//	JSON에서 객체는 {} 리스트는 []로 작성
//	@ResponseBody
	@PostMapping("/q5")					//전달받은 data가 인스턴스로 생성되기에 구현체로 선언해야함
	public String stuList(@RequestBody ArrayList<StudentDTO> stu) {
		System.out.println("객체타입 리스트 수집: "+ stu);
		for(StudentDTO dto : stu) {
			System.out.println(dto);	
		}
		System.out.println("리스트의 개수: " + stu.size());
		return "학생정보list 수집완료";
	}
	
//	@ResponseBody
	@PostMapping("/q6")
	public String carList(@RequestBody ArrayList<CarDTO> car) {
		System.out.println("객체타입 리스트 수집: " + car);
		for(CarDTO carList : car) {
			System.out.println(carList);
		}
//		int size = car.size();
//		System.out.println(car.get(size-1));
		
		System.out.println("리스트 마지막 요소: " + car.get(car.size()-1));
		System.out.println("리스트 첫번째 요소: " + car.get(0));
		return "자동차list 수집완료";
	}
	
}
