package com.szrt.java.lesson161226.hb;

import java.util.Scanner;

public class Test02 {
	
	public static int add(int x,int y){
		
		return x+y;
	}
	public static int sub(int x,int y){
		
		return x-y;
	}
	public static int mul(int x,int y){
		
		return x*y;
	}
	public static int chu(int x,int y){
		
		return x/y;
	}
	public static int mo(int x,int y){
		
		return x%y;
	}
	
	public static void cal(int x,int y,String z ){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入第1个数：");
		x=sc.nextInt();
		System.out.println("请输入符号：");
		z=sc.next();
		System.out.println("请输入第1个数：");
		y=sc.nextInt();
		sc.close();
		int sum=0 ;
		if(z.equals("+")){
			
			sum=add(x,y);
			
		}else if(z.equals("-")){
			
			sum=sub(x,y);
			
		}else if(z.equals("*")){
			
			sum=mul(x,y);
			
		}else if(z.equals("/")){
			
			sum=chu(x,y);
			
		}else if(z.equals("%")){
			
			sum=mo(x,y);
			
		}else{
			
		}
		System.out.println(sum);
		
		
	}
	public static void main(String[] args) {
		
	}
	

}
