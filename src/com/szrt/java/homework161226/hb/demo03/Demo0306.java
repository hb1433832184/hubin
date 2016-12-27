package com.szrt.java.homework161226.hb.demo03;

import java.util.Scanner;

public class Demo0306 {
	
	/**
	 * 构造5个不同运算的函数
	 * @param args
	 */
	public static int add(int a,int b){
		
		return a+b;
		
	}
	public static int sub(int a,int b){
		
		return a-b;
		
	}
	public static int mul(int a,int b){
		
		return a*b;
		
	}
	public static int chu(int a,int b){
		
		return a/b;
		
	}
	public static int mo(int a,int b){
		
		return a%b;
		
	}
	
	/**
	 * 构造实现计算器功能的方法
	 * @param args
	 */
	public static void test06(int a,int b,char fh){
		
        if(fh=='+'){
			
			System.out.println("a+b="+add(a,b));
			
		}else if(fh=='-'){
			
			System.out.println("a-b="+sub(a,b));
			
		}else if(fh=='*'){
			
			System.out.println("a*b="+mul(a,b));
			
		}else if(fh=='/'){
			
			System.out.println("a/b="+chu(a,b));
			
		}else if(fh=='%'){
			
			System.out.println("a%b="+mo(a,b));
			
		}else{
			
			System.out.println("出现未知错误！");
			
		}
		
	}
 
	
	/**
	 * 调用上面的方法
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个整数a:");
		int a=sc.nextInt();
		System.out.println("请输入一另个整数b:");
		int b=sc.nextInt();
		System.out.println("请输入要进行的运算符：");
		char fh=sc.next().charAt(0);
		sc.close();
		test06(a,b,fh);
		
	}
	
 }
	
	
	
	/*public void demo0601(){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个整数a:");
		int a=sc.nextInt();
		System.out.println("请输入一另个整数b:");
		int b=sc.nextInt();
		System.out.println("请输入要进行的运算符：");
		String fh=sc.next();
		sc.close();
		switch (fh) {
		
		case "+": System.out.println("a+b="+(a+b)); break;
		case "-": System.out.println("a-b="+(a-b)); break;
		case "*": System.out.println("a*b="+(a*b)); break;
		case "/": System.out.println("a/b="+(a/b)); break;
		case "%": System.out.println("a%b="+(a%b)); break;
		default : System.out.println("出现未知错误!"); break;
		
		}
		
	}

}*/



