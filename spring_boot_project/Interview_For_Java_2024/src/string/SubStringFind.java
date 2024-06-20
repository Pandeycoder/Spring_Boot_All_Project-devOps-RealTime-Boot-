package string;

import java.util.ArrayList;

public class SubStringFind {
	public static void main(String[] args) {

		System.out.println(findSubString("RahulPandey", "Rahul"));
   String s="";
		subSequence("abc");
		subSequence1("abc",s,0);
	}

	private static boolean findSubString(String name, String sub) {
		int nameIndex = 0;
		int subIndex = 0;

		while (nameIndex < name.length()) {

			if (subIndex < sub.length() && name.charAt(nameIndex) == sub.charAt(subIndex)) {
				subIndex++;
			}
			nameIndex++;
		}

		return subIndex == sub.length();
	}

	private static void subSequence(String name) {

		ArrayList<String> s1=new ArrayList<>();
		for (int i = 0; i < name.length(); i++) {
			for (int j = i + 1; j <= name.length(); j++) {
				s1.add(name.substring(i,j));
			}
		}
		System.out.println(s1);
	}
	
	private static void subSequence1(String name,String curr,int index)
	{
		if(index==name.length())
		{
			System.out.println(curr);
			return ;
		}
		//exclude..
		subSequence1(name ,curr,index+1);
		//include
		subSequence1(name, curr+name.charAt(index),index+1);	
	}

}
