package com.szrt.java.lesson161226.hb;

public class TriDemo02 {
	
	public static void main(String[] args) {
		
		printStar(7);
		
		
		
		
	}
	
	public static void printStar(int counter){
		
		
		
        for(int outer=1;outer<=counter;outer++){
        	
			
			for(int inner=1;inner<=outer;inner++){
				
				System.out.print("*");
				
			}
			System.out.println();
		}
		
	}

}
