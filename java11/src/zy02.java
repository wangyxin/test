import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;


public class zy02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入四位会员卡号：");
		int num = input.nextInt();
		int ge = num%10;
		int shi = num/10%10;
		int bai = num/100%10;
		int qian = num/1000;
		System.out.println("会员号"+num+"各位之和为:"+(ge+shi+bai+qian));
	}

}
