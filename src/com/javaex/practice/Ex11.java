package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num=s.nextInt();
		int sum = 0;
		
		if(num%2==0) {
			for(int i=0; i<=num; i+=2) {
				sum+=i;
			}
		}else {
			for(int i=1; i<=num; i+=2) {
				sum+=i;
			}
		}
		
		System.out.println("결과값: "+sum);
		
		s.close();

	}

}
