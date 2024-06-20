package string;

public class Remove {
	public static void main(String[] args) {
		dup1("rahulpandeykumar");
	}

	static void dup1(String s) {
		char ch[] = s.toCharArray();
		String s1 = "";

		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (ch[i] == ch[j]) {
					ch[j] = '@';
					// ch[i]='@'; //all duplicate value assign through @
				}
			}
		}
		String s2 = new String(ch);
		System.out.println(s2);

	}

	static void dup11(String s) {
		char ch[] = s.toCharArray();
		String s1 = "";
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;i<s.length();i++)
			{
				if(ch[i]==ch[j])
				{
					
				}
			}
		}
		

	}
}
