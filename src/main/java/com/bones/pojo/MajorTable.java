package model;
import java.util.HashSet;
import java.util.Set;

public class MajorTable {
	private int mid;
	private String majorname;
	private Set students = new HashSet();
	
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMajorname() {
		return majorname;
	}
	public void setMajorname(String majorname) {
		this.majorname = majorname;
	}
	public Set getStudents() {
		return students;
	}
	public void setStudents(Set students) {
		this.students = students;
	}
	
	
}
