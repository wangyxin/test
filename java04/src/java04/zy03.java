package java04;

import java.util.Scanner;

public class zy03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("���������ѽ�");
		int qian = input.nextInt();//���ѽ��
		System.out.println("�Ƿ�μ��Żݻ������");
		System.out.println("1.��50Ԫ����2Ԫ�������¿�������һƿ");
		System.out.println("2.��100Ԫ����3Ԫ����500ml����һƿ");
		System.out.println("3.��100Ԫ����10Ԫ����5�������");
		System.out.println("4.��200Ԫ����10Ԫ����1���ղ������˹�");
		System.out.println("5.��200Ԫ����20Ԫ����ŷ����ˬ��ˮ1ƿ");
		System.out.println("0.������");
		System.out.println("��ѡ��");
		int xz = input.nextInt();
		double z = 0;//�ܽ��
		if (qian>=50&&xz==1) {
			z = qian+2;
			System.out.println("���������ܽ�"+z);
			System.out.println("�ɹ����������¿�������һƿ");
		}
		else if (qian>=100&&xz==2) {
			z = qian+3;
			System.out.println("���������ܽ�"+z);
			System.out.println("�ɹ�������500ml����һƿ");
		}
		else if (qian>=100&&xz==3) {
			z = qian+10;
			System.out.println("���������ܽ�"+z);
			System.out.println("�ɹ�������5�����");
		}
		else if (qian>=200&&xz==4) {
			z = qian+10;
			System.out.println("���������ܽ�"+z);
			System.out.println("�ɹ�������1���ղ������˹�");
		}
		else if (qian>=200&&xz==5) {
			z = qian+20;
			System.out.println("���������ܽ�"+z);
			System.out.println("�ɹ�������ŷ����ˬ��ˮ1ƿ");
		}
		else if (xz==0) {
			System.out.println("���������ܽ�"+qian);
		}
		else {
			System.out.println("���ѽ�����ѡ��Ļ�����Ŀ");
		}
	}

}
