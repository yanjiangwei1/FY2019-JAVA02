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
		System.out.println("��ӭ��¼");
		Scanner b=new Scanner(System.in);
		System.out.println("�������û�����");
		String username=b.nextLine();
		System.out.println("���������룺");
		String password=b.nextLine();
		for(int i=0;i<=a.length;i++) {
			//Manager manager=a[i];
			if(username.equals(a[i].username)&&
					password.equals(a[i].password)) {
				System.out.println("��ӭ��¼�ɹ���");
				break;
			}
			
		}
	}
public  void arr(){
		
		
		
	}
	public void add(User[] user1) {
		
		
		Scanner b1=new Scanner(System.in);
		System.out.println("============���ѧ����Ϣ============");
		user1[0]=new User(3);
		user1[2]=new User(0);
		user1[1]=new User(3);
		user1[3]=new User(3);
		user1[4]=new User(3);
		System.out.println("������id��");
		int idd=b1.nextInt();
		
		for(int i=0;i<user1.length;i++) {
			//Manager manager=a[i];
			
			if(idd==user1[i].id) {
				System.out.println(user1.length);
				System.out.println("���������룺");
				this.add(user1);
			}else {
				User asd=new User(idd);
				asd.setid(idd);
				Scanner b2=new Scanner(System.in);
				System.out.println("������������");
				String name = b2.next();
				System.out.println("�������Ա�");
				String name2 = b2.next();
				System.out.println("���������䣺");
				String name3 = b2.next();
				System.out.println("�������꼶��");
				String name4 = b2.next();
				System.out.println("�������ַ��");
				String name5 = b2.next();
				System.out.println("��������ϵ��ʽ��");
				String name6 = b2.next();
				System.out.println("������������䣺");
				String name7 = b2.next();
				System.out.println("������������䣺");
				String name8 = b2.next();
				System.out.println("������������䣺");
				String name9 = b2.next();
				User user = new User(name,name2,name3,name4,name5,name6,Integer.valueOf(name7) ,name8,name9);
			
				
			}
			
		}
		
	}

}
