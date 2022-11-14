package model;

public class UserTable {
	private int id;
	private String username;
	private String password;
	private StudentTable student;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public StudentTable getStudent() {
		return student;
	}

	public void setStudent(StudentTable student) {
		this.student = student;
	}

	
}
