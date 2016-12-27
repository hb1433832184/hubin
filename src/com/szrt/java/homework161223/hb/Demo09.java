package com.szrt.java.homework161223.hb;

import org.junit.Test;

public class Demo09 {
	@Test
	
	public void demo09(){
		//分上下两部分，分开打，先打上半部分
		for(int hang1=1;hang1<=4;hang1++){
			 //先打每行的第一部分space
			for(int space11=1;space11<=4-hang1;space11++){
				
				System.out.print(" ");
				
			}
			//开头1行只打1个star，从第2行开始都打2个star，用if.else分别对待
			if(hang1==1){
				//单独打第1行的第1个star
				System.out.println("*");
				
			}else{
				//打从第2行开始的第1个star
				System.out.print("*");
				for(int space12=1;space12<=hang1*2-3;space12++){
					//打从第2行开始的第二部分space
					System.out.print(" ");
					
				}
				//打从第2行开始的第2个star
				System.out.println("*");
				
			}
				
		}
		
		//打下半部分
		for(int hang2=1;hang2<=3;hang2++){
			
			//先打每行的第一部分space
			for(int space21=1;space21<=hang2;space21++){
				
				System.out.print(" ");
				
			}
			
			//除最后一行1个star，其余行都是2个star，用if.else分别对待
			if(hang2==3){
				//最后一行1个star单独打
				System.out.println("*");
				
			}else{
				//打其余行的第1个star
				System.out.print("*");
				for(int space22=1;space22<=5-hang2*2;space22++){
					//打其余行的的第二部分space
					System.out.print(" ");
					
				}
				//打其余行的第二个star
				System.out.println("*");
				
			}
			
		}
			
	}

}
