import java.util.Scanner;

class Ex1 {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Insira um numero inteiro: ");
		int n = in.nextInt();
		String out = parOuImpar(n) ? String.format("%d e par",n) : String.format("%d e impar",n);
		System.out.println(out);
		in.close();
	}
	
	private static boolean parOuImpar(int n) {
	    if (n % 2 == 0)
	        return true;
	    else
	        return false;
	}
}
