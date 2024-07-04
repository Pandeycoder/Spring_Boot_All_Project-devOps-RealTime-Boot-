package string;

public class Basic1 {
	public static void main(String[] args) {
		basicStr();
	}
	
	private static void basicStr()
	{
		String s1="geeks";
		String s2=s1;
		System.out.println("s1 hashcode:- "+s1.hashCode());
		s1=s1+"forgeek";
		System.out.println("s2 hashcode:- "+s2.hashCode());
		System.out.println(s1==s2);
	}

}
