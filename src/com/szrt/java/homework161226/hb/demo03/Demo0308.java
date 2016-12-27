package com.szrt.java.homework161226.hb.demo03;

public class Demo0308 {
	/**
	 * 分两段写
	 * 第1行：1star,3space  
	 * 第2行：3star,2space
	 * 第3行：5star,1space
	 * 第4行：7star,0space
	 *     star=hang*2-1;space=4-hang
	 * 
	 * 第01行：5star,1space
	 * 第02行：3star,2space
	 * 第03行: 1star,3space
	 *     star=7-hang*2;space=hang
	 * 
	 */
	
	public static void main(String[] args) {
		
		test08();
		
	}
	
	/**
	 * 构造一个打出实心菱形星的方法
	 */
	public static void test08(){
		
		 //先打第一部分
		for(int hang1=1;hang1<=4;hang1++){
			//先打space
			for(int space1=1;space1<=4-hang1;space1++){

				System.out.print(" ");
				
			}
			//再打star
			for(int star1=1;star1<=hang1*2-1;star1++){
				
				System.out.print("*");
				
			}
			
			System.out.println();
			
		}
		
		//打第二部分
		for(int hang2=1;hang2<=3;hang2++){
			
			//先打space
			for(int space2=1;space2<=hang2;space2++){
				
				System.out.print(" ");
				
			}
			
			//再打star
			for(int star2=1;star2<=7-hang2*2;star2++){
				
				System.out.print('*');
				
			}
			
			System.out.println();
			
		}
		
	}

}
