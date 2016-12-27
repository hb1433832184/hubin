package com.szrt.java.homework161223.hb;

import java.util.Scanner;

import org.junit.Test;

public class Demo07 {
	@Test
	
	public void demo07(){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("请按拨号快捷键：");
		int number=sc.nextInt();
		sc.close();
		switch (number) {
		
		case 1: System.out.println("正在拨打爸爸电话.."); break;
		case 2: System.out.println("正在拨打妈妈电话.."); break;
		case 3: System.out.println("正在拨打爷爷电话.."); break;
		case 4: System.out.println("正在拨打奶奶电话.."); break;
		default : System.out.println("拨号错误！");      break;
		
		}
		
	}

}
