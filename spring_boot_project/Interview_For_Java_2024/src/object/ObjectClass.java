package object;

import java.util.Objects;

class Person {
	String name;
	String Dob;
	int age;

	Person(String name, String Dob, int age) {
		this.name = name;
		this.Dob = Dob;
		this.age = age;
	}
	String getName()
	{
		return name;
	}
	int getAge()
	{
		return age;
	}
	public void info()
	{
		System.out.println(name+"  "+age);
	}
//	public String toString()
//	{
//		return name+" "+age+"  ";
//	}
	@Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}



public class ObjectClass {
	public static void main(String[] args) {
		
		Person p1=new Person("Rahul","09/01/200",23);
		Person p2=new Person("Neha","13/09/20001",23);
		Person p3=new Person("Pragati Priya","09/11/2002",23);
		
		System.out.println(p3.name);
		System.out.println(p1.toString());
		System.out.println(p1.equals(p2));
		System.out.println(p1.hashCode());
		
		p1.info();
		
		
	}

}
