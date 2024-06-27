package exception;

public class Student {
	private String name;
	private String add;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdd() {
	  if("null".equals(add))
	  {
		  return  "add not found";
	  }
		return add;
	}
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	}
