import java.util.Random;
import java.util.Scanner;

/**
 * 管理类
 * 
 * @author jzbr
 * 
 */
public class gl {
	kh[] arr = new kh[30];
	Scanner input = new Scanner(System.in);

	/**
	 * 初始化方法
	 */
	void init() {
		arr[0] = new kh("孙悟空", "179708064356", 1000, "123");
		arr[1] = new kh("猪八戒", "179708064357", 2000, "456");
		arr[2] = new kh("沙和尚", "179708064358", 3000, "789");
	}

	/**
	 * 显示菜单
	 */
	void showMenu() {
		int num = 1;
		while (num != 0) {
			System.out
					.println("====================欢迎使用自动银行服务=====================");
			System.out
					.println("1:开户  2：存款 3：取款 4：转账 5：查询余额 6：修改密码 7：显示用户信息 0：退出");
			System.out
					.println("=======================================================");
			num = input.nextInt();// 选择
			switch (num) {
			case 1:
				newKh();
				break;
			case 2:
				deposit();
				break;
			case 3:
				qk();
				break;
			case 4:
				zz();
				break;
			case 5:
				cxye();
				break;
			case 6:
				xg();
				break;
			case 7:
				showinfo();
				break;
			case 0:
				System.out.println("退出系统！");
				break;
			default:
				System.out.println("输入错误，请重新输入！");
				break;
			}

		}

	}

	/**
	 * 7.显示用户信息
	 */
	void showinfo() {
		System.out.println("姓名\t账号\t\t余额 \t密码");
		for (kh a : arr) {
			if (a == null) {
				break;
			}
			System.out
					.println(a.name + "\t" + a.zh + "\t" + a.y + "\t" + a.pwd);
		}
	}

	/**
	 * 1.开户
	 */
	void newKh() {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == null) {
				arr[i] = new kh();
				System.out.print("请输入开户姓名：");
				arr[i].name = input.next();
				System.out.print("请输入开户密码：");
				arr[i].pwd = input.next();
				System.out.print("请输入开户金额：");
				arr[i].y = input.nextInt();
				Random r = new Random();
				String c = "17970806" + (1000 + r.nextInt(9000));				
				while (findkh(c)!=null) {
					c = "17970806" + (1000 + r.nextInt(9000));					
				}
				arr[i].zh = c;
				System.out.println("开户成功！您的账号是" + arr[i].zh + "，密码是" + arr[i].pwd
								+ "，金额是" + arr[i].y + "，姓名是" + arr[i].name);
				break;

			}
			
		}
	}

	/**
	 * 2.存款
	 */
	void deposit() {
		System.out.print("请输入账号:");
		String zh = input.next();
		kh a = findkh(zh);
		if (a == null) {
			System.out.println("账号不存在！");
		} else {
			System.out.print("请输入密码：");
			String pwd = input.next();
			if (a.pwd.equals(pwd)) {
				System.out.print("请输入存款金额：");
				int money = input.nextInt();
				a.y += money;
				System.out.println("存款成功！您的余额为：" + a.y);
			} else {
				System.out.println("密码不正确！");
			}
		}
	}

	/**
	 * 根据账号找到一个对象
	 * 
	 * @param zh
	 */
	kh findkh(String zh) {
		boolean flag = false;
		for (kh a : arr) {
			if (a == null) {
				break;
			}
			if (zh.equals(a.zh)) {
				return a;
			}
		}

		return null;
	}

	

	/**
	 * 3.取款
	 */
	void qk() {
		System.out.print("请输入账号:");
		String zh = input.next();
		kh a = findkh(zh);
		if (a == null) {
			System.out.println("账号不存在！");
		} else {
			System.out.print("请输入密码：");
			String pwd = input.next();
			if (a.pwd.equals(pwd)) {
				System.out.print("请输入取款金额：");
				int money = input.nextInt();
				if (a.y >= money) {
					a.y -= money;
					System.out.println("存款成功！您的余额为：" + a.y);
				} else {
					System.out.println("余额不足！");
				}
			} else {
				System.out.println("密码不正确！");
			}
		}
	}

	/**
	 * 4.转账
	 */
	void zz() {
		System.out.print("请输入账号:");
		String zh = input.next();
		kh a = findkh(zh);
		if (a == null) {
			System.out.println("账号不存在！");
		} else {
			System.out.print("请输入密码：");
			String pwd = input.next();
			if (a.pwd.equals(pwd)) {
				System.out.print("请输入要转入的账号：");
				String zh2 = input.next();
				kh b = findkh(zh2);
				if (b.zh.equals(zh2)) {
					System.out.print("请输入要转账的金额：");
					int money = input.nextInt();
					if (a.y >= money) {
						a.y -= money;
						b.y += money;
						System.out.println("转账成功！");
					} else {
						System.out.println("余额不足！");
					}

				} else {
					System.out.println("转入账号不存在，转账失败！");
				}
			} else {
				System.out.println("密码不正确！");
			}
		}
	}

	/**
	 * 5.查询余额
	 */
	void cxye() {
		System.out.print("请输入账号:");
		String zh = input.next();
		kh a = findkh(zh);
		if (a == null) {
			System.out.println("账号不存在！");
		} else {
			System.out.print("请输入密码：");
			String pwd = input.next();
			if (a.pwd.equals(pwd)) {
				System.out.println("账号为" + zh + "的用户余额为：" + a.y);
			} else {
				System.out.println("密码错误！");
			}
		}
	}

	/**
	 * 6.修改密码
	 */
	void xg() {
		System.out.print("请输入账号:");
		String zh = input.next();
		kh a = findkh(zh);
		if (a == null) {
			System.out.println("账号不存在！");
		} else {
			System.out.print("请输入密码：");
			String pwd = input.next();
			if (a.pwd.equals(pwd)) {
				System.out.print("请输入新密码：");
				String pwd2 = input.next();
				System.out.print("请再次输入新密码：");
				String pwd3 = input.next();
				if (pwd2.equals(pwd3)) {
					a.pwd = pwd2;
					System.out.println("密码修改成功！");
				} else {
					System.out.println("两次密码不一致，修改失败！");
				}
			} else {
				System.out.println("密码错误！");
			}
		}
	}

}
