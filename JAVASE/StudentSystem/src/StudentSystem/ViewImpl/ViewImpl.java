package StudentSystem.ViewImpl;

import java.util.Scanner;

import StudentSystem.View.View;
import StudentSystem.jopo.User;
import StudentSystem.service.Service;
import StudentSystem.serviceImpl.serviceImpl;

public class ViewImpl implements View {
	public  void operation(){
		Scanner a=new Scanner(System.in);
		System.out.println("请选择：");
		int intt=a.nextInt();
		if(intt==1){
			//登录
		}else if(intt==2){
			//退出
			//System.exit(1);
		}else{
			System.out.println("请重新输入：");
			operation();
		}
	}
	public void meun() {
		System.out.println("请选择要操作的信息对应数字：");
		System.out.println("*1.查看学生信息 2.添加学生信息 3.删除学生信息 4.修改学生信息 5.退出*");
		System.out.println("================================================");
		System.out.println("请选择：");
		Scanner b=new Scanner(System.in);
		int intt=b.nextInt();
		if(intt==1){
			//查看
		}else if(intt==2){
			//添加
			
			Service server=new serviceImpl();
			User[] user1=new User[5];
			server.add(user1);
		}else if(intt==3){
			//删除
			//System.exit(1);
		}else if(intt==4){
			//修改
			//System.exit(1);
		}else if(intt==5){
			//退出
			//System.exit(1);
		}
	}

}
