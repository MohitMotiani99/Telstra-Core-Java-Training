package com.prac.model.ppack;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Book {
	
	
	private int bookId;
	private String bookName;
	private int bookPrice;
	private int units;
	
	
	
}
