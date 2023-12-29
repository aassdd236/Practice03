package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num=s.nextInt();
		
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				System.out.println(i);
			}
		}
		s.close();

	}

}
