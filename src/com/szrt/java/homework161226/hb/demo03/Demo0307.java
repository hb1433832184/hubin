package com.szrt.java.homework161226.hb.demo03;

import java.util.Scanner;

public class Demo0307 {
	
	/**
	 * 构造拨号快捷键的方法
	 * @param args
	 */
	public static void test07(int number){
		
        switch (number) {
		
		case 1: System.out.println("正在拨打爸爸电话.."); break;
		case 2: System.out.println("正在拨打妈妈电话.."); break;
		case 3: System.out.println("正在拨打爷爷电话.."); break;
		case 4: System.out.println("正在拨打奶奶电话.."); break;
		default : System.out.println("拨号错误！");      break;
		
		}
		
	}
	
	/**
	 * 调用上面的方法
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("请按拨号快捷键：");
		int number=sc.nextInt();
		sc.close();
		test07(number);
		
	}
	
}
