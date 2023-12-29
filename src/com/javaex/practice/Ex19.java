package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);


		int select, sum = 0;
		int plus, minus;
		
		
		do {
			System.out.println("--------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------------------------");
			System.out.print("선택>");
			select=s.nextInt();

			switch(select) {
			case 1:
				System.out.print("예금액>");
				plus=s.nextInt();
				sum+=plus;
				break;
			case 2:
				System.out.print("출금액>");
				minus=s.nextInt();
				sum-=minus;
				break;
			case 3:
				System.out.println("잔고액>"+sum);
				break;
			case 4:
				System.out.println("프로그램 종료");
				break;
			default:
				System.out.println("다시 입력해 주세요");
				break;
			}
		}while(select !=4);

		s.close();
	}

}
