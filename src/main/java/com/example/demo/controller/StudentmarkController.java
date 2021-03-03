package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.StudentmarkMapper;
import com.example.demo.entity.Studentmark;
import com.example.demo.entity.StudentmarkExample;

@RestController
@RequestMapping("/StudentmarkMapper")
public class StudentmarkController {
	@Autowired
	private StudentmarkMapper studentmarkMapper;
	
	@RequestMapping("/select")
	 
	 List<Studentmark> selectByExample(StudentmarkExample example){
	    	return studentmarkMapper.selectByExample(example);

		}
}
