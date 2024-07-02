package string;

import java.util.Collections;

public class SUbString {
	public static void main(String[] args) {
		
		subSets("ABC","",0);
	}
	private static void subSets(String s, String curr,int i)
	{
		if(i==s.length())
		{
			System.out.println(curr);
			return ;
		}
		subSets(s,curr,i+1);
		subSets(s,curr+s.charAt(i),i+1);
		
	
	}

}
