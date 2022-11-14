package com.bones.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentTable implements Serializable {
	private Integer sid;
	private String name;
	private Integer gender;
	private String birthday;
	private Integer credit;
	private String remarks;
	private MajorTable major;
	private UserTable user;
	private Set courses= new HashSet();
}
