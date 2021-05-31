import java.util.Scanner;

class Ex1 {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Insira um numero inteiro: ");
		int n = in.nextInt();
		if (parOuImpar(n))
		    System.out.println(String.format("%d e par",n));
		else
		    System.out.println(String.format("%d e impar",n));
		
		in.close();
	}
	
	private static boolean parOuImpar(int n) {
	    boolean b = n % 2 == 0 ? true : false;
	    return b;
	}
}
