package com.prac;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class CharImplementation implements CharSequence {

	@Getter
	private String s;
	
	@Override
	public int length() {
		// TODO Auto-generated method stub
		
		return s.length();
	}

	@Override
	public char charAt(int index) {
		// TODO Auto-generated method stub
		if(index<0 || index>=s.length())
			throw new StringIndexOutOfBoundsException(index);
		else
			return s.charAt(s.length()-index-1);
	}

	@Override
	public CharSequence subSequence(int start, int end) {
		// TODO Auto-generated method stub
		
		if(start<0)
			throw new StringIndexOutOfBoundsException(start);
		else if(end>=s.length())
			throw new StringIndexOutOfBoundsException(end);
		else if(start>end)
			throw new StringIndexOutOfBoundsException(start-end);

		StringBuffer str = new StringBuffer(s.subSequence(s.length()-end-1, s.length()-start));
		return str.reverse();
		
	}

	@Override
	public String toString() {
		StringBuilder str= new StringBuilder(s);
		return str.reverse().toString();
	}
	
	
	
}
