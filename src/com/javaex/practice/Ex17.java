package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("숫자를 입력하세요: ");
		int num = s.nextInt();

		for(int i = num; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}


	}

}
