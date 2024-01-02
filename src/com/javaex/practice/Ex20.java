package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);

		int max=29;
		//int max=(int) (Math.random() * 100) + 1
		String a = null;

		System.out.println("======================");
		System.out.println("   [숫자맞히기게임 시작]   ");
		System.out.println("======================");
		while(true) {
			int num = (int) (Math.random() * 100) + 1;
			if(max>num) {
				System.out.println(">>"+num+"\n더 높게");
			}else if(max<num) {
				System.out.println(">>"+num+"\n더 낮게");
			}
			else{
				System.out.println(">>"+num+"\n맞았습니다.");
				System.out.print("게임을 종료하시겠습니까?(y/n) >>");
				a=s.nextLine();
				if(a.equals("y")) {
					System.out.println("======================");
					System.out.println("   [숫자맞히기게임 종료]   ");
					System.out.println("======================");
					break;
				}
			}
		}
		s.close();
	}

}
