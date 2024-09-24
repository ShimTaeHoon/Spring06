//package com.example.demo.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//// 컨트롤러의 역할: 사용자 요청 처리
//
//@Controller // 컨트롤러 표시 + 빈등록
//public class MappingController1 {
//	
//	//주소와 메소드
////	@RequestMapping(value = "/board", method = RequestMethod.GET)
//	@ResponseBody // 메세지 바디에 데이터를 직접 담는 기능
//	@GetMapping("/board") // 축약된 어노테이션 // GET + /board
//	public String list() {
//		System.out.println("게시물 조회..");
//		return "ok"; // /template/ok.html(@responsebody없을때) <> 
//						 ok라는 텍스트가 담김(@ResponseBody사용시)
//	}
//	
//	// 스프링부트는 기본적으로 템플릿 파일을 반환한다
//	// 순수한 데이터를 반환할때는 @ResponseBody 어노테이션을 설정해야한다
//	
////	@RequestMapping(value = "/board", method = RequestMethod.POST)
//	// HTTP 메소드 종류가 다르면 url이 같아도 중복 아님
//	// POST + /board
//	@ResponseBody
//	@PostMapping("/board")
//	public String save() {
//		
//		System.out.println("게시물 등록..");
//		return "ok";
//	}
//	
//	// 주소: PUT + /board
//	@ResponseBody
//	@PutMapping("/board")
//	public String modify() {
//		
//		System.out.println("게시물 수정..");
//		return "ok";
//		
//	}
//	
//	@ResponseBody
//	@DeleteMapping("/board")
//	public String remove() {
//		System.out.println("게시물 삭제..");
//		return "ok";
//	}
//	
//}
