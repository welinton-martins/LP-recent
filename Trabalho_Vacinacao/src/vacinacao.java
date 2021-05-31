import java.util.Scanner;

public class vacinacao {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = 0, M = 0;
		
		do {
			System.out.print("População do país: ");
			N = in.nextInt();
		}
		while(!(Math.pow(10, 3) <= N && N <= Math.pow(10, 9)));
		
		do {
			System.out.print("Número meses que a vacina foi aplicada: ");
			M = in.nextInt();
		}
		while(!(1 <= M && M <= 10));
		
		int[] P = new int[M];
		
		for (int i = 1; i <= M; i++) {
			do {
				System.out.printf("Numero de pessoas que receberam a %d dose no %d mes: ", i);
				P[i] = in.nextInt();
			}
			while (!( 0 <= P[i] && P[i] <= N));
		}
	}
	
	
}
