package com.szrt.java.lesson161227.hb;

import org.junit.Test;

public class RandomDemo {
	
	@Test
	public void testName() throws Exception {
		/**
		 * 111
		 * 222222222
		 * 3333333333333333
		 * 66666666666
		 */
		//初始化数组
		int len=11;
		String[] class1612=new String[len]; 
		class1612[0]="炸弹";
		class1612[1]="按时";
		class1612[2]="速度";
		class1612[3]="啥事";
		class1612[4]="试试";
		class1612[5]="老师";
		class1612[6]="收到";
		class1612[7]="类似";
		class1612[8]="开始";
		class1612[9]="李四";
		class1612[10]="欧式";
		
		int counter=1;
		while(counter<=100){
			
			//得到一个随机数
			double random=Math.random();
			System.out.println(random);
			
			//通过长度和floor的计算得到具体的下标
			int index=(int)Math.floor(random*len);
			System.out.println(class1612[index]+":"+index);
			counter++;
			
			
		}
		
	}

}
