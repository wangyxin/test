import java.util.Scanner;


public class zy05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入本金：");
		double qian = input.nextDouble();
		System.out.println("本金为："+qian);
		System.out.println();
		System.out.println("存取一年后的本息："+(qian*1.0225));
		System.out.println("存取两年后的本息："+(qian*1.027*1.027));
		System.out.println("存取三年后的本息："+(qian*1.0324*1.0324*1.0324));
		System.out.println("存取五年后的本息："+(qian*1.036*1.036*1.036*1.036*1.036));
	}

}
