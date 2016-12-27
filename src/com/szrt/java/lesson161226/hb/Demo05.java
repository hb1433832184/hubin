package com.szrt.java.lesson161226.hb;

import java.util.Scanner;

public class Demo05 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入x的值：");
		int x=sc.nextInt();
		Scanner sc1=new Scanner(System.in);
		System.out.println("请输入y的值：");
		int y=sc1.nextInt();
		sc.close();
		sc1.close();
		int sum;
		sum = add(x, y);
		System.out.println("x+y的值为："+sum);
	}

	private static int add(int x, int y) {
		int sum;
		sum=x+y;
		return sum;
	}

}
