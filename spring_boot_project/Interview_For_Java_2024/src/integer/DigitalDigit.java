package integer;

public class DigitalDigit {
	public static void main(String[] args) {
 	digitalRoot(54632);
	}
	public static void digitalRoot(int n)
    { //54632
        // add your code here
        if(n==0)
        {
        	System.out.println(0);
            return ;
        }
        int x=(n-1)%9; //4533%9= 53 =7
        
        System.out.println(1 + x);
    }
}
