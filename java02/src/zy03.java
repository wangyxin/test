import java.util.Scanner;


public class zy03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入互换前的纸牌：");
		System.out.print("左手中的纸牌：");
		int znum = input.nextInt();
		System.out.print("右手中的纸牌：");
		int ynum = input.nextInt();		
		System.out.println("输出互换后手中的纸牌：");		
		System.out.println("左手中的纸牌："+ynum);
		System.out.print("右手中的纸牌："+znum);
	}

}
