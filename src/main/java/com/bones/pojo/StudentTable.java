package model;

import java.util.HashSet;
import java.util.Set;

public class StudentTable {
	private Integer sid;
	private String name;
	private Integer gender;
	private String birthday;
	private Integer credit;
	private String remarks;
	private MajorTable major;
	private UserTable user;
	private Set courses= new HashSet();
	
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public Integer getCredit() {
		return credit;
	}
	public void setCredit(Integer credit) {
		this.credit = credit;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	public MajorTable getMajor() {
		return major;
	}
	public void setMajor(MajorTable major) {
		this.major = major;
	}
	public UserTable getUser() {
		return user;
	}
	public void setUser(UserTable user) {
		this.user = user;
	}
	public Set getCourses() {
		return courses;
	}
	public void setCourses(Set courses) {
		this.courses = courses;
	}
}
