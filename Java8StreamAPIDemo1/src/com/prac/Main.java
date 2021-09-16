package com.prac;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = Arrays.asList(4,3,2,3,2,6,6);
		
		System.out.println("Map");
		List<Integer> sqnumbers = numbers.stream().map((x)->x*x).collect(Collectors.toList());
		System.out.println(sqnumbers);
		
		System.out.println("filter");
		List<String> slist = Arrays.asList("Seelk","Ad","sss","Solid");
		System.out.println(slist.stream()
				.filter((s)->s.startsWith("S"))
				.collect(Collectors.toList()));
		
		System.out.println("sort");
		System.out.println(slist
				.stream()
				.sorted()
				.collect(Collectors.toList()));
		System.out.println("Collect as Set");
		System.out.println(numbers
				.stream()
				.map((x)->x*x)
				.collect(Collectors.toSet()));
		System.out.println("foEach");
		numbers
		.stream()
		.forEach(x->System.out.print(x+" "));
		System.out.println();
		System.out.println("reduce");
		System.out.println(numbers
				.stream()
				.filter(x->x%2==0)
				.reduce(0,(ans,i)->ans+i));
		
	}

}
