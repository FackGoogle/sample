package com.example.demo.controller;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.MemberDto;

@RestController
public class HellowController {
	
	@RequestMapping(value = "/")
	public String hello() {
		System.out.println("핼로 컨트롤러 헬러"+new Date());
		return "헬로";
	}
	
	@RequestMapping(value="/member")
	public MemberDto getMembet() {
		System.out.println("헬로 컨트롤러 겟 멤버"+new Date());
		MemberDto dto = new MemberDto("aaa","000","aaa","aaa@naver.com",3);
		
		return dto;
	}
	
	@RequestMapping(value="/memberList")
	public List<MemberDto> getMembetList() {
		System.out.println("헬로 컨트롤러 겟 멤버리스트"+new Date());
		List<MemberDto> list = new ArrayList<MemberDto>();
		list.add(new MemberDto("aaa","000","aaa","aaa@naver.com",3));
		list.add(new MemberDto("bbb","111","bbb","bbb@naver.com",3));
		list.add(new MemberDto("ccc","222","ccc","ccc@naver.com",3));
		return list;
	}
}

