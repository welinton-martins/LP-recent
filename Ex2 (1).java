import java.util.Scanner;

class Ex2 {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Insira dois numeros positivos: ");
		int a = in.nextInt();
		int b = in.nextInt();
		int s = soma(a, b);
		System.out.println("Soma: " + s);
		in.close();
	}
	
	private static int soma(int a, int b) {
	    return a + b;
	}
}
