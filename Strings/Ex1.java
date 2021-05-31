import java.util.Scanner;

class Ex1 {
	public static void main (String[] args)	{
	    Scanner in = new Scanner(System.in);
	    
	    String str = in.nextLine(), rev = "";
	    
	    in.close();
	    
	    for (int i = 0; i < str.length(); i++)
	        rev = str.charAt(i) + rev;
	        
	    System.out.print(rev);
	}
}
