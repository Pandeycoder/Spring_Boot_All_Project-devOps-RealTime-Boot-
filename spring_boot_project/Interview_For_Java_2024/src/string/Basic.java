package string;

public class Basic { 
	public static void main(String[] args) {
		wayString();	
	}
	
	private static void wayString()
	{
		char []ch= {'a','e','i','o','u'};
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(" "+ch[i]);
		}
		String str=new String(ch);
		String str1="Hello";
		String str2="Hello";
		System.out.println();
		System.out.println(str.charAt(3));
		System.out.println(str.substring(0,3));
		
		if(str1==str2)
		{
			System.out.println(str1.hashCode()+" "+str2.hashCode());
		}
		if(str1.equals(str2))
		{
			System.out.println(str1+" "+str2);
		}
		String str3=new String("Hello");
		System.out.println(str3.hashCode());
		
		
		if(str3==str1) {
			System.out.println("Yes");
		}else
		{
			System.out.println("No");
		}
		
		String str4="llo";
		if(str1.contains(str4))
		{
			System.out.println("true");
		}
		
		String s1="geekforgeeks";
		String s2="geeksforgeek";
		
		//System.out.println(s2.hashCode()-s1.hashCode());
		
		int res=s2.compareTo(s1);
		
		System.out.println(res);
		if(res==0)
		{
			System.out.println("same");
		}
		if(res>0)
		{
			System.out.println("s1 Greater");
		}
		if(res<0)
		{
			System.out.println("s1 smaller");
		}
		
		//  contains()
		//  equals()
		//  comapreTo()
		//  indexOf()
		
		
	}

}
