package in.pandey.binding;

public class User {

	private Integer id;
	private String name;
	private String gender;
	private Integer phno;
	
	
	
	public User()
	{
		
	}
	
	public User(Integer id, String name, String gender, Integer phno) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.phno = phno;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getPhno() {
		return phno;
	}
	public void setPhno(Integer phno) {
		this.phno = phno;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", gender=" + gender + ", phno=" + phno + "]";
	}
	
	
	
}
