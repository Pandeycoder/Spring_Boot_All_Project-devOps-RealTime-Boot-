package Colection_List.arraylist;

public class Student {
	
	int id ;
	String name;
	
	public Student(int id, String name) {
		
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

}
