package com.szrt.java.homework161226.hb.demo03;

import java.util.Scanner;

public class Demo0303 {
	
	/**
	 * 构造求a，b中最大数的方法
	 * @param a
	 * @param b
	 */
	public static void test03(int a,int b){
		
		int max;
		if(a>b){
			
			max=a;
			
		}else{

			max=b;
			
		}
		System.out.println("a与b中最大值为："+max);
		
	}
	
	/**
	 * 调用上面的方法
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个整数a：");
		int a=sc.nextInt();
		System.out.println("请输入另一个整数b：");
		int b=sc.nextInt();
		sc.close();
		test03(a,b);
	}
		
}
