package com.szrt.java.homework161223.hb;

import java.util.Scanner;

import org.junit.Test;

public class Demo01 {
	@Test
	
	public void demo01(){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个年份：");
		int year=sc.nextInt();
		sc.close();
		if((year%400==0)||(year%4==0)&&((year%100!=0))){
			
			System.out.println("此年是闰年");
			
		}else{
			
			System.out.println("此年不是闰年");
			
		}
		
	}

}
