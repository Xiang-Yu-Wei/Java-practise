package com.example.demo.Service;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.example.demo.entity.Studentinfo;
import com.example.demo.entity.StudentinfoExample;

public interface studentinfoService {
   
   //增删改查
    public int insert(Studentinfo record);
	public int deleteByExample(StudentinfoExample example) ;
	public int updateByExampleSelective(@Param("record") Studentinfo record, @Param("example") StudentinfoExample example);
	public List<Studentinfo> selectByExample(StudentinfoExample example);
	
   //根据年级总分进行排名并输出
    public List<Studentinfo> selectBygrade(String grade);
    
    //根据学号查询到自己所在年级中总分排名第几
    public List<Studentinfo> selectMarkByID(Integer ID);
    
    //根据年级学科进行排名并输出
    public List<Studentinfo> selectBysubject(String subject,String grade);
    
    //根据学号查询到自己所在年级中按学科分别排名第几
    public List<Studentinfo> selectMarkByID1(Integer ID,String subject);
	
}
