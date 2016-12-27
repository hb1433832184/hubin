package com.szrt.java.homework161223.hb;

import java.util.Scanner;

import org.junit.Test;

public class Demo04 {
	@Test
	
	public void demo04(){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个成绩分数：");
		int score=sc.nextInt();
		sc.close();
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

}
