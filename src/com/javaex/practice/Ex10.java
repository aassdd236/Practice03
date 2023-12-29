package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int num;
		System.out.println("숫자를 입력하세요");
		
		System.out.print("숫자: ");
		num=s.nextInt();
		int max=num;
		
		for(int i=0; i<4; i++) {
			System.out.print("숫자: ");
			num=s.nextInt();
		
			if(num>max) {
				max=num;
			}
		}
		System.out.println("최대값은 "+max+"입니다.");
		s.close();

	}

}
