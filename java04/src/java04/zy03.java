package java04;

import java.util.Scanner;

public class zy03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入消费金额：");
		int qian = input.nextInt();//消费金额
		System.out.println("是否参加优惠换购活动：");
		System.out.println("1.满50元，加2元换购百事可乐饮料一瓶");
		System.out.println("2.满100元，加3元换购500ml可乐一瓶");
		System.out.println("3.满100元，加10元换购5公斤面粉");
		System.out.println("4.满200元，加10元换购1个苏泊尔炒菜锅");
		System.out.println("5.满200元，加20元换购欧莱雅爽肤水1瓶");
		System.out.println("0.不换购");
		System.out.println("请选择：");
		int xz = input.nextInt();
		double z = 0;//总金额
		if (qian>=50&&xz==1) {
			z = qian+2;
			System.out.println("本次消费总金额："+z);
			System.out.println("成功换购：百事可乐饮料一瓶");
		}
		else if (qian>=100&&xz==2) {
			z = qian+3;
			System.out.println("本次消费总金额："+z);
			System.out.println("成功换购：500ml可乐一瓶");
		}
		else if (qian>=100&&xz==3) {
			z = qian+10;
			System.out.println("本次消费总金额："+z);
			System.out.println("成功换购：5斤面粉");
		}
		else if (qian>=200&&xz==4) {
			z = qian+10;
			System.out.println("本次消费总金额："+z);
			System.out.println("成功换购：1个苏泊尔炒菜锅");
		}
		else if (qian>=200&&xz==5) {
			z = qian+20;
			System.out.println("本次消费总金额："+z);
			System.out.println("成功换购：欧莱雅爽肤水1瓶");
		}
		else if (xz==0) {
			System.out.println("本次消费总金额："+qian);
		}
		else {
			System.out.println("消费金额不满足选择的换购项目");
		}
	}

}
