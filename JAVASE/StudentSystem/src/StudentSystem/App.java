package StudentSystem;

import StudentSystem.View.View;
import StudentSystem.ViewImpl.ViewImpl;
import StudentSystem.jopo.Manager;
import StudentSystem.jopo.User;
import StudentSystem.service.Service;
import StudentSystem.serviceImpl.serviceImpl;

public class App {
	

	public static void main(String[] asd) {
		wellcome();
		View view=new ViewImpl();
		view.operation();
		Manager[] a=new Manager[5];
		
		Service service=new serviceImpl();
		service.initData(a);
		service.login(a);
		view.meun();
		
	}
	
	public static void wellcome(){
		System.out.println("====欢迎使用学生登录系统====");
		System.out.println("1.登录 2.退出");
		System.out.println("----------------------------");	
	}

}
