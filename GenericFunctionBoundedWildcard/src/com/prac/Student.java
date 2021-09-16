package com.prac;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Student implements Comparable<Student>{

	private int id;
	private String name;
	private int marks;
	
	@Override
	public int compareTo(Student s) {
		if(marks>s.marks)
			return 1;
		else {
			if(marks==s.marks)
				return 0;
			else
				return -1;
		}
	}
	
	
	
}
