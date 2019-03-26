package com.jifeixitong;


public class User {
	public static void main(String[] ad){
		User[] a=new User[5];
		User a1=new User();
		a1.username="admin";
		a1.password="admin";
		a1.name="Administrator";
		a1.email="admin@123.com";
		a[0]=a1;
		User a2=new User();
		a2.username="admin";
		a2.password="admin";
		a2.name="Administrator";
		a2.email="admin@123.com";
		a[0]=a2;
		
	}
	public String username;
	public String password;
	public String name;
	public String email;
	
	public User() {
		
	}
	
	public String getusername(String username) {
		return username;
	}
	public void setpassword(String password) {
		this.password=password;
		
	}

}

	


interface UserBiz{
	void register(String username, String password, String password2,
		    String name, String email);
	void login(String username, String password) ;
}


class Userreally implements UserBiz{
	 

	@Override
	public void register(String username, String password, String password2, String name, String email) {
		// TODO Auto-generated method stub
		if(true) {
			throw new RegisterException("username 在数组中 中已存在");
		}
		if(password!=password2) {
			throw new RegisterException("密码不一致");
		}
		
	}

	@Override
	public void login(String username, String password) {
		// TODO Auto-generated method stub
		if(username==username) {
			throw new LoginException("username 不存在");
		}
		if(true) {
			throw new LoginException("username 和password 不匹配");
		}
		
	}
	 
interface UserView{
	void login();
    void register();
}
class UserViewreally implements UserView{

	@Override
	public void login() {
		// TODO Auto-generated method stub
		System.out.println("请输入用户名：");
	    
	    System.out.println("请输入密码");
	    
		
	}

	@Override
	public void register() {
		// TODO Auto-generated method stub
		
	}
	
}
}
