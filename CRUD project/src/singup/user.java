package singup;

public class user {
	String name;
	String id;
	String pw;
	String email;
	String age;
	
	
	public user(String name, String id, String pw, String email, String age) {
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.email = email;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getPw() {
		return pw;
	}
	
	public void setPw(String pw) {
		this.pw = pw;
		
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getAge() {
		return age;
	}
	
	public void setAge(String age) {
		this.age = age;
	}
	
	public String toString( ) {
		return "----------- \n ȸ�� �̸�:" + name  + "\n ���̵� :" + id + "��й�ȣ" + pw + "\n �̸���:" + email + " ����:" + age +"\n ------------";
	}
}
