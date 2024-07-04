package string;

public class Palindrome {
	public static void main(String[] args) {
		String s1="GeeGk";
		System.out.println(palindrome(s1,0,s1.length()-1));
	
		pali(s1);
		System.out.println(pal(s1,0,s1.length()-1));
	}
	
	private static boolean palindrome(String s,int start,int end)
	{
     if(start>=end)
    	 return true;
	  
     return s.charAt(end)==s.charAt(start) && palindrome(s,start+1,end-1);
	}
	
	private static void pali(String s)
	{
		System.out.println("Original :- "+s);
		String rev="";
		char ch[]=s.toCharArray();
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+ch[i];
		}
		System.out.println("rev      :- "+rev);
		
		if(s.equals(rev))
		{
			System.out.println("Palindrome ");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
	
	
	private static boolean pal(String s,int start,int end)
	{
		if(start>=end)
		{
			return true;
		}
		return s.charAt(start)==s.charAt(end) && pal(s,start+1,end-1);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
