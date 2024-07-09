package string;

import java.util.StringTokenizer;

public class Abc {
	public static void main(String[] args) {
		revStr1();
	}

	static void revStr() {
		String s = " I am a  BridgeLabz Engineer ";
		StringTokenizer st = new StringTokenizer(s);
		String s2 = "";
		while (st.hasMoreElements()) {
			String s3 = st.nextToken();
			for (int i = s3.length() - 1; i >= 0; i--) {
				s2 = s2 + s3.charAt(i);
			}
			s2 = s2 + " ";

		}
		System.out.println(s2);
	}

	static void revStr1() {
		String s = " I am a BridgeLabz Engineer ";
		String original = "";
		String rev = "";
		for (int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i)!=' ')
			{
			 	rev=s.charAt(i)+rev;
			}
			else
			{
				original+=rev+" ";
				rev="";
			}
		}
		original += rev;
		System.out.println(original);
	}
	

}
