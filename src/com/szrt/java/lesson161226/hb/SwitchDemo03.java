package com.szrt.java.lesson161226.hb;

public class SwitchDemo03 {
	
	public static void main(String[] args) {
		
		String score="A";
		
		String result="";
		
		switch (score) {
		case "A":result="优秀"; break;
		case "B":result="良好"; break;
		case "C":result="一般"; break;
		case "D":result="差劲"; break;
			

		default:result="输入的数据有问题.."; break;
		}
		System.out.println(result);
	}

}
