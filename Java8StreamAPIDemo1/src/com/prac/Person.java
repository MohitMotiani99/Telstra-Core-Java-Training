package com.prac;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Person {
	private int pId;
	private int age;
	private String email;
	private String gender;
	private String city;
	
	
}
