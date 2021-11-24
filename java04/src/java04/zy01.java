package java04;

import java.util.Scanner;

public class zy01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入星期几：");
		int x = input.nextInt();//星期
		switch (x) {
		case 1:
		case 3:
		case 5:
			System.out.println("学习编程");
			break;
		case 2:
		case 4:
		case 6:
			System.out.println("学习英语");
			break;
		case 7:
			System.out.println("休息");
			break;
		}
	}

}
