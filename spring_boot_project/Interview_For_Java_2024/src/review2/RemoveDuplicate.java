package review2;
public class RemoveDuplicate {
	public static void main(String[] args) {
		remove("rahulkumar");
		
	}
	
	private static void remove(String s)
	{
		char ch[]=s.toCharArray();
		String str="";
		
		for(int i=0;i<s.length();i++)
		{
			boolean b=true;
			for(int j=i+1;j<s.length();j++)
			{
				if(ch[i]==ch[j])
				{
					b=false;
					//str=str+ch[j];
				}
				
			}
			if(!b)
			{
				
			}
			else
			{
				str=str+ch[i];
			}
		}
		
		System.out.println(str);
	}

}
