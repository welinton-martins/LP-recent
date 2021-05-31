import java.util.Scanner;

class somaEntreNumeros {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Insira dois numeros positivos: ");
		int a = in.nextInt();
		int b = in.nextInt();
		int s = soma(a, b);
		System.out.println("Soma entre os numeros digitados: " + s);
		in.close();
	}
	
	private static int soma(int a, int b) {
	    int s = 0;
	    for(int i = a; i <= b; i++) {
	        s += i;
	    }
	    
	    return s;
	}
}
