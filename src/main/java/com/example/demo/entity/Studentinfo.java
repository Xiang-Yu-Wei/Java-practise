package com.example.demo.entity;

public class Studentinfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column studentinfo.ID
     *
     * @mbggenerated Sun Feb 21 21:57:23 CST 2021
     */
    private Integer ID;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column studentinfo.Name
     *
     * @mbggenerated Sun Feb 21 21:57:23 CST 2021
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column studentinfo.grade
     *
     * @mbggenerated Sun Feb 21 21:57:23 CST 2021
     */
    private String grade;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column studentinfo.classnumber
     *
     * @mbggenerated Sun Feb 21 21:57:23 CST 2021
     */
    private String classnumber;
   
    
  
  
   
    private Integer Rank;
   
  
 
    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column studentinfo.ID
     *
     * @return the value of studentinfo.ID
     *
     * @mbggenerated Sun Feb 21 21:57:23 CST 2021
     */
    public Integer getID() {
        return ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column studentinfo.ID
     *
     * @param ID the value for studentinfo.ID
     *
     * @mbggenerated Sun Feb 21 21:57:23 CST 2021
     */
    public void setID(Integer ID) {
        this.ID = ID;
    }

    
    
    
    
    
    public Integer getRank() {
        return Rank;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column studentinfo.ID
     *
     * @param ID the value for studentinfo.ID
     *
     * @mbggenerated Sun Feb 21 21:57:23 CST 2021
     */
    public void setRank(Integer Rank) {
        this.Rank = Rank;
    }
    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column studentinfo.Name
     *
     * @return the value of studentinfo.Name
     *
     * @mbggenerated Sun Feb 21 21:57:23 CST 2021
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column studentinfo.Name
     *
     * @param name the value for studentinfo.Name
     *
     * @mbggenerated Sun Feb 21 21:57:23 CST 2021
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column studentinfo.grade
     *
     * @return the value of studentinfo.grade
     *
     * @mbggenerated Sun Feb 21 21:57:23 CST 2021
     */
    public String getGrade() {
        return grade;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column studentinfo.grade
     *
     * @param grade the value for studentinfo.grade
     *
     * @mbggenerated Sun Feb 21 21:57:23 CST 2021
     */
    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column studentinfo.classnumber
     *
     * @return the value of studentinfo.classnumber
     *
     * @mbggenerated Sun Feb 21 21:57:23 CST 2021
     */
    public String getClassnumber() {
        return classnumber;
    }
    
    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column studentinfo.classnumber
     *
     * @param classnumber the value for studentinfo.classnumber
     *
     * @mbggenerated Sun Feb 21 21:57:23 CST 2021
     */
    public void setClassnumber(String classnumber) {
        this.classnumber = classnumber == null ? null : classnumber.trim();
    }
    
    private String subject;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column studentmark.s_id
     *
     * @mbggenerated Sun Feb 21 23:33:25 CST 2021
     */
    private Integer s_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column studentmark.Mark
     *
     * @mbggenerated Sun Feb 21 23:33:25 CST 2021
     */
    private Integer mark;
    
    

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column studentmark.Subject
     *
     * @return the value of studentmark.Subject
     *
     * @mbggenerated Sun Feb 21 23:33:25 CST 2021
     */
    public String getSubject() {
        return subject;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column studentmark.Subject
     *
     * @param subject the value for studentmark.Subject
     *
     * @mbggenerated Sun Feb 21 23:33:25 CST 2021
     */
    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column studentmark.s_id
     *
     * @return the value of studentmark.s_id
     *
     * @mbggenerated Sun Feb 21 23:33:25 CST 2021
     */
    public Integer getS_id() {
        return s_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column studentmark.s_id
     *
     * @param s_id the value for studentmark.s_id
     *
     * @mbggenerated Sun Feb 21 23:33:25 CST 2021
     */
    public void setS_id(Integer s_id) {
        this.s_id = s_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column studentmark.Mark
     *
     * @return the value of studentmark.Mark
     *
     * @mbggenerated Sun Feb 21 23:33:25 CST 2021
     */
    public Integer getMark() {
        return mark;
    }
    
    
    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column studentmark.Mark
     *
     * @param mark the value for studentmark.Mark
     *
     * @mbggenerated Sun Feb 21 23:33:25 CST 2021
     */
    public void setMark(Integer mark) {
        this.mark = mark;
        
    }
    @Override
    public String toString() {
    
    	
   	return  "成绩信息 [姓名:" + name + ",班级:" + classnumber + ",年纪:" + grade +",学号："+ID + ",学科："+ subject +",分数: "+mark + ",排名：" + Rank+ "]";
		
	}
}