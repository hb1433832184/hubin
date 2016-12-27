package com.szrt.java.homework161226.hb.demo04;

import java.util.Scanner;

public class Demo04 {
	
	/**
	 * 输入一个不大于5位的正整数，然后判断它是几位数，打印出各位数，并逆序输出这个整数。
	 * 1<=x<=99999
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个不大于5位的正整数：");
		long x=sc.nextLong();
		sc.close();
		if(x/10000>0){
			
			long[] arrays=new long[5];
			System.out.println("此数为5位数");
			long wanwei=qiuwanwei(x);
			arrays[0]=wanwei;
			System.out.println("此数万位为："+wanwei);
			long qianwei=qiuqianwei(x);
			arrays[1]=qianwei;
			System.out.println("此数千位为："+qianwei);
			long baiwei=qiubaiwei(x);
			arrays[2]=baiwei;
			System.out.println("此数百位为："+baiwei);
			long shiwei=qiushiwei(x);
			arrays[3]=shiwei;
			System.out.println("此数十位为："+shiwei);
			long geiwei=qiugewei(x);
			arrays[4]=geiwei;
			System.out.println("此数个位为："+geiwei);
			System.out.println("此数逆序输出为：");
			printarrays(arrays);
			
		}else if(x/1000>0){
			
			long[] arrays=new long[4];
			System.out.println("此数为4位数");
			long qianwei=qiuqianwei(x);
			arrays[0]=qianwei;
			System.out.println("此数千位为："+qianwei);
			long baiwei=qiuwanwei(x);
			arrays[1]=baiwei;
			System.out.println("此数百位为："+baiwei);
			long shiwei=qiushiwei(x);
			arrays[2]=shiwei;
			System.out.println("此数十位为："+shiwei);
			long geiwei=qiugewei(x);
			arrays[0]=geiwei;
			System.out.println("此数个位为："+geiwei);
			System.out.println("此数逆序输出为：");
			printarrays(arrays);
			
		}else if(x/100>0){
			
			long[] arrays=new long[4];
			System.out.println("此数为3位数");
			long baiwei=qiubaiwei(x);
			arrays[0]=baiwei;
			System.out.println("此数百位为："+baiwei);
			long shiwei=qiushiwei(x);
			arrays[1]=shiwei;
			System.out.println("此数十位为："+shiwei);
			long geiwei=qiugewei(x);
			arrays[2]=geiwei;
			System.out.println("此数个位为："+geiwei);
			System.out.println("此数逆序输出为：");
			printarrays(arrays);
			
		}else if(x/10>0){
			
			long[] arrays=new long[2];
			System.out.println("此数为2位数");
			long shiwei=qiushiwei(x);
			arrays[0]=shiwei;
			System.out.println("此数十位为："+shiwei);
			long geiwei=qiushiwei(x);
			arrays[1]=geiwei;
			System.out.println("此数个位为："+geiwei);
			System.out.println("此数逆序输出为：");
			printarrays(arrays);
			
		}else{
			
			System.out.println("此数为1位数");
			System.out.println("此数个位为："+x);
			System.out.println(x);
			
		}
		
	}
	
	/**
	 * 打印一个数组
	 */
	public static void printarray(long[] array,int weishu){
		
		array=new long[weishu];
		int begin=0;
		System.out.println("此数逆序输出为:");
		for(;begin<weishu;begin++){
			
			System.out.print(array[begin]);
			
		}
	}
	
	/**
	 * 构造求个、十、百、千、万位函数
	 */
	public static long qiugewei(long x){
		
		return x%10;
		
	}
	
	public static long qiushiwei(long x){
		
		return x%100/10;
		
	}
	
	public static long qiubaiwei(long x){
		
		return x%1000/100;
		
	}
	
	public static long qiuqianwei(long x){
		
		return x%10000/1000;
		
	}
	
	public static long qiuwanwei(long x){
		
		return x/10000;
		
	}
	
	/**
	 * 打印一个数组
	 */
	public static void printarrays(long[] arrays){
		
		for(int index=arrays.length-1;index>=0;index--){
			
			System.out.print(arrays[index]);
			
		}
	}

}
