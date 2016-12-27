package com.szrt.java.homework161223.hb;

import java.util.Scanner;

import org.junit.Test;

public class Demo05 {
	@Test
	
	public void demo05(){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个成绩（例如A）：");
		String score=sc.next();
		sc.close();
		switch (score) {
		
		case "A": System.out.println("优秀"); break;
		case "B": System.out.println("良好"); break;
		case "C": System.out.println("及格"); break;
		case "D": System.out.println("有问题"); break;
		default : System.out.println("不是合法输入!"); break;
		
		}
		
	}

}
