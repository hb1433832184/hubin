package com.szrt.java.homework161226.hb.demo02;

import java.util.Scanner;
/**
 * 5个运算方法的定义
 * @author zsrt
 *
 */
public class Demo02 {
	
	public static int add(int x,int y){
		
		return x+y;
		
	}
	
	public static int sub(int x,int y){
		
		return x-y;
		
	}
	
	public static int mul(int x,int y){
		
		return x*y;
		
	}
	
	public static int chu(int x,int y){
		
		return x/y;
		
	}
	
	public static int mo(int x,int y){
		
		return x%y;
		
	}
	
	/**
	 * 实现计算器功能
	 * @param x:操作数1
	 * @param y：操作数2
	 * @param flag：运算符
	 */
	public static void cal(int x,int y,String flag){
		
		switch (flag) {
		case "+":System.out.println("x+y="+add(x,y)); break;
		case "-":System.out.println("x-y="+sub(x,y)); break;
		case "*":System.out.println("x*y="+mul(x,y)); break;
		case "/":System.out.println("x/y="+chu(x,y)); break;
		case "%":System.out.println("x%y="+mo(x,y));  break;
		default:System.out.println("输入有误！");       break;
		
		}
		
	}
	
	/**
	 * 主程序：调用上面已经定义的计算器方法
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入第1个数x：");
		int x=sc.nextInt();
		System.out.println("请输入运算符号：");
		String flag=sc.next();
		System.out.println("请输入第2个数y：");
		int y=sc.nextInt();
		sc.close();
		cal(x,y,flag);
		
	}

}
