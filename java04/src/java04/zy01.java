package java04;

import java.util.Scanner;

public class zy01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("���������ڼ���");
		int x = input.nextInt();//����
		switch (x) {
		case 1:
		case 3:
		case 5:
			System.out.println("ѧϰ���");
			break;
		case 2:
		case 4:
		case 6:
			System.out.println("ѧϰӢ��");
			break;
		case 7:
			System.out.println("��Ϣ");
			break;
		}
	}

}
