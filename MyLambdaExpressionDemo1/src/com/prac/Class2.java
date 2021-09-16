package com.prac;

import java.util.function.Predicate;

public class Class2 implements Predicate<Object>{

	//the arg in <> is theparameter test takes and its pred so return type is boolean
	@Override
	public boolean test(Object t) {
		return (Integer)t<18;
	}
	
}
