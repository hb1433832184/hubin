package com.szrt.java.lesson161226.hb;

public class FunDemo01 {
	
	public static void main(String[] args) {
		
		int sum = add(1,2);
		System.out.println(sum);
		int x = sum(1,10);
		System.out.println(x);
	}
	

	
	public static int add(int x,int y){
		int sum = x + y;
		return sum;
	}
	
	public static int sum(int begin,int end){
		
		int sum=0;
		for(begin=1;begin<=end;begin++){
			
			sum = sum+begin;
			
		}
		return sum;
	}

}
