package com.prac;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyFunction myfun = (n1,n2)->{return n1+n2;};
		int res = myfun.apply2(10, 30);
		System.out.println(res);
		
		System.out.println("using anonymous Interface");
		
		System.out.println(new MyFunction() {
			
			@Override
			public int apply2(int n1, int n2) {
				return n1+n2;			
			}
		}.apply2(20, 40));
		System.out.println("Anonymous Interface insode SYSO");
		
		System.out.println(new MyFunctionAn() {
			
			@Override
			public int sub(int a, int b) {
				// TODO Auto-generated method stub
				return a+b;
			}
			
			@Override
			public int add(int a, int b) {
				// TODO Auto-generated method stub
				return a-b;
			}
		}.add(34, 44));
		System.out.println("Anonymous Interface Objectly");
		MyFunctionAn impl = new MyFunctionAn() {
			
			@Override
			public int sub(int a, int b) {
				// TODO Auto-generated method stub
				return a+b;
			}
			
			@Override
			public int add(int a, int b) {
				// TODO Auto-generated method stub
				return a-b;
			}
		};
		System.out.println(impl.add(40, 20));
		System.out.println(impl.sub(40, 30));
		
		System.out.println("Anonymous Interface with parent interface ref and child interface object");
		
		MyFunctionAn i2= new MyFunctionAnC() {
			
			@Override
			public int sub(int a, int b) {
				// TODO Auto-generated method stub
				return a-b;
			}
			
			@Override
			public int add(int a, int b) {
				// TODO Auto-generated method stub
				return a+b;
			}

			@Override
			public int mult(int a, int b) {
				// TODO Auto-generated method stub
				return a*b;
			}
		};
		
		System.out.println(i2.add(30, 60));
		//works
		//System.out.println(i2.mul);
		// not possible bcoz referefnce of base interface and that does not have this fun
		
		
		MyFunctionAnC i3 = new MyFunctionAnC() {
			
			@Override
			public int sub(int a, int b) {
				// TODO Auto-generated method stub
				return a-b;
			}
			
			@Override
			public int add(int a, int b) {
				// TODO Auto-generated method stub
				return a+b;
			}

			@Override
			public int mult(int a, int b) {
				// TODO Auto-generated method stub
				return a*b;
			}
		};
		
		System.out.println(i3.mult(2, 4));
//		MyFunctionAnC i4 = (MyFunctionAnC) new MyFunctionAn() {
//			
//			@Override
//			public int sub(int a, int b) {
//				// TODO Auto-generated method stub
//				return a+b;
//			}
//			
//			@Override
//			public int add(int a, int b) {
//				// TODO Auto-generated method stub
//				return a-b;
//			}
//		};
//		
		//System.out.println(i4.add(5,6));
		// for some reason cant cast a parent interface impl to child one,may be bcoz
		//it may have extra funs,other way round possibele .
		
		
		System.out.println("Implementing Standard Functional Interface");
		
		//Class that implements a Functional Inteface Function<T,U> 
		Function<Integer,Long> f1 = new Class1();
		System.out.println(f1.apply(4));
		//System.out.println(f1.apply2(4));//cant access anything else than apply bcoz that not in its interface
		//if we make class ref var then we can obv
		
		//assigning the params like we did above 
		Function<Integer, Long> f2 = (n)->(long)n+3;
		System.out.println(f2.apply(10));
		
		System.out.println("Predicates");
		
		Predicate<Object> fp = new Class2();
		System.out.println(fp.test(20));
		
		System.out.println("Lambda predicates");
		Predicate<Double> fp2 =(d)->d<100;
		Predicate<Double> fp3 =(d)->d>=75;
		
		System.out.println(fp2.test(45.5));
		
		//.and .or .negate
		if(fp2.and(fp3).test(66.99))
			System.out.println("True tested");
		else
			System.out.println("False tested");
	
		
		Predicate<Reversenum> pfrevnum =(revnum) ->revnum.getN()==revnum.getRevnum();
		System.out.println("is pal? "+pfrevnum.test(new Reversenum(121)));
		//the arg parameter is ame tupe as type given to predicate
		
		
		Predicate<String> pf5 = (s)->s.contains("A");
		Predicate<String> pf6 = (s)->s.equalsIgnoreCase("admin");
		
		//works same as && or || or ! respectively
		System.out.println(pf5.and(pf6).test("admin"));
			
		
		if(pf5.test("Admin") && pf6.test("Admin"))
			System.out.println("Correct");
		//can use normal logical ops with th eresults of test
		
		System.out.println("Passing predicates as argumenets to funs");
		
		Predicate<User> pfuser =(u)->u.getRole().equalsIgnoreCase("admin");
		
		ArrayList<User> ulist = new ArrayList<User>();
		ulist.add(new User(10,"XXX","Admin"));
		ulist.add(new User(20,"XXX","member"));
		ulist.add(new User(30,"XXX","ADMIN"));
		ulist.add(new User(40,"XXX","member"));
		ulist.add(new User(50,"XXX","ADmiN"));

		
		ArrayList<User> alist = getAdmins(ulist,pfuser);
		System.out.println(alist);
		
		
		Function<Integer,Integer> mul =(val)->val*2;
		Function<Integer, Integer> add = (val)->val+3;
		
		System.out.println("testing compose for combining Function<>");
		System.out.println(mul.compose(add).apply(4));
		//applies the inner fun cfirst to input and to the result the outer
		System.out.println("testing the andThen ");
		System.out.println(mul.andThen(add).apply(4));;
		//applies outer first to inp then inner to res
		
		
		
		
		System.out.println("Unary Operator");
		//when the arg and return type are of same type
		UnaryOperator<Integer> xor1 = (a)->a^1;
		System.out.println(xor1.apply(2));
		//also has the compose and the addThen ,every fun interface has these
		
		Predicate<Integer> fp4 = (i)->i>10;
		System.out.println(isGreater(15,fp4));
		//primitive types have the baility of autoboxing
	}
	
	public static ArrayList<User> getAdmins(ArrayList<User> ulist,Predicate<User> p){
		ArrayList<User> alist = new ArrayList<User>();
		
		for(User u:ulist) {
			if(p.test(u))
				alist.add(u);
		}
		return alist;
	}
	
	//these <> alwaays take classes never primitive types
	public static boolean isGreater(int n,Predicate<Integer> p) {
		return p.test(n);
	}

}

//Observations

//1. myfun = lambda expr works only when 1 func def in interface without any annotation
//2. if we mark interface as funcTnterface it then makes it compuslsory to have only 
	//only one non default fun
//Anonymous interface work
