package mapinterface;

public class Student {
	
	int id;
	String name;
	double mark;
	
	Student(int id, String name,double mark)
	{
		this.id=id;
		this.name=name;
		this.mark=mark;
	}

	public String toString()
	{
		return id +"--"+name+ "--"+mark;
	}
}
