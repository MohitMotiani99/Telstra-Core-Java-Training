package com.prac;

public enum CustomEnum {

	MR("Mr."),MRS("Mrs."),MS("Ms.");
	private final String title;
	private CustomEnum(String t) {
		title=t;
	}
	public String format(String last,String first) {
		return title+" "+first+" "+last;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(CustomEnum.MR.format("Mitch", "Jones"));
	}

}
