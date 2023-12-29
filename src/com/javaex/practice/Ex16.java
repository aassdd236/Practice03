package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num=s.nextInt();
		int sum=0;
		
		for(int i=0; i<=num; i+=5) {
			sum+=i;
		}
		
		System.out.println("5의배수의 개수: "+num/5);
		System.out.println("5의배수의 합: "+sum);
		s.close();

	}

}
