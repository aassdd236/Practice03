package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("======================");
		System.out.println("   [숫자맞히기게임 시작]   ");
		System.out.println("======================");
		System.out.print(">>");
		
		int num = (int) (Math.random() * 100) + 1;
		System.out.println(num);
		
		
		
		s.close();
	}

}
