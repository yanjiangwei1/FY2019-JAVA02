package StudentSystem.jopo;

public class User {
	public String username;
	public String password;
	public int id;
	public String name;
	public String phone;
	public String email;
	public String address;
	public int age;
	public String _class;
	public String sex;
	
	public String getUsername(){
		return username;
	}
	public int id(){
		return id;
	}
	public void setid(int id){
		this.id=id;
	}
	public User(int id) {
		this.id=id;
	}
	
	public User(String username, String password, String name, String phone, String email, String address, int age,
			String _class, String sex) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.age = age;
		this._class = _class;
		this.sex = sex;
	}
	public User(String username) {
		super();
		this.username = username;
	}
	public User(String username, String password,int id) {
		super();
		this.username = username;
		this.password = password;
		this.id = id;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String get_class() {
		return _class;
	}
	public void set_class(String _class) {
		this._class = _class;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setUsername(String username){
		this.username=username;
	}
	public String getPassword(){
		return password;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", id=" + id + ", name=" + name + ", phone="
				+ phone + ", email=" + email + ", address=" + address + ", age=" + age + ", _class=" + _class + ", sex="
				+ sex + "]";
	}

}
