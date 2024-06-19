package recursion;

public class PalindromeString {

	public static void main(String[] args) {
		String name="RaR";
		System.out.println(palindromeString(name,0,name.length()-1));;
	}
	private static boolean palindromeString(String s,int start ,int end)
	{
		if(start>=end)
			return true;
		return s.charAt(start)==s.charAt(end) && palindromeString(s,start+1,end-1);	
	}
}
