package com.szrt.java.homework161226.hb.demo03;

import java.util.Scanner;


public class Demo0302 {
	
	/**
	 * 构造一个如果a>b就交换a，b的方法
	 * @param a
	 * @param b
	 */
	public static void test02(int a,int b){
		
        if(a>b){
			
			int c=b;
			b=a;
			a=c;
			
		}else{
			
		}
		
		System.out.println("a等于："+a);
		System.out.println("b等于："+b);
		
	}
		
		
	/**
	 * 调用上面定义的方法
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个整数a：");
		int a=sc.nextInt();
		System.out.println("请输入另一个整数b：");
		int b=sc.nextInt();
		sc.close();
		test02(a,b);
		
    }
}
	
