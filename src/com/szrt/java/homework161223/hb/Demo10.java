package com.szrt.java.homework161223.hb;

import org.junit.Test;

public class Demo10 {
	@Test
	
	public void demo1002(){
		
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
	
	
	@Test
	
	public void demo1001(){
		
		int hang=1;
		while(hang<=9){
			
			int lie=1;
			while(lie<=hang){
				
				System.out.print(hang+"*"+lie+"="+hang*lie);
				System.out.print("\t");
				lie++;
				
			}
			System.out.println();
			hang++;
			
		}
		
	}

}
