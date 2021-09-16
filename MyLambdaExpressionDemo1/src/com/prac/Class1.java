package com.prac;

import java.util.function.Function;

public class Class1 implements Function<Integer, Long>{

	//first is return type and the second is parameter type for apply fun
	@Override
	public Long apply(Integer t) {
		// TODO Auto-generated method stub
		Long res = t+15L;
		return res;
	}
	
	public Long apply2(Integer t) {
		return (long)t+10;
	}

}
//Function<T,U> is an already defined one arg fun with areturn
//BiFunction<T,U,V> is a 2 arg fun 
// and many more are defied in java
//this class should not contain more than 1 function else the lambda expr cant match the args

// no prob definifn another method here but it wont be accessible
//also if there is no apply with the absolutely same parameters goven when class implements it
		//then compile time error as ee need to implement the correct apply