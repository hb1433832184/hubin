package com.szrt.java.lesson161226.hb;

public class AddDemo04 {
	
	public static void main(String[] args) {
		
		double sum;
		double x=1.5;
		double y=2.5;
		double z=3.5;
		sum = add(x, y, z);
		System.out.println(sum);
		
	}

	private static double add(double x, double y, double z) {
		double sum;
		sum=x+y+z;
		return sum;
	}


}
