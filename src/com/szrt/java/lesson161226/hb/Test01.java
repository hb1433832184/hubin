package com.szrt.java.lesson161226.hb;

import java.util.Scanner;

public class Test01 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入x：");
		int x=sc.nextInt();
		System.out.println("请输入符号：");
		String z=sc.next();
		System.out.println("请输入y：");
		int y=sc.nextInt();
		sc.close();
		int sum;
		switch (z) {
		case "+":sum=add(x,y);System.out.println("x+y="+sum);break;
		case "-":sum=jian(x,y);System.out.println("x-y="+sum);break;
		case "*":sum=mul(x,y);System.out.println("x*y="+sum);break;
		case "/":sum=chu(x,y);System.out.println("x/y="+sum);break;
		case "%":sum=mo(x,y);System.out.println("x+%y="+sum);break;
		default:System.out.println("输入错误");break;
		}
		
		
	}

	private static int mo(int x, int y) {
		int sum;
		sum=x%y;
		return sum;
	}

	private static  int chu(int x, int y) {
		int sum;
		sum=x/y;
		return sum;
	}

	private static int mul(int x, int y) {
		int sum;
		sum=x*y;
		return sum;
	}

	private static int jian(int x, int y) {
		int sum;
		sum=x-y;
		return sum;
	}

	private static  int add(int x, int y) {
		int sum;
		 sum=x+y;
		return sum;
	}

}


