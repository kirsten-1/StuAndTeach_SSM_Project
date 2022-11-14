package com.bones.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserTable implements Serializable {
	private int id;
	private String username;
	private String password;
	private StudentTable student;
}
