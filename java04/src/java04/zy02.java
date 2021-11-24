package java04;

import java.util.Scanner;

public class zy02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入第一个操作数：");
		int s1 = input.nextInt();//第一个数
		System.out.print("请输入第二个操作数：");
		int s2 = input.nextInt();//第二个数
		System.out.print("请输入运算符(+ - * / %):");
		char f = input.next().charAt(0);//运算符
		int sum = 0;//结果
		switch (f) {
		case '+':
			sum = s1+s2;
			break;
		case '-':
			sum = s1-s2;
			break;
		case '*':
			sum = s1*s2;
			break;
		case '/':
			sum = s1/s2;
			break;
		case '%':
			sum = s1%s2;
			break;

		default:
			break;
		}
		System.out.print("计算结果："+s1+f+s2+"="+sum);
	}

}
