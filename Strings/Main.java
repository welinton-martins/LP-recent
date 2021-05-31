import java.util.Scanner;

class OrdemAlfabetica {
	public static void main (String[] args)	{
		Scanner in = new Scanner(System.in);
		
		String str1 = "",str2 = "";
		
		System.out.print("Informe duas Strings: ");
		
		str1 = in.nextLine();
        str2 = in.nextLine();
		
// 		in.close();
		
// 		String alfa = str1.charAt(0) > str2.charAt(0) ?
// 		    String.format("%s\n%s",str1,str2) :
// 		    String.format("%s\n%s",str2,str1);
		    
// 		System.out.println(alfa);
        System.out.println(str1+str2);
	}
}
