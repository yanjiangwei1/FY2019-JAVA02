package StudentSystem.ViewImpl;

import java.util.Scanner;

import StudentSystem.View.View;
import StudentSystem.jopo.User;
import StudentSystem.service.Service;
import StudentSystem.serviceImpl.serviceImpl;

public class ViewImpl implements View {
	public  void operation(){
		Scanner a=new Scanner(System.in);
		System.out.println("��ѡ��");
		int intt=a.nextInt();
		if(intt==1){
			//��¼
		}else if(intt==2){
			//�˳�
			//System.exit(1);
		}else{
			System.out.println("���������룺");
			operation();
		}
	}
	public void meun() {
		System.out.println("��ѡ��Ҫ��������Ϣ��Ӧ���֣�");
		System.out.println("*1.�鿴ѧ����Ϣ 2.���ѧ����Ϣ 3.ɾ��ѧ����Ϣ 4.�޸�ѧ����Ϣ 5.�˳�*");
		System.out.println("================================================");
		System.out.println("��ѡ��");
		Scanner b=new Scanner(System.in);
		int intt=b.nextInt();
		if(intt==1){
			//�鿴
		}else if(intt==2){
			//���
			
			Service server=new serviceImpl();
			User[] user1=new User[5];
			server.add(user1);
		}else if(intt==3){
			//ɾ��
			//System.exit(1);
		}else if(intt==4){
			//�޸�
			//System.exit(1);
		}else if(intt==5){
			//�˳�
			//System.exit(1);
		}
	}

}
