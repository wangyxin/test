import java.util.Scanner;


public class zy01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("******消费单*******");
		System.out.println("购物商品\t单价\t个数\t金额");		
		String s1 = "T恤",s2 = "网球鞋",s3 = "网球拍";
		double d1 = 245,d2 = 570,d3 = 320;
		int g1 = 2,g2 = 1,g3 = 1;
		System.out.println(s1+"\t￥"+d1+"\t"+g1+"\t￥"+d1*g1);
		System.out.println(s2+"\t￥"+d2+"\t"+g2+"\t￥"+d2*g2);
		System.out.println(s3+"\t￥"+d3+"\t"+g3+"\t￥"+d3*g3);
		System.out.println("折扣：8折");		
		double sum = d1*g1+d2*g2+d3*g3;
		sum = sum * 0.8;
		System.out.println("消费总金额\t￥"+sum);
		System.out.print("实际交费\t￥");
		double qian = input.nextDouble();
		System.out.println("找钱\t￥"+(qian-sum));
		System.out.println("本次购物所获得的积分是："+(int)(sum/100)*3);
	}

}
