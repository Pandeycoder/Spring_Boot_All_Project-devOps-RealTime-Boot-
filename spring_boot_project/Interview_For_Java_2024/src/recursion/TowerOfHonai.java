package recursion;

public class TowerOfHonai {
	public static void main(String[] args) {
		
		
	}
	
	private static void tower(int a ,char A,char B,char C)
	{
		if(a==1)
		{
			System.out.println("Move L from"+A+" to "+C);
			return;
		}
		tower(a-1,A,C,B);
		System.out.println("Move "+a+" from"+A + " to "+C);
		
	}
	

}
