package review2;
public class DulicateReomoveReplace {
	public static void main(String[] args) {
		duplicate("rahulkumar");
		
	}
	
	private static void duplicate(String s)
	{
		char ch[]=s.toCharArray();
		
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
				
			{
				if(ch[i]==ch[j])
				{
					ch[j]='@';
					
				}
			}
		}
		String s1=new String(ch);
		System.out.println(s1);
	}

}
