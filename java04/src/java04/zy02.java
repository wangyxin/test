package java04;

import java.util.Scanner;

public class zy02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�������һ����������");
		int s1 = input.nextInt();//��һ����
		System.out.print("������ڶ�����������");
		int s2 = input.nextInt();//�ڶ�����
		System.out.print("�����������(+ - * / %):");
		char f = input.next().charAt(0);//�����
		int sum = 0;//���
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
		System.out.print("��������"+s1+f+s2+"="+sum);
	}

}
