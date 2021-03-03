package com.example.demo.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.studentinfoService;
import com.example.demo.dao.StudentinfoMapper;
import com.example.demo.entity.Studentinfo;
import com.example.demo.entity.StudentinfoExample;

@RestController
@RequestMapping("/StudentinfoMapper")

public class StudentinfoController  {
	@Autowired
	private StudentinfoMapper studentinfoMapper;
	@Autowired
	private studentinfoService studentinfoService;
	@RequestMapping("/select")
	 List<Studentinfo> selectByExample(StudentinfoExample example){
    	return studentinfoMapper.selectByExample(example);

	}
	@RequestMapping(value = "/selectByGrade/{grade}",method = RequestMethod.GET,produces = "application/json")
	public List<Studentinfo> selectBygrade(@PathVariable String grade){
		
		return studentinfoService.selectBygrade(grade);
	}
	@RequestMapping(value = "/selectMarkBySubject/{ID}/{subject}",method = RequestMethod.GET,produces = "application/json")
	public  List<Studentinfo> selectMarkByID1(@PathVariable Integer ID,@PathVariable String subject){
	    return studentinfoService.selectMarkByID1(ID,subject);
}
	
	@RequestMapping(value = "/selectMarkByID/{ID}",method = RequestMethod.GET,produces = "application/json")
	public   List<Studentinfo> selectMarkByID(@PathVariable Integer ID){
    	return studentinfoService.selectMarkByID(ID);
    }
	
	@RequestMapping(value = "/selectBySubject/{subject}/{grade}",method = RequestMethod.GET,produces = "application/json")
	List<Studentinfo> selectBysubject(@PathVariable String subject,@PathVariable String grade){
		return studentinfoService.selectBysubject(subject,grade);
	}
	 @RequestMapping("/insert")
	 public int insert(Studentinfo record) {
			return studentinfoMapper.insert(record);
		} 
	 @RequestMapping("/delete")
	 public  int deleteByExample(StudentinfoExample example) {
		 return studentinfoMapper.deleteByExample(example);
	 }
	 @RequestMapping("/update")
	 public  int updateByExampleSelective(@Param("record") Studentinfo record, @Param("example") StudentinfoExample example) {
		 return studentinfoMapper.updateByExampleSelective(record, example);
	 }
}
