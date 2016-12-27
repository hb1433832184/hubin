package com.szrt.java.homework161223.hb;

import java.util.Scanner;

import org.junit.Test;

public class Demo03 {
	@Test
	
	public void demo03(){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个整数a：");
		int a=sc.nextInt();
		System.out.println("请输入另一个整数b：");
		int b=sc.nextInt();
		sc.close();
		int max;
		if(a>b){
			
			max=a;
			
		}else{

			max=b;
			
		}
		System.out.println("a与b中最大值为："+max);
		
	}

}
