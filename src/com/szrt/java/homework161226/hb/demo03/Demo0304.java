package com.szrt.java.homework161226.hb.demo03;

import java.util.Scanner;

public class Demo0304 {
	
	/**
	 * 构造一个判断分数的方法
	 */
	public static void test04(int score){
		
        if(score>=90){
			
			System.out.println("优秀");
			
		}else if(score>=80){
			
			System.out.println("良好");
			
		}else if(score>=70){
			
			System.out.println("及格");
			
		}else{
			
			System.out.println("不及格");
			
		}
		
	}
	
	/**
	 * 调用上面的方法
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个成绩分数：");
		int score=sc.nextInt();
		sc.close();
		test04(score);
		
	}
	
}
