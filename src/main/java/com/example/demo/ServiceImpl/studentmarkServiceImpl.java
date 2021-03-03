package com.example.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentmarkMapper;
import com.example.demo.entity.Studentmark;
import com.example.demo.entity.StudentmarkExample;
@Service
public class studentmarkServiceImpl {
	 @Autowired
	 private StudentmarkMapper studentmarkMapper;
	 List<Studentmark> selectByExample(StudentmarkExample example){
	    	return studentmarkMapper.selectByExample(example);
			
		}
}
