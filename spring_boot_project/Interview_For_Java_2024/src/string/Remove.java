package string;

public class Remove {
	public static void main(String[] args) {
		dup1("Ananya");
	}

	static void dup1(String s) {
		char ch[] = s.toCharArray();

//		for (int i = 0; i < s.length(); i++) {
//			for (int j = i + 1; j < s.length(); j++) {
//				if (ch[i] == ch[j]) {
//					ch[j] = '@';
//					 ch[i]='@'; //all duplicate value assign through @
//				}
//			}
//		}
//		String s2 = new String(ch);
//		System.out.println(s2);
//		

		int p = ch[0];//
		String s4 = "";
		s4 = s4 + ch[0];
		String s5 = s4.toLowerCase();
		char ch1[] = s5.toCharArray();
		int p1 = ch1[0];

		System.out.println(p);
		System.out.println(p1);
		for (int i = 0; i < s.length(); i++) {

			for (int j = i + 1; j < ch.length; j++) {
				if (ch[j] == p || ch[j] == p1) {
					ch[j] = '@';

				}
			}
		}
		String s2 = new String(ch);
		System.out.println(s2);

	}

}
