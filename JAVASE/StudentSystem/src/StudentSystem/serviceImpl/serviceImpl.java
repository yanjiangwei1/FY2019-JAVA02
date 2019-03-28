package StudentSystem.serviceImpl;

import java.util.Scanner;

import StudentSystem.jopo.Manager;
import StudentSystem.jopo.User;
import StudentSystem.service.Service;

public class serviceImpl implements Service{
	public  void initData(Manager[] a){
		
		Manager manager=new Manager("admin","admin");
		a[0]=manager;
	}
	public void login(Manager[] a){
		System.out.println("欢迎登录");
		Scanner b=new Scanner(System.in);
		System.out.println("请输入用户名：");
		String username=b.nextLine();
		System.out.println("请输入密码：");
		String password=b.nextLine();
		for(int i=0;i<=a.length;i++) {
			//Manager manager=a[i];
			if(username.equals(a[i].username)&&
					password.equals(a[i].password)) {
				System.out.println("欢迎登录成功！");
				break;
			}
			
		}
	}
public  void arr(){
		
		
		
	}
	public void add(User[] user1) {
		
		
		Scanner b1=new Scanner(System.in);
		System.out.println("============添加学生信息============");
		user1[0]=new User(3);
		user1[2]=new User(0);
		user1[1]=new User(3);
		user1[3]=new User(3);
		user1[4]=new User(3);
		System.out.println("请输入id：");
		int idd=b1.nextInt();
		
		for(int i=0;i<user1.length;i++) {
			//Manager manager=a[i];
			
			if(idd==user1[i].id) {
				System.out.println(user1.length);
				System.out.println("请重新输入：");
				this.add(user1);
			}else {
				User asd=new User(idd);
				asd.setid(idd);
				Scanner b2=new Scanner(System.in);
				System.out.println("请输入姓名：");
				String name = b2.next();
				System.out.println("请输入性别：");
				String name2 = b2.next();
				System.out.println("请输入年龄：");
				String name3 = b2.next();
				System.out.println("请输入年级：");
				String name4 = b2.next();
				System.out.println("请输入地址：");
				String name5 = b2.next();
				System.out.println("请输入联系方式：");
				String name6 = b2.next();
				System.out.println("请输入电子邮箱：");
				String name7 = b2.next();
				System.out.println("请输入电子邮箱：");
				String name8 = b2.next();
				System.out.println("请输入电子邮箱：");
				String name9 = b2.next();
				User user = new User(name,name2,name3,name4,name5,name6,Integer.valueOf(name7) ,name8,name9);
			
				
			}
			
		}
		
	}

}
