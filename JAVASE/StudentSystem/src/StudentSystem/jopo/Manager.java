package StudentSystem.jopo;

public class Manager {
	public String username;
	public String password;
	
	public Manager(String username,String password){
		this.username=username;
		this.password=password;
	}
	
	public String getUsername(){
		return username;
	}
	public void setUsername(String username){
		this.username=username;
	}
	public String getPassword(){
		return password;
	}

}
