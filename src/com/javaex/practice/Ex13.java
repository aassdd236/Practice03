package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("숫자를 입력하세요: ");
		int num = s.nextInt();
		int sum = 0;

		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println("합계: " + sum);

		s.close();
	}

}
