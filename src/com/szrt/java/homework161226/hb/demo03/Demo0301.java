package com.szrt.java.homework161226.hb.demo03;

import java.util.Scanner;

public class Demo0301 {
	
	/**
	 * 构造一个判断某年是否为闰年的方法
	 */
	public static void test01(int year){
		
        if((year%400==0)||(year%4==0)&&((year%100!=0))){
			
			System.out.println("此年是闰年");
			
		}else{
			
			System.out.println("此年不是闰年");
			
		}
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个年份：");
		int year=sc.nextInt();
		sc.close();
		test01(year);
		
	}
	
}
