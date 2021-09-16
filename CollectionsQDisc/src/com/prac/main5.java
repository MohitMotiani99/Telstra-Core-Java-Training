package com.prac;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class main5 {
	private String name;
	public static void takeList(List<? extends Number> list) {
		//list.add(4);
		//list = new ArrayList<Number>();
		Number n = list.get(0);
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		main5 other = (main5) obj;
		return Objects.equals(name, other.name);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
