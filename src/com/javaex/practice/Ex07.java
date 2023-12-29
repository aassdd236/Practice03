package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int a=s.nextInt();
		
		for(int i=1; i<a+1; i++) {
			for(int j=1; j<i+1; j++) {
				System.out.print(i);
			}
			System.out.println("");
		}
		
		s.close();

	}

}
