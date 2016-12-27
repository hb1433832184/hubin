package com.szrt.java.homework161226.hb.demo03;

import java.util.Scanner;

public class Demo0305 {
	
	/**
	 * 构造一个判断成绩的方法
	 * @param args
	 */
	public static void test05(String score){
		
        switch (score) {
		
		case "A": System.out.println("优秀"); break;
		case "B": System.out.println("良好"); break;
		case "C": System.out.println("及格"); break;
		case "D": System.out.println("有问题"); break;
		default : System.out.println("不是合法输入!"); break;
		
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个成绩（例如A）：");
		String score=sc.next();
		sc.close();
		test05(score);
		
	}
	
}
