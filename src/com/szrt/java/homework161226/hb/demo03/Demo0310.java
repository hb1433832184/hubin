package com.szrt.java.homework161226.hb.demo03;

public class Demo0310 {
	
	/**
	 * 构造一个打印九九乘法表的方法
	 */
	public static void test10(){
		
		int hang=1;
		do{
			
			int lie=1;
			do{
				
				System.out.print(hang+"*"+lie+"="+hang*lie);
				System.out.print("\t");
				lie++;
				
			}while(lie<=hang);
			System.out.println();
			hang++;
			
		}while(hang<=9);
		
	}
	
	/**
	 * 调用上面的方法
	 * @param args
	 */
	public static void main(String[] args) {
		
		test10();
		
	}
	
}