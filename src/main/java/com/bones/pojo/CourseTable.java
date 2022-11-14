package com.bones.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseTable implements Serializable {
	private int cid;
	private String name;
	private int semester;
	private int stunum;
	private int credit;
	private Set students = new HashSet();
}
