package com.szrt.java.homework161223.hb;

import java.util.Scanner;

import org.junit.Test;

public class Demo06 {
	@Test
	
	public void demo0602(){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个整数a:");
		int a=sc.nextInt();
		System.out.println("请输入一另个整数b:");
		int b=sc.nextInt();
		System.out.println("请输入要进行的运算符：");
		char fh=sc.next().charAt(0);
		sc.close();
		if(fh=='+'){
			
			System.out.println("a+b="+(a+b));
			
		}else if(fh=='-'){
			
			System.out.println("a-b="+(a-b));
			
		}else if(fh=='*'){
			
			System.out.println("a*b="+(a*b));
			
		}else if(fh=='/'){
			
			System.out.println("a/b="+(a/b));
			
		}else if(fh=='%'){
			
			System.out.println("a%b="+(a%b));
			
		}else{
			
			System.out.println("出现未知错误！");
			
		}
		
	}
	
	
	@Test
	
	public void demo0601(){
		
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

}



