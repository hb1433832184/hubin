package com.szrt.java.homework161223.hb;

import java.util.Scanner;

import org.junit.Test;

public class Demo02 {
	@Test
	
	public void demo02(){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个整数a：");
		int a=sc.nextInt();
		System.out.println("请输入另一个整数b：");
		int b=sc.nextInt();
		sc.close();
		if(a>b){
			
			int c=b;
			b=a;
			a=c;
			
		}else{
			
		}
		
		System.out.println("a等于："+a);
		System.out.println("b等于："+b);
		
	}
	
}
