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
public class MajorTable implements Serializable {
	private int mid;
	private String majorname;
	private Set students = new HashSet();
}
