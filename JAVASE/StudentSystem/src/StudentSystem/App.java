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
		System.out.println("====��ӭʹ��ѧ����¼ϵͳ====");
		System.out.println("1.��¼ 2.�˳�");
		System.out.println("----------------------------");	
	}

}
