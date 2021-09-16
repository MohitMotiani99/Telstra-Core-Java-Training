package com.scjp;

public class Main24 {
	
	public enum Color{
		RED(0xff0000),GREEN(0x00ff00),BLUE(0x0000ff);
		private final int rgb;
		Color(int rgb){
			this.rgb=rgb;
		}
		public int getRGB() {
			return rgb;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Color t = Color.GREEN;
		System.out.println(t);
		
		Short s =15;
		Boolean b = (s instanceof Number);
		
		//Color p = new Color(0xff00ff);
		
		//Color p = Color.BLUE + Color.RED;
	}

}
