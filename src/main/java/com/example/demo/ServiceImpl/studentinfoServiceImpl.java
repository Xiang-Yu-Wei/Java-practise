package com.example.demo.ServiceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Service.studentinfoService;
import com.example.demo.dao.StudentinfoMapper;
import com.example.demo.entity.Studentinfo;
import com.example.demo.entity.StudentinfoExample;

@Service
public class studentinfoServiceImpl implements studentinfoService {
    @Autowired
    private StudentinfoMapper studentinfoMapper;
   
    public List<Studentinfo> selectByExample(StudentinfoExample example){
    	return studentinfoMapper.selectByExample(example);
		
	}
    public List<Studentinfo> selectBygrade(String grade){
    	List<Studentinfo> selectBygrade = studentinfoMapper.selectBygrade(grade);
		Integer[] arr = {1};
		selectBygrade= selectBygrade.stream().peek(e->e.setRank(arr[0] ++)).collect(Collectors.toList());
    	return selectBygrade;
    }
    public List<Studentinfo> selectMarkByID(Integer ID){
    	List<Studentinfo> selectMarkByID = studentinfoMapper.selectMarkByID(ID);
		Integer[] arr = {1};
		selectMarkByID= selectMarkByID.stream().peek(e->e.setRank(arr[0] ++)).collect(Collectors.toList());
		for(Studentinfo studentinfo : selectMarkByID) {
			 if (studentinfo.getID() == ID) {
				 System.out.println("你在"+studentinfo.getGrade()+"的排名是：第"+studentinfo.getRank()+"名。");
			}
		}
    	return selectMarkByID;
    }
    public List<Studentinfo> selectBysubject(String subject,String grade){
    	List<Studentinfo> selectBysubject = studentinfoMapper.selectBysubject(subject,grade);
		Integer[] arr = {1};
		selectBysubject= selectBysubject.stream().peek(e->e.setRank(arr[0] ++)).collect(Collectors.toList());
    	return selectBysubject;
    }
   public List<Studentinfo> selectMarkByID1(Integer ID,String subject){
    	
		List<Studentinfo> selectMarkByID1 = studentinfoMapper.selectMarkByID1(ID,subject);
		Integer[] arr = {1};
		selectMarkByID1= selectMarkByID1.stream().peek(e->e.setRank(arr[0] ++)).collect(Collectors.toList());
		for(Studentinfo studentinfo : selectMarkByID1) {
			 if (studentinfo.getID() == ID) {
				 System.out.println("你在"+studentinfo.getGrade()+"的"+studentinfo.getSubject()+"排名是：第"+studentinfo.getRank()+"名。");
			}
		}
		
    	return selectMarkByID1;
    }
	public int insert(Studentinfo record) {
		return studentinfoMapper.insert(record);
	}
	public int deleteByExample(StudentinfoExample example) {
		return studentinfoMapper.deleteByExample(example);
	}
	public  int updateByExampleSelective(@Param("record") Studentinfo record, @Param("example") StudentinfoExample example) {
		return studentinfoMapper.updateByExampleSelective(record, example);
	}
	
}
