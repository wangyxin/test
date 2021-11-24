import java.util.Scanner;


public class zy04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入华氏度值：");
		double zhi = input.nextDouble();
		System.out.println("华氏度"+zhi+"对应的摄氏度值为："+5/9.0*(zhi-32));
	}

}
